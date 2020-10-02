package PaginaPrincipal.Paneles;

import AccionEspecial.Accion;
import PaginaPrincipal.Controlador.FeBautismoControlador;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelFeBautismo extends javax.swing.JPanel {

    Accion accion = new Accion();
    FeBautismoControlador feBautismoControlador = new FeBautismoControlador();

    DefaultTableModel modelo;

    public PanelFeBautismo() throws SQLException {
        initComponents();
        this.cIdCivilE.setVisible(false);
        this.cIdParro.setVisible(false);
        this.cIdCivil.setVisible(false);
        this.cIdParroE.setVisible(false);
        this.cIdBau.setVisible(false);
        feBautismoControlador.IdRegCiv(cIdCivil);
        feBautismoControlador.IdRegParr(cIdParro);
        feBautismoControlador.DatosTabla();
        feBautismoControlador.LlenarTabla(modelo, tBautizado);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgGenero = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pRegistrar = new javax.swing.JPanel();
        pDatos = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        cNombre = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cApellido = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cFechaNac = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cFechaBautizo = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        cLugarNac = new javax.swing.JTextField();
        pDatos1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        cMadre = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cPadre = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        cPadrinos = new javax.swing.JTextField();
        pDatos2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        cAnoP = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        cPaginaP = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        cTomoP = new javax.swing.JTextField();
        cNumeroP = new javax.swing.JTextField();
        bNuevo = new rojeru_san.rsbutton.RSButtonEffect();
        bRegistrar = new rojeru_san.rsbutton.RSButtonEffect();
        pDatos6 = new javax.swing.JPanel();
        cAnoC = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        cPaginaC = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        cTomoC = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        cActaC = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ctNota = new javax.swing.JTextArea();
        pDatos7 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        cSacerdote = new javax.swing.JTextField();
        cbFeBautismo = new javax.swing.JComboBox<>();
        cIdCivil = new javax.swing.JTextField();
        cIdParro = new javax.swing.JTextField();
        bCertificado = new rojeru_san.rsbutton.RSButtonEffect();
        pEditar = new javax.swing.JPanel();
        pBuscarDoctor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tBautizado = new javax.swing.JTable();
        cBuscar = new javax.swing.JTextField();
        bEditar = new rojeru_san.rsbutton.RSButtonEffect();
        bEliminar = new rojeru_san.rsbutton.RSButtonEffect();
        pDatos3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        cNombreE = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cApellidoE = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        cFechaNacE = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        cFechaBautizoE = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        cLugarNacE = new javax.swing.JTextField();
        pDatos4 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        cMadreE = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        cPadreE = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        cPadrinosE = new javax.swing.JTextField();
        pDatos8 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        cAnoPE = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        cPaginaPE = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        cTomoPE = new javax.swing.JTextField();
        cNumeroPE = new javax.swing.JTextField();
        pDatos10 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        cSacerdoteE = new javax.swing.JTextField();
        pDatos11 = new javax.swing.JPanel();
        cAnoCE = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        cPaginaCE = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        cTomoCE = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        cActaCE = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ctNotaE = new javax.swing.JTextArea();
        cIdCivilE = new javax.swing.JTextField();
        cbFeBautismoE = new javax.swing.JComboBox<>();
        cIdBau = new javax.swing.JTextField();
        cIdParroE = new javax.swing.JTextField();
        bCertificado1 = new rojeru_san.rsbutton.RSButtonEffect();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        pRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        pRegistrar.setLayout(null);

        pDatos.setBackground(new java.awt.Color(255, 255, 255));
        pDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Personales"));
        pDatos.setAutoscrolls(true);

        jLabel13.setText("NOMBRES");

        cNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cNombreKeyTyped(evt);
            }
        });

        jLabel14.setText("APELLIDOS");

        cApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cApellidoKeyTyped(evt);
            }
        });

        jLabel15.setText("LUGAR DE NACIMIENTO");

        cFechaNac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cFechaNacKeyTyped(evt);
            }
        });

        jLabel16.setText("FECHA DE BAUTIZO");

        cFechaBautizo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cFechaBautizoKeyTyped(evt);
            }
        });

        jLabel29.setText("FECHA DE NACIMIENTO");

        cLugarNac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cLugarNacKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDatosLayout = new javax.swing.GroupLayout(pDatos);
        pDatos.setLayout(pDatosLayout);
        pDatosLayout.setHorizontalGroup(
            pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatosLayout.createSequentialGroup()
                        .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pDatosLayout.createSequentialGroup()
                        .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cFechaBautizo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cLugarNac, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        pDatosLayout.setVerticalGroup(
            pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cLugarNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cFechaBautizo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pRegistrar.add(pDatos);
        pDatos.setBounds(10, 40, 530, 200);

        pDatos1.setBackground(new java.awt.Color(255, 255, 255));
        pDatos1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Familiares"));
        pDatos1.setAutoscrolls(true);

        jLabel17.setText("MADRE");

        cMadre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cMadreKeyTyped(evt);
            }
        });

        jLabel18.setText("PADRE");

        cPadre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cPadreKeyTyped(evt);
            }
        });

        jLabel45.setText("PADRINOS");

        cPadrinos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cPadrinosKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDatos1Layout = new javax.swing.GroupLayout(pDatos1);
        pDatos1.setLayout(pDatos1Layout);
        pDatos1Layout.setHorizontalGroup(
            pDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                    .addComponent(jLabel45))
                .addGap(32, 32, 32)
                .addGroup(pDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cMadre, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(cPadre, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(cPadrinos))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        pDatos1Layout.setVerticalGroup(
            pDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cMadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cPadrinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pRegistrar.add(pDatos1);
        pDatos1.setBounds(10, 240, 530, 130);

        pDatos2.setBackground(new java.awt.Color(255, 255, 255));
        pDatos2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Registro Parroquial\n"));
        pDatos2.setAutoscrolls(true);

        jLabel19.setText("Año");

        cAnoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAnoPActionPerformed(evt);
            }
        });
        cAnoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cAnoPKeyTyped(evt);
            }
        });

        jLabel20.setText("Tomo");

        cPaginaP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cPaginaPKeyTyped(evt);
            }
        });

        jLabel32.setText("Número");

        jLabel33.setText("Página");

        cTomoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cTomoPKeyTyped(evt);
            }
        });

        cNumeroP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cNumeroPKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDatos2Layout = new javax.swing.GroupLayout(pDatos2);
        pDatos2.setLayout(pDatos2Layout);
        pDatos2Layout.setHorizontalGroup(
            pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cPaginaP, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(cAnoP))
                .addGap(18, 18, 18)
                .addGroup(pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatos2Layout.createSequentialGroup()
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cNumeroP, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDatos2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cTomoP, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        pDatos2Layout.setVerticalGroup(
            pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cAnoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cTomoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cPaginaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cNumeroP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pRegistrar.add(pDatos2);
        pDatos2.setBounds(560, 10, 270, 100);

        bNuevo.setBackground(new java.awt.Color(102, 102, 255));
        bNuevo.setText("NUEVO");
        bNuevo.setColorHover(new java.awt.Color(153, 153, 255));
        bNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevoActionPerformed(evt);
            }
        });
        pRegistrar.add(bNuevo);
        bNuevo.setBounds(340, 470, 120, 40);

        bRegistrar.setBackground(new java.awt.Color(0, 204, 102));
        bRegistrar.setText("REGISTRAR");
        bRegistrar.setColorHover(new java.awt.Color(0, 255, 102));
        bRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistrarActionPerformed(evt);
            }
        });
        pRegistrar.add(bRegistrar);
        bRegistrar.setBounds(480, 470, 120, 40);

        pDatos6.setBackground(new java.awt.Color(255, 255, 255));
        pDatos6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Registro Civil\n"));
        pDatos6.setAutoscrolls(true);

        cAnoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAnoCActionPerformed(evt);
            }
        });
        cAnoC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cAnoCKeyTyped(evt);
            }
        });

        jLabel34.setText("Año");

        jLabel35.setText("Página");

        cPaginaC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cPaginaCKeyTyped(evt);
            }
        });

        jLabel37.setText("Tomo");

        cTomoC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cTomoCKeyTyped(evt);
            }
        });

        jLabel38.setText("Acta");

        cActaC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cActaCKeyTyped(evt);
            }
        });

        jLabel39.setText("Nota");

        ctNota.setColumns(20);
        ctNota.setRows(5);
        ctNota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ctNotaKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(ctNota);

        javax.swing.GroupLayout pDatos6Layout = new javax.swing.GroupLayout(pDatos6);
        pDatos6.setLayout(pDatos6Layout);
        pDatos6Layout.setHorizontalGroup(
            pDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatos6Layout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDatos6Layout.createSequentialGroup()
                        .addGroup(pDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cPaginaC, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                            .addComponent(cAnoC))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cTomoC, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDatos6Layout.createSequentialGroup()
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cActaC, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pDatos6Layout.setVerticalGroup(
            pDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cAnoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cTomoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cPaginaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cActaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(pDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDatos6Layout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addContainerGap())
        );

        pRegistrar.add(pDatos6);
        pDatos6.setBounds(560, 120, 270, 190);

        pDatos7.setBackground(new java.awt.Color(255, 255, 255));
        pDatos7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Sacerdote que Bautizó"));
        pDatos7.setAutoscrolls(true);

        jLabel30.setText("SACERDOTE");

        cSacerdote.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cSacerdoteKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDatos7Layout = new javax.swing.GroupLayout(pDatos7);
        pDatos7.setLayout(pDatos7Layout);
        pDatos7Layout.setHorizontalGroup(
            pDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(cSacerdote, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        pDatos7Layout.setVerticalGroup(
            pDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cSacerdote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pRegistrar.add(pDatos7);
        pDatos7.setBounds(10, 380, 530, 70);

        cbFeBautismo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FE DE BAUTISMO", "SUPLETORIA" }));
        pRegistrar.add(cbFeBautismo);
        cbFeBautismo.setBounds(20, 10, 150, 20);

        cIdCivil.setEditable(false);
        cIdCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cIdCivilActionPerformed(evt);
            }
        });
        cIdCivil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cIdCivilKeyTyped(evt);
            }
        });
        pRegistrar.add(cIdCivil);
        cIdCivil.setBounds(430, 10, 60, 20);

        cIdParro.setEditable(false);
        cIdParro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cIdParroActionPerformed(evt);
            }
        });
        cIdParro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cIdParroKeyTyped(evt);
            }
        });
        pRegistrar.add(cIdParro);
        cIdParro.setBounds(360, 10, 50, 20);

        bCertificado.setBackground(new java.awt.Color(0, 153, 153));
        bCertificado.setText("CERTIFICADO");
        bCertificado.setColorHover(new java.awt.Color(0, 204, 204));
        bCertificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCertificadoActionPerformed(evt);
            }
        });
        pRegistrar.add(bCertificado);
        bCertificado.setBounds(620, 470, 120, 40);

        jTabbedPane1.addTab("FE BAUTISMO", pRegistrar);

        pEditar.setBackground(new java.awt.Color(255, 255, 255));
        pEditar.setLayout(null);

        pBuscarDoctor.setBackground(new java.awt.Color(255, 255, 255));
        pBuscarDoctor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Buscar Bautizado"));

        tBautizado = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tBautizado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tBautizado.setSelectionBackground(new java.awt.Color(0, 128, 255));
        tBautizado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tBautizadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tBautizado);

        cBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cBuscarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pBuscarDoctorLayout = new javax.swing.GroupLayout(pBuscarDoctor);
        pBuscarDoctor.setLayout(pBuscarDoctorLayout);
        pBuscarDoctorLayout.setHorizontalGroup(
            pBuscarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBuscarDoctorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pBuscarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(cBuscar))
                .addContainerGap())
        );
        pBuscarDoctorLayout.setVerticalGroup(
            pBuscarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBuscarDoctorLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(cBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pEditar.add(pBuscarDoctor);
        pBuscarDoctor.setBounds(10, 0, 360, 250);

        bEditar.setBackground(new java.awt.Color(255, 204, 0));
        bEditar.setText("EDITAR");
        bEditar.setColorHover(new java.awt.Color(255, 204, 51));
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });
        pEditar.add(bEditar);
        bEditar.setBounds(340, 500, 100, 40);

        bEliminar.setBackground(new java.awt.Color(221, 87, 76));
        bEliminar.setText("ELIMINAR");
        bEliminar.setColorHover(new java.awt.Color(248, 133, 124));
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });
        pEditar.add(bEliminar);
        bEliminar.setBounds(460, 500, 100, 40);

        pDatos3.setBackground(new java.awt.Color(255, 255, 255));
        pDatos3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Personales"));
        pDatos3.setAutoscrolls(true);

        jLabel21.setText("NOMBRES");

        cNombreE.setEditable(false);
        cNombreE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cNombreEKeyTyped(evt);
            }
        });

        jLabel22.setText("APELLIDOS");

        cApellidoE.setEditable(false);
        cApellidoE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cApellidoEKeyTyped(evt);
            }
        });

        jLabel25.setText("LUGAR DE NACIMIENTO");

        cFechaNacE.setEditable(false);
        cFechaNacE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cFechaNacEKeyTyped(evt);
            }
        });

        jLabel26.setText("FECHA DE BAUTIZO");

        cFechaBautizoE.setEditable(false);
        cFechaBautizoE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cFechaBautizoEKeyTyped(evt);
            }
        });

        jLabel31.setText("FECHA DE NACIMIENTO");

        cLugarNacE.setEditable(false);
        cLugarNacE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cLugarNacEKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDatos3Layout = new javax.swing.GroupLayout(pDatos3);
        pDatos3.setLayout(pDatos3Layout);
        pDatos3Layout.setHorizontalGroup(
            pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cApellidoE, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cFechaBautizoE, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cFechaNacE, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cLugarNacE, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        pDatos3Layout.setVerticalGroup(
            pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cApellidoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cLugarNacE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cFechaNacE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cFechaBautizoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pEditar.add(pDatos3);
        pDatos3.setBounds(380, 40, 480, 200);

        pDatos4.setBackground(new java.awt.Color(255, 255, 255));
        pDatos4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Familiares"));
        pDatos4.setAutoscrolls(true);

        jLabel27.setText("MADRE");

        cMadreE.setEditable(false);
        cMadreE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cMadreEKeyTyped(evt);
            }
        });

        jLabel28.setText("PADRE");

        cPadreE.setEditable(false);
        cPadreE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cPadreEKeyTyped(evt);
            }
        });

        jLabel44.setText("PADRINOS");

        cPadrinosE.setEditable(false);
        cPadrinosE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cPadrinosEKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDatos4Layout = new javax.swing.GroupLayout(pDatos4);
        pDatos4.setLayout(pDatos4Layout);
        pDatos4Layout.setHorizontalGroup(
            pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cPadreE, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addComponent(cMadreE)
                    .addComponent(cPadrinosE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pDatos4Layout.setVerticalGroup(
            pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cMadreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cPadreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cPadrinosE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pEditar.add(pDatos4);
        pDatos4.setBounds(380, 250, 480, 130);

        pDatos8.setBackground(new java.awt.Color(255, 255, 255));
        pDatos8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Registro Parroquial\n"));
        pDatos8.setAutoscrolls(true);

        jLabel40.setText("Año");

        cAnoPE.setEditable(false);
        cAnoPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAnoPEActionPerformed(evt);
            }
        });
        cAnoPE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cAnoPEKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cAnoPEKeyTyped(evt);
            }
        });

        jLabel41.setText("Tomo");

        cPaginaPE.setEditable(false);
        cPaginaPE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cPaginaPEKeyTyped(evt);
            }
        });

        jLabel42.setText("Número");

        jLabel43.setText("Página");

        cTomoPE.setEditable(false);
        cTomoPE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cTomoPEKeyTyped(evt);
            }
        });

        cNumeroPE.setEditable(false);
        cNumeroPE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cNumeroPEKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDatos8Layout = new javax.swing.GroupLayout(pDatos8);
        pDatos8.setLayout(pDatos8Layout);
        pDatos8Layout.setHorizontalGroup(
            pDatos8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cPaginaPE, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(cAnoPE))
                .addGap(18, 18, 18)
                .addGroup(pDatos8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatos8Layout.createSequentialGroup()
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cNumeroPE, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDatos8Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cTomoPE, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        pDatos8Layout.setVerticalGroup(
            pDatos8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cAnoPE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cTomoPE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cPaginaPE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cNumeroPE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pEditar.add(pDatos8);
        pDatos8.setBounds(10, 260, 270, 100);

        pDatos10.setBackground(new java.awt.Color(255, 255, 255));
        pDatos10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Sacerdote que Bautizó"));
        pDatos10.setAutoscrolls(true);

        jLabel50.setText("SACERDOTE");

        cSacerdoteE.setEditable(false);
        cSacerdoteE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cSacerdoteEKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDatos10Layout = new javax.swing.GroupLayout(pDatos10);
        pDatos10.setLayout(pDatos10Layout);
        pDatos10Layout.setHorizontalGroup(
            pDatos10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos10Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cSacerdoteE, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pDatos10Layout.setVerticalGroup(
            pDatos10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cSacerdoteE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pEditar.add(pDatos10);
        pDatos10.setBounds(380, 380, 480, 70);

        pDatos11.setBackground(new java.awt.Color(255, 255, 255));
        pDatos11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Registro Civil\n"));
        pDatos11.setAutoscrolls(true);

        cAnoCE.setEditable(false);
        cAnoCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAnoCEActionPerformed(evt);
            }
        });
        cAnoCE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cAnoCEKeyTyped(evt);
            }
        });

        jLabel51.setText("Año");

        jLabel52.setText("Página");

        cPaginaCE.setEditable(false);
        cPaginaCE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cPaginaCEKeyTyped(evt);
            }
        });

        jLabel54.setText("Tomo");

        cTomoCE.setEditable(false);
        cTomoCE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cTomoCEKeyTyped(evt);
            }
        });

        jLabel55.setText("Acta");

        cActaCE.setEditable(false);
        cActaCE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cActaCEKeyTyped(evt);
            }
        });

        jLabel56.setText("Nota");

        ctNotaE.setEditable(false);
        ctNotaE.setColumns(20);
        ctNotaE.setRows(5);
        ctNotaE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ctNotaEKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(ctNotaE);

        javax.swing.GroupLayout pDatos11Layout = new javax.swing.GroupLayout(pDatos11);
        pDatos11.setLayout(pDatos11Layout);
        pDatos11Layout.setHorizontalGroup(
            pDatos11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatos11Layout.createSequentialGroup()
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDatos11Layout.createSequentialGroup()
                        .addGroup(pDatos11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pDatos11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cPaginaCE, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                            .addComponent(cAnoCE))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cTomoCE, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDatos11Layout.createSequentialGroup()
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cActaCE, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        pDatos11Layout.setVerticalGroup(
            pDatos11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cAnoCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cTomoCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cPaginaCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cActaCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pDatos11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDatos11Layout.createSequentialGroup()
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addContainerGap())
        );

        pEditar.add(pDatos11);
        pDatos11.setBounds(10, 370, 270, 180);

        cIdCivilE.setEditable(false);
        cIdCivilE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cIdCivilEActionPerformed(evt);
            }
        });
        cIdCivilE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cIdCivilEKeyTyped(evt);
            }
        });
        pEditar.add(cIdCivilE);
        cIdCivilE.setBounds(640, 10, 30, 20);

        cbFeBautismoE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FE DE BAUTISMO", "SUPLETORIA" }));
        cbFeBautismoE.setEnabled(false);
        pEditar.add(cbFeBautismoE);
        cbFeBautismoE.setBounds(380, 10, 140, 20);

        cIdBau.setEditable(false);
        cIdBau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cIdBauActionPerformed(evt);
            }
        });
        cIdBau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cIdBauKeyTyped(evt);
            }
        });
        pEditar.add(cIdBau);
        cIdBau.setBounds(550, 10, 30, 20);

        cIdParroE.setEditable(false);
        cIdParroE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cIdParroEActionPerformed(evt);
            }
        });
        cIdParroE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cIdParroEKeyTyped(evt);
            }
        });
        pEditar.add(cIdParroE);
        cIdParroE.setBounds(600, 10, 30, 20);

        bCertificado1.setBackground(new java.awt.Color(0, 153, 153));
        bCertificado1.setText("CERTIFICADO");
        bCertificado1.setColorHover(new java.awt.Color(0, 204, 204));
        bCertificado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCertificado1ActionPerformed(evt);
            }
        });
        pEditar.add(bCertificado1);
        bCertificado1.setBounds(580, 500, 120, 40);

        jTabbedPane1.addTab("ADMINISTRAR", pEditar);

        add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 880, 630);
    }// </editor-fold>//GEN-END:initComponents

    private void cNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNombreKeyTyped
        accion.Letras(evt);
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cNombreKeyTyped

    private void cApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cApellidoKeyTyped
        accion.Letras(evt);
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cApellidoKeyTyped

    private void cBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBuscarKeyTyped
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cBuscarKeyTyped

    private void cBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBuscarKeyReleased
        this.accion.filtro(this.cBuscar.getText(), tBautizado);
    }//GEN-LAST:event_cBuscarKeyReleased

    private void cFechaNacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cFechaNacKeyTyped
        accion.Numeros(evt);
    }//GEN-LAST:event_cFechaNacKeyTyped

    private void cFechaBautizoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cFechaBautizoKeyTyped
        accion.Numeros(evt);
    }//GEN-LAST:event_cFechaBautizoKeyTyped

    private void cMadreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cMadreKeyTyped
        accion.Letras(evt);
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cMadreKeyTyped

    private void cPadreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cPadreKeyTyped
        accion.Letras(evt);
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cPadreKeyTyped

    private void cAnoPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cAnoPKeyTyped
        accion.Numeros(evt);

    }//GEN-LAST:event_cAnoPKeyTyped

    private void cPaginaPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cPaginaPKeyTyped
        accion.Numeros(evt);

    }//GEN-LAST:event_cPaginaPKeyTyped

    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
        feBautismoControlador.Vacio(cNombre, cApellido, cLugarNac, cFechaNac, cFechaBautizo, cMadre, cPadre, cPadrinos, cSacerdote, cAnoP, cTomoP, cPaginaP, cNumeroP, cAnoC, cTomoC, cPaginaC, cActaC, ctNota, cbFeBautismo);
    }//GEN-LAST:event_bNuevoActionPerformed

    private void bRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistrarActionPerformed
        try {
            feBautismoControlador.Registrar(cNombre, cApellido, cLugarNac, cFechaNac, cFechaBautizo, cMadre, cPadre, cPadrinos, cSacerdote, cAnoP, cTomoP, cPaginaP, cNumeroP, cAnoC, cTomoC, cPaginaC, cActaC, ctNota, cbFeBautismo, cIdParro, cIdCivil);
            feBautismoControlador.IdRegCiv(cIdCivil);
            feBautismoControlador.IdRegParr(cIdParro);
            feBautismoControlador.listafeBautismo.clear();
            feBautismoControlador.DatosTabla();
            feBautismoControlador.LlenarTabla(modelo, tBautizado);
        } catch (SQLException ex) {
            Logger.getLogger(PanelFeBautismo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bRegistrarActionPerformed

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        this.feBautismoControlador.Modificar(cIdCivilE, cIdBau, cIdParroE, cNombreE, cApellidoE, cLugarNacE, cFechaNacE, cFechaBautizoE, cMadreE, cPadreE, cPadrinosE, cSacerdoteE, cAnoPE, cTomoPE, cPaginaPE, cNumeroPE, cAnoCE, cTomoCE, cPaginaCE, cActaCE, ctNotaE, cbFeBautismoE);
        feBautismoControlador.listafeBautismo.clear();
        feBautismoControlador.DatosTabla();
        feBautismoControlador.LlenarTabla(modelo, tBautizado);
    }//GEN-LAST:event_bEditarActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "¿Desea eliminar ?", "Confirmación ", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            this.feBautismoControlador.Eliminar(cIdBau, cNombreE, cApellidoE, cLugarNacE, cFechaNacE, cFechaBautizoE, cMadreE, cPadreE, cPadrinosE, cSacerdoteE, cAnoPE, cTomoPE, cPaginaPE, cNumeroPE, cAnoCE, cTomoCE, cPaginaCE, cActaCE, ctNotaE, cbFeBautismoE, cIdParroE, cIdCivilE);
            cBuscar.setText("");
            feBautismoControlador.listafeBautismo.clear();
            feBautismoControlador.DatosTabla();
            feBautismoControlador.LlenarTabla(modelo, tBautizado);

        } else {
        }
    }//GEN-LAST:event_bEliminarActionPerformed

    private void cLugarNacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cLugarNacKeyTyped
        accion.Letras(evt);
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cLugarNacKeyTyped

    private void cTomoPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cTomoPKeyTyped
        accion.Numeros(evt);
    }//GEN-LAST:event_cTomoPKeyTyped

    private void cNumeroPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNumeroPKeyTyped
        accion.Numeros(evt);
    }//GEN-LAST:event_cNumeroPKeyTyped

    private void cAnoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAnoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cAnoPActionPerformed

    private void cAnoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAnoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cAnoCActionPerformed

    private void cAnoCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cAnoCKeyTyped
        accion.Numeros(evt);
    }//GEN-LAST:event_cAnoCKeyTyped

    private void cPaginaCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cPaginaCKeyTyped
        accion.Numeros(evt);
    }//GEN-LAST:event_cPaginaCKeyTyped

    private void cTomoCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cTomoCKeyTyped
        accion.Numeros(evt);
    }//GEN-LAST:event_cTomoCKeyTyped

    private void cActaCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cActaCKeyTyped
        accion.Numeros(evt);
    }//GEN-LAST:event_cActaCKeyTyped

    private void cSacerdoteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cSacerdoteKeyTyped
        accion.Letras(evt);
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cSacerdoteKeyTyped

    private void cNombreEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNombreEKeyTyped
        accion.Letras(evt);
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cNombreEKeyTyped

    private void cApellidoEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cApellidoEKeyTyped
        accion.Letras(evt);
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cApellidoEKeyTyped

    private void cFechaNacEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cFechaNacEKeyTyped
        accion.Numeros(evt);
    }//GEN-LAST:event_cFechaNacEKeyTyped

    private void cFechaBautizoEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cFechaBautizoEKeyTyped
        accion.Numeros(evt);
    }//GEN-LAST:event_cFechaBautizoEKeyTyped

    private void cLugarNacEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cLugarNacEKeyTyped
        accion.Letras(evt);
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cLugarNacEKeyTyped

    private void cMadreEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cMadreEKeyTyped
        accion.Letras(evt);
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cMadreEKeyTyped

    private void cPadreEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cPadreEKeyTyped
        accion.Letras(evt);
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cPadreEKeyTyped

    private void cAnoPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAnoPEActionPerformed
    }//GEN-LAST:event_cAnoPEActionPerformed

    private void cAnoPEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cAnoPEKeyTyped
        accion.Numeros(evt);
    }//GEN-LAST:event_cAnoPEKeyTyped

    private void cPaginaPEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cPaginaPEKeyTyped
        accion.Numeros(evt);
    }//GEN-LAST:event_cPaginaPEKeyTyped

    private void cTomoPEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cTomoPEKeyTyped
        accion.Numeros(evt);
    }//GEN-LAST:event_cTomoPEKeyTyped

    private void cNumeroPEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNumeroPEKeyTyped
        accion.Numeros(evt);
    }//GEN-LAST:event_cNumeroPEKeyTyped

    private void cSacerdoteEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cSacerdoteEKeyTyped
        accion.Letras(evt);
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cSacerdoteEKeyTyped

    private void cAnoCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAnoCEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cAnoCEActionPerformed

    private void cAnoCEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cAnoCEKeyTyped
        accion.Numeros(evt);
    }//GEN-LAST:event_cAnoCEKeyTyped

    private void cPaginaCEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cPaginaCEKeyTyped
        accion.Numeros(evt);
    }//GEN-LAST:event_cPaginaCEKeyTyped

    private void cTomoCEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cTomoCEKeyTyped
        accion.Numeros(evt);
    }//GEN-LAST:event_cTomoCEKeyTyped

    private void cActaCEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cActaCEKeyTyped
        accion.Numeros(evt);
    }//GEN-LAST:event_cActaCEKeyTyped

    private void cPadrinosEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cPadrinosEKeyTyped
        accion.Letras(evt);
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cPadrinosEKeyTyped

    private void cIdCivilEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cIdCivilEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cIdCivilEActionPerformed

    private void cIdCivilEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cIdCivilEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cIdCivilEKeyTyped

    private void ctNotaEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ctNotaEKeyTyped
        accion.Letras(evt);
        accion.Mayuscula(evt);
    }//GEN-LAST:event_ctNotaEKeyTyped

    private void cAnoPEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cAnoPEKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cAnoPEKeyReleased

    private void ctNotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ctNotaKeyTyped
        accion.Letras(evt);
        accion.Mayuscula(evt);
    }//GEN-LAST:event_ctNotaKeyTyped

    private void cPadrinosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cPadrinosKeyTyped
        accion.Letras(evt);
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cPadrinosKeyTyped

    private void cIdCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cIdCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cIdCivilActionPerformed

    private void cIdCivilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cIdCivilKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cIdCivilKeyTyped

    private void cIdParroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cIdParroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cIdParroActionPerformed

    private void cIdParroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cIdParroKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cIdParroKeyTyped

    private void cIdBauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cIdBauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cIdBauActionPerformed

    private void cIdBauKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cIdBauKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cIdBauKeyTyped

    private void cIdParroEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cIdParroEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cIdParroEActionPerformed

    private void cIdParroEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cIdParroEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cIdParroEKeyTyped

    private void tBautizadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tBautizadoMouseClicked
        feBautismoControlador.PasarDatos(tBautizado, cIdBau, cNombreE, cApellidoE, cLugarNacE, cFechaNacE, cFechaBautizoE, cMadreE, cPadreE, cPadrinosE, cSacerdoteE, cAnoPE, cTomoPE, cPaginaPE, cNumeroPE, cAnoCE, cTomoCE, cPaginaCE, cActaCE, ctNotaE, cbFeBautismoE, cIdParroE, cIdCivilE);
    }//GEN-LAST:event_tBautizadoMouseClicked

    private void bCertificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCertificadoActionPerformed
        this.feBautismoControlador.ReporteCertBautismo(cNombre, cApellido, cLugarNac, cFechaNac, cFechaBautizo, cMadre, cPadre, cPadrinos, cSacerdote, cAnoP, cTomoP, cPaginaP, cNumeroP, cAnoC, cTomoC, cPaginaC, cActaC, ctNota, cbFeBautismo);
        this.feBautismoControlador.listafeBautismoR.clear();
    }//GEN-LAST:event_bCertificadoActionPerformed

    private void bCertificado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCertificado1ActionPerformed
        this.feBautismoControlador.ReporteCertBautismo(cNombreE, cApellidoE, cLugarNacE, cFechaNacE, cFechaBautizoE, cMadreE, cPadreE, cPadrinosE, cSacerdoteE, cAnoPE, cTomoPE, cPaginaPE, cNumeroPE, cAnoCE, cTomoCE, cPaginaCE, cActaCE, ctNotaE, cbFeBautismoE);
        this.feBautismoControlador.listafeBautismoR.clear();
    }//GEN-LAST:event_bCertificado1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rsbutton.RSButtonEffect bCertificado;
    private rojeru_san.rsbutton.RSButtonEffect bCertificado1;
    private rojeru_san.rsbutton.RSButtonEffect bEditar;
    private rojeru_san.rsbutton.RSButtonEffect bEliminar;
    private rojeru_san.rsbutton.RSButtonEffect bNuevo;
    private rojeru_san.rsbutton.RSButtonEffect bRegistrar;
    private javax.swing.ButtonGroup bgGenero;
    private javax.swing.JTextField cActaC;
    private javax.swing.JTextField cActaCE;
    private javax.swing.JTextField cAnoC;
    private javax.swing.JTextField cAnoCE;
    private javax.swing.JTextField cAnoP;
    private javax.swing.JTextField cAnoPE;
    private javax.swing.JTextField cApellido;
    private javax.swing.JTextField cApellidoE;
    private javax.swing.JTextField cBuscar;
    private javax.swing.JTextField cFechaBautizo;
    private javax.swing.JTextField cFechaBautizoE;
    private javax.swing.JTextField cFechaNac;
    private javax.swing.JTextField cFechaNacE;
    private javax.swing.JTextField cIdBau;
    private javax.swing.JTextField cIdCivil;
    private javax.swing.JTextField cIdCivilE;
    private javax.swing.JTextField cIdParro;
    private javax.swing.JTextField cIdParroE;
    private javax.swing.JTextField cLugarNac;
    private javax.swing.JTextField cLugarNacE;
    private javax.swing.JTextField cMadre;
    private javax.swing.JTextField cMadreE;
    private javax.swing.JTextField cNombre;
    private javax.swing.JTextField cNombreE;
    private javax.swing.JTextField cNumeroP;
    private javax.swing.JTextField cNumeroPE;
    private javax.swing.JTextField cPadre;
    private javax.swing.JTextField cPadreE;
    private javax.swing.JTextField cPadrinos;
    private javax.swing.JTextField cPadrinosE;
    private javax.swing.JTextField cPaginaC;
    private javax.swing.JTextField cPaginaCE;
    private javax.swing.JTextField cPaginaP;
    private javax.swing.JTextField cPaginaPE;
    private javax.swing.JTextField cSacerdote;
    private javax.swing.JTextField cSacerdoteE;
    private javax.swing.JTextField cTomoC;
    private javax.swing.JTextField cTomoCE;
    private javax.swing.JTextField cTomoP;
    private javax.swing.JTextField cTomoPE;
    private javax.swing.JComboBox<String> cbFeBautismo;
    private javax.swing.JComboBox<String> cbFeBautismoE;
    private javax.swing.JTextArea ctNota;
    private javax.swing.JTextArea ctNotaE;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pBuscarDoctor;
    private javax.swing.JPanel pDatos;
    private javax.swing.JPanel pDatos1;
    private javax.swing.JPanel pDatos10;
    private javax.swing.JPanel pDatos11;
    private javax.swing.JPanel pDatos2;
    private javax.swing.JPanel pDatos3;
    private javax.swing.JPanel pDatos4;
    private javax.swing.JPanel pDatos6;
    private javax.swing.JPanel pDatos7;
    private javax.swing.JPanel pDatos8;
    private javax.swing.JPanel pEditar;
    private javax.swing.JPanel pRegistrar;
    private javax.swing.JTable tBautizado;
    // End of variables declaration//GEN-END:variables
}
