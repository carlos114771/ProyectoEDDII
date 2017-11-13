package proyectoeddii;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
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
        jButton1 = new javax.swing.JButton();
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
        jButton2 = new javax.swing.JButton();
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        creararchivo = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jm_campos = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

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

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("¡Crear!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jButton2.setText("¡Modificar!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jMenu4.setText("Registros");
        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String nombre_campo, tipo_campo, campo_llave;
            int longitud_campo;
            nombre_campo = tf_nombre_campo.getText();
            tipo_campo = cb_tipo_campos.getSelectedItem().toString();
            longitud_campo = (Integer)sp_longitud_campos.getValue();
            if (rb_si.isSelected()){
                campo_llave = "Si";
            } else {
                campo_llave = "No";
            }
            campos.add(new Campo(nombre_campo, tipo_campo, longitud_campo, campo_llave));
            
            DefaultTableModel modelo =(DefaultTableModel)tb_campos.getModel();
            Object[] newrow = {nombre_campo, tipo_campo, longitud_campo, campo_llave};
            modelo.addRow(newrow);
            tb_campos.setModel(modelo);
            
            tf_nombre_campo.setText("");
            cb_tipo_campos.setSelectedIndex(0);
            sp_longitud_campos.setValue(0);
            rb_si.setSelected(false);
            rb_no.setSelected(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado y no se guardaron los datos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tb_camposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_camposMouseClicked
        if (evt.isMetaDown()){
            int row = tb_campos.getSelectedRow();
            if (tb_campos.getSelectedRow() != -1){
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
            campos.remove(tb_campos.getSelectedRow());
            modelo.removeRow(tb_campos.getSelectedRow());

            tb_campos.setModel(modelo);
        }
        JOptionPane.showMessageDialog(this, "Campo eliminado exitosamente");
    }//GEN-LAST:event_mi_eliminar_campoActionPerformed

    private void mi_modificar_campoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_modificar_campoActionPerformed
        this.jd_modificar_campo.setModal(true);
        this.jd_modificar_campo.pack();
        this.jd_modificar_campo.setLocationRelativeTo(this);
        this.jd_modificar_campo.setVisible(true);
    }//GEN-LAST:event_mi_modificar_campoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String nombre_campo, tipo_campo, campo_llave;
            int longitud_campo;
            nombre_campo = tf_nombre_campo.getText();
            tipo_campo = cb_tipo_campos.getSelectedItem().toString();
            longitud_campo = (Integer)sp_longitud_campos.getValue();
            if (rb_si.isSelected()){
                campo_llave = "Si";
            } else {
                campo_llave = "No";
            }
            Campo camp = new Campo();
            camp.setNombre_campo(nombre_campo);
            camp.setTipo_campo(tipo_campo);
            camp.setLongitud_campo(longitud_campo);
            camp.setCampo_llave(campo_llave);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado y no se guardaron las modificaciones");
        }
        jd_modificar_campo.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.ButtonGroup bt_campo_llave;
    private javax.swing.JComboBox<String> cb_tipo_campos;
    private javax.swing.JComboBox<String> cb_tipo_mod;
    private javax.swing.JMenuItem creararchivo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JDialog jd_campos;
    private javax.swing.JDialog jd_modificar_campo;
    private javax.swing.JDialog jd_persona;
    private javax.swing.JMenu jm_campos;
    private javax.swing.JMenuItem mi_eliminar_campo;
    private javax.swing.JMenuItem mi_modificar_campo;
    private javax.swing.JPopupMenu popup_campos;
    private javax.swing.JRadioButton rb_no;
    private javax.swing.JRadioButton rb_no_mod;
    private javax.swing.JRadioButton rb_si;
    private javax.swing.JRadioButton rb_si_mod;
    private javax.swing.JSpinner sp_longitud_campos;
    private javax.swing.JSpinner sp_longitud_mod;
    private javax.swing.JTable tb_campos;
    private javax.swing.JTextField tf_direccion;
    private javax.swing.JTextField tf_edad;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombre_campo;
    private javax.swing.JTextField tf_nombre_mod;
    // End of variables declaration//GEN-END:variables
String Nombre;
ArrayList list = new ArrayList();
File archivo = null;
int cont=0;
ArrayList campos = new ArrayList();
}
