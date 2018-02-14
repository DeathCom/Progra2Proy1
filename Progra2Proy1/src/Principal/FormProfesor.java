package Principal;
import Clases.Profesor;
import Clases.MasterClass;
import Clases.MasterArchivos;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class FormProfesor extends javax.swing.JFrame {
    MasterClass datos = new MasterClass();
    MasterArchivos controlArchivo = new MasterArchivos();
    
    public void limpiar(){
        txt_CnombreProfesor.setText("");
        txt_CapellidoProfesor.setText("");
        txt_CemailProfesor.setText("");
        txt_CtelefonoProfesor.setText("");
        txt_CsedeProfesor.setText("");
        txt_CcodProfesor.setText("");
        txt_CcantidProfesor.setText("");

        txt_InombreProfesor.setText("");
        txt_IapellidoProfesor.setText("");
        txt_IemailProfesor.setText("");
        txt_ItelefonoProfesor.setText("");
        txt_IsedeProfesor.setText("");
        txt_IcodProfesor.setText("");
        //txt_IcantidProfesor.setText("");
        txt_IcantidProfesor.setValue(0);
    }
    public void imprimir(Profesor arg){
        txt_CnombreProfesor.setText(arg.getNombre());
        txt_CapellidoProfesor.setText(arg.getApellido());
        txt_CemailProfesor.setText(arg.getDireccionCorreo());
        txt_CtelefonoProfesor.setText(arg.getTelefono());
        txt_CsedeProfesor.setText(arg.getSede());
        txt_CcodProfesor.setText(arg.getCodigoMarca());
        txt_CcantidProfesor.setText(arg.getCantidadCursosqueImparte());
    }
    /**
     * Creates new form Profesor
     */
    public FormProfesor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txt_CnombreProfesor = new javax.swing.JTextField();
        txt_CapellidoProfesor = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_CemailProfesor = new javax.swing.JTextField();
        txt_CtelefonoProfesor = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_CcodProfesor = new javax.swing.JTextField();
        btn_buscarProfesor = new javax.swing.JButton();
        btn_editarProfesor = new javax.swing.JButton();
        btn_elimiarProfesor = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_CcantidProfesor = new javax.swing.JTextField();
        btn_volver4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_CLibosAsignados = new javax.swing.JTextField();
        btn_primero1 = new javax.swing.JButton();
        btn_anterior1 = new javax.swing.JButton();
        btn_siguiente1 = new javax.swing.JButton();
        btn_ultimo1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_CsedeProfesor = new javax.swing.JTextField();
        btn_CargarDatosProfesores = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txt_InombreProfesor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_IapellidoProfesor = new javax.swing.JTextField();
        txt_IemailProfesor = new javax.swing.JTextField();
        txt_ItelefonoProfesor = new javax.swing.JTextField();
        txt_IsedeProfesor = new javax.swing.JTextField();
        txt_IcodProfesor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bntGuardarProfesor = new javax.swing.JButton();
        txt_IcantidProfesor = new javax.swing.JSpinner();
        btn_volver5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 300));

        jLabel16.setText("Nombre:");

        jLabel17.setText("Apellido:");

        jLabel18.setText("Direccion  de Correo:");

        jLabel19.setText("Telefono: ");

        btn_buscarProfesor.setText("Buscar");
        btn_buscarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarProfesorActionPerformed(evt);
            }
        });

        btn_editarProfesor.setText("Editar");
        btn_editarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarProfesorActionPerformed(evt);
            }
        });

        btn_elimiarProfesor.setText("Eliminar");
        btn_elimiarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_elimiarProfesorActionPerformed(evt);
            }
        });

        jLabel9.setText("Codigo de Marca:");

        jLabel10.setText("Cantidad de Cusrsos que Imparte: ");

        btn_volver4.setText("volver");
        btn_volver4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volver4ActionPerformed(evt);
            }
        });

        jLabel11.setText("Libros Asignados");

        btn_primero1.setText("|<");
        btn_primero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_primero1ActionPerformed(evt);
            }
        });

        btn_anterior1.setText("<");
        btn_anterior1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anterior1ActionPerformed(evt);
            }
        });

        btn_siguiente1.setText(">");
        btn_siguiente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siguiente1ActionPerformed(evt);
            }
        });

        btn_ultimo1.setText(">|");
        btn_ultimo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ultimo1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Sede:");

        btn_CargarDatosProfesores.setText("Cargar data");
        btn_CargarDatosProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CargarDatosProfesoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel17)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_CcodProfesor)
                            .addComponent(txt_CsedeProfesor)
                            .addComponent(txt_CnombreProfesor)
                            .addComponent(txt_CapellidoProfesor)
                            .addComponent(txt_CemailProfesor)
                            .addComponent(txt_CtelefonoProfesor)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(2, 2, 2)
                        .addComponent(txt_CcantidProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(txt_CLibosAsignados, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_CargarDatosProfesores)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_primero1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_anterior1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_siguiente1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_ultimo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_elimiarProfesor)
                                .addGap(10, 10, 10)
                                .addComponent(btn_volver4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_buscarProfesor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_editarProfesor)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txt_CnombreProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_CapellidoProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_CemailProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txt_CtelefonoProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_CsedeProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_CcodProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_CcantidProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txt_CLibosAsignados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_CargarDatosProfesores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_primero1)
                            .addComponent(btn_siguiente1)
                            .addComponent(btn_anterior1)
                            .addComponent(btn_ultimo1))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_buscarProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_editarProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_elimiarProfesor)
                            .addComponent(btn_volver4))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedPane4.addTab("Consultar Profesor", jPanel1);

        jLabel2.setText("Nombre:");

        jLabel3.setText("Sede:");

        jLabel4.setText("Telefono: ");

        jLabel5.setText("Direccion  de Correo:");

        jLabel6.setText("Cantidad de Cusrsos que imprate ");

        jLabel7.setText("Codigo de Marca:");

        jLabel1.setText("Apellido:");

        bntGuardarProfesor.setText("Guardar");
        bntGuardarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntGuardarProfesorActionPerformed(evt);
            }
        });

        btn_volver5.setText("volver");
        btn_volver5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volver5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_IcodProfesor)
                            .addComponent(txt_InombreProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(txt_IapellidoProfesor)
                            .addComponent(txt_IemailProfesor)
                            .addComponent(txt_ItelefonoProfesor)
                            .addComponent(txt_IsedeProfesor)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_IcantidProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(bntGuardarProfesor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_volver5)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_InombreProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_IapellidoProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_IemailProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ItelefonoProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_IsedeProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_IcodProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_IcantidProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntGuardarProfesor)
                    .addComponent(btn_volver5))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 8, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 9, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane4.addTab("Ingresar Profesor", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_volver4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volver4ActionPerformed
        FormPrincipal selcam = new FormPrincipal();
        selcam.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_volver4ActionPerformed

    private void btn_volver5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volver5ActionPerformed
        FormPrincipal selcam = new FormPrincipal();
        selcam.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_volver5ActionPerformed

    private void btn_primero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_primero1ActionPerformed
        if(datos.primeroP()==null){
            JOptionPane.showMessageDialog(rootPane, "No hay datos a Mostrar");
        }else{
            imprimir(datos.primeroP());
        }
    }//GEN-LAST:event_btn_primero1ActionPerformed

    private void btn_anterior1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anterior1ActionPerformed
        if(datos.primeroP()==null){
            JOptionPane.showMessageDialog(rootPane, "No hay datos a Mostrar");
        }else{
            imprimir(datos.anteriorP());
        }
    }//GEN-LAST:event_btn_anterior1ActionPerformed

    private void btn_siguiente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siguiente1ActionPerformed
        if(datos.primeroP()==null){
            JOptionPane.showMessageDialog(rootPane, "No hay datos a Mostrar");
        }else{
            imprimir(datos.siguenteP());
        }
    }//GEN-LAST:event_btn_siguiente1ActionPerformed

    private void btn_ultimo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ultimo1ActionPerformed
        if(datos.primeroP()==null){
            JOptionPane.showMessageDialog(rootPane, "No hay datos a Mostrar");
        }else{
            imprimir(datos.ultimoP());
        }
    }//GEN-LAST:event_btn_ultimo1ActionPerformed

    private void btn_buscarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarProfesorActionPerformed
         if(datos.primeroP()==null){
            JOptionPane.showMessageDialog(rootPane, "No hay datos a Mostrar");
        }else{
            imprimir(datos.buscarP(txt_CnombreProfesor.getText()));
        }
    }//GEN-LAST:event_btn_buscarProfesorActionPerformed

    private void btn_editarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarProfesorActionPerformed
        if(datos.primeroP()==null){
            JOptionPane.showMessageDialog(rootPane, "No hay datos a Mostrar");
        }else{
            datos.modificarP(txt_CnombreProfesor.getText(),txt_CapellidoProfesor.getText(),
                    txt_CemailProfesor.getText(),txt_CtelefonoProfesor.getText(),txt_CsedeProfesor.getText(), 
                    txt_CcodProfesor.getText(),txt_CcantidProfesor.getText());
        }
        limpiar();
    }//GEN-LAST:event_btn_editarProfesorActionPerformed

    private void btn_elimiarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_elimiarProfesorActionPerformed
        if(datos.primeroP()==null){
            JOptionPane.showMessageDialog(rootPane, "No hay datos a Mostrar");
        }else{
            datos.eliminarP(txt_CnombreProfesor.getText());
        }
        limpiar();
    }//GEN-LAST:event_btn_elimiarProfesorActionPerformed

    private void bntGuardarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGuardarProfesorActionPerformed
        if(txt_InombreProfesor.getText().isEmpty() || txt_IapellidoProfesor.getText().isEmpty()
                || txt_IemailProfesor.getText().isEmpty() || txt_ItelefonoProfesor.getText().isEmpty()
                || txt_IsedeProfesor.getText().isEmpty() || txt_IcodProfesor.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Debe llenar todos los campos");
        }else{
            /*String cantidProfesor = txt_IcantidProfesor.getValue().toString();
            datos.guardarP(txt_InombreProfesor.getText(), txt_IapellidoProfesor.getText(), 
                    txt_IemailProfesor.getText(), txt_ItelefonoProfesor.getText(),
                    txt_IsedeProfesor.getText(), txt_IcodProfesor.getText(),cantidProfesor);*/
            
            Profesor obProfesor = new Profesor();
            obProfesor.setNombre(txt_InombreProfesor.getText());
            obProfesor.setApellido(txt_IapellidoProfesor.getText());
            obProfesor.setDireccionCorreo(txt_IemailProfesor.getText());
            obProfesor.setTelefono(txt_ItelefonoProfesor.getText());
            obProfesor.setSede(txt_IsedeProfesor.getText());
            obProfesor.setCodigoMarca(txt_IcodProfesor.getText());
            obProfesor.setCantidadCursosqueImparte(txt_IcantidProfesor.getValue().toString());
            controlArchivo.GuardarArchivo(obProfesor);
        }
        limpiar();
    }//GEN-LAST:event_bntGuardarProfesorActionPerformed

    private void btn_CargarDatosProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CargarDatosProfesoresActionPerformed
        Profesor profesor = new Profesor();
        String linea;FileReader f = null;
        try {
            f = new FileReader("profesores.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MasterClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        try (BufferedReader b = new BufferedReader(f)) {
            while ((linea = b.readLine()) != null) {
                String orden[] = linea.split(",");
                profesor.setNombre(orden[0]);
                profesor.setApellido(orden[1]);
                profesor.setDireccionCorreo(orden[2]);
                profesor.setTelefono(orden[3]);
                profesor.setSede(orden[4]);
                profesor.setCodigoMarca(orden[5]);
                profesor.setCantidadCursosqueImparte(orden[6]);
                datos.guardarP(profesor.getNombre(), profesor.getApellido(), 
                    profesor.getDireccionCorreo(), profesor.getTelefono(),
                    profesor.getSede(), profesor.getCodigoMarca(),
                    profesor.getCantidadCursosqueImparte());
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_CargarDatosProfesoresActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FormProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProfesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntGuardarProfesor;
    private javax.swing.JButton btn_CargarDatosProfesores;
    private javax.swing.JButton btn_anterior1;
    private javax.swing.JButton btn_buscarProfesor;
    private javax.swing.JButton btn_editarProfesor;
    private javax.swing.JButton btn_elimiarProfesor;
    private javax.swing.JButton btn_primero1;
    private javax.swing.JButton btn_siguiente1;
    private javax.swing.JButton btn_ultimo1;
    private javax.swing.JButton btn_volver4;
    private javax.swing.JButton btn_volver5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextField txt_CLibosAsignados;
    private javax.swing.JTextField txt_CapellidoProfesor;
    private javax.swing.JTextField txt_CcantidProfesor;
    private javax.swing.JTextField txt_CcodProfesor;
    private javax.swing.JTextField txt_CemailProfesor;
    private javax.swing.JTextField txt_CnombreProfesor;
    private javax.swing.JTextField txt_CsedeProfesor;
    private javax.swing.JTextField txt_CtelefonoProfesor;
    private javax.swing.JTextField txt_IapellidoProfesor;
    private javax.swing.JSpinner txt_IcantidProfesor;
    private javax.swing.JTextField txt_IcodProfesor;
    private javax.swing.JTextField txt_IemailProfesor;
    private javax.swing.JTextField txt_InombreProfesor;
    private javax.swing.JTextField txt_IsedeProfesor;
    private javax.swing.JTextField txt_ItelefonoProfesor;
    // End of variables declaration//GEN-END:variables
}
