package PaginaPrincipal.Controlador;

import BaseDatos.BaseDatoControlador;
import Bean.Historial;
import Bean.Matricula;
import Conexion.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ReporteControlador {

    BaseDatoControlador bdControlador = new BaseDatoControlador();

    public ArrayList<Matricula> listaMatricula = new ArrayList<>();
    public ArrayList<Matricula> listaComprobante = new ArrayList<>();
    public ArrayList<Matricula> listaCatequista = new ArrayList<>();

    // INICIO -- ENCONTRAR EL MAXIMO ID DE UNA TABLA
    private int id() throws SQLException {
        String mysqlId = "SELECT MAX(idMatricula) FROM Matricula";
        return bdControlador.ConsultarIdMax(mysqlId);

    }
    // FIN -- ENCONTRAR EL MAXIMO ID DE UNA TABLA

    // INICIO -- LLENAR COMBOBOX 
    public void Comunidad(JComboBox cbComunidad) {
        String nombreRegistro = "nombre";
        String mysql = "SELECT * FROM sanpedro.comunidad";
        bdControlador.LlenarCombo(cbComunidad, mysql, nombreRegistro);

    }
    // INICIO -- LLENAR COMBOBOX 

    public void Niveles(JComboBox cbNivel) {
        String nombreRegistro = "nombre";
        String mysql = "SELECT * FROM sanpedro.niveles";
        bdControlador.LlenarCombo(cbNivel, mysql, nombreRegistro);

    }

    // FIN -- LLENAR COMBOBOX 
    // INICIO -- METODOS PARA VALIDACIONES
    public void Vacio(JTextField cApellidos, JTextField cNombre, JTextField cNivel, JTextField cComunidad,
            JTextField cAnoInicio, JTextField cAnoFin) {
        cApellidos.setText("");
        cNombre.setText("");
        cNombre.setText("");
        cNivel.setText("");
        cComunidad.setText("");
        cAnoInicio.setText("");
        cAnoFin.setText("");
    }

    // FIN -- METODOS PARA VALIDACIONES
    // INICIO -- PASAR REGISTRO A LA TABLA
    public void DatosTabla() {
        ResultSet rs;
        String mysql = "SELECT idMatricula,matricula.IdAlumno, alumno.nombres,alumno.apellidos,matricula.IdCatequista,comunidad.nombre as Comunidad,niveles.nombre as Nivel, CAST(AnoInicio AS CHAR) "
                + "as AnoInicio,CAST(AnoFin AS CHAR) as AnoFin\n"
                + "FROM matricula\n"
                + "INNER JOIN alumno ON alumno.IdAlumno = matricula.IdAlumno\n"
                + "INNER JOIN comunidad ON comunidad.IdComunidad = matricula.IdComunidad\n"
                + "INNER JOIN niveles ON niveles.IdNivel = matricula.IdNivel "
                + "INNER JOIN parroco ON  parroco.IdParroco = matricula.IdParroco\n"
                + "INNER JOIN catequista ON catequista.IdCatequista = matricula.IdCatequista "
                + "WHERE PaseAno= 1";
        try {
            rs = bdControlador.Buscar(mysql);
            while (rs.next()) {
                Matricula matricula = new Matricula();
                matricula.setIdMatricula(Integer.parseInt(rs.getString("idMatricula")));
                matricula.setIdAlumno(Integer.parseInt(rs.getString("idAlumno")));
                matricula.setNombres(rs.getString("nombres"));
                matricula.setApellidos(rs.getString("apellidos"));
                matricula.setComunidad(rs.getString("Comunidad"));
                matricula.setNivel(rs.getString("Nivel"));
                matricula.setAnoInicio(rs.getString("AnoInicio"));
                matricula.setAnoFin(rs.getString("AnoFin"));
                listaMatricula.add(matricula);
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error" + "\n" + e);
        }

    }

    public void DatosTablaCate() {
        ResultSet rs;
        String mysql = "SELECT distinct  catequista.IdCatequista,catequista.nombres as catequista,comunidad.nombre as Comunidad,niveles.nombre as Nivel, CAST(AnoInicio AS CHAR) "
                + "as AnoInicio,CAST(AnoFin AS CHAR) as AnoFin\n"
                + "FROM matricula\n"
                + "INNER JOIN alumno ON alumno.IdAlumno = matricula.IdAlumno\n"
                + "INNER JOIN comunidad ON comunidad.IdComunidad = matricula.IdComunidad\n"
                + "INNER JOIN niveles ON niveles.IdNivel = matricula.IdNivel "
                + "INNER JOIN catequista ON catequista.IdCatequista = matricula.IdCatequista";
        try {
            rs = bdControlador.Buscar(mysql);
            while (rs.next()) {
                Matricula matricula = new Matricula();
                matricula.setIdCatequista(Integer.parseInt(rs.getString("IdCatequista")));
                matricula.setCatequista(rs.getString("Catequista"));
                matricula.setComunidad(rs.getString("Comunidad"));
                matricula.setNivel(rs.getString("Nivel"));
                matricula.setAnoInicio(rs.getString("AnoInicio"));
                matricula.setAnoFin(rs.getString("AnoFin"));
                listaCatequista.add(matricula);
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error" + "\n" + e);
        }

    }

    public void LlenarTablaCate(DefaultTableModel model, JTable tHistorial, JTextField cAnoInicioB, JTextField cAnoFinB, JComboBox comunidad, JComboBox nivel) {
        String[] titulos = {"IDCATEQUISTA", "CATEQUISTA", "COMUNIDAD", "NIVEL", "ANOINICIO", "ANOFIN"};
        model = new DefaultTableModel(null, titulos);

        String[] fila = new String[6];
        for (int i = 0; i < listaCatequista.size(); i++) {
            if (listaCatequista.get(i).getAnoInicio().equals(cAnoInicioB.getText()) && listaCatequista.get(i).getAnoFin().equals(cAnoFinB.getText())
                    && listaCatequista.get(i).getComunidad().equals(comunidad.getSelectedItem()) && listaCatequista.get(i).getNivel().equals(nivel.getSelectedItem())) {

                fila[0] = listaCatequista.get(i).getIdCatequista() + "";
                fila[1] = listaCatequista.get(i).getCatequista();
                fila[2] = listaCatequista.get(i).getComunidad();
                fila[3] = listaCatequista.get(i).getNivel();
                fila[4] = listaCatequista.get(i).getAnoInicio() + "";
                fila[5] = listaCatequista.get(i).getAnoFin() + "";
                model.addRow(fila);
            }
        }
        TableColumnModel columnModel = tHistorial.getColumnModel();
        tHistorial.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tHistorial.doLayout();
        tHistorial.setModel(model);
        columnModel.getColumn(0).setMinWidth(0);
        columnModel.getColumn(0).setMaxWidth(0);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(150);
        columnModel.getColumn(3).setPreferredWidth(150);

    }

    public void LlenarTabla(DefaultTableModel model, JTable tHistorial, JTextField cAnoInicioB, JTextField cAnoFinB) {
        String[] titulos = {"IDMATRICULA", "IDALUMNO", "NOMBRES", "APELLIDOS", "COMUNIDAD", "NIVEL", "ANOINICIO", "ANOFIN"};
        model = new DefaultTableModel(null, titulos);

        String[] fila = new String[8];
        for (int i = 0; i < listaMatricula.size(); i++) {
            if (listaMatricula.get(i).getAnoInicio().equals(cAnoInicioB.getText()) && listaMatricula.get(i).getAnoFin().equals(cAnoFinB.getText())) {
                fila[0] = listaMatricula.get(i).getIdMatricula() + "";
                fila[1] = listaMatricula.get(i).getIdAlumno() + "";
                fila[2] = listaMatricula.get(i).getNombres();
                fila[3] = listaMatricula.get(i).getApellidos();
                fila[4] = listaMatricula.get(i).getComunidad();
                fila[5] = listaMatricula.get(i).getNivel();
                fila[6] = listaMatricula.get(i).getAnoInicio() + "";
                fila[7] = listaMatricula.get(i).getAnoFin() + "";
                model.addRow(fila);
            }
        }
        TableColumnModel columnModel = tHistorial.getColumnModel();
        tHistorial.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tHistorial.doLayout();
        tHistorial.setModel(model);
        columnModel.getColumn(0).setMinWidth(0);
        columnModel.getColumn(0).setMaxWidth(0);
        columnModel.getColumn(1).setMinWidth(0);
        columnModel.getColumn(1).setMaxWidth(0);
        columnModel.getColumn(2).setPreferredWidth(150);
        columnModel.getColumn(3).setPreferredWidth(150);
        columnModel.getColumn(4).setPreferredWidth(150);
        columnModel.getColumn(4).setPreferredWidth(150);

    }

    public void PasarDatos(JTable tAlumno, JTextField cIdMatri, JTextField cIdAlumno, JTextField cApellidos, JTextField cNombre, JTextField cNivel, JTextField cComunidad,
            JTextField cAnoInicio, JTextField cAnoFin
    ) {
        int rec = tAlumno.getSelectedRow();
        cIdMatri.setText((String) tAlumno.getValueAt(rec, 0));
        cIdAlumno.setText((String) tAlumno.getValueAt(rec, 1));
        cNombre.setText((String) tAlumno.getValueAt(rec, 2));
        cApellidos.setText((String) tAlumno.getValueAt(rec, 3));
        cComunidad.setText((String) tAlumno.getValueAt(rec, 4));
        cNivel.setText((String) tAlumno.getValueAt(rec, 5));
        cAnoInicio.setText((String) tAlumno.getValueAt(rec, 6));
        cAnoFin.setText((String) tAlumno.getValueAt(rec, 7));

    }

    public void PasarDatosCa(JTable tCatequista, JTextField cIdCate, JTextField cNombreCaE, JTextField cNivelC, JTextField cComunidadC,
            JTextField cAnoInicioC, JTextField cAnoFinC
    ) {
        int rec = tCatequista.getSelectedRow();
        cIdCate.setText((String) tCatequista.getValueAt(rec, 0));
        cNombreCaE.setText((String) tCatequista.getValueAt(rec, 1));
        cNivelC.setText((String) tCatequista.getValueAt(rec, 3));
        cComunidadC.setText((String) tCatequista.getValueAt(rec, 2));
        cAnoInicioC.setText((String) tCatequista.getValueAt(rec, 4));
        cAnoFinC.setText((String) tCatequista.getValueAt(rec, 5));

    }

    //INICIO-- PASAR DATOS A FORMULARIO
    private void Llenar(JTextField cNombreAl, JTextField cApellidoAl, JTextField cNivel, JTextField cComunidad,
            JTextField cAnoInicio, JTextField cAnoFin, JTextField cValor) {
        Matricula matricula = new Matricula();
        matricula.setNombres(cNombreAl.getText() + " " + cApellidoAl.getText());
        matricula.setNivel(cNivel.getText());
        matricula.setComunidad(cComunidad.getText());
        matricula.setAnoFin(cAnoInicio.getText() + " - " + cAnoFin.getText());
        matricula.setValor(cValor.getText());
        listaComprobante.add(matricula);

    }

    public void ReporteComprobante(JTextField cNombreAl, JTextField cApellidoAl, JTextField cNivel, JTextField cComunidad,
            JTextField cAnoInicio, JTextField cAnoFin, JTextField cValor) {
        Llenar(cNombreAl, cApellidoAl, cNivel, cComunidad, cAnoInicio, cAnoFin, cValor);

        Map parametro = new HashMap();
        parametro.put("logo", this.getClass().getResourceAsStream("/iconos/iSanPedro.jpg"));
        parametro.put("pTipoComp", "COMPROBANTE DE PAGO PASE AÑO ");
//        parametro.put("nivel", cbNivel.getSelectedItem());
//        parametro.put("comunidad", cbComunidad.getSelectedItem());
//        parametro.put("anoFin", cAnoInicio.getText() + " - " + cAnoFin.getText());

        JasperReport reporte; // Instaciamos el objeto reporte

        try {
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reporte/Comprobante.jasper"));
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, new JRBeanCollectionDataSource(listaComprobante)); //Agregamos los parametros para llenar el reporte
            JasperViewer viewer = new JasperViewer(jprint, false); //Se crea la vista del reportes
            viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Se declara con dispose_on_close para que no se cierre el programa cuando se cierre el reporte
            viewer.setTitle("Reporte de Comprobante ");
            viewer.setVisible(true); //Se vizualiza el reporte
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Mostrar el Reporte" + "\n" + e);

        }
    }

    public void ReportePase(JTextField cIdMatricula) {

        Map parametro = new HashMap();
        parametro.put("logo", this.getClass().getResourceAsStream("/iconos/iSanPedro.jpg"));
        parametro.put("pMatricula", Integer.parseInt(cIdMatricula.getText()));
        Conexion con = new Conexion();
        JasperReport reporte; // Instaciamos el objeto reporte

        try {
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reporte/CerticadoPaseAno.jasper"));
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, con.Conexion()); //Agregamos los parametros para llenar el reporte
            JasperViewer viewer = new JasperViewer(jprint, false); //Se crea la vista del reportes
            viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Se declara con dispose_on_close para que no se cierre el programa cuando se cierre el reporte
            viewer.setTitle("Reporte de Pase de Año");
            viewer.setVisible(true); //Se vizualiza el reporte
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Mostrar el Reporte" + "\n" + e);

        }
    }

    public void ReporteListado(JTextField cIdCate, JTextField cNivelC, JTextField cAnoInicioC, JTextField cAnoFinC, JTextField cHora, JComboBox cbDia) {

        Map parametro = new HashMap();
        parametro.put("pLogo", this.getClass().getResourceAsStream("/iconos/iSanPedro.jpg"));
        parametro.put("pIdCatequista", Integer.parseInt(cIdCate.getText()));
        parametro.put("pNivel", cNivelC.getText());
        parametro.put("pAnoInicio", cAnoInicioC.getText());
        parametro.put("pAnoFin", cAnoFinC.getText());
        parametro.put("pHorario", cbDia.getSelectedItem() + " " + cHora.getText());
        Conexion con = new Conexion();

        JasperReport reporte; // Instaciamos el objeto reporte

        try {
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reporte/ListaCatequista.jasper"));
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, con.Conexion()); //Agregamos los parametros para llenar el reporte
            JasperViewer viewer = new JasperViewer(jprint, false); //Se crea la vista del reportes
            viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Se declara con dispose_on_close para que no se cierre el programa cuando se cierre el reporte
            viewer.setTitle("Reporte de Listado ");
            viewer.setVisible(true); //Se vizualiza el reporte
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Mostrar el Reporte" + "\n" + e);

        }
    }
    //FIN-- PASAR DATOS A FORMULARIO
}







