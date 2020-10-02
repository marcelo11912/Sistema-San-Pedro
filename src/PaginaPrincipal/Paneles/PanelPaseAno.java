package PaginaPrincipal.Paneles;

import AccionEspecial.Accion;
import PaginaPrincipal.Controlador.PaseAnoControlador;
import javax.swing.table.DefaultTableModel;

public class PanelPaseAno extends javax.swing.JPanel {

    Accion accion = new Accion();
    PaseAnoControlador paseAnoControlador = new PaseAnoControlador();
    DefaultTableModel modelo;

    public PanelPaseAno() {
        initComponents();
        this.cIdMatricula.setVisible(false);
        this.cIdAlE.setVisible(false);
        this.cIdCaE.setVisible(false);
        paseAnoControlador.Niveles(cbNivelE);
        paseAnoControlador.Parroco(cbParrocoE);
        paseAnoControlador.Comunidad(cbComunidadE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgGenero = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pEditar = new javax.swing.JPanel();
        pBuscarDoctor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAlumno = new javax.swing.JTable();
        cBuscar = new javax.swing.JTextField();
        cAnoFinB = new javax.swing.JTextField();
        cAnoInicioB = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        bListoAl = new rojeru_san.rsbutton.RSButtonEffect();
        cIdMatricula = new javax.swing.JTextField();
        bEditar = new rojeru_san.rsbutton.RSButtonEffect();
        pDatos1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        cNombreAlE = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cApellidoAlE = new javax.swing.JTextField();
        pDatos8 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        cNombreCaE = new javax.swing.JTextField();
        pDatos9 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        cbComunidadE = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        cbNivelE = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        cAnoInicioE = new javax.swing.JTextField();
        cAnoFinE = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        cObservacionE = new javax.swing.JTextField();
        pDatos3 = new javax.swing.JPanel();
        cbParrocoE = new javax.swing.JComboBox<>();
        cIdCaE = new javax.swing.JTextField();
        cIdAlE = new javax.swing.JTextField();
        pDatos10 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        cbPaseAno = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        pEditar.setBackground(new java.awt.Color(255, 255, 255));
        pEditar.setLayout(null);

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
        tAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tAlumnoKeyTyped(evt);
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

        cAnoFinB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAnoFinBActionPerformed(evt);
            }
        });
        cAnoFinB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cAnoFinBKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cAnoFinBKeyTyped(evt);
            }
        });

        cAnoInicioB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAnoInicioBActionPerformed(evt);
            }
        });
        cAnoInicioB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cAnoInicioBKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cAnoInicioBKeyTyped(evt);
            }
        });

        jLabel29.setText("PERIÓDO");

        jLabel30.setText("---");

        bListoAl.setBackground(new java.awt.Color(204, 51, 255));
        bListoAl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono de visto.png"))); // NOI18N
        bListoAl.setColorHover(new java.awt.Color(204, 153, 255));
        bListoAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListoAlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pBuscarDoctorLayout = new javax.swing.GroupLayout(pBuscarDoctor);
        pBuscarDoctor.setLayout(pBuscarDoctorLayout);
        pBuscarDoctorLayout.setHorizontalGroup(
            pBuscarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBuscarDoctorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pBuscarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(pBuscarDoctorLayout.createSequentialGroup()
                        .addComponent(cAnoInicioB, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cAnoFinB, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(pBuscarDoctorLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bListoAl, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pBuscarDoctorLayout.setVerticalGroup(
            pBuscarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBuscarDoctorLayout.createSequentialGroup()
                .addGroup(pBuscarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29)
                    .addComponent(bListoAl, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(pBuscarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cAnoInicioB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cAnoFinB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addContainerGap())
        );

        pEditar.add(pBuscarDoctor);
        pBuscarDoctor.setBounds(10, 20, 360, 310);

        cIdMatricula.setEditable(false);
        cIdMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cIdMatriculaKeyTyped(evt);
            }
        });
        pEditar.add(cIdMatricula);
        cIdMatricula.setBounds(210, 0, 30, 20);

        bEditar.setBackground(new java.awt.Color(255, 204, 0));
        bEditar.setText("EDITAR");
        bEditar.setColorHover(new java.awt.Color(255, 204, 51));
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });
        pEditar.add(bEditar);
        bEditar.setBounds(490, 450, 100, 40);

        pDatos1.setBackground(new java.awt.Color(255, 255, 255));
        pDatos1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Alumno"));
        pDatos1.setAutoscrolls(true);

        jLabel21.setText("NOMBRES");

        cNombreAlE.setEditable(false);
        cNombreAlE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNombreAlEActionPerformed(evt);
            }
        });
        cNombreAlE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cNombreAlEKeyTyped(evt);
            }
        });

        jLabel22.setText("APELLIDOS");

        cApellidoAlE.setEditable(false);
        cApellidoAlE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cApellidoAlEKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDatos1Layout = new javax.swing.GroupLayout(pDatos1);
        pDatos1.setLayout(pDatos1Layout);
        pDatos1Layout.setHorizontalGroup(
            pDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cNombreAlE, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cApellidoAlE, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        pDatos1Layout.setVerticalGroup(
            pDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cNombreAlE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cApellidoAlE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pEditar.add(pDatos1);
        pDatos1.setBounds(400, 0, 440, 100);

        pDatos8.setBackground(new java.awt.Color(255, 255, 255));
        pDatos8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Catequista"));
        pDatos8.setAutoscrolls(true);

        jLabel23.setText("NOMBRES");

        cNombreCaE.setEditable(false);
        cNombreCaE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNombreCaEActionPerformed(evt);
            }
        });
        cNombreCaE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cNombreCaEKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDatos8Layout = new javax.swing.GroupLayout(pDatos8);
        pDatos8.setLayout(pDatos8Layout);
        pDatos8Layout.setHorizontalGroup(
            pDatos8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(cNombreCaE, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pDatos8Layout.setVerticalGroup(
            pDatos8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cNombreCaE))
                .addGap(51, 51, 51))
        );

        pEditar.add(pDatos8);
        pDatos8.setBounds(400, 180, 440, 60);

        pDatos9.setBackground(new java.awt.Color(255, 255, 255));
        pDatos9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Iglesia"));
        pDatos9.setAutoscrolls(true);

        jLabel24.setText("COMUNIDAD");

        cbComunidadE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR" }));
        cbComunidadE.setEnabled(false);

        jLabel25.setText("NIVEL");

        cbNivelE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR" }));
        cbNivelE.setEnabled(false);

        jLabel26.setText("PERIÓDO");

        cAnoInicioE.setEditable(false);
        cAnoInicioE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAnoInicioEActionPerformed(evt);
            }
        });
        cAnoInicioE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cAnoInicioEKeyTyped(evt);
            }
        });

        cAnoFinE.setEditable(false);
        cAnoFinE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAnoFinEActionPerformed(evt);
            }
        });
        cAnoFinE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cAnoFinEKeyTyped(evt);
            }
        });

        jLabel27.setText("---");

        jLabel32.setText("OBSERVACION");

        cObservacionE.setEditable(false);
        cObservacionE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cObservacionEActionPerformed(evt);
            }
        });
        cObservacionE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cObservacionEKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDatos9Layout = new javax.swing.GroupLayout(pDatos9);
        pDatos9.setLayout(pDatos9Layout);
        pDatos9Layout.setHorizontalGroup(
            pDatos9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos9Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pDatos9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatos9Layout.createSequentialGroup()
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cObservacionE, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDatos9Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbComunidadE, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDatos9Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbNivelE, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDatos9Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cAnoInicioE, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cAnoFinE, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pDatos9Layout.setVerticalGroup(
            pDatos9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbComunidadE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNivelE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cAnoInicioE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cAnoFinE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(cObservacionE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pEditar.add(pDatos9);
        pDatos9.setBounds(400, 250, 440, 170);

        pDatos3.setBackground(new java.awt.Color(255, 255, 255));
        pDatos3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Párroco"));
        pDatos3.setAutoscrolls(true);

        cbParrocoE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR" }));
        cbParrocoE.setEnabled(false);

        javax.swing.GroupLayout pDatos3Layout = new javax.swing.GroupLayout(pDatos3);
        pDatos3.setLayout(pDatos3Layout);
        pDatos3Layout.setHorizontalGroup(
            pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbParrocoE, 0, 260, Short.MAX_VALUE)
                .addContainerGap())
        );
        pDatos3Layout.setVerticalGroup(
            pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbParrocoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pEditar.add(pDatos3);
        pDatos3.setBounds(10, 340, 290, 80);

        cIdCaE.setEditable(false);
        cIdCaE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cIdCaEKeyTyped(evt);
            }
        });
        pEditar.add(cIdCaE);
        cIdCaE.setBounds(290, 0, 30, 20);

        cIdAlE.setEditable(false);
        cIdAlE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cIdAlEKeyTyped(evt);
            }
        });
        pEditar.add(cIdAlE);
        cIdAlE.setBounds(250, 0, 30, 20);

        pDatos10.setBackground(new java.awt.Color(255, 255, 255));
        pDatos10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Pase de Año"));
        pDatos10.setAutoscrolls(true);

        jLabel28.setText("ESTADO");

        cbPaseAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO PAGADO", "PAGADO" }));
        cbPaseAno.setEnabled(false);

        javax.swing.GroupLayout pDatos10Layout = new javax.swing.GroupLayout(pDatos10);
        pDatos10.setLayout(pDatos10Layout);
        pDatos10Layout.setHorizontalGroup(
            pDatos10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbPaseAno, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 87, Short.MAX_VALUE))
        );
        pDatos10Layout.setVerticalGroup(
            pDatos10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPaseAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        pEditar.add(pDatos10);
        pDatos10.setBounds(400, 110, 440, 60);

        jTabbedPane1.addTab("PASE DE AÑO", pEditar);

        add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 880, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void cBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBuscarKeyTyped
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cBuscarKeyTyped

    private void cBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBuscarKeyReleased

        this.accion.filtro(this.cBuscar.getText(), tAlumno);
    }//GEN-LAST:event_cBuscarKeyReleased

    private void cIdMatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cIdMatriculaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cIdMatriculaKeyTyped

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        this.paseAnoControlador.Modificar(cIdMatricula, cbPaseAno);
        paseAnoControlador.listaMatricula.clear();
        paseAnoControlador.DatosTabla();
        paseAnoControlador.LlenarTablaMatri(modelo, tAlumno, cAnoInicioB, cAnoFinB);
    }//GEN-LAST:event_bEditarActionPerformed

    private void cNombreAlEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNombreAlEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNombreAlEActionPerformed

    private void cNombreAlEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNombreAlEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cNombreAlEKeyTyped

    private void cApellidoAlEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cApellidoAlEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cApellidoAlEKeyTyped

    private void cNombreCaEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNombreCaEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNombreCaEActionPerformed

    private void cNombreCaEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNombreCaEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cNombreCaEKeyTyped

    private void cAnoInicioEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAnoInicioEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cAnoInicioEActionPerformed

    private void cAnoInicioEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cAnoInicioEKeyTyped
        accion.Numeros(evt);
    }//GEN-LAST:event_cAnoInicioEKeyTyped

    private void cAnoFinEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAnoFinEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cAnoFinEActionPerformed

    private void cAnoFinEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cAnoFinEKeyTyped
        accion.Numeros(evt);
    }//GEN-LAST:event_cAnoFinEKeyTyped

    private void cObservacionEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cObservacionEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cObservacionEActionPerformed

    private void cObservacionEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cObservacionEKeyTyped
        accion.Mayuscula(evt);
        accion.Letras(evt);
    }//GEN-LAST:event_cObservacionEKeyTyped

    private void cIdCaEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cIdCaEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cIdCaEKeyTyped

    private void cIdAlEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cIdAlEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cIdAlEKeyTyped

    private void tAlumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tAlumnoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tAlumnoKeyTyped

    private void cAnoInicioBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAnoInicioBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cAnoInicioBActionPerformed

    private void cAnoInicioBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cAnoInicioBKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cAnoInicioBKeyTyped

    private void cAnoFinBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAnoFinBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cAnoFinBActionPerformed

    private void cAnoFinBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cAnoFinBKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cAnoFinBKeyTyped

    private void cAnoFinBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cAnoFinBKeyReleased


    }//GEN-LAST:event_cAnoFinBKeyReleased

    private void cAnoInicioBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cAnoInicioBKeyReleased

    }//GEN-LAST:event_cAnoInicioBKeyReleased

    private void tAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tAlumnoMouseClicked
        paseAnoControlador.PasarDatos(tAlumno, cIdMatricula, cIdAlE, cNombreAlE, cApellidoAlE, cIdCaE, cNombreCaE, cbComunidadE, cbParrocoE, cbNivelE, cAnoInicioE, cAnoFinE, cObservacionE, cbPaseAno);
    }//GEN-LAST:event_tAlumnoMouseClicked

    private void bListoAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListoAlActionPerformed
        paseAnoControlador.listaMatricula.clear();
        paseAnoControlador.DatosTabla();
        paseAnoControlador.LlenarTablaMatri(modelo, tAlumno, cAnoInicioB, cAnoFinB);
    }//GEN-LAST:event_bListoAlActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rsbutton.RSButtonEffect bEditar;
    private rojeru_san.rsbutton.RSButtonEffect bListoAl;
    private javax.swing.ButtonGroup bgGenero;
    private javax.swing.JTextField cAnoFinB;
    private javax.swing.JTextField cAnoFinE;
    private javax.swing.JTextField cAnoInicioB;
    private javax.swing.JTextField cAnoInicioE;
    private javax.swing.JTextField cApellidoAlE;
    private javax.swing.JTextField cBuscar;
    private javax.swing.JTextField cIdAlE;
    private javax.swing.JTextField cIdCaE;
    private javax.swing.JTextField cIdMatricula;
    private javax.swing.JTextField cNombreAlE;
    private javax.swing.JTextField cNombreCaE;
    private javax.swing.JTextField cObservacionE;
    private javax.swing.JComboBox<String> cbComunidadE;
    private javax.swing.JComboBox<String> cbNivelE;
    private javax.swing.JComboBox<String> cbParrocoE;
    private javax.swing.JComboBox<String> cbPaseAno;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pBuscarDoctor;
    private javax.swing.JPanel pDatos1;
    private javax.swing.JPanel pDatos10;
    private javax.swing.JPanel pDatos3;
    private javax.swing.JPanel pDatos8;
    private javax.swing.JPanel pDatos9;
    private javax.swing.JPanel pEditar;
    private javax.swing.JTable tAlumno;
    // End of variables declaration//GEN-END:variables
}
