package PaginaPrincipal.Controlador;

import BaseDatos.BaseDatoControlador;
import Bean.Historial;
import Bean.Matricula;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
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

public class MatriculaControlador {

    BaseDatoControlador bdControlador = new BaseDatoControlador();
    public ArrayList<Historial> listaHistorial = new ArrayList<>();
    public ArrayList<Matricula> listaMatricula = new ArrayList<>();
    public ArrayList<Matricula> listaComprobante = new ArrayList<>();

    // INICIO -- ENCONTRAR EL MAXIMO ID DE UNA TABLA
    private int id() throws SQLException {
        String mysqlId = "SELECT MAX(idMatricula) FROM Matricula";
        return bdControlador.ConsultarIdMax(mysqlId);
    }

    public String parroco() {
        ResultSet rs;
        String parroco = "" ;
        String mysql = "SELECT nombres FROM parroco\n"
                + "WHERE idParroco = (SELECT MAX(idParroco) FROM parroco);";
        try {
            rs = bdControlador.Buscar(mysql);
            while (rs.next()) {
                parroco = rs.getString("nombres");
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error" + "\n" + e);
        }
        return parroco;

    }
    // FIN -- ENCONTRAR EL MAXIMO ID DE UNA TABLA

    // INICIO -- LLENAR COMBOBOX 
    public void Niveles(JComboBox cbNivel) {
        String nombreRegistro = "nombre";
        String mysql = "SELECT * FROM sanpedro.niveles";
        bdControlador.LlenarCombo(cbNivel, mysql, nombreRegistro);

    }

    public void Comunidad(JComboBox cbComunidad) {
        String nombreRegistro = "nombre";
        String mysql = "SELECT * FROM sanpedro.comunidad";
        bdControlador.LlenarCombo(cbComunidad, mysql, nombreRegistro);

    }

    public void Parroco(JComboBox cbParroco) {
        String nombreRegistro = "nombres";
        String mysql = "SELECT * FROM sanpedro.parroco";
        bdControlador.LlenarCombo(cbParroco, mysql, nombreRegistro);

    }
    public void ParrocoSelect(JComboBox cbParroco) {
       cbParroco.setSelectedItem(parroco());

    }
    // FIN -- LLENAR COMBOBOX 

    // INICIO -- METODOS PARA VALIDACIONES
    public void Vacio(JTextField cIdAlumno, JTextField cNombre, JTextField cIdCatequista, JTextField cApellido, JTextField cCelular01, JTextField cCelular02, JTextField cNombreCa, JTextField cComunidad,
            JComboBox cbComunidad, JComboBox cbParroco, JComboBox cbNivel, JTextField cAnoInicio, JTextField cAnoFin, JTextField cObservacion) {
        cIdAlumno.setText("");
        cIdCatequista.setText("");
        cNombre.setText("");
        cApellido.setText("");
        cCelular01.setText("");
        cCelular02.setText("");
        cNombreCa.setText("");
        cComunidad.setText("");
        cAnoInicio.setText("");
        cAnoFin.setText("");
        cObservacion.setText("");
        cbComunidad.setSelectedIndex(0);
        cbParroco.setSelectedIndex(0);
        cbNivel.setSelectedIndex(0);

    }

    public void VacioE(JTextField cIdAlumno, JTextField cNombre, JTextField cIdCatequista, JTextField cApellido, JTextField cNombreCa,
            JComboBox cbComunidad, JComboBox cbParroco, JComboBox cbNivel, JTextField cAnoInicio, JTextField cAnoFin, JTextField cObservacion) {
        cIdAlumno.setText("");
        cIdCatequista.setText("");
        cNombre.setText("");
        cApellido.setText("");
        cNombreCa.setText("");
        cAnoInicio.setText("");
        cAnoFin.setText("");
        cObservacion.setText("");
        cbComunidad.setSelectedIndex(0);
        cbParroco.setSelectedIndex(0);
        cbNivel.setSelectedIndex(0);

    }

    private void Desbloquear(rojeru_san.rsbutton.RSButtonEffect bBuscarCaE, rojeru_san.rsbutton.RSButtonEffect bListoCaE,
            JComboBox cbComunidad, JComboBox cbParroco, JComboBox cbNivel,
            JTextField cAnoInicio, JTextField cAnoFin, JTextField cObservacion) {
        bBuscarCaE.setEnabled(true);
        bListoCaE.setEnabled(true);
        cAnoInicio.setEditable(true);
        cAnoFin.setEditable(true);
        cObservacion.setEditable(true);
        cbComunidad.setEnabled(true);
        cbParroco.setEnabled(true);
        cbNivel.setEnabled(true);

    }

    public void VaciarTabla(DefaultTableModel modelo) {
        int numDatos = modelo.getRowCount();
        for (int i = 0; i < numDatos; i++) {
            modelo.removeRow(0);
        }
    }

    public void CalcularPeriodo(JTextField cAnoInicioc, JTextField cAnoFin) {
        Calendar cal = Calendar.getInstance();
        int yearInicio = cal.get(Calendar.YEAR);
        int yearFin = yearInicio + 1;
        cAnoInicioc.setText(yearInicio + "");
        cAnoFin.setText(yearFin + "");

    }
    // FIN -- METODOS PARA VALIDACIONES

    // INICIO -- PASAR REGISTRO A LA TABLA
    public void ActualizarCelular(JTextField cIdAlumno, JTextField cCelular01, JTextField cCelular02) {
        ResultSet rs;
        String mysql = "SELECT celular01, celular02 FROM \n"
                + "ALUMNO WHERE idAlumno =" + Integer.parseInt(cIdAlumno.getText());
        try {
            rs = bdControlador.Buscar(mysql);
            while (rs.next()) {
                cCelular01.setText(rs.getString("celular01"));
                cCelular02.setText(rs.getString("celular02"));

            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Actualizar el numero de Celular" + "\n" + e);
        }

    }

    public void DatosTabla() {
        ResultSet rs;
        String mysql = "SELECT IdMatricula,matricula.IdAlumno, alumno.nombres,alumno.apellidos,matricula.IdCatequista,catequista.Nombres as Catequista,comunidad.nombre as Comunidad,niveles.nombre as Nivel, CAST(AnoInicio AS CHAR) "
                + "as AnoInicio,CAST(AnoFin AS CHAR) as AnoFin,parroco.Nombres,Observacion\n"
                + "FROM matricula\n"
                + "INNER JOIN alumno ON alumno.IdAlumno = matricula.IdAlumno\n"
                + "INNER JOIN comunidad ON comunidad.IdComunidad = matricula.IdComunidad\n"
                + "INNER JOIN niveles ON niveles.IdNivel = matricula.IdNivel "
                + "INNER JOIN parroco ON  parroco.IdParroco = matricula.IdParroco\n"
                + "INNER JOIN catequista ON catequista.IdCatequista = matricula.IdCatequista";
        try {
            rs = bdControlador.Buscar(mysql);
            while (rs.next()) {
                Matricula matricula = new Matricula();
                matricula.setIdMatricula(Integer.parseInt(rs.getString("matricula.IdMatricula")));
                matricula.setIdAlumno(Integer.parseInt(rs.getString("idAlumno")));
                matricula.setNombres(rs.getString("nombres"));
                matricula.setApellidos(rs.getString("apellidos"));
                matricula.setIdCatequista(Integer.parseInt(rs.getString("IdCatequista")));
                matricula.setCatequista(rs.getString("catequista"));
                matricula.setComunidad(rs.getString("Comunidad"));
                matricula.setNivel(rs.getString("Nivel"));
                matricula.setAnoInicio(rs.getString("AnoInicio"));
                matricula.setAnoFin(rs.getString("AnoFin"));
                matricula.setParroco(rs.getString("parroco.Nombres"));
                matricula.setObservacion(rs.getString("observacion"));

                listaMatricula.add(matricula);
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error" + "\n" + e);
        }

    }

    public void DatosTablaHistorial(JTextField cIdAlumno) {
        ResultSet rs;
        String mysql = "SELECT comunidad.nombre as Comunidad, if(PaseAno=0,'NO PAGADO','PAGADO') AS PaseAño,niveles.nombre as Nivel ,catequista.Nombres as Catequista, CONCAT(AnoInicio,' -' ,AnoFin) AS Periodo\n"
                + "FROM matricula\n"
                + "INNER JOIN alumno ON alumno.IdAlumno = matricula.IdAlumno\n"
                + "INNER JOIN comunidad ON comunidad.IdComunidad = matricula.IdComunidad\n"
                + "INNER JOIN niveles ON niveles.IdNivel = matricula.IdNivel\n"
                + "INNER JOIN catequista ON catequista.IdCatequista = matricula.IdCatequista\n"
                + "WHERE alumno.IdAlumno=" + Integer.parseInt(cIdAlumno.getText()) + " ORDER BY AnoFin DESC";
        try {
            rs = bdControlador.Buscar(mysql);

            while (rs.next()) {
                Historial historial = new Historial();
                historial.setComunidad(rs.getString("Comunidad"));
                historial.setPaseAno(rs.getString("PaseAño"));
                historial.setNivel(rs.getString("Nivel"));
                historial.setCatequista(rs.getString("Catequista"));
                historial.setPeriodo(rs.getString("Periodo"));

                listaHistorial.add(historial);
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error " + "\n" + e);
        }

    }

    public void LlenarTabla(DefaultTableModel model, JTable tHistorial) {
        String[] titulos = {"COMUNIDAD", "NIVEL", "PASE_AÑO", "CATEQUISTA", "PERIODO"};
        model = new DefaultTableModel(null, titulos);
        String[] fila = new String[5];
        for (int i = 0; i < listaHistorial.size(); i++) {
            fila[0] = listaHistorial.get(i).getComunidad();
            fila[1] = listaHistorial.get(i).getNivel();
            fila[2] = listaHistorial.get(i).getPaseAno();
            fila[3] = listaHistorial.get(i).getCatequista();
            fila[4] = listaHistorial.get(i).getPeriodo();

            model.addRow(fila);
        }
        TableColumnModel columnModel = tHistorial.getColumnModel();
        tHistorial.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tHistorial.doLayout();
        tHistorial.setModel(model);
        columnModel.getColumn(0).setPreferredWidth(100);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(150);

    }

    public void LlenarTablaMatri(DefaultTableModel model, JTable tHistorial) {
        String[] titulos = {"IDMATRICULA", "IDALUMNO", "NOMBRES", "APELLIDOS", "IDCATEQUISTA", "CATEQUISTA", "COMUNIDAD", "NIVEL", "ANOINICIO", "ANOFIN", "PARROCO", "OBSERVACION"};
        model = new DefaultTableModel(null, titulos);
        String[] fila = new String[12];
        for (int i = 0; i < listaMatricula.size(); i++) {
            fila[0] = listaMatricula.get(i).getIdMatricula() + "";
            fila[1] = listaMatricula.get(i).getIdAlumno() + "";
            fila[2] = listaMatricula.get(i).getNombres();
            fila[3] = listaMatricula.get(i).getApellidos();
            fila[4] = listaMatricula.get(i).getIdCatequista() + "";
            fila[5] = listaMatricula.get(i).getCatequista();
            fila[6] = listaMatricula.get(i).getComunidad();
            fila[7] = listaMatricula.get(i).getNivel();
            fila[8] = listaMatricula.get(i).getAnoInicio() + "";
            fila[9] = listaMatricula.get(i).getAnoFin() + "";
            fila[10] = listaMatricula.get(i).getParroco() + "";
            fila[11] = listaMatricula.get(i).getObservacion();
            model.addRow(fila);
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
        columnModel.getColumn(4).setMinWidth(0);
        columnModel.getColumn(4).setMaxWidth(0);
        columnModel.getColumn(5).setPreferredWidth(150);
        columnModel.getColumn(6).setPreferredWidth(150);
        columnModel.getColumn(7).setPreferredWidth(150);
        columnModel.getColumn(10).setPreferredWidth(0);
        columnModel.getColumn(10).setPreferredWidth(0);
        columnModel.getColumn(11).setPreferredWidth(0);
        columnModel.getColumn(11).setPreferredWidth(0);

    }

    public void PasarDatos(rojeru_san.rsbutton.RSButtonEffect bBuscarCaE, rojeru_san.rsbutton.RSButtonEffect bListoCaE,
            JTable tAlumno, JTextField cIdMatricula, JTextField cIdAlumno, JTextField cNombres, JTextField cApellidos, JTextField cIdCatequista,
            JTextField cCatequista, JComboBox cbComunidad, JComboBox cbParroco, JComboBox cbNivel, JTextField cAnoInicio, JTextField cAnoFin, JTextField cObservacion) {
        int rec = tAlumno.getSelectedRow();
        cIdMatricula.setText((String) tAlumno.getValueAt(rec, 0));
        cIdAlumno.setText((String) tAlumno.getValueAt(rec, 1));
        cNombres.setText((String) tAlumno.getValueAt(rec, 2));
        cApellidos.setText((String) tAlumno.getValueAt(rec, 3));
        cIdCatequista.setText((String) tAlumno.getValueAt(rec, 4));
        cCatequista.setText((String) tAlumno.getValueAt(rec, 5));
        cbComunidad.setSelectedItem((String) tAlumno.getValueAt(rec, 6));
        cbNivel.setSelectedItem((String) tAlumno.getValueAt(rec, 7));
        cAnoInicio.setText((String) tAlumno.getValueAt(rec, 8));
        cAnoFin.setText((String) tAlumno.getValueAt(rec, 9));
        cbParroco.setSelectedItem((String) tAlumno.getValueAt(rec, 10));
        cObservacion.setText((String) tAlumno.getValueAt(rec, 11));
        this.Desbloquear(bBuscarCaE, bListoCaE, cbComunidad, cbParroco, cbNivel, cAnoInicio, cAnoFin, cObservacion);
    }
    // FIN -- PASAR REGISTRO A LA TABLA

    // INICIO -- REGISTRAR 
    public void RegistrarMatricula(JTextField cIdAlumno, JTextField cNombre, JTextField cIdCatequista, JTextField cApellido, JTextField cCelular01, JTextField cCelular02, JTextField cNombreCa, JTextField cComunidad,
            JComboBox cbIdComunidad, JComboBox cIdParroco, JComboBox cIdNivel, JTextField cAnoInicio, JTextField cAnoFin, JTextField cObservacion) {
        String mysql = "INSERT INTO Matricula(IdMatricula,IdAlumno,IdCatequista,IdComunidad,IdNivel,"
                + "IdParroco,PaseAno,AnoInicio,AnoFin,Observacion) VALUES(?,?,?,?,?,?,0,?,?,?)";
        try {
            if (cIdAlumno.getText().isEmpty() || cIdCatequista.getText().isEmpty() || cIdNivel.getSelectedIndex() == 0
                    || cIdParroco.getSelectedIndex() == 0 || cbIdComunidad.getSelectedIndex() == 0 || cAnoInicio.getText().isEmpty()
                    || cAnoFin.getText().isEmpty() || cObservacion.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Existen campos vacios");
                return;

            }
            if (!cbIdComunidad.getSelectedItem().equals(cComunidad.getText())) {
                JOptionPane.showMessageDialog(null, "La catequista debe pertenece a esa comunidad");
                return;
            }

            bdControlador.Registrar(mysql);
            bdControlador.ps.setInt(1, this.id());
            bdControlador.ps.setInt(2, Integer.parseInt(cIdAlumno.getText()));
            bdControlador.ps.setInt(3, Integer.parseInt(cIdCatequista.getText()));
            bdControlador.ps.setInt(4, cbIdComunidad.getSelectedIndex());
            bdControlador.ps.setInt(5, cIdNivel.getSelectedIndex());
            bdControlador.ps.setInt(6, cIdParroco.getSelectedIndex());
            bdControlador.ps.setInt(7, Integer.parseInt(cAnoInicio.getText()));
            bdControlador.ps.setInt(8, Integer.parseInt(cAnoFin.getText()));
            bdControlador.ps.setString(9, cObservacion.getText());
            bdControlador.ps.executeUpdate();
            bdControlador.ps.close();
            JOptionPane.showMessageDialog(null, "Se Guardó Correctamente");
            this.Vacio(cIdAlumno, cNombre, cIdCatequista, cApellido, cCelular01, cCelular02, cNombreCa, cComunidad, cbIdComunidad, cIdParroco, cIdNivel, cAnoInicio, cAnoFin, cObservacion);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Guardar" + "\n" + e);
        }
    }

    // FIN -- REGISTRAR 
    // INICIO -- MODIFICAR
    public void Modificar(JTextField cIdMatricula, JTextField cIdAlumno, JTextField cIdCatequista, JTextField cNombreCa,
            JComboBox cbComunidad, JComboBox cbParroco, JComboBox cbNivel, JTextField cAnoInicio, JTextField cAnoFin, JTextField cObservacion) {
        String mysql = "UPDATE matricula SET idAlumno=?,idCatequista=?,idComunidad=?,"
                + "idNivel=?,idParroco=?,anoInicio=?,anoFin=?,observacion=?  WHERE idMatricula=?";
        try {
            if (cNombreCa.getText().isEmpty() || cAnoInicio.getText().isEmpty()
                    || cAnoFin.getText().isEmpty() || cObservacion.getText().isEmpty()
                    || cbParroco.getSelectedIndex() == 0 || cbComunidad.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Existen campos vacios");
                return;

            }
            bdControlador.Registrar(mysql);
            bdControlador.ps.setInt(1, Integer.parseInt(cIdAlumno.getText()));
            bdControlador.ps.setInt(2, Integer.parseInt(cIdCatequista.getText()));
            bdControlador.ps.setInt(3, cbComunidad.getSelectedIndex());
            bdControlador.ps.setInt(4, cbNivel.getSelectedIndex());
            bdControlador.ps.setInt(5, cbParroco.getSelectedIndex());
            bdControlador.ps.setInt(6, Integer.parseInt(cAnoInicio.getText()));
            bdControlador.ps.setInt(7, Integer.parseInt(cAnoFin.getText()));
            bdControlador.ps.setString(8, cObservacion.getText());
            bdControlador.ps.setInt(9, Integer.parseInt(cIdMatricula.getText()));

            bdControlador.ps.executeUpdate();
            bdControlador.ps.close();
            JOptionPane.showMessageDialog(null, "Se Modificó Correctamente");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Guardar" + "\n" + e);
        }
    }

    public void ModificarCelular(JTextField cIdA, JTextField cCelular01, JTextField cCelular02) {
        String mysql = "UPDATE alumno SET celular01 =?,celular02=? WHERE idAlumno=?";
        try {
            if (cCelular01.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Existen campos vacios");
                return;
            }
            bdControlador.Registrar(mysql);
            bdControlador.ps.setString(1, cCelular01.getText());
            bdControlador.ps.setString(2, cCelular02.getText());
            bdControlador.ps.setInt(3, Integer.parseInt(cIdA.getText()));
            bdControlador.ps.executeUpdate();
            bdControlador.ps.close();
            cCelular01.setText("");
            cCelular02.setText("");
            JOptionPane.showMessageDialog(null, "Se Modificó Correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Guardar" + "\n" + e);
        }
    }

    // FIN -- MODIFICAR
    // INICIO -- ELIMINAR
    public void Eliminar(JTextField cIdMatricula, JTextField cIdAlumno, JTextField cNombre, JTextField cIdCatequista, JTextField cApellido, JTextField cNombreCa,
            JComboBox cbComunidad, JComboBox cbParroco, JComboBox cbNivel, JTextField cAnoInicio, JTextField cAnoFin, JTextField cObservacion) {
        String mysql = "DELETE FROM matricula WHERE idMatricula=?";

        try {
            if (cIdMatricula.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Existen campos vacios");
                return;

            }
            bdControlador.Eliminar(mysql);
            bdControlador.ps.setInt(1, Integer.parseInt(cIdMatricula.getText()));
            bdControlador.ps.executeUpdate();
            bdControlador.ps.close();
            JOptionPane.showMessageDialog(null, "Se Eliminó Correctamente");
            this.VacioE(cIdAlumno, cNombre, cIdCatequista, cApellido, cNombreCa, cbComunidad, cbParroco, cbNivel, cAnoInicio, cAnoFin, cObservacion);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Eliminar" + "\n" + e);
        }

    }
    // FIN-- ELIMINAR

    //INICIO-- PASAR DATOS A FORMULARIO
    private void LlenarMa(JTextField cNombreAl, JTextField cApellidoAl, JComboBox cbNivel, JComboBox cbComunidad,
            JTextField cAnoInicio, JTextField cAnoFin, JTextField cValor) {
        Matricula matricula = new Matricula();
        matricula.setNombres(cNombreAl.getText() + " " + cApellidoAl.getText());
        matricula.setNivel((String) cbNivel.getSelectedItem());
        matricula.setComunidad((String) cbComunidad.getSelectedItem());
        matricula.setAnoFin(cAnoInicio.getText() + " - " + cAnoFin.getText());
        matricula.setValor(cValor.getText());
        listaComprobante.add(matricula);

    }

    public void ReporteComprobante(JTextField cNombreAl, JTextField cApellidoAl, JComboBox cbNivel, JComboBox cbComunidad,
            JTextField cAnoInicio, JTextField cAnoFin, JTextField cValor) {
        LlenarMa(cNombreAl, cApellidoAl, cbNivel, cbComunidad, cAnoInicio, cAnoFin, cValor);

        Map parametro = new HashMap();
        parametro.put("logo", this.getClass().getResourceAsStream("/iconos/iSanPedro.jpg"));
        parametro.put("pTipoComp", "COMPROBANTE DE PAGO MATRICULA");
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

    //FIN-- PASAR DATOS A FORMULARIO
}


