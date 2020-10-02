package AccionEspecial;

import PaginaPrincipal.Paneles.PanelAlumno;
import PaginaPrincipal.Paneles.PanelCatequista;
import PaginaPrincipal.Paneles.PanelFeBautismo;
import PaginaPrincipal.Paneles.PanelMatricula;
import PaginaPrincipal.Paneles.PanelParroco;
import PaginaPrincipal.Paneles.PanelPaseAno;
import PaginaPrincipal.Paneles.PanelReporte;
import java.sql.SQLException;
import javax.swing.JPanel;

public class AccionBotones {

    public void botonParroco(JPanel PanelCambio) {
        PanelParroco panelParroco = new PanelParroco();
        panelParroco.setVisible(true);
        panelParroco.setSize(1000, 589);
        panelParroco.setLocation(5, 5);
        PanelCambio.removeAll();
        PanelCambio.add(panelParroco);
        PanelCambio.revalidate();
        PanelCambio.repaint();

    }

    public void botonAlumnos(JPanel PanelCambio) {
        PanelAlumno panelAlumno = new PanelAlumno();
        panelAlumno.setVisible(true);
        panelAlumno.setSize(1000, 589);
        panelAlumno.setLocation(5, 5);
        PanelCambio.removeAll();
        PanelCambio.add(panelAlumno);
        PanelCambio.revalidate();
        PanelCambio.repaint();

    }

    public void botonCatequista(JPanel PanelCambio) {
        PanelCatequista panelCatequista = new PanelCatequista();
        panelCatequista.setVisible(true);
        panelCatequista.setSize(1000, 589);
        panelCatequista.setLocation(5, 5);
        PanelCambio.removeAll();
        PanelCambio.add(panelCatequista);
        PanelCambio.revalidate();
        PanelCambio.repaint();

    }

    public void botonPaseAno(JPanel PanelCambio) {
        PanelPaseAno panelPaseAno = new PanelPaseAno();
        panelPaseAno.setVisible(true);
        panelPaseAno.setSize(1000, 589);
        panelPaseAno.setLocation(5, 5);
        PanelCambio.removeAll();
        PanelCambio.add(panelPaseAno);
        PanelCambio.revalidate();
        PanelCambio.repaint();

    }

    public void botonMatricula(JPanel PanelCambio) {
        PanelMatricula panelMatricula = new PanelMatricula();
        panelMatricula.setVisible(true);
        panelMatricula.setSize(1000, 589);
        panelMatricula.setLocation(5, 5);
        PanelCambio.removeAll();
        PanelCambio.add(panelMatricula);
        PanelCambio.revalidate();
        PanelCambio.repaint();
    }

    public void botonFeBautismo(JPanel PanelCambio) throws SQLException {
        PanelFeBautismo panelFeBautismo = new PanelFeBautismo();
        panelFeBautismo.setVisible(true);
        panelFeBautismo.setSize(1000, 589);
        panelFeBautismo.setLocation(5, 5);
        PanelCambio.removeAll();
        PanelCambio.add(panelFeBautismo);
        PanelCambio.revalidate();
        PanelCambio.repaint();
    }
    
     public void botonReporte(JPanel PanelCambio){
        PanelReporte panelReporte = new PanelReporte();
        panelReporte.setVisible(true);
        panelReporte.setSize(1000, 589);
        panelReporte.setLocation(5, 5);
        PanelCambio.removeAll();
        PanelCambio.add(panelReporte);
        PanelCambio.revalidate();
        PanelCambio.repaint();
    }

}




