package PaginaPrincipal.Paneles;

import AccionEspecial.Accion;
import PaginaPrincipal.Controlador.ReporteControlador;
import javax.swing.table.DefaultTableModel;

public class PanelReporte extends javax.swing.JPanel {

    Accion accion = new Accion();
    ReporteControlador reporteControlador = new ReporteControlador();
    DefaultTableModel modelo;

    public PanelReporte() {
        initComponents();
        this.cIdMatri.setVisible(false);
        this.cIdAl.setVisible(false);
        this.cIdCate.setVisible(false);
        this.reporteControlador.Comunidad(cbComunidadE2);
        this.reporteControlador.Niveles(cbNivelE1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgGenero = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pEditar = new javax.swing.JPanel();
        pDatos1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        cNombreAl = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cApellidoAl = new javax.swing.JTextField();
        cIdMatri = new javax.swing.JTextField();
        pDatos3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        cNivel = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        cComunidad = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        cAnoInicio = new javax.swing.JTextField();
        cAnoFin = new javax.swing.JTextField();
        pBuscarDoctor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAlumno = new javax.swing.JTable();
        cBuscar = new javax.swing.JTextField();
        cAnoFinB = new javax.swing.JTextField();
        cAnoInicioB = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        bListoAl2 = new rojeru_san.rsbutton.RSButtonEffect();
        pDatos5 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        cValor = new javax.swing.JTextField();
        bComprobante = new rojeru_san.rsbutton.RSButtonEffect();
        cIdAl = new javax.swing.JTextField();
        bComprobante1 = new rojeru_san.rsbutton.RSButtonEffect();
        pEditar1 = new javax.swing.JPanel();
        pBuscarDoctor1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tCatequista = new javax.swing.JTable();
        cAnoFinBC = new javax.swing.JTextField();
        cAnoInicioBC = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        cbComunidadE2 = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        cbNivelE1 = new javax.swing.JComboBox<>();
        cBuscarC = new javax.swing.JTextField();
        bListoAl3 = new rojeru_san.rsbutton.RSButtonEffect();
        pDatos11 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        cNombreCaE = new javax.swing.JTextField();
        cIdCate = new javax.swing.JTextField();
        pDatos4 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        cNivelC = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        cAnoInicioC = new javax.swing.JTextField();
        cAnoFinC = new javax.swing.JTextField();
        pDatos6 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        cHora = new javax.swing.JTextField();
        cbDia = new javax.swing.JComboBox<>();
        bComprobante2 = new rojeru_san.rsbutton.RSButtonEffect();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        pEditar.setBackground(new java.awt.Color(255, 255, 255));
        pEditar.setLayout(null);

        pDatos1.setBackground(new java.awt.Color(255, 255, 255));
        pDatos1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Alumno"));
        pDatos1.setAutoscrolls(true);

        jLabel21.setText("NOMBRES");

        cNombreAl.setEditable(false);
        cNombreAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNombreAlActionPerformed(evt);
            }
        });
        cNombreAl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cNombreAlKeyTyped(evt);
            }
        });

        jLabel22.setText("APELLIDOS");

        cApellidoAl.setEditable(false);
        cApellidoAl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cApellidoAlKeyTyped(evt);
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
                    .addComponent(cNombreAl, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cApellidoAl, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        pDatos1Layout.setVerticalGroup(
            pDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cNombreAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cApellidoAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pEditar.add(pDatos1);
        pDatos1.setBounds(400, 40, 440, 100);

        cIdMatri.setEditable(false);
        cIdMatri.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cIdMatriKeyTyped(evt);
            }
        });
        pEditar.add(cIdMatri);
        cIdMatri.setBounds(170, 0, 40, 20);

        pDatos3.setBackground(new java.awt.Color(255, 255, 255));
        pDatos3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Iglesia"));
        pDatos3.setAutoscrolls(true);

        jLabel23.setText("NIVEL");

        cNivel.setEditable(false);
        cNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNivelActionPerformed(evt);
            }
        });
        cNivel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cNivelKeyTyped(evt);
            }
        });

        jLabel24.setText("COMUNIDAD");

        cComunidad.setEditable(false);
        cComunidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cComunidadKeyTyped(evt);
            }
        });

        jLabel25.setText("PERÍODO");

        cAnoInicio.setEditable(false);
        cAnoInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cAnoInicioKeyTyped(evt);
            }
        });

        cAnoFin.setEditable(false);
        cAnoFin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cAnoFinKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDatos3Layout = new javax.swing.GroupLayout(pDatos3);
        pDatos3.setLayout(pDatos3Layout);
        pDatos3Layout.setHorizontalGroup(
            pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cNivel, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(cComunidad)
                    .addGroup(pDatos3Layout.createSequentialGroup()
                        .addComponent(cAnoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cAnoFin, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        pDatos3Layout.setVerticalGroup(
            pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cComunidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cAnoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cAnoFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pEditar.add(pDatos3);
        pDatos3.setBounds(400, 150, 440, 130);

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

        bListoAl2.setBackground(new java.awt.Color(204, 51, 255));
        bListoAl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono de visto.png"))); // NOI18N
        bListoAl2.setColorHover(new java.awt.Color(204, 153, 255));
        bListoAl2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListoAl2ActionPerformed(evt);
            }
        });
        bListoAl2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bListoAl2KeyReleased(evt);
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
                        .addGroup(pBuscarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pBuscarDoctorLayout.createSequentialGroup()
                                .addComponent(cAnoInicioB, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pBuscarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pBuscarDoctorLayout.createSequentialGroup()
                                .addComponent(cAnoFinB, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pBuscarDoctorLayout.createSequentialGroup()
                                .addComponent(bListoAl2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        pBuscarDoctorLayout.setVerticalGroup(
            pBuscarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBuscarDoctorLayout.createSequentialGroup()
                .addGroup(pBuscarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29)
                    .addComponent(bListoAl2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(pBuscarDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cAnoInicioB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cAnoFinB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );

        pEditar.add(pBuscarDoctor);
        pBuscarDoctor.setBounds(10, 20, 360, 310);

        pDatos5.setBackground(new java.awt.Color(255, 255, 255));
        pDatos5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Valor"));
        pDatos5.setAutoscrolls(true);

        jLabel28.setText("$");

        cValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cValorActionPerformed(evt);
            }
        });
        cValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cValorKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDatos5Layout = new javax.swing.GroupLayout(pDatos5);
        pDatos5.setLayout(pDatos5Layout);
        pDatos5Layout.setHorizontalGroup(
            pDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDatos5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cValor, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        pDatos5Layout.setVerticalGroup(
            pDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pEditar.add(pDatos5);
        pDatos5.setBounds(400, 290, 100, 70);

        bComprobante.setBackground(new java.awt.Color(0, 153, 153));
        bComprobante.setText("COMPROBANTE");
        bComprobante.setColorHover(new java.awt.Color(0, 204, 204));
        bComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComprobanteActionPerformed(evt);
            }
        });
        pEditar.add(bComprobante);
        bComprobante.setBounds(390, 450, 140, 40);

        cIdAl.setEditable(false);
        cIdAl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cIdAlKeyTyped(evt);
            }
        });
        pEditar.add(cIdAl);
        cIdAl.setBounds(390, 0, 30, 20);

        bComprobante1.setBackground(new java.awt.Color(0, 153, 153));
        bComprobante1.setText("CERTIFICADO");
        bComprobante1.setColorHover(new java.awt.Color(0, 204, 204));
        bComprobante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComprobante1ActionPerformed(evt);
            }
        });
        pEditar.add(bComprobante1);
        bComprobante1.setBounds(560, 450, 140, 40);

        jTabbedPane1.addTab("CERTIFICADO", pEditar);

        pEditar1.setBackground(new java.awt.Color(255, 255, 255));
        pEditar1.setLayout(null);

        pBuscarDoctor1.setBackground(new java.awt.Color(255, 255, 255));
        pBuscarDoctor1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Buscar Alumno"));

        tCatequista = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tCatequista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tCatequista.setSelectionBackground(new java.awt.Color(0, 128, 255));
        tCatequista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tCatequistaMouseClicked(evt);
            }
        });
        tCatequista.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tCatequistaKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(tCatequista);

        cAnoFinBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAnoFinBCActionPerformed(evt);
            }
        });
        cAnoFinBC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cAnoFinBCKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cAnoFinBCKeyTyped(evt);
            }
        });

        cAnoInicioBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAnoInicioBCActionPerformed(evt);
            }
        });
        cAnoInicioBC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cAnoInicioBCKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cAnoInicioBCKeyTyped(evt);
            }
        });

        jLabel31.setText("PERIÓDO");

        jLabel33.setText("---");

        jLabel42.setText("COMUNIDAD");

        cbComunidadE2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR" }));
        cbComunidadE2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbComunidadE2ItemStateChanged(evt);
            }
        });

        jLabel38.setText("NIVEL");

        cbNivelE1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR" }));
        cbNivelE1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbNivelE1ItemStateChanged(evt);
            }
        });

        cBuscarC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cBuscarCKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cBuscarCKeyTyped(evt);
            }
        });

        bListoAl3.setBackground(new java.awt.Color(204, 51, 255));
        bListoAl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono de visto.png"))); // NOI18N
        bListoAl3.setColorHover(new java.awt.Color(204, 153, 255));
        bListoAl3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListoAl3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pBuscarDoctor1Layout = new javax.swing.GroupLayout(pBuscarDoctor1);
        pBuscarDoctor1.setLayout(pBuscarDoctor1Layout);
        pBuscarDoctor1Layout.setHorizontalGroup(
            pBuscarDoctor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBuscarDoctor1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pBuscarDoctor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cBuscarC)
                    .addGroup(pBuscarDoctor1Layout.createSequentialGroup()
                        .addGroup(pBuscarDoctor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pBuscarDoctor1Layout.createSequentialGroup()
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cAnoInicioBC, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cAnoFinBC, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)
                                .addComponent(bListoAl3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pBuscarDoctor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pBuscarDoctor1Layout.createSequentialGroup()
                                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbComunidadE2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pBuscarDoctor1Layout.createSequentialGroup()
                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbNivelE1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pBuscarDoctor1Layout.setVerticalGroup(
            pBuscarDoctor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBuscarDoctor1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pBuscarDoctor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bListoAl3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pBuscarDoctor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31)
                        .addComponent(cAnoInicioBC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cAnoFinBC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pBuscarDoctor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbComunidadE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pBuscarDoctor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNivelE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(cBuscarC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pEditar1.add(pBuscarDoctor1);
        pBuscarDoctor1.setBounds(10, 20, 360, 400);

        pDatos11.setBackground(new java.awt.Color(255, 255, 255));
        pDatos11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Catequista"));
        pDatos11.setAutoscrolls(true);

        jLabel36.setText("NOMBRES");

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

        javax.swing.GroupLayout pDatos11Layout = new javax.swing.GroupLayout(pDatos11);
        pDatos11.setLayout(pDatos11Layout);
        pDatos11Layout.setHorizontalGroup(
            pDatos11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(cNombreCaE, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pDatos11Layout.setVerticalGroup(
            pDatos11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cNombreCaE))
                .addGap(51, 51, 51))
        );

        pEditar1.add(pDatos11);
        pDatos11.setBounds(390, 20, 440, 60);

        cIdCate.setEditable(false);
        cIdCate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cIdCateKeyTyped(evt);
            }
        });
        pEditar1.add(cIdCate);
        cIdCate.setBounds(310, 0, 40, 20);

        pDatos4.setBackground(new java.awt.Color(255, 255, 255));
        pDatos4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Iglesia"));
        pDatos4.setAutoscrolls(true);

        jLabel26.setText("NIVEL");

        cNivelC.setEditable(false);
        cNivelC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNivelCActionPerformed(evt);
            }
        });
        cNivelC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cNivelCKeyTyped(evt);
            }
        });

        jLabel32.setText("PERÍODO");

        cAnoInicioC.setEditable(false);
        cAnoInicioC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cAnoInicioCKeyTyped(evt);
            }
        });

        cAnoFinC.setEditable(false);
        cAnoFinC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cAnoFinCKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDatos4Layout = new javax.swing.GroupLayout(pDatos4);
        pDatos4.setLayout(pDatos4Layout);
        pDatos4Layout.setHorizontalGroup(
            pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cNivelC, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pDatos4Layout.createSequentialGroup()
                        .addComponent(cAnoInicioC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cAnoFinC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        pDatos4Layout.setVerticalGroup(
            pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cNivelC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cAnoInicioC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cAnoFinC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pEditar1.add(pDatos4);
        pDatos4.setBounds(390, 90, 440, 100);

        pDatos6.setBackground(new java.awt.Color(255, 255, 255));
        pDatos6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Horario"));
        pDatos6.setAutoscrolls(true);

        jLabel34.setText("HORA:");

        cHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cHoraActionPerformed(evt);
            }
        });
        cHora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cHoraKeyTyped(evt);
            }
        });

        cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DIA", "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO" }));

        javax.swing.GroupLayout pDatos6Layout = new javax.swing.GroupLayout(pDatos6);
        pDatos6.setLayout(pDatos6Layout);
        pDatos6Layout.setHorizontalGroup(
            pDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDatos6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cHora, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pDatos6Layout.setVerticalGroup(
            pDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pEditar1.add(pDatos6);
        pDatos6.setBounds(390, 200, 310, 70);

        bComprobante2.setBackground(new java.awt.Color(0, 153, 153));
        bComprobante2.setText("LISTADO");
        bComprobante2.setColorHover(new java.awt.Color(0, 204, 204));
        bComprobante2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComprobante2ActionPerformed(evt);
            }
        });
        pEditar1.add(bComprobante2);
        bComprobante2.setBounds(560, 460, 140, 40);

        jTabbedPane1.addTab("LISTADO", pEditar1);

        add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 880, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void cNombreAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNombreAlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNombreAlActionPerformed

    private void cNombreAlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNombreAlKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cNombreAlKeyTyped

    private void cApellidoAlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cApellidoAlKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cApellidoAlKeyTyped

    private void cIdMatriKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cIdMatriKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cIdMatriKeyTyped

    private void tCatequistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tCatequistaMouseClicked
        this.reporteControlador.PasarDatosCa(tCatequista, cIdCate, cNombreCaE, cNivelC, cComunidad, cAnoInicioC, cAnoFinC);

    }//GEN-LAST:event_tCatequistaMouseClicked

    private void tCatequistaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tCatequistaKeyTyped
    }//GEN-LAST:event_tCatequistaKeyTyped

    private void cAnoFinBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAnoFinBCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cAnoFinBCActionPerformed

    private void cAnoFinBCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cAnoFinBCKeyReleased

    }//GEN-LAST:event_cAnoFinBCKeyReleased

    private void cAnoFinBCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cAnoFinBCKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cAnoFinBCKeyTyped

    private void cAnoInicioBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAnoInicioBCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cAnoInicioBCActionPerformed

    private void cAnoInicioBCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cAnoInicioBCKeyReleased

    }//GEN-LAST:event_cAnoInicioBCKeyReleased

    private void cAnoInicioBCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cAnoInicioBCKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cAnoInicioBCKeyTyped

    private void cNombreCaEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNombreCaEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNombreCaEActionPerformed

    private void cNombreCaEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNombreCaEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cNombreCaEKeyTyped

    private void cNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNivelActionPerformed

    private void cNivelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNivelKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cNivelKeyTyped

    private void cComunidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cComunidadKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cComunidadKeyTyped

    private void cAnoInicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cAnoInicioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cAnoInicioKeyTyped

    private void cAnoFinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cAnoFinKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cAnoFinKeyTyped

    private void tAlumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tAlumnoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tAlumnoKeyTyped

    private void cBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBuscarKeyReleased

        this.accion.filtro(this.cBuscar.getText(), tAlumno);
    }//GEN-LAST:event_cBuscarKeyReleased

    private void cBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBuscarKeyTyped
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cBuscarKeyTyped

    private void cAnoFinBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAnoFinBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cAnoFinBActionPerformed

    private void cAnoFinBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cAnoFinBKeyReleased

    }//GEN-LAST:event_cAnoFinBKeyReleased

    private void cAnoFinBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cAnoFinBKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cAnoFinBKeyTyped

    private void cAnoInicioBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAnoInicioBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cAnoInicioBActionPerformed

    private void cAnoInicioBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cAnoInicioBKeyReleased

    }//GEN-LAST:event_cAnoInicioBKeyReleased

    private void cAnoInicioBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cAnoInicioBKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cAnoInicioBKeyTyped

    private void tAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tAlumnoMouseClicked
        this.reporteControlador.PasarDatos(tAlumno, cIdMatri, cIdAl, cApellidoAl, cNombreAl, cNivel, cComunidad, cAnoInicio, cAnoFin);
    }//GEN-LAST:event_tAlumnoMouseClicked

    private void cValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cValorActionPerformed

    private void cValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cValorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cValorKeyTyped

    private void bComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComprobanteActionPerformed
        this.reporteControlador.listaComprobante.clear();
        this.reporteControlador.ReporteComprobante(cNombreAl, cApellidoAl, cNivel, cComunidad, cAnoInicio, cAnoFin, cValor);
    }//GEN-LAST:event_bComprobanteActionPerformed

    private void cIdAlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cIdAlKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cIdAlKeyTyped

    private void bComprobante1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComprobante1ActionPerformed
        this.reporteControlador.ReportePase(cIdMatri);
    }//GEN-LAST:event_bComprobante1ActionPerformed

    private void cBuscarCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBuscarCKeyReleased
        this.accion.filtro(this.cBuscarC.getText(), tCatequista);
    }//GEN-LAST:event_cBuscarCKeyReleased

    private void cBuscarCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBuscarCKeyTyped
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cBuscarCKeyTyped

    private void cIdCateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cIdCateKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cIdCateKeyTyped

    private void cNivelCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNivelCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNivelCActionPerformed

    private void cNivelCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNivelCKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cNivelCKeyTyped

    private void cAnoInicioCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cAnoInicioCKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cAnoInicioCKeyTyped

    private void cAnoFinCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cAnoFinCKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cAnoFinCKeyTyped

    private void cHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cHoraActionPerformed

    private void cHoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cHoraKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cHoraKeyTyped

    private void cbComunidadE2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbComunidadE2ItemStateChanged

    }//GEN-LAST:event_cbComunidadE2ItemStateChanged

    private void cbNivelE1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbNivelE1ItemStateChanged

    }//GEN-LAST:event_cbNivelE1ItemStateChanged

    private void bListoAl2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListoAl2ActionPerformed
        reporteControlador.listaMatricula.clear();
        reporteControlador.DatosTabla();
        reporteControlador.LlenarTabla(modelo, tAlumno, cAnoInicioB, cAnoFinB);
    }//GEN-LAST:event_bListoAl2ActionPerformed

    private void bListoAl2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bListoAl2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_bListoAl2KeyReleased

    private void bListoAl3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListoAl3ActionPerformed
        reporteControlador.listaCatequista.clear();
        reporteControlador.DatosTablaCate();
        reporteControlador.LlenarTablaCate(modelo, tCatequista, cAnoInicioBC, cAnoFinBC, cbComunidadE2, cbNivelE1);
    }//GEN-LAST:event_bListoAl3ActionPerformed

    private void bComprobante2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComprobante2ActionPerformed
        this.reporteControlador.ReporteListado(cIdCate, cNivelC, cAnoInicioC, cAnoFinC, cHora, cbDia);
    }//GEN-LAST:event_bComprobante2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rsbutton.RSButtonEffect bComprobante;
    private rojeru_san.rsbutton.RSButtonEffect bComprobante1;
    private rojeru_san.rsbutton.RSButtonEffect bComprobante2;
    private rojeru_san.rsbutton.RSButtonEffect bListoAl2;
    private rojeru_san.rsbutton.RSButtonEffect bListoAl3;
    private javax.swing.ButtonGroup bgGenero;
    private javax.swing.JTextField cAnoFin;
    private javax.swing.JTextField cAnoFinB;
    private javax.swing.JTextField cAnoFinBC;
    private javax.swing.JTextField cAnoFinC;
    private javax.swing.JTextField cAnoInicio;
    private javax.swing.JTextField cAnoInicioB;
    private javax.swing.JTextField cAnoInicioBC;
    private javax.swing.JTextField cAnoInicioC;
    private javax.swing.JTextField cApellidoAl;
    private javax.swing.JTextField cBuscar;
    private javax.swing.JTextField cBuscarC;
    private javax.swing.JTextField cComunidad;
    private javax.swing.JTextField cHora;
    private javax.swing.JTextField cIdAl;
    private javax.swing.JTextField cIdCate;
    private javax.swing.JTextField cIdMatri;
    private javax.swing.JTextField cNivel;
    private javax.swing.JTextField cNivelC;
    private javax.swing.JTextField cNombreAl;
    private javax.swing.JTextField cNombreCaE;
    private javax.swing.JTextField cValor;
    private javax.swing.JComboBox<String> cbComunidadE2;
    private javax.swing.JComboBox<String> cbDia;
    private javax.swing.JComboBox<String> cbNivelE1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pBuscarDoctor;
    private javax.swing.JPanel pBuscarDoctor1;
    private javax.swing.JPanel pDatos1;
    private javax.swing.JPanel pDatos11;
    private javax.swing.JPanel pDatos3;
    private javax.swing.JPanel pDatos4;
    private javax.swing.JPanel pDatos5;
    private javax.swing.JPanel pDatos6;
    private javax.swing.JPanel pEditar;
    private javax.swing.JPanel pEditar1;
    private javax.swing.JTable tAlumno;
    private javax.swing.JTable tCatequista;
    // End of variables declaration//GEN-END:variables
}
