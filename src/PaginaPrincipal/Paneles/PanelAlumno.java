package PaginaPrincipal.Paneles;

import AccionEspecial.Accion;
import PaginaPrincipal.Controlador.AlumnoControlador;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelAlumno extends javax.swing.JPanel {

    Accion accion = new Accion();
    AlumnoControlador alumnoControlador = new AlumnoControlador();

    DefaultTableModel modelo;

    public PanelAlumno() {
        initComponents();
        this.cIdE.setVisible(false);
        alumnoControlador.DatosTabla();
        alumnoControlador.LlenarTabla(modelo, tAlumno);

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
        bNoTiene = new rojeru_san.rsbutton.RSButtonEffect();
        pDatos1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        cMadre = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cPadre = new javax.swing.JTextField();
        pDatos2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        cTelefono1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        cTelefono2 = new javax.swing.JTextField();
        bNuevo = new rojeru_san.rsbutton.RSButtonEffect();
        bRegistrar = new rojeru_san.rsbutton.RSButtonEffect();
        pEditar = new javax.swing.JPanel();
        pDatos4 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        cNombreE = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        cApellidoE = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        cFechaNacE = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        cFechaBautizoE = new javax.swing.JTextField();
        pBuscarDoctor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAlumno = new javax.swing.JTable();
        cBuscar = new javax.swing.JTextField();
        cIdE = new javax.swing.JTextField();
        pDatos3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        cMadreE = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cPadreE = new javax.swing.JTextField();
        pDatos5 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        cTelefono1E = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        cTelefono2E = new javax.swing.JTextField();
        bEditar = new rojeru_san.rsbutton.RSButtonEffect();
        bEditar1 = new rojeru_san.rsbutton.RSButtonEffect();

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

        jLabel15.setText("FECHA DE NACIMIENTO");

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

        bNoTiene.setBackground(new java.awt.Color(102, 102, 255));
        bNoTiene.setText("NO BAUTIZADO");
        bNoTiene.setColorHover(new java.awt.Color(153, 153, 255));
        bNoTiene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNoTieneActionPerformed(evt);
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
                        .addGap(32, 32, 32)
                        .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pDatosLayout.createSequentialGroup()
                        .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cFechaBautizo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(bNoTiene, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
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
                    .addComponent(cFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cFechaBautizo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bNoTiene, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pRegistrar.add(pDatos);
        pDatos.setBounds(20, 30, 530, 160);

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

        javax.swing.GroupLayout pDatos1Layout = new javax.swing.GroupLayout(pDatos1);
        pDatos1.setLayout(pDatos1Layout);
        pDatos1Layout.setHorizontalGroup(
            pDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(pDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cMadre, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cPadre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pRegistrar.add(pDatos1);
        pDatos1.setBounds(20, 200, 530, 100);

        pDatos2.setBackground(new java.awt.Color(255, 255, 255));
        pDatos2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Contactos"));
        pDatos2.setAutoscrolls(true);

        jLabel19.setText("Telefono1");

        cTelefono1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cTelefono1KeyTyped(evt);
            }
        });

        jLabel20.setText("Telefono2");

        cTelefono2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cTelefono2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDatos2Layout = new javax.swing.GroupLayout(pDatos2);
        pDatos2.setLayout(pDatos2Layout);
        pDatos2Layout.setHorizontalGroup(
            pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cTelefono1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(cTelefono2))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pDatos2Layout.setVerticalGroup(
            pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pRegistrar.add(pDatos2);
        pDatos2.setBounds(560, 30, 270, 100);

        bNuevo.setBackground(new java.awt.Color(102, 102, 255));
        bNuevo.setText("NUEVO");
        bNuevo.setColorHover(new java.awt.Color(153, 153, 255));
        bNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevoActionPerformed(evt);
            }
        });
        pRegistrar.add(bNuevo);
        bNuevo.setBounds(340, 360, 120, 40);

        bRegistrar.setBackground(new java.awt.Color(0, 204, 102));
        bRegistrar.setText("REGISTRAR");
        bRegistrar.setColorHover(new java.awt.Color(0, 255, 102));
        bRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistrarActionPerformed(evt);
            }
        });
        pRegistrar.add(bRegistrar);
        bRegistrar.setBounds(480, 360, 120, 40);

        jTabbedPane1.addTab("REGISTRAR", pRegistrar);

        pEditar.setBackground(new java.awt.Color(255, 255, 255));
        pEditar.setLayout(null);

        pDatos4.setBackground(new java.awt.Color(255, 255, 255));
        pDatos4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Personales"));
        pDatos4.setAutoscrolls(true);

        jLabel26.setText("NOMBRES");

        cNombreE.setEditable(false);
        cNombreE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cNombreEKeyTyped(evt);
            }
        });

        jLabel27.setText("APELLIDO");

        cApellidoE.setEditable(false);
        cApellidoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cApellidoEActionPerformed(evt);
            }
        });
        cApellidoE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cApellidoEKeyTyped(evt);
            }
        });

        jLabel25.setText("FECHA DE NACIMIENTO");

        cFechaNacE.setEditable(false);
        cFechaNacE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cFechaNacEKeyTyped(evt);
            }
        });

        jLabel28.setText("FECHA DE BAUTIZO");

        cFechaBautizoE.setEditable(false);
        cFechaBautizoE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cFechaBautizoEKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDatos4Layout = new javax.swing.GroupLayout(pDatos4);
        pDatos4.setLayout(pDatos4Layout);
        pDatos4Layout.setHorizontalGroup(
            pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatos4Layout.createSequentialGroup()
                        .addGroup(pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cFechaNacE, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cFechaBautizoE, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pDatos4Layout.createSequentialGroup()
                        .addGroup(pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cApellidoE, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        pDatos4Layout.setVerticalGroup(
            pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cApellidoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cFechaNacE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cFechaBautizoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pEditar.add(pDatos4);
        pDatos4.setBounds(390, 40, 470, 160);

        pBuscarDoctor.setBackground(new java.awt.Color(255, 255, 255));
        pBuscarDoctor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Buscar Alumno"));

        tAlumno = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tAlumno.setSelectionBackground(new java.awt.Color(0, 128, 255));
        tAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tAlumnoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tAlumno);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
        );

        pEditar.add(pBuscarDoctor);
        pBuscarDoctor.setBounds(10, 40, 360, 380);

        cIdE.setEditable(false);
        cIdE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cIdEKeyTyped(evt);
            }
        });
        pEditar.add(cIdE);
        cIdE.setBounds(410, 10, 50, 20);

        pDatos3.setBackground(new java.awt.Color(255, 255, 255));
        pDatos3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Familiares"));
        pDatos3.setAutoscrolls(true);

        jLabel21.setText("MADRE");

        cMadreE.setEditable(false);
        cMadreE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cMadreEActionPerformed(evt);
            }
        });
        cMadreE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cMadreEKeyTyped(evt);
            }
        });

        jLabel22.setText("PADRE");

        cPadreE.setEditable(false);
        cPadreE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cPadreEKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDatos3Layout = new javax.swing.GroupLayout(pDatos3);
        pDatos3.setLayout(pDatos3Layout);
        pDatos3Layout.setHorizontalGroup(
            pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cMadreE, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                    .addComponent(cPadreE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        pDatos3Layout.setVerticalGroup(
            pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cMadreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cPadreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pEditar.add(pDatos3);
        pDatos3.setBounds(390, 210, 470, 100);

        pDatos5.setBackground(new java.awt.Color(255, 255, 255));
        pDatos5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Contactos"));
        pDatos5.setAutoscrolls(true);

        jLabel23.setText("Telefono1");

        cTelefono1E.setEditable(false);
        cTelefono1E.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cTelefono1EKeyTyped(evt);
            }
        });

        jLabel24.setText("Telefono2");

        cTelefono2E.setEditable(false);
        cTelefono2E.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cTelefono2EKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDatos5Layout = new javax.swing.GroupLayout(pDatos5);
        pDatos5.setLayout(pDatos5Layout);
        pDatos5Layout.setHorizontalGroup(
            pDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cTelefono1E, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(cTelefono2E))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pDatos5Layout.setVerticalGroup(
            pDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cTelefono1E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cTelefono2E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pEditar.add(pDatos5);
        pDatos5.setBounds(390, 320, 270, 100);

        bEditar.setBackground(new java.awt.Color(255, 204, 0));
        bEditar.setText("EDITAR");
        bEditar.setColorHover(new java.awt.Color(255, 204, 51));
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });
        pEditar.add(bEditar);
        bEditar.setBounds(490, 440, 100, 40);

        bEditar1.setBackground(new java.awt.Color(221, 87, 76));
        bEditar1.setText("ELIMINAR");
        bEditar1.setColorHover(new java.awt.Color(248, 133, 124));
        bEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditar1ActionPerformed(evt);
            }
        });
        pEditar.add(bEditar1);
        bEditar1.setBounds(620, 440, 100, 40);

        jTabbedPane1.addTab("ADMINISTRAR", pEditar);

        add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 880, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void cNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNombreKeyTyped
        accion.Letras(evt);
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cNombreKeyTyped

    private void cApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cApellidoKeyTyped
        accion.Letras(evt);
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cApellidoKeyTyped

    private void cNombreEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNombreEKeyTyped
        accion.Letras(evt);
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cNombreEKeyTyped

    private void cApellidoEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cApellidoEKeyTyped
        accion.Letras(evt);
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cApellidoEKeyTyped

    private void cBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBuscarKeyTyped
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cBuscarKeyTyped

    private void cBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBuscarKeyReleased
        this.accion.filtro(this.cBuscar.getText(), tAlumno);
    }//GEN-LAST:event_cBuscarKeyReleased

    private void cIdEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cIdEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cIdEKeyTyped

    private void tAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tAlumnoMouseClicked
        alumnoControlador.PasarDatos(tAlumno, cIdE, cNombreE, cApellidoE, cFechaNacE, cFechaBautizoE, cMadreE, cPadreE, cTelefono1E, cTelefono2E);
    }//GEN-LAST:event_tAlumnoMouseClicked

    private void cApellidoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cApellidoEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cApellidoEActionPerformed

    private void cFechaNacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cFechaNacKeyTyped
        accion.Numeros(evt);
    }//GEN-LAST:event_cFechaNacKeyTyped

    private void cFechaBautizoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cFechaBautizoKeyTyped
        accion.Numeros(evt);
    }//GEN-LAST:event_cFechaBautizoKeyTyped

    private void cMadreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cMadreKeyTyped
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cMadreKeyTyped

    private void cPadreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cPadreKeyTyped
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cPadreKeyTyped

    private void cTelefono1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cTelefono1KeyTyped
        accion.Numeros(evt);
        accion.NumCaracteres(this.cTelefono1, evt, 10);
    }//GEN-LAST:event_cTelefono1KeyTyped

    private void cTelefono2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cTelefono2KeyTyped
        accion.Numeros(evt);
        accion.NumCaracteres(this.cTelefono2, evt, 10);
    }//GEN-LAST:event_cTelefono2KeyTyped

    private void cMadreEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cMadreEKeyTyped
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cMadreEKeyTyped

    private void cPadreEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cPadreEKeyTyped
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cPadreEKeyTyped

    private void cMadreEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cMadreEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cMadreEActionPerformed

    private void cTelefono1EKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cTelefono1EKeyTyped
        accion.Numeros(evt);
        accion.NumCaracteres(this.cTelefono1E, evt, 10);
    }//GEN-LAST:event_cTelefono1EKeyTyped

    private void cTelefono2EKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cTelefono2EKeyTyped
        accion.Numeros(evt);
        accion.NumCaracteres(this.cTelefono2E, evt, 10);
    }//GEN-LAST:event_cTelefono2EKeyTyped

    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
        alumnoControlador.Vacio(cNombre, cApellido, cFechaNac, cFechaBautizo, cMadre, cPadre, cTelefono1, cTelefono2);
    }//GEN-LAST:event_bNuevoActionPerformed

    private void cFechaNacEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cFechaNacEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cFechaNacEKeyTyped

    private void cFechaBautizoEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cFechaBautizoEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cFechaBautizoEKeyTyped

    private void bRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistrarActionPerformed
        alumnoControlador.RegistrarAlumno(cNombre, cApellido, cFechaNac, cFechaBautizo, cMadre, cPadre, cTelefono1, cTelefono2);
        alumnoControlador.listaAlumno.clear();
        alumnoControlador.DatosTabla();
        alumnoControlador.LlenarTabla(modelo, tAlumno);
    }//GEN-LAST:event_bRegistrarActionPerformed

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        alumnoControlador.Modificar(this.cIdE, cNombreE, cApellidoE, cFechaNacE, cFechaBautizoE, cMadreE, cPadreE, cTelefono1E, cTelefono2E);
        alumnoControlador.listaAlumno.clear();
        alumnoControlador.DatosTabla();
        alumnoControlador.LlenarTabla(modelo, tAlumno);
    }//GEN-LAST:event_bEditarActionPerformed

    private void bEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditar1ActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "¿Desea eliminar ?", "Confirmación ", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            alumnoControlador.Eliminar(cIdE, cNombreE, cApellidoE, cFechaNacE, cFechaBautizoE, cMadreE, cPadreE, cTelefono1E, cTelefono2E);
            cBuscar.setText("");
            alumnoControlador.listaAlumno.clear();
            alumnoControlador.DatosTabla();
            alumnoControlador.LlenarTabla(modelo, tAlumno);
        } else {
        }

    }//GEN-LAST:event_bEditar1ActionPerformed

    private void bNoTieneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNoTieneActionPerformed
        this.cFechaBautizo.setText("0001-01-01");
    }//GEN-LAST:event_bNoTieneActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rsbutton.RSButtonEffect bEditar;
    private rojeru_san.rsbutton.RSButtonEffect bEditar1;
    private rojeru_san.rsbutton.RSButtonEffect bNoTiene;
    private rojeru_san.rsbutton.RSButtonEffect bNuevo;
    private rojeru_san.rsbutton.RSButtonEffect bRegistrar;
    private javax.swing.ButtonGroup bgGenero;
    private javax.swing.JTextField cApellido;
    private javax.swing.JTextField cApellidoE;
    private javax.swing.JTextField cBuscar;
    private javax.swing.JTextField cFechaBautizo;
    private javax.swing.JTextField cFechaBautizoE;
    private javax.swing.JTextField cFechaNac;
    private javax.swing.JTextField cFechaNacE;
    private javax.swing.JTextField cIdE;
    private javax.swing.JTextField cMadre;
    private javax.swing.JTextField cMadreE;
    private javax.swing.JTextField cNombre;
    private javax.swing.JTextField cNombreE;
    private javax.swing.JTextField cPadre;
    private javax.swing.JTextField cPadreE;
    private javax.swing.JTextField cTelefono1;
    private javax.swing.JTextField cTelefono1E;
    private javax.swing.JTextField cTelefono2;
    private javax.swing.JTextField cTelefono2E;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pBuscarDoctor;
    private javax.swing.JPanel pDatos;
    private javax.swing.JPanel pDatos1;
    private javax.swing.JPanel pDatos2;
    private javax.swing.JPanel pDatos3;
    private javax.swing.JPanel pDatos4;
    private javax.swing.JPanel pDatos5;
    private javax.swing.JPanel pEditar;
    private javax.swing.JPanel pRegistrar;
    private javax.swing.JTable tAlumno;
    // End of variables declaration//GEN-END:variables
}
