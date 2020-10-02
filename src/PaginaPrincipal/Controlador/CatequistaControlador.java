package PaginaPrincipal.Controlador;

import BaseDatos.BaseDatoControlador;
import Bean.Catequista;
import Bean.Temporal;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class CatequistaControlador {

    BaseDatoControlador bdControlador = new BaseDatoControlador();
    public ArrayList<Catequista> listaCatequista = new ArrayList<>();

    // INICIO -- ENCONTRAR EL MAXIMO ID DE UNA TABLA
    private int id() throws SQLException {
        String mysqlId = "SELECT MAX(idCatequista) FROM Catequista";
        return bdControlador.ConsultarIdMax(mysqlId);

    }
    // FIN -- ENCONTRAR EL MAXIMO ID DE UNA TABLA

    // INICIO -- LLENAR COMBOBOX 
    public void Comunidad(JComboBox cbComunidad) {
        String nombreRegistro = "nombre";
        String mysql = "SELECT * FROM sanpedro.comunidad";
        bdControlador.LlenarCombo(cbComunidad, mysql, nombreRegistro);

    }
    // FIN -- LLENAR COMBOBOX 

    // INICIO -- METODOS PARA VALIDACIONES
    public void Vacio(JTextField cNombre, JComboBox cbComunidad, JComboBox cbCordinador) {
        cNombre.setText("");
        cbComunidad.setSelectedIndex(0);
        cbCordinador.setSelectedIndex(0);

    }

    private void Desbloquear(JTextField cNombre, JComboBox cbComunidad, JComboBox cbCordinador) {
        cNombre.setEditable(true);
        cbComunidad.setEditable(true);
        cbCordinador.setEditable(true);
    }

    private void Bloquear(JTextField cNombre, JComboBox cbComunidad, JComboBox cbCordinador) {
        cNombre.setEditable(false);
        cbComunidad.setEditable(false);
        cbCordinador.setEditable(false);
    }
    // FIN -- METODOS PARA VALIDACIONES

    // INICIO -- PASAR REGISTRO A LA TABLA
    public void DatosTabla() {
        ResultSet rs;
        String mysql = "SELECT idCatequista, Nombres, IF(Cordinador=0, 'NO', 'SI') AS Cordinador ,comunidad.Nombre AS Comunidad\n"
                + "FROM catequista \n"
                + "INNER JOIN comunidad ON catequista.IdComunidad = comunidad.IdComunidad; ";
        try {
            rs = bdControlador.Buscar(mysql);
            while (rs.next()) {
                Catequista catequista = new Catequista();
                catequista.setIdCatequista(Integer.parseInt(rs.getString("IdCatequista")));
                catequista.setNombres(rs.getString("Nombres"));
                catequista.setCordinador(rs.getString("Cordinador"));
                catequista.setComunidad(rs.getString("Comunidad"));
                listaCatequista.add(catequista);
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error " + "\n" + e);
        }

    }

    public void LlenarTabla(DefaultTableModel model, JTable tCatequista) {
        String[] titulos = {"ID", "NOMBRES", "COMUNIDAD", "CORDINADOR"};
        model = new DefaultTableModel(null, titulos);
        String[] fila = new String[4];
        for (int i = 0; i < listaCatequista.size(); i++) {
            fila[0] = listaCatequista.get(i).getIdCatequista() + "";
            fila[1] = listaCatequista.get(i).getNombres();
            fila[2] = listaCatequista.get(i).getComunidad();
            fila[3] = listaCatequista.get(i).getCordinador();

            model.addRow(fila);
        }
        TableColumnModel columnModel = tCatequista.getColumnModel();
        tCatequista.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tCatequista.doLayout();
        tCatequista.setModel(model);
        columnModel.getColumn(0).setPreferredWidth(40);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(150);

    }

    public void PasarDatos(JTable tCatequista, JTextField cIdE, JTextField cNombre, JComboBox cbComunidad, JComboBox cbCordinador) {
        int rec = tCatequista.getSelectedRow();
        cIdE.setText((String) tCatequista.getValueAt(rec, 0));
        cNombre.setText((String) tCatequista.getValueAt(rec, 1));
        cbComunidad.setSelectedItem((String) tCatequista.getValueAt(rec, 2));
        cbCordinador.setSelectedItem((String) tCatequista.getValueAt(rec, 3));
    }
    // FIN -- PASAR REGISTRO A LA TABLA

    // INICIO -- REGISTRAR 
    public void RegistrarAlumno(JTextField cNombre, JComboBox cbComunidad, JComboBox cbCordinador) {
        String mysql = "INSERT INTO catequista(IdCatequista,Nombres,Cordinador,IdComunidad)VALUES(?,?,?,?)";
        try {
            if (cNombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Existen campos vacios");
                return;

            }
            bdControlador.Registrar(mysql);
            bdControlador.ps.setInt(1, this.id());
            bdControlador.ps.setString(2, cNombre.getText());
            bdControlador.ps.setInt(3, cbCordinador.getSelectedIndex());
            bdControlador.ps.setInt(4, cbComunidad.getSelectedIndex());

            bdControlador.ps.executeUpdate();
            bdControlador.ps.close();
            JOptionPane.showMessageDialog(null, "Se Guardó Correctamente");
            this.Vacio(cNombre, cbComunidad, cbCordinador);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Guardar" + "\n" + e);
        }
    }

    // FIN -- REGISTRAR 
    // INICIO -- MODIFICAR
    public void Modificar(JTextField cIdE, JTextField cNombre, JComboBox cbComunidad, JComboBox cbCordinador) {
        String mysql = "UPDATE catequista SET Nombres=?,Cordinador=?,IdComunidad=? WHERE idCatequista=?";
        try {
            if (cNombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Existen campos vacios");
                return;

            }
            bdControlador.Registrar(mysql);
            bdControlador.ps.setString(1, cNombre.getText());
            bdControlador.ps.setInt(2, cbCordinador.getSelectedIndex());
            bdControlador.ps.setInt(3, cbComunidad.getSelectedIndex());
            bdControlador.ps.setInt(4, Integer.parseInt(cIdE.getText()));

            bdControlador.ps.executeUpdate();
            bdControlador.ps.close();
            JOptionPane.showMessageDialog(null, "Se Guardó Correctamente");
            this.Vacio(cNombre, cbComunidad, cbCordinador);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Modificar" + "\n" + e);
        }
    }

    // FIN -- MODIFICAR
    // INICIO -- ELIMINAR
    public void Eliminar(JTextField cIdE, JTextField cNombre, JComboBox cbComunidad, JComboBox cbCordinador) {
        String mysql = "DELETE FROM catequista WHERE idCatequista=?";

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
            this.Vacio(cNombre, cbComunidad, cbCordinador);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Eliminar" + "\n" + e);
        }

    }

    // FIN-- ELIMINAR
    public void DatosFormulario(JTable tCatequista, JDialog form) throws SQLException {

        Temporal tp = new Temporal();

        if (tCatequista.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila");
            return;
        }
        int num = tCatequista.getRowCount();

        for (int i = 0; i < num; i++) {
            if (tCatequista.isRowSelected(i)) {
                tp.setIdCatequesis((String) (tCatequista.getValueAt(i, 0)));
                tp.setNombreC((String) (tCatequista.getValueAt(i, 1)));
                tp.setComunidadC((String) (tCatequista.getValueAt(i, 2)));
                form.dispose();
                return;
            }
        }

    }
    //FIN-- PASAR DATOS A FORMULARIO
}


