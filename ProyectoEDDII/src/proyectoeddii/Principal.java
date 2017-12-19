package proyectoeddii;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_persona = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        tf_edad = new javax.swing.JTextField();
        tf_id = new javax.swing.JTextField();
        tf_direccion = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jd_campos = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tf_nombre_campo = new javax.swing.JTextField();
        boton_crearcampo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cb_tipo_campos = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        sp_longitud_campos = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        rb_si = new javax.swing.JRadioButton();
        rb_no = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_campos = new javax.swing.JTable();
        bt_campo_llave = new javax.swing.ButtonGroup();
        popup_campos = new javax.swing.JPopupMenu();
        mi_modificar_campo = new javax.swing.JMenuItem();
        mi_eliminar_campo = new javax.swing.JMenuItem();
        jd_modificar_campo = new javax.swing.JDialog();
        boton_modificar_campo = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_nombre_mod = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cb_tipo_mod = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        sp_longitud_mod = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        rb_si_mod = new javax.swing.JRadioButton();
        rb_no_mod = new javax.swing.JRadioButton();
        jd_registros = new javax.swing.JDialog();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tf_contenido_registro = new javax.swing.JTextField();
        boton_guardarregistro = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_registros = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        boton_exportar = new javax.swing.JButton();
        boton_cargar_registros = new javax.swing.JButton();
        boton_buscar = new javax.swing.JButton();
        popup_registros = new javax.swing.JPopupMenu();
        mi_eliminar_registros = new javax.swing.JMenuItem();
        mi_modificar_registros = new javax.swing.JMenuItem();
        jd_modificar_buscar_registros = new javax.swing.JDialog();
        jLabel19 = new javax.swing.JLabel();
        tf_nuevoregistro = new javax.swing.JTextField();
        boton_modificar_registro = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jd_buscar_registros = new javax.swing.JDialog();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tf_buscar_registro = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_buscar_registros = new javax.swing.JTable();
        boton_buscar_registro = new javax.swing.JButton();
        jd_ExportarExcel = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_datos_todos = new javax.swing.JTable();
        export_excel = new javax.swing.JButton();
        foto_background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        creararchivo = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jm_campos = new javax.swing.JMenu();
        jm_registros = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        Export_XML = new javax.swing.JMenuItem();
        menu_salir = new javax.swing.JMenuItem();

        jLabel3.setText("Nombre");

        jLabel4.setText("Edad");

        jLabel5.setText("Id");

        jLabel6.setText("Direccion");

        jButton6.setText("Agregar al archivo");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_personaLayout = new javax.swing.GroupLayout(jd_persona.getContentPane());
        jd_persona.getContentPane().setLayout(jd_personaLayout);
        jd_personaLayout.setHorizontalGroup(
            jd_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_personaLayout.createSequentialGroup()
                .addGroup(jd_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_personaLayout.createSequentialGroup()
                        .addGroup(jd_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_personaLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel3))
                            .addGroup(jd_personaLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(jd_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))))
                        .addGap(121, 121, 121)
                        .addGroup(jd_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_nombre)
                            .addComponent(tf_edad)
                            .addComponent(tf_id)
                            .addComponent(tf_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)))
                    .addGroup(jd_personaLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jButton6)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jd_personaLayout.setVerticalGroup(
            jd_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_personaLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jd_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jd_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(jButton6)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Campos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Ingrese el Nombre del Campo:");

        boton_crearcampo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boton_crearcampo.setText("¡Crear!");
        boton_crearcampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_crearcampoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Ingrese el Tipo de Campo:");

        cb_tipo_campos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Texto", "Numérico" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Longitud del Campo:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("¿Campo Llave?");

        bt_campo_llave.add(rb_si);
        rb_si.setText("Si");

        bt_campo_llave.add(rb_no);
        rb_no.setText("No");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_nombre_campo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_tipo_campos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp_longitud_campos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rb_si)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rb_no))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boton_crearcampo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)))
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nombre_campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cb_tipo_campos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(sp_longitud_campos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_si)
                    .addComponent(jLabel9)
                    .addComponent(rb_no))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(boton_crearcampo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jTabbedPane1.addTab("Crear Campo", jPanel1);

        tb_campos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre del Campo", "Tipo de Campo", "Longitud del Campo", "¿Campo Llave?"
            }
        ));
        tb_campos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_camposMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_campos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listar Campos", jPanel2);

        javax.swing.GroupLayout jd_camposLayout = new javax.swing.GroupLayout(jd_campos.getContentPane());
        jd_campos.getContentPane().setLayout(jd_camposLayout);
        jd_camposLayout.setHorizontalGroup(
            jd_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_camposLayout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPane1)
        );
        jd_camposLayout.setVerticalGroup(
            jd_camposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_camposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        mi_modificar_campo.setText("Modificar");
        mi_modificar_campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_modificar_campoActionPerformed(evt);
            }
        });
        popup_campos.add(mi_modificar_campo);

        mi_eliminar_campo.setText("Eliminar");
        mi_eliminar_campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_eliminar_campoActionPerformed(evt);
            }
        });
        popup_campos.add(mi_eliminar_campo);

        boton_modificar_campo.setText("¡Modificar!");
        boton_modificar_campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_modificar_campoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("Modificar Campo");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Ingrese el Nombre del Campo:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Ingrese el Tipo de Campo:");

        cb_tipo_mod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Texto", "Numérico" }));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Longitud del Campo:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("¿Campo Llave?");

        bt_campo_llave.add(rb_si_mod);
        rb_si_mod.setText("Si");

        bt_campo_llave.add(rb_no_mod);
        rb_no_mod.setSelected(true);
        rb_no_mod.setText("No");

        javax.swing.GroupLayout jd_modificar_campoLayout = new javax.swing.GroupLayout(jd_modificar_campo.getContentPane());
        jd_modificar_campo.getContentPane().setLayout(jd_modificar_campoLayout);
        jd_modificar_campoLayout.setHorizontalGroup(
            jd_modificar_campoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificar_campoLayout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addGroup(jd_modificar_campoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modificar_campoLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modificar_campoLayout.createSequentialGroup()
                        .addComponent(boton_modificar_campo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192))))
            .addGroup(jd_modificar_campoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_modificar_campoLayout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addGroup(jd_modificar_campoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel13)
                        .addComponent(jLabel14))
                    .addGap(18, 18, 18)
                    .addGroup(jd_modificar_campoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tf_nombre_mod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb_tipo_mod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sp_longitud_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jd_modificar_campoLayout.createSequentialGroup()
                            .addComponent(rb_si_mod)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rb_no_mod)))
                    .addContainerGap(40, Short.MAX_VALUE)))
        );
        jd_modificar_campoLayout.setVerticalGroup(
            jd_modificar_campoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modificar_campoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addComponent(boton_modificar_campo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jd_modificar_campoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_modificar_campoLayout.createSequentialGroup()
                    .addGap(105, 105, 105)
                    .addGroup(jd_modificar_campoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_nombre_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jd_modificar_campoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(cb_tipo_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jd_modificar_campoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13)
                        .addComponent(sp_longitud_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jd_modificar_campoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rb_si_mod)
                        .addComponent(jLabel14)
                        .addComponent(rb_no_mod))
                    .addContainerGap(105, Short.MAX_VALUE)))
        );

        jPanel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("Registros");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Ingrese el Registro");

        tf_contenido_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_contenido_registroActionPerformed(evt);
            }
        });

        boton_guardarregistro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boton_guardarregistro.setText("Guardar");
        boton_guardarregistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_guardarregistroMouseClicked(evt);
            }
        });

        tabla_registros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registros"
            }
        ));
        tabla_registros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_registrosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabla_registros);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(0, 19, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)
                        .addGap(27, 27, 27)
                        .addComponent(tf_contenido_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(boton_guardarregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tf_contenido_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addGap(238, 238, 238))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(boton_guardarregistro)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))))
        );

        jTabbedPane2.addTab("Registros", jPanel3);

        boton_exportar.setText("Exportar Registros a TXT");
        boton_exportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_exportarMouseClicked(evt);
            }
        });

        boton_cargar_registros.setText("Cargar Registros");
        boton_cargar_registros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_cargar_registrosMouseClicked(evt);
            }
        });

        boton_buscar.setText("Buscar Registros");
        boton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boton_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton_exportar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(boton_cargar_registros, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_exportar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_cargar_registros, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(boton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Exportar TXT/Cargar", jPanel4);

        javax.swing.GroupLayout jd_registrosLayout = new javax.swing.GroupLayout(jd_registros.getContentPane());
        jd_registros.getContentPane().setLayout(jd_registrosLayout);
        jd_registrosLayout.setHorizontalGroup(
            jd_registrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_registrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_registrosLayout.setVerticalGroup(
            jd_registrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_registrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                .addContainerGap())
        );

        mi_eliminar_registros.setText("Eliminar");
        mi_eliminar_registros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_eliminar_registrosActionPerformed(evt);
            }
        });
        popup_registros.add(mi_eliminar_registros);

        mi_modificar_registros.setText("Modificar\n");
        mi_modificar_registros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_modificar_registrosActionPerformed(evt);
            }
        });
        popup_registros.add(mi_modificar_registros);

        jLabel19.setText("Ingrese nuevo Registro: ");

        boton_modificar_registro.setText("Modificar");
        boton_modificar_registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_modificar_registroMouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("Modificar Registros");

        javax.swing.GroupLayout jd_modificar_buscar_registrosLayout = new javax.swing.GroupLayout(jd_modificar_buscar_registros.getContentPane());
        jd_modificar_buscar_registros.getContentPane().setLayout(jd_modificar_buscar_registrosLayout);
        jd_modificar_buscar_registrosLayout.setHorizontalGroup(
            jd_modificar_buscar_registrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificar_buscar_registrosLayout.createSequentialGroup()
                .addGroup(jd_modificar_buscar_registrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_modificar_buscar_registrosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(tf_nuevoregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_modificar_buscar_registrosLayout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel20))
                    .addGroup(jd_modificar_buscar_registrosLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(boton_modificar_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modificar_buscar_registrosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(166, 166, 166))
        );
        jd_modificar_buscar_registrosLayout.setVerticalGroup(
            jd_modificar_buscar_registrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificar_buscar_registrosLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(43, 43, 43)
                .addGroup(jd_modificar_buscar_registrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(tf_nuevoregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(boton_modificar_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Buscar Registros");

        jLabel22.setText("Ingrese Registro a Buscar:");

        tabla_buscar_registros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registro"
            }
        ));
        jScrollPane2.setViewportView(tabla_buscar_registros);

        boton_buscar_registro.setText("Buscar");
        boton_buscar_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_buscar_registroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_buscar_registrosLayout = new javax.swing.GroupLayout(jd_buscar_registros.getContentPane());
        jd_buscar_registros.getContentPane().setLayout(jd_buscar_registrosLayout);
        jd_buscar_registrosLayout.setHorizontalGroup(
            jd_buscar_registrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_buscar_registrosLayout.createSequentialGroup()
                .addGroup(jd_buscar_registrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_buscar_registrosLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel18))
                    .addGroup(jd_buscar_registrosLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel22)
                        .addGap(42, 42, 42)
                        .addComponent(tf_buscar_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_buscar_registrosLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_buscar_registrosLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(boton_buscar_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jd_buscar_registrosLayout.setVerticalGroup(
            jd_buscar_registrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_buscar_registrosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel18)
                .addGap(38, 38, 38)
                .addGroup(jd_buscar_registrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(tf_buscar_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(boton_buscar_registro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        tabla_datos_todos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tabla_datos_todos);

        export_excel.setText("Exportar a Excel");
        export_excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                export_excelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_ExportarExcelLayout = new javax.swing.GroupLayout(jd_ExportarExcel.getContentPane());
        jd_ExportarExcel.getContentPane().setLayout(jd_ExportarExcelLayout);
        jd_ExportarExcelLayout.setHorizontalGroup(
            jd_ExportarExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ExportarExcelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(export_excel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ExportarExcelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jd_ExportarExcelLayout.setVerticalGroup(
            jd_ExportarExcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ExportarExcelLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(export_excel)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        foto_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoeddii/Circuit-Board-Background-600x600.jpg"))); // NOI18N

        jMenu1.setText("Opciones");

        jMenu2.setText("Archivos");

        creararchivo.setText("Crear Archivo");
        creararchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creararchivoActionPerformed(evt);
            }
        });
        jMenu2.add(creararchivo);

        jMenuItem2.setText("Guardar Archivo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem1.setText("Cerrar Archivo");
        jMenu2.add(jMenuItem1);

        jMenu1.add(jMenu2);

        jm_campos.setText("Campos");
        jm_campos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jm_camposMouseClicked(evt);
            }
        });
        jMenu1.add(jm_campos);

        jm_registros.setText("Registros");
        jm_registros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jm_registrosMouseClicked(evt);
            }
        });
        jMenu1.add(jm_registros);

        jMenu3.setText("Exportar");

        jMenuItem3.setText("Exportar a Excel");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        Export_XML.setText("Exportar a XML");
        Export_XML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Export_XMLActionPerformed(evt);
            }
        });
        jMenu3.add(Export_XML);

        jMenu1.add(jMenu3);

        menu_salir.setText("Salir del Programa");
        menu_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_salirActionPerformed(evt);
            }
        });
        jMenu1.add(menu_salir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foto_background, javax.swing.GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foto_background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 426, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        File arch = new File(Nombre + ".txt");
        FileWriter writes;

        try {
            writes = new FileWriter(arch);
            BufferedWriter bw = new BufferedWriter(writes);
            PrintWriter writer = new PrintWriter(bw);
            writer.write(tf_nombre.getText() + "|");
            writer.write(tf_edad.getText() + "|");
            writer.write(tf_id.getText() + "|");
            writer.write(tf_direccion.getText() + "|");

            writer.close();
            bw.close();
            JOptionPane.showMessageDialog(null, "La Persona fue agregada al archivo ");
        } catch (IOException ex) {
        }


    }//GEN-LAST:event_jButton6ActionPerformed

    private void creararchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creararchivoActionPerformed
        // TODO add your handling code here:
        File archivo;
        Nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre de su "
                + "Nuevo Archivo");

        archivo = new File(Nombre + ".txt");
        //System.out.println(Nombre);
        try {
            if (archivo.createNewFile()) {
                JOptionPane.showMessageDialog(null, "Su archivo Ha sido creado "
                        + "Correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Su Ha encontrado un error "
                        + "al querer crear el archivo");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_creararchivoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        if (cont == 0) {
            JFileChooser jfc = new JFileChooser();
            int seleccion = jfc.showSaveDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                archivo = jfc.getSelectedFile();
            }

            cont++;
        }

        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            File fichero = archivo;
            fw = new FileWriter(fichero);
            bw = new BufferedWriter(fw);
            String text = "";
            for (int j = 0; j < list.size(); j++) {

            }

            bw.write(text);
            bw.flush();
            JOptionPane.showMessageDialog(this, "archivo guardado exitosamente");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void boton_crearcampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_crearcampoActionPerformed
        try {
            String nombre_campo, tipo_campo, campo_llave;
            int longitud_campo;
            if (tf_nombre_campo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error\n El Nombre del Campor no puede Quedar Vacio");
            } else {
                nombre_campo = tf_nombre_campo.getText();
                tipo_campo = cb_tipo_campos.getSelectedItem().toString();
                longitud_campo = (Integer) sp_longitud_campos.getValue();
                if (rb_si.isSelected()) {
                    campo_llave = "Si";
                } else {
                    campo_llave = "No";
                }
                campos.add(new Campo(nombre_campo, tipo_campo, longitud_campo, campo_llave));
                /*for (int i = 0; i < campos.size(); i++) {
                 System.out.println(campos.get(i).getNombre_campo());
                 }*/
                DefaultTableModel modelo = (DefaultTableModel) tb_campos.getModel();
                Object[] newrow = {nombre_campo, tipo_campo, longitud_campo, campo_llave};
                modelo.addRow(newrow);
                tb_campos.setModel(modelo);
                DefaultTableModel modelo_excel = (DefaultTableModel) tabla_datos_todos.getModel();
                Object[] newcol = {nombre_campo};
                modelo_excel.addColumn(nombre_campo, newcol);
                tabla_datos_todos.setModel(modelo_excel);

                FileWriter fw = new FileWriter(Nombre + ".txt");
                BufferedWriter bw = new BufferedWriter(fw);

                for (int i = 0; i < campos.size(); i++) {
                    bw.write(campos.get(i).getNombre_campo().toString());
                    bw.write(";");
                }
                bw.close();

                tf_nombre_campo.setText("");
                cb_tipo_campos.setSelectedIndex(0);
                sp_longitud_campos.setValue(0);
                rb_si.setSelected(false);
                rb_no.setSelected(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado y no se guardaron los datos");
        }
    }//GEN-LAST:event_boton_crearcampoActionPerformed

    private void tb_camposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_camposMouseClicked
        if (evt.isMetaDown()) {
            int row = tb_campos.getSelectedRow();
            if (tb_campos.getSelectedRow() != -1) {
                popup_campos.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_tb_camposMouseClicked

    private void jm_camposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jm_camposMouseClicked
        this.jd_campos.setModal(true);
        this.jd_campos.pack();
        this.jd_campos.setLocationRelativeTo(this);
        this.jd_campos.setVisible(true);
    }//GEN-LAST:event_jm_camposMouseClicked

    private void mi_eliminar_campoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_eliminar_campoActionPerformed
        if (tb_campos.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tb_campos.getModel();
            DefaultTableModel modelo_excel =(DefaultTableModel) tabla_datos_todos.getModel();
            campos.remove(tb_campos.getSelectedRow());
            campos.remove(tabla_datos_todos.getSelectedRow());
            modelo.removeRow(tb_campos.getSelectedRow());
            modelo_excel.removeRow(tabla_datos_todos.getSelectedRow());

            tb_campos.setModel(modelo);
        }
        JOptionPane.showMessageDialog(this, "Campo eliminado exitosamente");
    }//GEN-LAST:event_mi_eliminar_campoActionPerformed

    private void mi_modificar_campoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_modificar_campoActionPerformed
         if (tb_campos.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tb_campos.getModel();
            //campos.remove(tb_campos.getSelectedRow());
            modelo.removeRow(tb_campos.getSelectedRow());
            tb_campos.setModel(modelo);
        }
        this.jd_modificar_campo.setModal(true);
        this.jd_modificar_campo.pack();
        this.jd_modificar_campo.setLocationRelativeTo(this);
        this.jd_modificar_campo.setVisible(true);
    }//GEN-LAST:event_mi_modificar_campoActionPerformed

    private void boton_modificar_campoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_modificar_campoActionPerformed
        try {
            String nombre_campo, tipo_campo, campo_llave;
            int longitud_campo;
            nombre_campo = tf_nombre_mod.getText();
            tipo_campo = cb_tipo_mod.getSelectedItem().toString();
            longitud_campo = (Integer) sp_longitud_mod.getValue();
            if (rb_si_mod.isSelected()) {
                campo_llave = "Si";
            } else {
                campo_llave = "No";
            }
            /*campos.get(tb_campos.getSelectedRow()).setNombre_campo(nombre_campo);
            campos.get(tb_campos.getSelectedRow()).setTipo_campo(tipo_campo);
            campos.get(tb_campos.getSelectedRow()).setLongitud_campo(longitud_campo);
            campos.get(tb_campos.getSelectedRow()).setCampo_llave(campo_llave);*/
            DefaultTableModel modelo = (DefaultTableModel) tb_campos.getModel();
            Object[] newrow = {nombre_campo, tipo_campo, longitud_campo, campo_llave};
            modelo.addRow(newrow);
            tb_campos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado y no se guardaron las modificaciones");
        }
        jd_modificar_campo.setVisible(false);
    }//GEN-LAST:event_boton_modificar_campoActionPerformed

    private void jm_registrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jm_registrosMouseClicked
        // TODO add your handling code here:
        this.jd_registros.setModal(true);
        this.jd_registros.pack();
        this.jd_registros.setLocationRelativeTo(this);
        this.jd_registros.setVisible(true);
    }//GEN-LAST:event_jm_registrosMouseClicked

    private void mi_eliminar_registrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_eliminar_registrosActionPerformed
        // TODO add your handling code here:
        if (tabla_registros.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tabla_registros.getModel();
            DefaultTableModel modelo_excel = (DefaultTableModel) tabla_datos_todos.getModel();
            registros.remove(tabla_registros.getSelectedRow());
            registros.remove(tabla_datos_todos.getSelectedRow());
            modelo.removeRow(tabla_registros.getSelectedRow());
            modelo_excel.removeRow(tabla_datos_todos.getSelectedRow());
            tabla_registros.setModel(modelo);
            tabla_datos_todos.setModel(modelo_excel);

        }
        JOptionPane.showMessageDialog(this, "Registro eliminado exitosamente");
    }//GEN-LAST:event_mi_eliminar_registrosActionPerformed

    private void boton_guardarregistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_guardarregistroMouseClicked
        try {
            String contenido = "";
            if (tf_contenido_registro.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error\n El Registro no puede quedar vacio");
            } else {

                contenido = tf_contenido_registro.getText();
                r = new Registro();
                r.setCampos(campos);//paso todos los campos al regristo campos
                //System.out.println(contenido);
                System.out.println(r.getCampos());
                System.out.println(contenido);
                registros.add(new Registro(contenido));//guardar registro

                //Listar los Registros
                DefaultTableModel modelo = (DefaultTableModel) tabla_registros.getModel();
                Object[] newrow = {contenido};
                modelo.addRow(newrow);
                tabla_registros.setModel(modelo);

                DefaultTableModel modelo_excel = (DefaultTableModel) tabla_datos_todos.getModel();
                Object[] newcol = {contenido};
                modelo_excel.addRow(newcol);
                tabla_datos_todos.setModel(modelo_excel);

                JOptionPane.showMessageDialog(this, "Se guardo correctamente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado y no se guardaron los datos");
        }
        tf_contenido_registro.setText("");
    }//GEN-LAST:event_boton_guardarregistroMouseClicked

    private void tf_contenido_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_contenido_registroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_contenido_registroActionPerformed

    private void boton_exportarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_exportarMouseClicked
        // TODO add your handling code here:
        try {
            /*Escritura de Registros*/
            FileWriter fw = new FileWriter(Nombre + ".txt", true);//evitamos sobreescribir 
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();
            for (Registro registro : registros) {
                bw.write(registro.getContenido());
                bw.write(";");
            }
            bw.close();
            fw.close();
            JOptionPane.showMessageDialog(this, "Se han exportado todos los registros exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado y no se guardaron los datos");
        }
    }//GEN-LAST:event_boton_exportarMouseClicked

    private void boton_cargar_registrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_cargar_registrosMouseClicked
        // TODO add your handling code here:
        Scanner sc = null;
        registros = new ArrayList();
        File archivo1 = null;
        try {
            if (cont == 0) {
                JFileChooser jfc = new JFileChooser();
                int seleccion = jfc.showSaveDialog(this);
                if (seleccion == JFileChooser.APPROVE_OPTION) {
                    archivo1 = jfc.getSelectedFile();
                }

                cont++;
            }

            sc = new Scanner(archivo1);
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                registros.add(new Registro(sc.next()));
            }
            JOptionPane.showMessageDialog(this, "Se seleccionó el archivo exitosamente");
            JOptionPane.showMessageDialog(this, "Se ha Cargado exitosamente");

            for (int i = 0; i < registros.size(); i++) {
                System.out.println(registros.get(i).getContenido());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado y no se guardaron los datos");
        } finally {
            sc.close();

        }

    }//GEN-LAST:event_boton_cargar_registrosMouseClicked

    private void boton_modificar_registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_modificar_registroMouseClicked
        // TODO add your handling code here:
        try {
            String nuevo_registro = tf_nuevoregistro.getText();
            //System.out.println(registros.get(tabla_registros.getSelectedRow()).getContenido());
            registros.get(tabla_registros.getSelectedRow()).setContenido(nuevo_registro);

            JOptionPane.showMessageDialog(this, "El registro se modifico");
            tf_nuevoregistro.setText("");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_boton_modificar_registroMouseClicked

    private void tabla_registrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_registrosMouseClicked
        if (evt.isMetaDown()) {
            int row = tabla_registros.getSelectedRow();
            if (tabla_registros.getSelectedRow() != -1) {
                popup_registros.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_tabla_registrosMouseClicked

    private void mi_modificar_registrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_modificar_registrosActionPerformed
        this.jd_modificar_buscar_registros.setModal(true);
        this.jd_modificar_buscar_registros.pack();
        this.jd_modificar_buscar_registros.setLocationRelativeTo(this);
        this.jd_modificar_buscar_registros.setVisible(true);
    }//GEN-LAST:event_mi_modificar_registrosActionPerformed

    private void boton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_buscarActionPerformed
        // TODO add your handling code here:
        this.jd_buscar_registros.setModal(true);
        this.jd_buscar_registros.pack();
        this.jd_buscar_registros.setLocationRelativeTo(this);
        this.jd_buscar_registros.setVisible(true);
    }//GEN-LAST:event_boton_buscarActionPerformed

    private void boton_buscar_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_buscar_registroActionPerformed
        // TODO add your handling code here:
        String registro = tf_buscar_registro.getText();
        String registros_print = "";
        for (int i = 0; i < registros.size(); i++) {

            if (registros.get(i).getContenido().equals(registro)) {
                //JOptionPane.showMessageDialog(this, "El registro  se encontro");
                registros_print += r.getCampos().get(i).getNombre_campo() + ";";
                registros_print += registros.get(i).getContenido() + ";";
            } else {
                //JOptionPane.showMessageDialog(this, "El registro no se encontro");

                //break;
            }
        }
        DefaultTableModel modelo = (DefaultTableModel) tabla_buscar_registros.getModel();
        Object[] newrow = {registros_print};
        modelo.addRow(newrow);
        tabla_buscar_registros.setModel(modelo);
        tf_buscar_registro.setText("");
    }//GEN-LAST:event_boton_buscar_registroActionPerformed

    private void menu_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menu_salirActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        jd_ExportarExcel.setModal(true);
        jd_ExportarExcel.pack();
        jd_ExportarExcel.setVisible(true);
        jd_ExportarExcel.setLocationRelativeTo(this);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void export_excelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_export_excelActionPerformed
        // TODO add your handling code here:
        if (this.tabla_datos_todos.getColumnCount() == 0) {
            JOptionPane.showMessageDialog(null, "No hay Datos en la tabla para exportar ", "Prueba", JOptionPane.INFORMATION_MESSAGE);
            //this.txtDNI.grabFocus;
            return;
        }
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Excel", "xls");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Guardar Archivo");
        chooser.setMultiSelectionEnabled(false);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            List<JTable> tb = new ArrayList<>();
            List<String> nom = new ArrayList<>();
            tb.add(tabla_datos_todos);
            nom.add("Hoja 1");
            String file = chooser.getSelectedFile().toString().concat(".xls");
            try {
                Exporter e = new Exporter(new File(file), tb, nom);
                if (e.export()) {
                    JOptionPane.showMessageDialog(null, "Los Datos fueron exportados a excel", "", JOptionPane.INFORMATION_MESSAGE);

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Hubo un error" + e.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }//GEN-LAST:event_export_excelActionPerformed

    private void Export_XMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Export_XMLActionPerformed
        // TODO add your handling code here:
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            //elemento raiz
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("root");
            doc.appendChild(rootElement);
            //Primer Elemento
            for (int i = 0; i < campos.size(); i++) {

                Element elemento1 = doc.createElement("Elemento");
                rootElement.appendChild(elemento1);
                //se agrega un atributo al nodo elemento y su valor
                Attr attr = doc.createAttribute(campos.get(i).getNombre_campo());
                for (int j = 0; j < registros.size(); j++) {

                    attr.setValue(registros.get(j).getContenido());
                }
                elemento1.setAttributeNode(attr);
            }

            //se escribe el ccontenido del XML en un archivo
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            JOptionPane.showMessageDialog(null, "Exportacion Exitosa");
            StreamResult restult = new StreamResult(new File("./prueba1.xml"));
            transformer.transform(source, restult);
        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }


    }//GEN-LAST:event_Export_XMLActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Export_XML;
    private javax.swing.JButton boton_buscar;
    private javax.swing.JButton boton_buscar_registro;
    private javax.swing.JButton boton_cargar_registros;
    private javax.swing.JButton boton_crearcampo;
    private javax.swing.JButton boton_exportar;
    private javax.swing.JButton boton_guardarregistro;
    private javax.swing.JButton boton_modificar_campo;
    private javax.swing.JButton boton_modificar_registro;
    private javax.swing.ButtonGroup bt_campo_llave;
    private javax.swing.JComboBox<String> cb_tipo_campos;
    private javax.swing.JComboBox<String> cb_tipo_mod;
    private javax.swing.JMenuItem creararchivo;
    private javax.swing.JButton export_excel;
    private javax.swing.JLabel foto_background;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JDialog jd_ExportarExcel;
    private javax.swing.JDialog jd_buscar_registros;
    private javax.swing.JDialog jd_campos;
    private javax.swing.JDialog jd_modificar_buscar_registros;
    private javax.swing.JDialog jd_modificar_campo;
    private javax.swing.JDialog jd_persona;
    private javax.swing.JDialog jd_registros;
    private javax.swing.JMenu jm_campos;
    private javax.swing.JMenu jm_registros;
    private javax.swing.JMenuItem menu_salir;
    private javax.swing.JMenuItem mi_eliminar_campo;
    private javax.swing.JMenuItem mi_eliminar_registros;
    private javax.swing.JMenuItem mi_modificar_campo;
    private javax.swing.JMenuItem mi_modificar_registros;
    private javax.swing.JPopupMenu popup_campos;
    private javax.swing.JPopupMenu popup_registros;
    private javax.swing.JRadioButton rb_no;
    private javax.swing.JRadioButton rb_no_mod;
    private javax.swing.JRadioButton rb_si;
    private javax.swing.JRadioButton rb_si_mod;
    private javax.swing.JSpinner sp_longitud_campos;
    private javax.swing.JSpinner sp_longitud_mod;
    private javax.swing.JTable tabla_buscar_registros;
    private javax.swing.JTable tabla_datos_todos;
    private javax.swing.JTable tabla_registros;
    private javax.swing.JTable tb_campos;
    private javax.swing.JTextField tf_buscar_registro;
    private javax.swing.JTextField tf_contenido_registro;
    private javax.swing.JTextField tf_direccion;
    private javax.swing.JTextField tf_edad;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombre_campo;
    private javax.swing.JTextField tf_nombre_mod;
    private javax.swing.JTextField tf_nuevoregistro;
    // End of variables declaration//GEN-END:variables
    String Nombre;
//    DefaultTableModel modelo_excel = (DefaultTableModel) tabla_datos_todos.getModel();
    ArrayList list = new ArrayList();
    File archivo = null;
    int cont = 0;
    ArrayList<Campo> campos = new ArrayList();
    ArrayList<Registro> registros = new ArrayList();
    Registro r;
}
