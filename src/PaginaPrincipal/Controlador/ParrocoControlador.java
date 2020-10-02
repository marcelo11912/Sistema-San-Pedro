package PaginaPrincipal.Controlador;

import BaseDatos.BaseDatoControlador;
import Bean.Parroco;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ParrocoControlador {

    BaseDatoControlador bdControlador = new BaseDatoControlador();
    public ArrayList<Parroco> listaParroco = new ArrayList<>();

    // INICIO -- ENCONTRAR EL MAXIMO ID DE UNA TABLA
    private int id() throws SQLException {
        String mysqlId = "SELECT MAX(idParroco) FROM parroco";
        return bdControlador.ConsultarIdMax(mysqlId);

    }
    // FIN -- ENCONTRAR EL MAXIMO ID DE UNA TABLA

    // INICIO -- METODOS PARA VALIDACIONES
    public void Vacio(JTextField cNombre) {
        cNombre.setText("");

    }

    private void Desbloquear(JTextField cNombre) {
        cNombre.setEditable(true);

    }

    private void Bloquear(JTextField cNombre) {
        cNombre.setEditable(false);
    }
    // FIN -- METODOS PARA VALIDACIONES

    // INICIO -- PASAR REGISTRO A LA TABLA
    public void DatosTabla() {
        ResultSet rs;
        String mysql = "SELECT * FROM sanpedro.parroco";
        try {
            rs = bdControlador.Buscar(mysql);
            while (rs.next()) {
                Parroco parroco = new Parroco();
                parroco.setIdParroco(Integer.parseInt(rs.getString("IdParroco")));
                parroco.setNombre(rs.getString("Nombres"));
                listaParroco.add(parroco);
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error " + "\n" + e);
        }

    }

    public void LlenarTabla(DefaultTableModel model, JTable tParroco) {
        String[] titulos = {"ID", "NOMBRES"};
        model = new DefaultTableModel(null, titulos);
        String[] fila = new String[2];
        for (int i = 0; i < listaParroco.size(); i++) {
            fila[0] = listaParroco.get(i).getIdParroco() + "";
            fila[1] = listaParroco.get(i).getNombre();
            model.addRow(fila);
        }
        TableColumnModel columnModel = tParroco.getColumnModel();
        tParroco.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tParroco.doLayout();
        tParroco.setModel(model);
        columnModel.getColumn(0).setPreferredWidth(40);
        columnModel.getColumn(1).setPreferredWidth(250);        

    }

    public void PasarDatos(JTable tParroco, JTextField cIdE, JTextField cNombre) {
        int rec = tParroco.getSelectedRow();
        cIdE.setText((String) tParroco.getValueAt(rec, 0));
        cNombre.setText((String) tParroco.getValueAt(rec, 1));
    }
    // FIN -- PASAR REGISTRO A LA TABLA

    // INICIO -- REGISTRAR 
    public void RegistrarAlumno(JTextField cNombre) {
        String mysql = "INSERT INTO parroco (IdParroco,Nombres)VALUES(?,?)";
        try {
            if (cNombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Existen campos vacios");
                return;

            }
            bdControlador.Registrar(mysql);
            bdControlador.ps.setInt(1, this.id());
            bdControlador.ps.setString(2, cNombre.getText());

            bdControlador.ps.executeUpdate();
            bdControlador.ps.close();
            JOptionPane.showMessageDialog(null, "Se Guardó Correctamente");
            this.Vacio(cNombre);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Guardar" + "\n" + e);
        }
    }

    // FIN -- REGISTRAR 
    // INICIO -- MODIFICAR
    public void ModificarDoctor(JTextField cIdE, JTextField cNombre) {
        String mysql = "UPDATE parroco SET Nombres=? WHERE idParroco=?";
        try {
            if (cNombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Existen campos vacios");
                return;

            }
            bdControlador.Registrar(mysql);
            bdControlador.ps.setString(1, cNombre.getText());
            bdControlador.ps.setInt(2, Integer.parseInt(cIdE.getText()));

            bdControlador.ps.executeUpdate();
            bdControlador.ps.close();
            JOptionPane.showMessageDialog(null, "Se Guardó Correctamente");
            this.Vacio(cNombre);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Modificar" + "\n" + e);
        }
    }

    // FIN -- MODIFICAR
    // INICIO -- ELIMINAR
    public void Eliminar(JTextField cIdE, JTextField cNombre) {
        String mysql = "DELETE FROM parroco WHERE idParroco=?";

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
            this.Vacio(cNombre);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Eliminar" + "\n" + e);
        }

    }
    // FIN-- ELIMINAR
}






