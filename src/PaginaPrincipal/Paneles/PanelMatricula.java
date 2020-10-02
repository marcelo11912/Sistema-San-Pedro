package PaginaPrincipal.Paneles;

import AccionEspecial.Accion;
import Bean.Temporal;
import PaginaPrincipal.Buscar.BuscarAlumno;
import PaginaPrincipal.Buscar.BuscarCatequista;
import PaginaPrincipal.Controlador.AlumnoControlador;
import PaginaPrincipal.Controlador.MatriculaControlador;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelMatricula extends javax.swing.JPanel {

    Temporal temporal = new Temporal();
    Accion accion = new Accion();
    AlumnoControlador alumnoControlador = new AlumnoControlador();
    MatriculaControlador matriculaControlador = new MatriculaControlador();
    DefaultTableModel modeloHis;
    DefaultTableModel modelo;

    public PanelMatricula() {
        initComponents();
        this.cIdAlumno.setVisible(false);
        this.cIdCatequista.setVisible(false);
        this.cIdMatricula.setVisible(false);
        this.cIdAlE.setVisible(false);
        this.cIdCaE.setVisible(false);
        matriculaControlador.Niveles(cbNivel);
        matriculaControlador.Parroco(cbParroco);
        matriculaControlador.ParrocoSelect(cbParroco);
        matriculaControlador.Comunidad(cbComunidad);
        matriculaControlador.Niveles(cbNivelE);
        matriculaControlador.Parroco(cbParrocoE);
        matriculaControlador.Comunidad(cbComunidadE);
        matriculaControlador.DatosTabla();
        matriculaControlador.LlenarTablaMatri(modelo, tAlumno);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgGenero = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pRegistrar = new javax.swing.JPanel();
        pDatos = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        cNombreAl = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cApellidoAl = new javax.swing.JTextField();
        bBuscarAl = new rojeru_san.rsbutton.RSButtonEffect();
        bListoAl = new rojeru_san.rsbutton.RSButtonEffect();
        jLabel15 = new javax.swing.JLabel();
        cCelular01 = new javax.swing.JTextField();
        cCelular02 = new javax.swing.JTextField();
        bEditarCe = new rojeru_san.rsbutton.RSButtonEffect();
        bRegistrar = new rojeru_san.rsbutton.RSButtonEffect();
        pBuscarDoctor1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tHistoria = new javax.swing.JTable();
        pDatos2 = new javax.swing.JPanel();
        cbParroco = new javax.swing.JComboBox<>();
        pDatos6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        cbComunidad = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        cbNivel = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        cAnoInicio = new javax.swing.JTextField();
        cAnoFin = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        cObservacion = new javax.swing.JTextField();
        bListoCa1 = new rojeru_san.rsbutton.RSButtonEffect();
        pDatos7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        cNombreCa = new javax.swing.JTextField();
        bBuscarCa = new rojeru_san.rsbutton.RSButtonEffect();
        bListoCa = new rojeru_san.rsbutton.RSButtonEffect();
        jLabel30 = new javax.swing.JLabel();
        cComunidad = new javax.swing.JTextField();
        bNuevo2 = new rojeru_san.rsbutton.RSButtonEffect();
        bComprobante = new rojeru_san.rsbutton.RSButtonEffect();
        cIdAlumno = new javax.swing.JTextField();
        cIdCatequista = new javax.swing.JTextField();
        pDatos4 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        cValor = new javax.swing.JTextField();
        pEditar = new javax.swing.JPanel();
        pBuscarDoctor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAlumno = new javax.swing.JTable();
        cBuscar = new javax.swing.JTextField();
        cIdMatricula = new javax.swing.JTextField();
        bEditar = new rojeru_san.rsbutton.RSButtonEffect();
        bEditar1 = new rojeru_san.rsbutton.RSButtonEffect();
        pDatos1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        cNombreAlE = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cApellidoAlE = new javax.swing.JTextField();
        pDatos8 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        cNombreCaE = new javax.swing.JTextField();
        bBuscarCaE = new rojeru_san.rsbutton.RSButtonEffect();
        bListoCaE = new rojeru_san.rsbutton.RSButtonEffect();
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
        bComprobante1 = new rojeru_san.rsbutton.RSButtonEffect();
        pDatos5 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        cValorE = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        pRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        pRegistrar.setLayout(null);

        pDatos.setBackground(new java.awt.Color(255, 255, 255));
        pDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Alumno"));
        pDatos.setAutoscrolls(true);

        jLabel13.setText("NOMBRES");

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

        jLabel14.setText("APELLIDOS");

        cApellidoAl.setEditable(false);
        cApellidoAl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cApellidoAlKeyTyped(evt);
            }
        });

        bBuscarAl.setBackground(new java.awt.Color(204, 51, 255));
        bBuscarAl.setText("Buscar");
        bBuscarAl.setColorHover(new java.awt.Color(204, 153, 255));
        bBuscarAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarAlActionPerformed(evt);
            }
        });

        bListoAl.setBackground(new java.awt.Color(204, 51, 255));
        bListoAl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono de visto.png"))); // NOI18N
        bListoAl.setColorHover(new java.awt.Color(204, 153, 255));
        bListoAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListoAlActionPerformed(evt);
            }
        });

        jLabel15.setText("CELULARES");

        cCelular01.setEditable(false);
        cCelular01.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cCelular01KeyTyped(evt);
            }
        });

        cCelular02.setEditable(false);
        cCelular02.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cCelular02KeyTyped(evt);
            }
        });

        bEditarCe.setBackground(new java.awt.Color(255, 204, 0));
        bEditarCe.setText("Editar ");
        bEditarCe.setColorHover(new java.awt.Color(255, 204, 51));
        bEditarCe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarCeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pDatosLayout = new javax.swing.GroupLayout(pDatos);
        pDatos.setLayout(pDatosLayout);
        pDatosLayout.setHorizontalGroup(
            pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pDatosLayout.createSequentialGroup()
                        .addComponent(cCelular01, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cCelular02))
                    .addGroup(pDatosLayout.createSequentialGroup()
                        .addComponent(bEditarCe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bBuscarAl, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bListoAl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cNombreAl, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cApellidoAl, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        pDatosLayout.setVerticalGroup(
            pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cNombreAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cApellidoAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cCelular01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cCelular02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bBuscarAl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bListoAl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bEditarCe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pRegistrar.add(pDatos);
        pDatos.setBounds(10, 0, 440, 170);

        bRegistrar.setBackground(new java.awt.Color(0, 204, 102));
        bRegistrar.setText("REGISTRAR");
        bRegistrar.setColorHover(new java.awt.Color(0, 255, 102));
        bRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistrarActionPerformed(evt);
            }
        });
        pRegistrar.add(bRegistrar);
        bRegistrar.setBounds(330, 450, 120, 40);

        pBuscarDoctor1.setBackground(new java.awt.Color(255, 255, 255));
        pBuscarDoctor1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Historial"));

        tHistoria = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tHistoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tHistoria.setSelectionBackground(new java.awt.Color(0, 128, 255));
        tHistoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tHistoriaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tHistoria);

        javax.swing.GroupLayout pBuscarDoctor1Layout = new javax.swing.GroupLayout(pBuscarDoctor1);
        pBuscarDoctor1.setLayout(pBuscarDoctor1Layout);
        pBuscarDoctor1Layout.setHorizontalGroup(
            pBuscarDoctor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBuscarDoctor1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addContainerGap())
        );
        pBuscarDoctor1Layout.setVerticalGroup(
            pBuscarDoctor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBuscarDoctor1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addContainerGap())
        );

        pRegistrar.add(pBuscarDoctor1);
        pBuscarDoctor1.setBounds(490, 0, 370, 220);

        pDatos2.setBackground(new java.awt.Color(255, 255, 255));
        pDatos2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Párroco"));
        pDatos2.setAutoscrolls(true);

        cbParroco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR" }));

        javax.swing.GroupLayout pDatos2Layout = new javax.swing.GroupLayout(pDatos2);
        pDatos2.setLayout(pDatos2Layout);
        pDatos2Layout.setHorizontalGroup(
            pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbParroco, 0, 260, Short.MAX_VALUE)
                .addContainerGap())
        );
        pDatos2Layout.setVerticalGroup(
            pDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbParroco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pRegistrar.add(pDatos2);
        pDatos2.setBounds(10, 340, 290, 70);

        pDatos6.setBackground(new java.awt.Color(255, 255, 255));
        pDatos6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Iglesia"));
        pDatos6.setAutoscrolls(true);

        jLabel17.setText("COMUNIDAD");

        cbComunidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR" }));

        jLabel18.setText("NIVEL");

        cbNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR" }));

        jLabel19.setText("PERIÓDO");

        cAnoInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAnoInicioActionPerformed(evt);
            }
        });
        cAnoInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cAnoInicioKeyTyped(evt);
            }
        });

        cAnoFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAnoFinActionPerformed(evt);
            }
        });
        cAnoFin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cAnoFinKeyTyped(evt);
            }
        });

        jLabel20.setText("---");

        jLabel29.setText("OBSERVACION");

        cObservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cObservacionActionPerformed(evt);
            }
        });
        cObservacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cObservacionKeyTyped(evt);
            }
        });

        bListoCa1.setBackground(new java.awt.Color(204, 51, 255));
        bListoCa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono de visto.png"))); // NOI18N
        bListoCa1.setColorHover(new java.awt.Color(204, 153, 255));
        bListoCa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListoCa1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pDatos6Layout = new javax.swing.GroupLayout(pDatos6);
        pDatos6.setLayout(pDatos6Layout);
        pDatos6Layout.setHorizontalGroup(
            pDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatos6Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cObservacion, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                    .addGroup(pDatos6Layout.createSequentialGroup()
                        .addGroup(pDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDatos6Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbComunidad, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pDatos6Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pDatos6Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cAnoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cAnoFin, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bListoCa1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pDatos6Layout.setVerticalGroup(
            pDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbComunidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cAnoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cAnoFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bListoCa1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pRegistrar.add(pDatos6);
        pDatos6.setBounds(490, 230, 370, 170);

        pDatos7.setBackground(new java.awt.Color(255, 255, 255));
        pDatos7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Catequista"));
        pDatos7.setAutoscrolls(true);

        jLabel16.setText("NOMBRES");

        cNombreCa.setEditable(false);
        cNombreCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNombreCaActionPerformed(evt);
            }
        });
        cNombreCa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cNombreCaKeyTyped(evt);
            }
        });

        bBuscarCa.setBackground(new java.awt.Color(204, 51, 255));
        bBuscarCa.setText("Buscar");
        bBuscarCa.setColorHover(new java.awt.Color(204, 153, 255));
        bBuscarCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarCaActionPerformed(evt);
            }
        });

        bListoCa.setBackground(new java.awt.Color(204, 51, 255));
        bListoCa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono de visto.png"))); // NOI18N
        bListoCa.setColorHover(new java.awt.Color(204, 153, 255));
        bListoCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListoCaActionPerformed(evt);
            }
        });

        jLabel30.setText("COMUNIDAD");

        cComunidad.setEditable(false);
        cComunidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cComunidadActionPerformed(evt);
            }
        });
        cComunidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cComunidadKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDatos7Layout = new javax.swing.GroupLayout(pDatos7);
        pDatos7.setLayout(pDatos7Layout);
        pDatos7Layout.setHorizontalGroup(
            pDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatos7Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(bBuscarCa, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bListoCa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pDatos7Layout.createSequentialGroup()
                        .addGroup(pDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDatos7Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cNombreCa, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pDatos7Layout.createSequentialGroup()
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cComunidad, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 22, Short.MAX_VALUE))))
        );
        pDatos7Layout.setVerticalGroup(
            pDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cNombreCa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cComunidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(pDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bBuscarCa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bListoCa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pRegistrar.add(pDatos7);
        pDatos7.setBounds(10, 190, 440, 140);

        bNuevo2.setBackground(new java.awt.Color(102, 102, 255));
        bNuevo2.setText("NUEVO");
        bNuevo2.setColorHover(new java.awt.Color(153, 153, 255));
        bNuevo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevo2ActionPerformed(evt);
            }
        });
        pRegistrar.add(bNuevo2);
        bNuevo2.setBounds(190, 450, 120, 40);

        bComprobante.setBackground(new java.awt.Color(0, 153, 153));
        bComprobante.setText("COMPROBANTE");
        bComprobante.setColorHover(new java.awt.Color(0, 204, 204));
        bComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComprobanteActionPerformed(evt);
            }
        });
        pRegistrar.add(bComprobante);
        bComprobante.setBounds(470, 450, 140, 40);

        cIdAlumno.setEditable(false);
        cIdAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cIdAlumnoKeyTyped(evt);
            }
        });
        pRegistrar.add(cIdAlumno);
        cIdAlumno.setBounds(460, 70, 20, 20);

        cIdCatequista.setEditable(false);
        cIdCatequista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cIdCatequistaActionPerformed(evt);
            }
        });
        cIdCatequista.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cIdCatequistaKeyTyped(evt);
            }
        });
        pRegistrar.add(cIdCatequista);
        cIdCatequista.setBounds(460, 40, 10, 20);

        pDatos4.setBackground(new java.awt.Color(255, 255, 255));
        pDatos4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Valor"));
        pDatos4.setAutoscrolls(true);

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

        javax.swing.GroupLayout pDatos4Layout = new javax.swing.GroupLayout(pDatos4);
        pDatos4.setLayout(pDatos4Layout);
        pDatos4Layout.setHorizontalGroup(
            pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDatos4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cValor, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        pDatos4Layout.setVerticalGroup(
            pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pRegistrar.add(pDatos4);
        pDatos4.setBounds(320, 340, 100, 70);

        jTabbedPane1.addTab("MATRICULAR", pRegistrar);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
        );

        pEditar.add(pBuscarDoctor);
        pBuscarDoctor.setBounds(10, 20, 360, 270);

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
        bEditar.setBounds(330, 450, 100, 40);

        bEditar1.setBackground(new java.awt.Color(221, 87, 76));
        bEditar1.setText("ELIMINAR");
        bEditar1.setColorHover(new java.awt.Color(248, 133, 124));
        bEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditar1ActionPerformed(evt);
            }
        });
        pEditar.add(bEditar1);
        bEditar1.setBounds(450, 450, 100, 40);

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

        bBuscarCaE.setBackground(new java.awt.Color(204, 51, 255));
        bBuscarCaE.setText("Buscar");
        bBuscarCaE.setColorHover(new java.awt.Color(204, 153, 255));
        bBuscarCaE.setEnabled(false);
        bBuscarCaE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarCaEActionPerformed(evt);
            }
        });

        bListoCaE.setBackground(new java.awt.Color(204, 51, 255));
        bListoCaE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icono de visto.png"))); // NOI18N
        bListoCaE.setColorHover(new java.awt.Color(204, 153, 255));
        bListoCaE.setEnabled(false);
        bListoCaE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListoCaEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pDatos8Layout = new javax.swing.GroupLayout(pDatos8);
        pDatos8.setLayout(pDatos8Layout);
        pDatos8Layout.setHorizontalGroup(
            pDatos8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos8Layout.createSequentialGroup()
                .addGroup(pDatos8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatos8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cNombreCaE, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDatos8Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(bBuscarCaE, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bListoCaE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        pDatos8Layout.setVerticalGroup(
            pDatos8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cNombreCaE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pDatos8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bBuscarCaE, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bListoCaE, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pEditar.add(pDatos8);
        pDatos8.setBounds(400, 110, 440, 100);

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
        pDatos9.setBounds(400, 220, 440, 170);

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
        pDatos3.setBounds(10, 300, 290, 80);

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

        bComprobante1.setBackground(new java.awt.Color(0, 153, 153));
        bComprobante1.setText("COMPROBANTE");
        bComprobante1.setColorHover(new java.awt.Color(0, 204, 204));
        bComprobante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bComprobante1ActionPerformed(evt);
            }
        });
        pEditar.add(bComprobante1);
        bComprobante1.setBounds(570, 450, 140, 40);

        pDatos5.setBackground(new java.awt.Color(255, 255, 255));
        pDatos5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Valor"));
        pDatos5.setAutoscrolls(true);

        jLabel31.setText("$");

        cValorE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cValorEActionPerformed(evt);
            }
        });
        cValorE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cValorEKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pDatos5Layout = new javax.swing.GroupLayout(pDatos5);
        pDatos5.setLayout(pDatos5Layout);
        pDatos5Layout.setHorizontalGroup(
            pDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDatos5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cValorE, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        pDatos5Layout.setVerticalGroup(
            pDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatos5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cValorE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pEditar.add(pDatos5);
        pDatos5.setBounds(300, 300, 90, 80);

        jTabbedPane1.addTab("ADMINISTRAR", pEditar);

        add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 880, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void cNombreAlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNombreAlKeyTyped
        accion.Letras(evt);
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cNombreAlKeyTyped

    private void cApellidoAlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cApellidoAlKeyTyped
        accion.Letras(evt);
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cApellidoAlKeyTyped

    private void cBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBuscarKeyTyped
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cBuscarKeyTyped

    private void cBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cBuscarKeyReleased
        this.accion.filtro(this.cBuscar.getText(), tAlumno);
    }//GEN-LAST:event_cBuscarKeyReleased

    private void cIdMatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cIdMatriculaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cIdMatriculaKeyTyped

    private void bBuscarAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarAlActionPerformed
        BuscarAlumno buscarAlumno = new BuscarAlumno(null, false);
        buscarAlumno.setVisible(true);
    }//GEN-LAST:event_bBuscarAlActionPerformed

    private void bRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistrarActionPerformed

        int reply = JOptionPane.showConfirmDialog(null, "¿Imprimió el comprobante?", "Confirmación ", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            matriculaControlador.RegistrarMatricula(cIdAlumno, cNombreAl, cIdCatequista, cApellidoAl, cCelular01, cCelular02, cNombreCa, cComunidad, cbComunidad, cbParroco, cbNivel, cAnoInicio, cAnoFin, cObservacion);
            if (cIdAlumno.getText().isEmpty()) {
                Temporal.setIdAlumno("0");
                cIdAlumno.setText(temporal.getIdAlumno());
            }
            matriculaControlador.listaHistorial.clear();
            matriculaControlador.DatosTablaHistorial(cIdAlumno);
            matriculaControlador.LlenarTabla(modeloHis, tHistoria);
            matriculaControlador.listaMatricula.clear();
            matriculaControlador.DatosTabla();
            matriculaControlador.LlenarTablaMatri(modelo, tAlumno);
        } else {

        }


    }//GEN-LAST:event_bRegistrarActionPerformed

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        this.matriculaControlador.Modificar(cIdMatricula, cIdAlE, cIdCaE, cNombreCaE, cbComunidadE, cbParrocoE, cbNivelE, cAnoInicioE, cAnoFinE, cObservacionE);
        matriculaControlador.listaMatricula.clear();
        matriculaControlador.DatosTabla();
        matriculaControlador.LlenarTablaMatri(modelo, tAlumno);
    }//GEN-LAST:event_bEditarActionPerformed

    private void bEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditar1ActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "¿Desea eliminar ?", "Confirmación ", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            matriculaControlador.Eliminar(cIdMatricula, cIdAlE, cNombreAlE, cIdCaE, cApellidoAlE, cNombreCaE, cbComunidadE, cbParrocoE, cbNivelE, cAnoInicioE, cAnoFinE, cObservacionE);
            cBuscar.setText("");
            matriculaControlador.listaMatricula.clear();
            matriculaControlador.DatosTabla();
            matriculaControlador.LlenarTablaMatri(modelo, tAlumno);
        } else {
        }
    }//GEN-LAST:event_bEditar1ActionPerformed

    private void cNombreAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNombreAlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNombreAlActionPerformed

    private void bListoAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListoAlActionPerformed
        this.cIdAlumno.setText(temporal.getIdAlumno());
        this.cNombreAl.setText(temporal.getNombreA());
        this.cApellidoAl.setText(temporal.getApellidoA());
        this.cCelular01.setText(temporal.getCelular01());
        this.cCelular02.setText(temporal.getCelular02());
        this.cCelular01.setEditable(true);
        this.cCelular02.setEditable(true);
        matriculaControlador.listaHistorial.clear();
        matriculaControlador.DatosTablaHistorial(cIdAlumno);
        matriculaControlador.LlenarTabla(modeloHis, tHistoria);

    }//GEN-LAST:event_bListoAlActionPerformed

    private void tHistoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tHistoriaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tHistoriaMouseClicked

    private void cAnoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAnoInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cAnoInicioActionPerformed

    private void cAnoInicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cAnoInicioKeyTyped
        accion.Numeros(evt);
    }//GEN-LAST:event_cAnoInicioKeyTyped

    private void cAnoFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAnoFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cAnoFinActionPerformed

    private void cAnoFinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cAnoFinKeyTyped
        accion.Numeros(evt);
    }//GEN-LAST:event_cAnoFinKeyTyped

    private void cObservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cObservacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cObservacionActionPerformed

    private void cObservacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cObservacionKeyTyped
        accion.Letras(evt);
        accion.Mayuscula(evt);
    }//GEN-LAST:event_cObservacionKeyTyped

    private void cNombreCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNombreCaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNombreCaActionPerformed

    private void cNombreCaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNombreCaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cNombreCaKeyTyped

    private void bBuscarCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarCaActionPerformed
        BuscarCatequista buscarCatequista = new BuscarCatequista(null, false);
        buscarCatequista.setVisible(true);
    }//GEN-LAST:event_bBuscarCaActionPerformed

    private void bListoCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListoCaActionPerformed
        this.cIdCatequista.setText(temporal.getIdCatequesis());
        this.cNombreCa.setText(temporal.getNombreC());
        this.cComunidad.setText(temporal.getComunidadC());
    }//GEN-LAST:event_bListoCaActionPerformed

    private void bNuevo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevo2ActionPerformed
        this.matriculaControlador.Vacio(cIdAlumno, cNombreAl, cIdCatequista, cApellidoAl, cCelular01, cCelular02, cNombreCa, cComunidad, cbComunidad, cbParroco, cbNivel, cAnoInicio, cAnoFin, cObservacion);
        if (cIdAlumno.getText().isEmpty()) {
            Temporal.setIdAlumno("0");
            cIdAlumno.setText(temporal.getIdAlumno());
        }
    }//GEN-LAST:event_bNuevo2ActionPerformed

    private void bComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComprobanteActionPerformed
        this.matriculaControlador.listaComprobante.clear();
        this.matriculaControlador.ReporteComprobante(cNombreAl, cApellidoAl, cbNivel, cbComunidad, cAnoInicio, cAnoFin, cValor);
    }//GEN-LAST:event_bComprobanteActionPerformed

    private void cIdCatequistaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cIdCatequistaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cIdCatequistaKeyTyped

    private void cIdAlumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cIdAlumnoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cIdAlumnoKeyTyped

    private void cIdCatequistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cIdCatequistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cIdCatequistaActionPerformed

    private void cCelular01KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cCelular01KeyTyped
        this.accion.Numeros(evt);
        this.accion.NumCaracteres(this.cCelular01, evt, 10);
    }//GEN-LAST:event_cCelular01KeyTyped

    private void cCelular02KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cCelular02KeyTyped
        this.accion.Numeros(evt);
        this.accion.NumCaracteres(this.cCelular01, evt, 10);
    }//GEN-LAST:event_cCelular02KeyTyped

    private void bEditarCeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarCeActionPerformed
        matriculaControlador.ModificarCelular(this.cIdAlumno, cCelular01, cCelular02);
        matriculaControlador.ActualizarCelular(cIdAlumno, cCelular01, cCelular02);
    }//GEN-LAST:event_bEditarCeActionPerformed

    private void cComunidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cComunidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cComunidadActionPerformed

    private void cComunidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cComunidadKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cComunidadKeyTyped

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

    private void bBuscarCaEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarCaEActionPerformed
        BuscarCatequista buscarCatequista = new BuscarCatequista(null, false);
        buscarCatequista.setVisible(true);
    }//GEN-LAST:event_bBuscarCaEActionPerformed

    private void bListoCaEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListoCaEActionPerformed
        this.cIdCaE.setText(temporal.getIdCatequesis());
        this.cNombreCaE.setText(temporal.getNombreC());
    }//GEN-LAST:event_bListoCaEActionPerformed

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

    private void tAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tAlumnoMouseClicked
        this.matriculaControlador.PasarDatos(bBuscarCaE, bListoCaE, tAlumno, cIdMatricula, cIdAlE, cNombreAlE, cApellidoAlE, cIdCaE, cNombreCaE, cbComunidadE, cbParrocoE, cbNivelE, cAnoInicioE, cAnoFinE, cObservacionE);
    }//GEN-LAST:event_tAlumnoMouseClicked

    private void cValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cValorActionPerformed

    private void cValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cValorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cValorKeyTyped

    private void bComprobante1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bComprobante1ActionPerformed
        this.matriculaControlador.listaComprobante.clear();
        this.matriculaControlador.ReporteComprobante(cNombreAlE, cApellidoAlE, cbNivelE, cbComunidadE, cAnoInicioE, cAnoFinE, cValorE);
    }//GEN-LAST:event_bComprobante1ActionPerformed

    private void cValorEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cValorEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cValorEActionPerformed

    private void cValorEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cValorEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cValorEKeyTyped

    private void bListoCa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListoCa1ActionPerformed
       this.matriculaControlador.CalcularPeriodo(cAnoInicio, cAnoFin);
    }//GEN-LAST:event_bListoCa1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rsbutton.RSButtonEffect bBuscarAl;
    private rojeru_san.rsbutton.RSButtonEffect bBuscarCa;
    private rojeru_san.rsbutton.RSButtonEffect bBuscarCaE;
    private rojeru_san.rsbutton.RSButtonEffect bComprobante;
    private rojeru_san.rsbutton.RSButtonEffect bComprobante1;
    private rojeru_san.rsbutton.RSButtonEffect bEditar;
    private rojeru_san.rsbutton.RSButtonEffect bEditar1;
    private rojeru_san.rsbutton.RSButtonEffect bEditarCe;
    private rojeru_san.rsbutton.RSButtonEffect bListoAl;
    private rojeru_san.rsbutton.RSButtonEffect bListoCa;
    private rojeru_san.rsbutton.RSButtonEffect bListoCa1;
    private rojeru_san.rsbutton.RSButtonEffect bListoCaE;
    private rojeru_san.rsbutton.RSButtonEffect bNuevo2;
    private rojeru_san.rsbutton.RSButtonEffect bRegistrar;
    private javax.swing.ButtonGroup bgGenero;
    private javax.swing.JTextField cAnoFin;
    private javax.swing.JTextField cAnoFinE;
    private javax.swing.JTextField cAnoInicio;
    private javax.swing.JTextField cAnoInicioE;
    private javax.swing.JTextField cApellidoAl;
    private javax.swing.JTextField cApellidoAlE;
    private javax.swing.JTextField cBuscar;
    private javax.swing.JTextField cCelular01;
    private javax.swing.JTextField cCelular02;
    private javax.swing.JTextField cComunidad;
    private javax.swing.JTextField cIdAlE;
    private javax.swing.JTextField cIdAlumno;
    private javax.swing.JTextField cIdCaE;
    private javax.swing.JTextField cIdCatequista;
    private javax.swing.JTextField cIdMatricula;
    private javax.swing.JTextField cNombreAl;
    private javax.swing.JTextField cNombreAlE;
    private javax.swing.JTextField cNombreCa;
    private javax.swing.JTextField cNombreCaE;
    private javax.swing.JTextField cObservacion;
    private javax.swing.JTextField cObservacionE;
    private javax.swing.JTextField cValor;
    private javax.swing.JTextField cValorE;
    private javax.swing.JComboBox<String> cbComunidad;
    private javax.swing.JComboBox<String> cbComunidadE;
    private javax.swing.JComboBox<String> cbNivel;
    private javax.swing.JComboBox<String> cbNivelE;
    private javax.swing.JComboBox<String> cbParroco;
    private javax.swing.JComboBox<String> cbParrocoE;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pBuscarDoctor;
    private javax.swing.JPanel pBuscarDoctor1;
    private javax.swing.JPanel pDatos;
    private javax.swing.JPanel pDatos1;
    private javax.swing.JPanel pDatos2;
    private javax.swing.JPanel pDatos3;
    private javax.swing.JPanel pDatos4;
    private javax.swing.JPanel pDatos5;
    private javax.swing.JPanel pDatos6;
    private javax.swing.JPanel pDatos7;
    private javax.swing.JPanel pDatos8;
    private javax.swing.JPanel pDatos9;
    private javax.swing.JPanel pEditar;
    private javax.swing.JPanel pRegistrar;
    private javax.swing.JTable tAlumno;
    private javax.swing.JTable tHistoria;
    // End of variables declaration//GEN-END:variables
}
