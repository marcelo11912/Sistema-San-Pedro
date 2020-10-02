package PaginaPrincipal.Controlador;

import BaseDatos.BaseDatoControlador;
import Bean.Alumno;
import Bean.Historial;
import Bean.Matricula;
import Bean.Temporal;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class PaseAnoControlador {

    BaseDatoControlador bdControlador = new BaseDatoControlador();
    public ArrayList<Matricula> listaMatricula = new ArrayList<>();

    // INICIO -- ENCONTRAR EL MAXIMO ID DE UNA TABLA
    private int id() throws SQLException {
        String mysqlId = "SELECT MAX(idMatricula) FROM Matricula";
        return bdControlador.ConsultarIdMax(mysqlId);

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
    // FIN -- LLENAR COMBOBOX 

    // INICIO -- METODOS PARA VALIDACIONES
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

    private void Desbloquear(JComboBox cbPaseAno) {
        cbPaseAno.setEnabled(true);

    }

    public void VaciarTabla(DefaultTableModel modelo) {
        int numDatos = modelo.getRowCount();
        for (int i = 0; i < numDatos; i++) {
            modelo.removeRow(0);
        }
    }
    // FIN -- METODOS PARA VALIDACIONES

    // INICIO -- PASAR REGISTRO A LA TABLA
    public void DatosTabla() {
        ResultSet rs;
        String mysql = "SELECT IdMatricula,matricula.IdAlumno, alumno.nombres,alumno.apellidos,matricula.IdCatequista,catequista.Nombres as Catequista,comunidad.nombre as Comunidad,niveles.nombre as Nivel, CAST(AnoInicio AS CHAR) "
                + "as AnoInicio,CAST(AnoFin AS CHAR) as AnoFin,parroco.Nombres,Observacion, if(paseano=0,'NO PAGADO','PAGADO') AS PaseAño\n"
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
                matricula.setPaseAno(rs.getString("PaseAño"));

                listaMatricula.add(matricula);
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error" + "\n" + e);
        }

    }

    public void LlenarTablaMatri(DefaultTableModel model, JTable tHistorial, JTextField cAnoInicioB, JTextField cAnoFinB) {

        String[] titulos = {"IDMATRICULA", "IDALUMNO", "NOMBRES", "APELLIDOS", "IDCATEQUISTA", "CATEQUISTA", "COMUNIDAD", "NIVEL", "ANOINICIO", "ANOFIN", "PARROCO", "OBSERVACION", "PASE"};
        model = new DefaultTableModel(null, titulos);
        String[] fila = new String[14];

        for (int i = 0; i < listaMatricula.size(); i++) {
            if (listaMatricula.get(i).getAnoInicio().equals(cAnoInicioB.getText()) && listaMatricula.get(i).getAnoFin().equals(cAnoFinB.getText())) {
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
                fila[12] = listaMatricula.get(i).getPaseAno();
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
        columnModel.getColumn(4).setMinWidth(0);
        columnModel.getColumn(4).setMaxWidth(0);
        columnModel.getColumn(5).setPreferredWidth(150);
        columnModel.getColumn(6).setPreferredWidth(150);
        columnModel.getColumn(7).setPreferredWidth(150);
        columnModel.getColumn(10).setPreferredWidth(0);
        columnModel.getColumn(10).setPreferredWidth(0);
        columnModel.getColumn(11).setPreferredWidth(0);
        columnModel.getColumn(11).setPreferredWidth(0);
        columnModel.getColumn(12).setPreferredWidth(0);
        columnModel.getColumn(12).setPreferredWidth(0);

    }

    public void PasarDatos(JTable tAlumno, JTextField cIdMatricula, JTextField cIdAlumno, JTextField cNombres, JTextField cApellidos, JTextField cIdCatequista,
            JTextField cCatequista, JComboBox cbComunidad, JComboBox cbParroco, JComboBox cbNivel, JTextField cAnoInicio, JTextField cAnoFin, JTextField cObservacion, JComboBox cbPaseAno) {
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
        cbPaseAno.setSelectedItem((String) tAlumno.getValueAt(rec, 12));
        System.out.println((String) tAlumno.getValueAt(rec, 12));
        this.Desbloquear(cbPaseAno);
    }
    // FIN -- PASAR REGISTRO A LA TABLA

    // INICIO -- MODIFICAR
    public void Modificar(JTextField cIdMatricula, JComboBox cbPaseAno) {
        String mysql = "UPDATE matricula SET PaseAno=? WHERE idMatricula=?";
        try {

            bdControlador.Registrar(mysql);
            bdControlador.ps.setInt(1, cbPaseAno.getSelectedIndex());
            bdControlador.ps.setInt(2, Integer.parseInt(cIdMatricula.getText()));

            bdControlador.ps.executeUpdate();
            bdControlador.ps.close();
            JOptionPane.showMessageDialog(null, "Se Modificó Correctamente");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Guardar" + "\n" + e);
        }
    }

   

    // FIN -- MODIFICAR
  
}






