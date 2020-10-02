package PaginaPrincipal.Controlador;

import BaseDatos.BaseDatoControlador;
import Bean.FeBautismo;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class FeBautismoControlador {

    BaseDatoControlador bdControlador = new BaseDatoControlador();
    public ArrayList<FeBautismo> listafeBautismo = new ArrayList<>();
    public ArrayList<FeBautismo> listafeBautismoR = new ArrayList<>();

    // INICIO -- ENCONTRAR EL MAXIMO ID DE UNA TABLA
    private int id() throws SQLException {
        String mysqlId = "SELECT MAX(idbautismo) FROM bautismo";
        return bdControlador.ConsultarIdMax(mysqlId);

    }

    private int IdRegParro() throws SQLException {
        String mysqlId = "SELECT MAX(idParroquial) FROM regparroquial";
        return bdControlador.ConsultarIdMax(mysqlId);

    }

    private int IdRegCivil() throws SQLException {
        String mysqlId = "SELECT MAX(idCivil) FROM regcivil";
        return bdControlador.ConsultarIdMax(mysqlId);

    }

    // FIN -- ENCONTRAR EL MAXIMO ID DE UNA TABLA
    // INICIO -- METODOS PARA VALIDACIONES
    public void IdRegParr(JTextField cIdParro) throws SQLException {
        cIdParro.setText(String.valueOf(IdRegParro()));

    }

    public void IdRegCiv(JTextField cIdCivil) throws SQLException {
        cIdCivil.setText(String.valueOf(IdRegCivil()));
    }

    public void Vacio(JTextField cNombres, JTextField cApellidos, JTextField cLugarNaci, JTextField cFechaNac, JTextField cFechaBau, JTextField cMadre, JTextField cPadre, JTextField cPadrinos, JTextField cSacerdote, JTextField cAnoP,
            JTextField cTomoP, JTextField cPaginaP, JTextField cNumeroP, JTextField cTomoC, JTextField cPaginaC, JTextField cNumeroC, JTextField cActac, JTextArea cNota, JComboBox cbFeBautismo) {
        cNombres.setText("");
        cApellidos.setText("");
        cLugarNaci.setText("");
        cFechaNac.setText("");
        cFechaBau.setText("");
        cMadre.setText("");
        cPadre.setText("");
        cPadrinos.setText("");
        cSacerdote.setText("");
        cAnoP.setText("");
        cTomoP.setText("");
        cPaginaP.setText("");
        cNumeroP.setText("");
        cTomoC.setText("");
        cPaginaC.setText("");
        cNumeroC.setText("");
        cActac.setText("");
        cNota.setText("");
        cbFeBautismo.setSelectedIndex(0);

    }

    private void Desbloquear(JTextField cNombres, JTextField cApellidos, JTextField cLugarNaci, JTextField cFechaNac, JTextField cFechaBau, JTextField cMadre, JTextField cPadre, JTextField cPadrinos, JTextField cSacerdote, JTextField cAnoP,
            JTextField cTomoP, JTextField cPaginaP, JTextField cNumeroP, JTextField cAnoC, JTextField cTomoC, JTextField cPaginaC, JTextField cActac, JTextArea cNota, JComboBox cbFeBautismo) {
        cNombres.setEditable(true);
        cApellidos.setEditable(true);
        cLugarNaci.setEditable(true);
        cFechaNac.setEditable(true);
        cFechaBau.setEditable(true);
        cMadre.setEditable(true);
        cPadre.setEditable(true);
        cPadrinos.setEditable(true);
        cSacerdote.setEditable(true);
        cAnoP.setEditable(true);
        cTomoP.setEditable(true);
        cPaginaP.setEditable(true);
        cNumeroP.setEditable(true);
        cAnoC.setEditable(true);
        cTomoC.setEditable(true);
        cPaginaC.setEditable(true);
        cActac.setEditable(true);
        cNota.setEditable(true);
        cbFeBautismo.setEnabled(true);
    }

    // FIN -- METODOS PARA VALIDACIONES
    // INICIO -- PASAR REGISTRO A LA TABLA
    public void DatosTabla() {
        ResultSet rs;
        String mysql = "SELECT IdBautismo , Apellidos, Nombres,LugarNacimiento, FechaNacimiento,\n"
                + "FechaBautizo, NombrePaterno, NombreMaterno,Sacerdote,padrinos,regparroquial.IdParroquial,\n"
                + "CAST(regparroquial.ano AS CHAR) as AnoP,regparroquial.tomo,regparroquial.pagina,regparroquial.numero,\n"
                + "regcivil.IdCivil,CAST(regcivil.ano AS CHAR) as AnoC,regcivil.tomo,regcivil.pagina,\n"
                + "regcivil.acta, regcivil.nota,if(supletorio=0,'FE DE BAUTISMO','SUPLETORIA') AS supletoria\n"
                + "FROM bautismo\n"
                + "INNER JOIN regparroquial ON regparroquial.IdParroquial=bautismo.IdParroquial \n"
                + "INNER JOIN regcivil ON regcivil.IdCivil=bautismo.IdCivil ";
        try {
            rs = bdControlador.Buscar(mysql);
            while (rs.next()) {
                FeBautismo feBautismo = new FeBautismo();
                feBautismo.setIdBautismo(Integer.parseInt(rs.getString("idBautismo")));
                feBautismo.setApellidos(rs.getString("Apellidos"));
                feBautismo.setNombres(rs.getString("Nombres"));
                feBautismo.setLugarNacimiento(rs.getString("LugarNacimiento"));
                feBautismo.setFechaNacimiento(rs.getString("FechaNacimiento"));
                feBautismo.setFechaBautizo(rs.getString("FechaBautizo"));
                feBautismo.setNombrePaterno(rs.getString("NombrePaterno"));
                feBautismo.setNombreMaterno(rs.getString("NombreMaterno"));
                feBautismo.setSacerdote(rs.getString("Sacerdote"));
                feBautismo.setPadrinos(rs.getString("Padrinos"));
                feBautismo.setIdParroquial(Integer.parseInt(rs.getString("IdParroquial")));
                feBautismo.setAnop(rs.getString("AnoP"));
                feBautismo.setTomoP(Integer.parseInt(rs.getString("regparroquial.tomo")));
                feBautismo.setPaginaP(Integer.parseInt(rs.getString("regparroquial.pagina")));
                feBautismo.setNumeroP(Integer.parseInt(rs.getString("regparroquial.numero")));
                feBautismo.setIdCivil(Integer.parseInt(rs.getString("IdCivil")));
                feBautismo.setAnoC(rs.getString("AnoC"));
                feBautismo.setTomoC(Integer.parseInt(rs.getString("regcivil.tomo")));
                feBautismo.setPaginaC(Integer.parseInt(rs.getString("regcivil.pagina")));
                feBautismo.setActa(Integer.parseInt(rs.getString("regcivil.acta")));
                feBautismo.setNota(rs.getString("regcivil.nota"));
                feBautismo.setSupletorio(rs.getString("supletoria"));
                listafeBautismo.add(feBautismo);
            }
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Guardar" + "\n" + e);
        }

    }

    public void LlenarTabla(DefaultTableModel model, JTable tAlumno) {
        String[] titulos = {" ", "APELLIDOS", "NOMBRES", "LUGARNACIMIENTO", "NACIMIENTO", "", "", " ", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
        model = new DefaultTableModel(null, titulos);
        String[] fila = new String[23];
        for (int i = 0; i < listafeBautismo.size(); i++) {
            fila[0] = listafeBautismo.get(i).getIdBautismo() + "";
            fila[1] = listafeBautismo.get(i).getApellidos();
            fila[2] = listafeBautismo.get(i).getNombres();
            fila[3] = listafeBautismo.get(i).getLugarNacimiento();
            fila[4] = listafeBautismo.get(i).getFechaNacimiento();
            fila[5] = listafeBautismo.get(i).getFechaBautizo();
            fila[6] = listafeBautismo.get(i).getNombrePaterno();
            fila[7] = listafeBautismo.get(i).getNombreMaterno();
            fila[8] = listafeBautismo.get(i).getSacerdote();
            fila[9] = listafeBautismo.get(i).getPadrinos();
            fila[10] = listafeBautismo.get(i).getIdParroquial() + "";
            fila[11] = listafeBautismo.get(i).getAnop() + "";
            fila[12] = listafeBautismo.get(i).getTomoP() + "";
            fila[13] = listafeBautismo.get(i).getPaginaP() + "";
            fila[14] = listafeBautismo.get(i).getNumeroP() + "";
            fila[15] = listafeBautismo.get(i).getIdCivil() + "";
            fila[16] = listafeBautismo.get(i).getAnoC();
            fila[17] = listafeBautismo.get(i).getTomoC() + "";
            fila[18] = listafeBautismo.get(i).getPaginaC() + "";
            fila[19] = listafeBautismo.get(i).getActa() + "";
            fila[20] = listafeBautismo.get(i).getNota();
            fila[21] = listafeBautismo.get(i).getSupletorio();
            model.addRow(fila);
        }
        TableColumnModel columnModel = tAlumno.getColumnModel();
        tAlumno.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tAlumno.doLayout();
        tAlumno.setModel(model);
        columnModel.getColumn(0).setMinWidth(0);
        columnModel.getColumn(0).setMaxWidth(0);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(150);
        columnModel.getColumn(3).setPreferredWidth(150);
        columnModel.getColumn(4).setPreferredWidth(150);
        columnModel.getColumn(5).setMinWidth(0);
        columnModel.getColumn(5).setMaxWidth(0);
        columnModel.getColumn(6).setMinWidth(0);
        columnModel.getColumn(6).setMaxWidth(0);
        columnModel.getColumn(7).setMinWidth(0);
        columnModel.getColumn(7).setMaxWidth(0);
        columnModel.getColumn(8).setMinWidth(0);
        columnModel.getColumn(8).setMaxWidth(0);
        columnModel.getColumn(9).setMinWidth(0);
        columnModel.getColumn(9).setMaxWidth(0);
        columnModel.getColumn(10).setMinWidth(0);
        columnModel.getColumn(10).setMaxWidth(0);
        columnModel.getColumn(11).setMinWidth(0);
        columnModel.getColumn(11).setMaxWidth(0);
        columnModel.getColumn(12).setMinWidth(0);
        columnModel.getColumn(12).setMaxWidth(0);
        columnModel.getColumn(13).setMinWidth(0);
        columnModel.getColumn(13).setMaxWidth(0);
        columnModel.getColumn(14).setMinWidth(0);
        columnModel.getColumn(14).setMaxWidth(0);
        columnModel.getColumn(15).setMinWidth(0);
        columnModel.getColumn(15).setMaxWidth(0);
        columnModel.getColumn(16).setMinWidth(0);
        columnModel.getColumn(16).setMaxWidth(0);
        columnModel.getColumn(17).setMinWidth(0);
        columnModel.getColumn(17).setMaxWidth(0);
        columnModel.getColumn(18).setMinWidth(0);
        columnModel.getColumn(18).setMaxWidth(0);
        columnModel.getColumn(19).setMinWidth(0);
        columnModel.getColumn(19).setMaxWidth(0);
        columnModel.getColumn(20).setMinWidth(0);
        columnModel.getColumn(20).setMaxWidth(0);
        columnModel.getColumn(21).setMinWidth(0);
        columnModel.getColumn(21).setMaxWidth(0);

    }

    public void PasarDatos(JTable tAlumno, JTextField cIdBau, JTextField cNombres, JTextField cApellidos, JTextField cLugarNaci, JTextField cFechaNac, JTextField cFechaBau, JTextField cMadre, JTextField cPadre, JTextField cPadrinos, JTextField cSacerdote, JTextField cAnoP,
            JTextField cTomoP, JTextField cPaginaP, JTextField cNumeroP, JTextField cAnoC, JTextField cTomoC, JTextField cPaginaC, JTextField cActac, JTextArea cNota, JComboBox cbFeBautismo,
            JTextField cIdParro, JTextField cIdCivil) {
        int rec = tAlumno.getSelectedRow();
        cIdBau.setText((String) tAlumno.getValueAt(rec, 0));
        cApellidos.setText((String) tAlumno.getValueAt(rec, 1));
        cNombres.setText((String) tAlumno.getValueAt(rec, 2));
        cLugarNaci.setText((String) tAlumno.getValueAt(rec, 3));
        cFechaNac.setText((String) tAlumno.getValueAt(rec, 4));
        cFechaBau.setText((String) tAlumno.getValueAt(rec, 5));
        cPadre.setText((String) tAlumno.getValueAt(rec, 6));
        cMadre.setText((String) tAlumno.getValueAt(rec, 7));
        cSacerdote.setText((String) tAlumno.getValueAt(rec, 8));
        cPadrinos.setText((String) tAlumno.getValueAt(rec, 9));
        cIdParro.setText((String) tAlumno.getValueAt(rec, 10));
        cAnoP.setText((String) tAlumno.getValueAt(rec, 11));
        cTomoP.setText((String) tAlumno.getValueAt(rec, 12));
        cPaginaP.setText((String) tAlumno.getValueAt(rec, 13));
        cNumeroP.setText((String) tAlumno.getValueAt(rec, 14));
        cIdCivil.setText((String) tAlumno.getValueAt(rec, 15));
        cAnoC.setText((String) tAlumno.getValueAt(rec, 16));
        cTomoC.setText((String) tAlumno.getValueAt(rec, 17));
        cPaginaC.setText((String) tAlumno.getValueAt(rec, 18));
        cActac.setText((String) tAlumno.getValueAt(rec, 19));
        cNota.setText((String) tAlumno.getValueAt(rec, 20));
        cbFeBautismo.setSelectedItem(tAlumno.getValueAt(rec, 21));
        this.Desbloquear(cNombres, cApellidos, cLugarNaci, cFechaNac, cFechaBau, cMadre, cPadre, cPadrinos, cSacerdote, cAnoP, cTomoP, cPaginaP, cNumeroP, cAnoC, cTomoC, cPaginaC, cActac, cNota, cbFeBautismo);

    }
    // FIN -- PASAR REGISTRO A LA TABLA

    // INICIO -- REGISTRAR
    private void RegistrarParro(JTextField cIdParro, JTextField cAnoP,
            JTextField cTomoP, JTextField cPaginaP, JTextField cNumeroP) {
        String mysql = "INSERT INTO regparroquial(IdParroquial,Ano,Tomo,Pagina,Numero) VALUES(?,?,?,?,?)";
        try {

            bdControlador.Registrar(mysql);
            bdControlador.ps.setInt(1, Integer.parseInt(cIdParro.getText()));
            bdControlador.ps.setInt(2, Integer.parseInt(cAnoP.getText()));
            bdControlador.ps.setInt(3, Integer.parseInt(cTomoP.getText()));
            bdControlador.ps.setInt(4, Integer.parseInt(cPaginaP.getText()));
            bdControlador.ps.setInt(5, Integer.parseInt(cNumeroP.getText()));
            bdControlador.ps.executeUpdate();
            bdControlador.ps.close();
        } catch (SQLException e) {

        }

    }

    private void RegistrarCivil(JTextField cIdCivil, JTextField cAnoC,
            JTextField cTomoC, JTextField cPaginaC, JTextField cActaC, JTextArea cNota) {
        String mysql = "INSERT INTO regcivil(IdCivil,Ano,Tomo,Pagina,Acta,Nota) VALUES(?,?,?,?,?,?)";
        try {
            bdControlador.Registrar(mysql);
            bdControlador.ps.setInt(1, Integer.parseInt(cIdCivil.getText()));
            bdControlador.ps.setInt(2, Integer.parseInt(cAnoC.getText()));
            bdControlador.ps.setInt(3, Integer.parseInt(cTomoC.getText()));
            bdControlador.ps.setInt(4, Integer.parseInt(cPaginaC.getText()));
            bdControlador.ps.setInt(5, Integer.parseInt(cActaC.getText()));
            bdControlador.ps.setString(6, cNota.getText());
            bdControlador.ps.executeUpdate();
            bdControlador.ps.close();
        } catch (SQLException e) {

        }

    }

    public void Registrar(JTextField cNombres, JTextField cApellidos, JTextField cLugarNaci, JTextField cFechaNac, JTextField cFechaBau, JTextField cMadre, JTextField cPadre, JTextField cPadrinos, JTextField cSacerdote, JTextField cAnoP,
            JTextField cTomoP, JTextField cPaginaP, JTextField cNumeroP, JTextField cAnoC, JTextField cTomoC, JTextField cPaginaC, JTextField cActac, JTextArea cNota, JComboBox cbFeBautismo,
            JTextField cIdParro, JTextField cIdCivil) {

        String mysql = "INSERT INTO bautismo(IdBautismo,Apellidos,Nombres,LugarNacimiento,FechaNacimiento,FechaBautizo,"
                + "NombrePaterno,NombreMaterno,sacerdote,IdParroquial,IdCivil,supletorio,padrinos) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {

            if (cNombres.getText().isEmpty() || cApellidos.getText().isEmpty() || cLugarNaci.getText().isEmpty() || cFechaNac.getText().isEmpty()
                    || cFechaBau.getText().isEmpty() || cPadrinos.getText().isEmpty() || cMadre.getText().isEmpty() || cPadre.getText().isEmpty()
                    || cSacerdote.getText().isEmpty() || cAnoP.getText().isEmpty() || cTomoP.getText().isEmpty()
                    || cPaginaP.getText().isEmpty() || cNumeroP.getText().isEmpty() || cAnoC.getText().isEmpty() || cTomoC.getText().isEmpty()
                    || cPaginaC.getText().isEmpty() || cActac.getText().isEmpty() || cNota.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Existen campos vacios");
                return;

            }
            RegistrarParro(cIdParro, cAnoP, cTomoP, cPaginaP, cNumeroP);
            RegistrarCivil(cIdCivil, cAnoC, cTomoC, cPaginaC, cActac, cNota);
            bdControlador.Registrar(mysql);
            bdControlador.ps.setInt(1, this.id());
            bdControlador.ps.setString(2, cApellidos.getText());
            bdControlador.ps.setString(3, cNombres.getText());
            bdControlador.ps.setString(4, cLugarNaci.getText());
            bdControlador.ps.setDate(5, Date.valueOf(cFechaNac.getText()));
            bdControlador.ps.setDate(6, Date.valueOf(cFechaBau.getText()));
            bdControlador.ps.setString(7, cPadre.getText());
            bdControlador.ps.setString(8, cMadre.getText());
            bdControlador.ps.setString(9, cSacerdote.getText());
            bdControlador.ps.setInt(10, Integer.parseInt(cIdParro.getText()));
            bdControlador.ps.setInt(11, Integer.parseInt(cIdCivil.getText()));
            bdControlador.ps.setInt(12, cbFeBautismo.getSelectedIndex());
            bdControlador.ps.setString(13, cPadrinos.getText());
            bdControlador.ps.executeUpdate();
            bdControlador.ps.close();
            JOptionPane.showMessageDialog(null, "Se Guardó Correctamente");
            this.Vacio(cNombres, cApellidos, cLugarNaci, cFechaNac, cFechaBau, cMadre, cPadre, cPadrinos, cSacerdote, cAnoP, cTomoP, cPaginaP, cNumeroP, cAnoC, cTomoC, cPaginaC, cActac, cNota, cbFeBautismo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Guardar" + "\n" + e);
        }
    }

    // FIN -- REGISTRAR 
    // INICIO -- MODIFICAR
    public void Modificar(JTextField cIdCivil, JTextField cIdBau, JTextField cIdParro, JTextField cNombres, JTextField cApellidos, JTextField cLugarNaci, JTextField cFechaNac, JTextField cFechaBau, JTextField cMadre, JTextField cPadre, JTextField cPadrinos, JTextField cSacerdote, JTextField cAnoP,
            JTextField cTomoP, JTextField cPaginaP, JTextField cNumeroP, JTextField cAnoC, JTextField cTomoC, JTextField cPaginaC, JTextField cActac, JTextArea cNota, JComboBox cbFeBautismo) {

        if (cNombres.getText().isEmpty() || cApellidos.getText().isEmpty() || cLugarNaci.getText().isEmpty() || cFechaNac.getText().isEmpty()
                || cFechaBau.getText().isEmpty() || cPadrinos.getText().isEmpty() || cMadre.getText().isEmpty() || cPadre.getText().isEmpty()
                || cSacerdote.getText().isEmpty() || cAnoP.getText().isEmpty() || cTomoP.getText().isEmpty()
                || cPaginaP.getText().isEmpty() || cNumeroP.getText().isEmpty() || cAnoC.getText().isEmpty() || cTomoC.getText().isEmpty()
                || cPaginaC.getText().isEmpty() || cActac.getText().isEmpty() || cNota.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Existen campos vacios");
            return;
        }
        ModificarParro(cIdParro, cAnoP, cTomoP, cPaginaP, cNumeroP);
        this.ModificarBauti(cIdBau, cNombres, cApellidos, cLugarNaci, cFechaNac, cFechaBau, cMadre, cPadre, cPadrinos, cSacerdote, cbFeBautismo);
        ModificarCivil(cIdCivil, cAnoC, cTomoC, cPaginaC, cActac, cNota);
        JOptionPane.showMessageDialog(null, "Se Guardo Correctamente");

    }

    private void ModificarBauti(JTextField cIdBau, JTextField cNombres, JTextField cApellidos, JTextField cLugarNaci, JTextField cFechaNac, JTextField cFechaBau, JTextField cMadre, JTextField cPadre,
            JTextField cPadrinos, JTextField cSacerdote, JComboBox cbFeBautismo) {
        String mysql = "UPDATE bautismo SET Apellidos =?,Nombres=?,LugarNacimiento=?,FechaNacimiento=?,FechaBautizo=?,"
                + "NombrePaterno =?,NombreMaterno=?,Sacerdote =?,Padrinos =?,Supletorio =? WHERE idBautismo=?";
        try {
            bdControlador.Registrar(mysql);
            bdControlador.ps.setString(1, cApellidos.getText());
            bdControlador.ps.setString(2, cNombres.getText());
            bdControlador.ps.setString(3, cLugarNaci.getText());
            bdControlador.ps.setDate(4, Date.valueOf(cFechaNac.getText()));
            bdControlador.ps.setDate(5, Date.valueOf(cFechaBau.getText()));
            bdControlador.ps.setString(6, cPadre.getText());
            bdControlador.ps.setString(7, cMadre.getText());
            bdControlador.ps.setString(8, cSacerdote.getText());
            bdControlador.ps.setString(9, cPadrinos.getText());
            bdControlador.ps.setInt(10, cbFeBautismo.getSelectedIndex());
            bdControlador.ps.setInt(11, Integer.parseInt(cIdBau.getText()));
            bdControlador.ps.executeUpdate();
            bdControlador.ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Modificar Datos Personales " + e);

        }
    }

    private void ModificarParro(JTextField cIdParro, JTextField cAnoP,
            JTextField cTomoP, JTextField cPaginaP, JTextField cNumeroP) {
        String mysql = "UPDATE regparroquial SET Ano =?,Tomo=?,Pagina=?,Numero=? WHERE idParroquial=?";
        try {
            bdControlador.Registrar(mysql);
            bdControlador.ps.setInt(1, Integer.parseInt(cAnoP.getText()));
            bdControlador.ps.setInt(2, Integer.parseInt(cTomoP.getText()));
            bdControlador.ps.setInt(3, Integer.parseInt(cPaginaP.getText()));
            bdControlador.ps.setInt(4, Integer.parseInt(cNumeroP.getText()));
            bdControlador.ps.setInt(5, Integer.parseInt(cIdParro.getText()));
            bdControlador.ps.executeUpdate();
            bdControlador.ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Modificar Datos Porroquiales" + "\n" + e);

        }
    }

    private void ModificarCivil(JTextField cIdCivil, JTextField cAnoC,
            JTextField cTomoC, JTextField cPaginaC, JTextField cActaC, JTextArea cNota) {
        String mysql = "UPDATE regcivil SET Ano =?,Tomo=?,Pagina=?,Acta=?,Nota=? WHERE idCivil=?";
        try {
            bdControlador.Registrar(mysql);
            bdControlador.ps.setInt(1, Integer.parseInt(cAnoC.getText()));
            bdControlador.ps.setInt(2, Integer.parseInt(cTomoC.getText()));
            bdControlador.ps.setInt(3, Integer.parseInt(cPaginaC.getText()));
            bdControlador.ps.setInt(4, Integer.parseInt(cActaC.getText()));
            bdControlador.ps.setString(5, cNota.getText());
            bdControlador.ps.setInt(6, Integer.parseInt(cIdCivil.getText()));
            bdControlador.ps.executeUpdate();
            bdControlador.ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Guardar Datos RegistroCivl" + "\n" + e);

        }
    }

    // FIN -- MODIFICAR
    // INICIO -- ELIMINAR
    public void Eliminar(JTextField cIdBau, JTextField cNombres, JTextField cApellidos, JTextField cLugarNaci, JTextField cFechaNac, JTextField cFechaBau, JTextField cMadre, JTextField cPadre, JTextField cPadrinos, JTextField cSacerdote, JTextField cAnoP,
            JTextField cTomoP, JTextField cPaginaP, JTextField cNumeroP, JTextField cAnoC, JTextField cTomoC, JTextField cPaginaC, JTextField cActac, JTextArea cNota, JComboBox cbFeBautismo,
            JTextField cIdParro, JTextField cIdCivil) {
        String mysql = "DELETE FROM bautismo WHERE idbautismo=?";

        try {
            if (cIdBau.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Existen campos vacios");
                return;

            }
            bdControlador.Eliminar(mysql);
            bdControlador.ps.setInt(1, Integer.parseInt(cIdBau.getText()));
            bdControlador.ps.executeUpdate();
            bdControlador.ps.close();
            JOptionPane.showMessageDialog(null, "Se Eliminó Correctamente");
            this.Vacio(cNombres, cApellidos, cLugarNaci, cFechaNac, cFechaBau, cMadre, cPadre, cPadrinos, cSacerdote, cAnoP, cTomoP, cPaginaP, cNumeroP, cAnoC, cTomoC, cPaginaC, cActac, cNota, cbFeBautismo);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al momento de Eliminar" + "\n" + e);
        }

    }
    // FIN-- ELIMINAR

    //INICIO-- PASAR DATOS A FORMULARIO
    public void LlenarCertBau(JTextField cNombres, JTextField cApellidos, JTextField cLugarNaci, JTextField cFechaNac, JTextField cFechaBau, JTextField cMadre, JTextField cPadre, JTextField cPadrinos, JTextField cSacerdote, JTextField cAnoP,
            JTextField cTomoP, JTextField cPaginaP, JTextField cNumeroP, JTextField cAnoC, JTextField cTomoC, JTextField cPaginaC, JTextField cActac, JTextArea cNota, JComboBox cbFeBautismo) {
        FeBautismo feBuatismo = new FeBautismo();
        feBuatismo.setNombres(cNombres.getText());
        feBuatismo.setApellidos(cApellidos.getText());
        feBuatismo.setLugarNacimiento(cLugarNaci.getText());
        feBuatismo.setFechaNacimiento(cFechaNac.getText());
        feBuatismo.setNombrePaterno(cPadre.getText());
        feBuatismo.setNombreMaterno(cMadre.getText());
        feBuatismo.setPadrinos(cPadrinos.getText());
        feBuatismo.setFechaBautizo(cFechaBau.getText());
        feBuatismo.setSacerdote(cSacerdote.getText());
        feBuatismo.setAnop(cAnoP.getText());
        feBuatismo.setTomoP(Integer.parseInt(cTomoP.getText()));
        feBuatismo.setPaginaP(Integer.parseInt(cPaginaP.getText()));
        feBuatismo.setNumeroP(Integer.parseInt(cNumeroP.getText()));
        feBuatismo.setAnoC(cAnoC.getText());
        feBuatismo.setTomoC(Integer.parseInt(cTomoC.getText()));
        feBuatismo.setPaginaC(Integer.parseInt(cPaginaC.getText()));
        feBuatismo.setActa(Integer.parseInt(cActac.getText()));
        feBuatismo.setNota(cNota.getText());
        if (cbFeBautismo.getSelectedIndex() == 0) {
            feBuatismo.setSupletorio("CERTIFICADO DE BAUTISMO");
        } else {
            feBuatismo.setSupletorio("CERTIFICADO SUPLETORIA DE BAUTISMO");
        }
        listafeBautismoR.add(feBuatismo);
    }

    public void ReporteCertBautismo(JTextField cNombres, JTextField cApellidos, JTextField cLugarNaci, JTextField cFechaNac, JTextField cFechaBau, JTextField cMadre, JTextField cPadre, JTextField cPadrinos, JTextField cSacerdote, JTextField cAnoP,
            JTextField cTomoP, JTextField cPaginaP, JTextField cNumeroP, JTextField cAnoC, JTextField cTomoC, JTextField cPaginaC, JTextField cActac, JTextArea cNota, JComboBox cbFeBautismo) {
        this.LlenarCertBau(cNombres, cApellidos, cLugarNaci, cFechaNac, cFechaBau, cMadre, cPadre, cPadrinos, cSacerdote, cAnoP, cTomoP, cPaginaP, cNumeroP, cAnoC, cTomoC, cPaginaC, cActac, cNota, cbFeBautismo);
        Map parametro = new HashMap();
        parametro.put("logo", this.getClass().getResourceAsStream("/iconos/iSanPedro.jpg"));
//        parametro.put("nombres", cNombreAl.getText() + " " + cApellidoAl.getText());
//        parametro.put("nivel", cbNivel.getSelectedItem());
//        parametro.put("comunidad", cbComunidad.getSelectedItem());
//        parametro.put("anoFin", cAnoInicio.getText() + " - " + cAnoFin.getText());

        JasperReport reporte; // Instaciamos el objeto reporte

        try {
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reporte/CertificadoBautismo.jasper"));
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, new JRBeanCollectionDataSource(this.listafeBautismoR)); //Agregamos los parametros para llenar el reporte
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

