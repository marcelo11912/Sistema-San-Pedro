package PaginaPrincipal.Controlador;

import BaseDatos.BaseDatoControlador;
import Bean.Alumno;
import Bean.Temporal;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class AlumnoControlador {

    BaseDatoControlador bdControlador = new BaseDatoControlador();
    public ArrayList<Alumno> listaAlumno = new ArrayList<>();

    // INICIO -- ENCONTRAR EL MAXIMO ID DE UNA TABLA
    private int id() throws SQLException {
        String mysqlId = "SELECT MAX(idAlumno) FROM alumno";
        return bdControlador.ConsultarIdMax(mysqlId);

    }

    // FIN -- ENCONTRAR EL MAXIMO ID DE UNA TABLA
    // INICIO -- METODOS PARA VALIDACIONES
    public void Vacio(JTextField cNombre, JTextField cApellido, JTextField cFechaNac, JTextField cFechaBautizo, JTextField cMadre, JTextField cPadre, JTextField cCelular01, JTextField cCelular02) {
        cNombre.setText("");
        cApellido.setText("");
        cFechaNac.setText("");
        cFechaBautizo.setText("");
        cMadre.setText("");
        cPadre.setText("");
        cCelular01.setText("");
        cCelular02.setText("");
    }

    private void Desbloquear(JTextField cNombre, JTextField cApellido, JTextField cFechaNac, JTextField cFechaBautizo, JTextField cMadre, JTextField cPadre, JTextField cCelular01, JTextField cCelular02) {
        cNombre.setEditable(true);
        cApellido.setEditable(true);
        cFechaNac.setEditable(true);
        cFechaBautizo.setEditable(true);
        cMadre.setEditable(true);
        cPadre.setEditable(true);
        cCelular01.setEditable(true);
        cCelular02.setEditable(true);
    }

    public void Bloquear(JTextField cNombre, JTextField cApellido, JTextField cFechaNac, JTextField cFechaBautizo, JTextField cMadre,
            JTextField cPadre, JTextField cCelular01, JTextField cCelular02) {
        cNombre.setEditable(false);
        cApellido.setEditable(false);
        cFechaNac.setEditable(false);
        cFechaBautizo.setEditable(false);
        cMadre.setEditable(false);
        cPadre.setEditable(false);
        cCelular01.setEditable(false);
        cCelular02.setEditable(false);

    }
    // FIN -- METODOS PARA VALIDACIONES

    // INICIO -- PASAR REGISTRO A LA TABLA
    public void DatosTabla() {
        ResultSet rs;
        String mysql = "SELECT * FROM sanpedro.alumno;";
        try {
            rs = bdControlador.Buscar(mysql);
            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(Integer.parseInt(rs.getString("idAlumno")));
                alumno.setApellidos(rs.getString("Apellidos"));
                alumno.setNombres(rs.getString("Nombres"));
                alumno.setFechaNaci(rs.getString("FechaNacimiento"));
                alumno.setFechaBautizo(rs.getString("FechaBautizo"));
                alumno.setPadre(rs.getString("NombrePaterno"));
                alumno.setMadre(rs.getString("NombreMaterno"));
                alumno.setCelular1(rs.getString("celular01"));
                alumno.setCelular2(rs.getString("celular02"));
                listaAlumno.add(alumno);
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Guardar" + "\n" + e);
        }

    }

    public void LlenarTabla(DefaultTableModel model, JTable tAlumno) {
        String[] titulos = {"ID", "APELLIDOS", "NOMBRES", "NACIMIENTO", "BAUTIZO", "PADRE", "MADRE", "CELULAR1", "CELULAR2"};
        model = new DefaultTableModel(null, titulos);
        String[] fila = new String[9];
        for (int i = 0; i < listaAlumno.size(); i++) {
            fila[0] = listaAlumno.get(i).getIdAlumno() + "";
            fila[1] = listaAlumno.get(i).getApellidos();
            fila[2] = listaAlumno.get(i).getNombres();
            fila[3] = listaAlumno.get(i).getFechaNaci();
            fila[4] = listaAlumno.get(i).getFechaBautizo();
            fila[5] = listaAlumno.get(i).getPadre();
            fila[6] = listaAlumno.get(i).getMadre();
            fila[7] = listaAlumno.get(i).getCelular1();
            fila[8] = listaAlumno.get(i).getCelular2();
            model.addRow(fila);
        }
        TableColumnModel columnModel = tAlumno.getColumnModel();
        tAlumno.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tAlumno.doLayout();
        tAlumno.setModel(model);
        columnModel.getColumn(0).setPreferredWidth(40);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(150);

    }

    public void PasarDatos(JTable tAlumno, JTextField cIdE, JTextField cNombreE, JTextField cApellidoE, JTextField cFechaNacE, JTextField cFechaBautizoE, JTextField cMadreE,
            JTextField cPadreE, JTextField cCelular01E, JTextField cCelular02E) {
        int rec = tAlumno.getSelectedRow();
        cIdE.setText((String) tAlumno.getValueAt(rec, 0));
        cNombreE.setText((String) tAlumno.getValueAt(rec, 2));
        cApellidoE.setText((String) tAlumno.getValueAt(rec, 1));
        cFechaNacE.setText((String) tAlumno.getValueAt(rec, 3));
        cFechaBautizoE.setText((String) tAlumno.getValueAt(rec, 4));
        cMadreE.setText((String) tAlumno.getValueAt(rec, 6));
        cPadreE.setText((String) tAlumno.getValueAt(rec, 5));
        cCelular01E.setText((String) tAlumno.getValueAt(rec, 7));
        cCelular02E.setText((String) tAlumno.getValueAt(rec, 8));

        this.Desbloquear(cNombreE, cApellidoE, cFechaNacE, cFechaBautizoE, cMadreE, cPadreE, cCelular01E, cCelular02E);

    }
    // FIN -- PASAR REGISTRO A LA TABLA

    // INICIO -- REGISTRAR 
    public void RegistrarAlumno(JTextField cNombre, JTextField cApellido, JTextField cFechaNac, JTextField cFechaBautizo, JTextField cMadre,
            JTextField cPadre, JTextField cCelular01, JTextField cCelular02) {
        String mysql = "INSERT INTO alumno(IdAlumno,Apellidos,Nombres,FechaNacimiento,FechaBautizo,"
                + "NombrePaterno,NombreMaterno,celular01,celular02) VALUES(?,?,?,?,?,?,?,?,?)";
        try {

            if (cNombre.getText().isEmpty() || cApellido.getText().isEmpty() || cFechaNac.getText().isEmpty()
                     || cMadre.getText().isEmpty() || cPadre.getText().isEmpty()
                    || cCelular01.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Existen campos vacios");
                return;

            }

            bdControlador.Registrar(mysql);
            bdControlador.ps.setInt(1, this.id());
            bdControlador.ps.setString(2, cApellido.getText());
            bdControlador.ps.setString(3, cNombre.getText());
            bdControlador.ps.setDate(4, Date.valueOf(cFechaNac.getText()));
            bdControlador.ps.setDate(5, Date.valueOf(cFechaBautizo.getText()));
            bdControlador.ps.setString(7, cMadre.getText());
            bdControlador.ps.setString(6, cPadre.getText());
            bdControlador.ps.setString(8, cCelular01.getText());
            bdControlador.ps.setString(9, cCelular02.getText());
            bdControlador.ps.executeUpdate();
            bdControlador.ps.close();
            JOptionPane.showMessageDialog(null, "Se Guardó Correctamente");
            this.Vacio(cNombre, cApellido, cFechaNac, cFechaBautizo, cMadre, cPadre, cCelular01, cCelular02);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Guardar" + "\n" + e);
        }
    }

    // FIN -- REGISTRAR 
    // INICIO -- MODIFICAR
    public void Modificar(JTextField cIdE, JTextField cNombre, JTextField cApellido, JTextField cFechaNac, JTextField cFechaBautizo, JTextField cMadre,
            JTextField cPadre, JTextField cCelular01, JTextField cCelular02) {
        String mysql = "UPDATE alumno SET Apellidos =?,Nombres=?,FechaNacimiento=?,FechaBautizo=?,"
                + "NombrePaterno =?,NombreMaterno=?,celular01 =?,celular02=? WHERE idAlumno=?";
        try {
            if (cNombre.getText().isEmpty() || cApellido.getText().isEmpty() || cFechaNac.getText().isEmpty()
                    || cFechaBautizo.getText().isEmpty() || cMadre.getText().isEmpty() || cPadre.getText().isEmpty()
                    || cCelular01.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Existen campos vacios");
                return;

            }

            bdControlador.Registrar(mysql);
            bdControlador.ps.setString(1, cApellido.getText());
            bdControlador.ps.setString(2, cNombre.getText());
            bdControlador.ps.setDate(3, Date.valueOf(cFechaNac.getText()));
            bdControlador.ps.setDate(4, Date.valueOf(cFechaBautizo.getText()));
            bdControlador.ps.setString(6, cMadre.getText());
            bdControlador.ps.setString(5, cPadre.getText());
            bdControlador.ps.setString(7, cCelular01.getText());
            bdControlador.ps.setString(8, cCelular02.getText());
            bdControlador.ps.setInt(9, Integer.parseInt(cIdE.getText()));
            bdControlador.ps.executeUpdate();
            bdControlador.ps.close();
            JOptionPane.showMessageDialog(null, "Se Modificó Correctamente");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Guardar" + "\n" + e);
        }
    }

    // FIN -- MODIFICAR
    // INICIO -- ELIMINAR
    public void Eliminar(JTextField cIdE, JTextField cNombre, JTextField cApellido, JTextField cFechaNac, JTextField cFechaBautizo, JTextField cMadre,
            JTextField cPadre, JTextField cCelular01, JTextField cCelular02) {
        String mysql = "DELETE FROM alumno WHERE idAlumno=?";

        try {
            if (cIdE.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Existen campos vacios");
                return;

            }
            bdControlador.Eliminar(mysql);
            bdControlador.ps.setInt(1, Integer.parseInt(cIdE.getText()));
            bdControlador.ps.executeUpdate();
            bdControlador.ps.close();
            JOptionPane.showMessageDialog(null, "Se Eliminó Correctamente");
            this.Vacio(cNombre, cApellido, cFechaNac, cFechaBautizo, cMadre, cPadre, cCelular01, cCelular02);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Eliminar" + "\n" + e);
        }

    }
    // FIN-- ELIMINAR

    //INICIO-- PASAR DATOS A FORMULARIO
    public void DatosFormulario(JTable tAlumno, JDialog form) throws SQLException {

        Temporal tp = new Temporal();

        if (tAlumno.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila");
            return;
        }
        int num = tAlumno.getRowCount();

        for (int i = 0; i < num; i++) {
            if (tAlumno.isRowSelected(i)) {
                tp.setIdAlumno((String) (tAlumno.getValueAt(i, 0)));
                tp.setNombreA((String) (tAlumno.getValueAt(i, 1)));
                tp.setApellidoA((String) (tAlumno.getValueAt(i, 2)));
                tp.setCelular01((String) (tAlumno.getValueAt(i, 7)));
                tp.setCelular02((String) (tAlumno.getValueAt(i, 8)));
                form.dispose();
                return;
            }
        }

    }
    //FIN-- PASAR DATOS A FORMULARIO
}








