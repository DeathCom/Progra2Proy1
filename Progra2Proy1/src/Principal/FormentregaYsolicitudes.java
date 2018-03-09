package Principal;
import Clases.DataSolicitudes;
import Clases.Estudiante;
import Clases.Funcionario;
import Clases.Libro;
import Clases.MasterArchivos;
import Clases.MasterClass;
import Clases.Profesor;
import Clases.Reservados;
import Clases.Solicitudes;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class FormentregaYsolicitudes extends javax.swing.JFrame {
    MasterClass datos = new MasterClass();
    DataSolicitudes data = new DataSolicitudes(); 
       
    public void imprimir(Estudiante arg){
        txt_Nombre.setText(arg.getNombre());
        txt_Apellido.setText(arg.getApellido());
        txt_Email.setText(arg.getDireccionCorreo());
        txt_Telefono.setText(arg.getTelefono());
        txt_Cede.setText(arg.getSede());
    }
    public void imprimir(Funcionario arg){
        txt_Nombre.setText(arg.getNombre());
        txt_Apellido.setText(arg.getApellido());
        txt_Email.setText(arg.getDireccionCorreo());
        txt_Telefono.setText(arg.getTelefono());
        txt_Cede.setText(arg.getSede());
    }
    public void imprimir(Profesor arg){
        txt_Nombre.setText(arg.getNombre());
        txt_Apellido.setText(arg.getApellido());
        txt_Email.setText(arg.getDireccionCorreo());
        txt_Telefono.setText(arg.getTelefono());
        txt_Cede.setText(arg.getSede());
    }
    public void imprimir(Libro arg){
        txt_TituloLibro.setText(arg.getNombreLibro());
        //txt_libroResumen.setText(arg.getNombreLibro());
        txt_librosAlmacenados.setText(arg.getCantidadLibrosDisponibles());
    }
    public void imprimir(Reservados arg){
        //txt_TituloLibro.setText(arg.getNombreLibro());
        txt_librosDisponibles.setText(arg.getDisponibles());
    }
     public void imprimir(Solicitudes arg){
        nombre.setText(arg.getNombSolicitante());
        libro.setText(arg.getNombLibro());
        cantidad.setText(arg.getLibAsignados());
    }
     
     public void limpiar(){
        nombre.setText("");
        libro.setText("");
        cantidad.setText("");
        txt_librosAsignadosP.setText("");
    }

    public FormentregaYsolicitudes() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_TipoPersona = new javax.swing.JComboBox<>();
        btn_CargarDatos = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Cede = new javax.swing.JTextField();
        txt_Telefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_Apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_Email = new javax.swing.JTextField();
        btn_buscarSolicitarLibro = new javax.swing.JButton();
        txt_TituloLibro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_librosAlmacenados = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_librosDisponibles = new javax.swing.JTextField();
        Buscarlibro = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_CantidadLibros = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        txt_Accion = new javax.swing.JComboBox<>();
        btn_enviarSolicitud = new javax.swing.JButton();
        btn_botonBuscarlibroAnterior = new javax.swing.JButton();
        btn_botonBuscarlibroSiguiente = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txt_librosAsignadosP = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        libro = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        btn_botonBuscarlibroSiguiente1 = new javax.swing.JButton();
        btn_botonBuscarlibroAnterior1 = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_botonBuscarPersona = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 50));

        jLabel6.setText("Tipo Persona:");

        txt_TipoPersona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Funcionario", "Estudiante", "Profesor" }));

        btn_CargarDatos.setText("Cargar Data");
        btn_CargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CargarDatosActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre: ");

        txt_Cede.setEditable(false);

        txt_Telefono.setEditable(false);

        jLabel4.setText("Telefono:");

        jLabel5.setText("Cede:");

        txt_Apellido.setEditable(false);

        jLabel3.setText("Apellido:");

        jLabel2.setText("Email:");

        txt_Email.setEditable(false);

        btn_buscarSolicitarLibro.setText("Buscar Persona");
        btn_buscarSolicitarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarSolicitarLibroActionPerformed(evt);
            }
        });

        jLabel7.setText("Titulo del Libro:");

        jLabel10.setText("Libros de Biblioteca:");

        txt_librosAlmacenados.setEditable(false);

        jLabel11.setText("Libros Disponibles:");

        txt_librosDisponibles.setEditable(false);

        Buscarlibro.setText("Buscar Libro");
        Buscarlibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarlibroActionPerformed(evt);
            }
        });

        jLabel8.setText("Cantidad Libros: ");

        jLabel9.setText("Accion:");

        txt_Accion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entregar Libro", "Solicitar Libro" }));

        btn_enviarSolicitud.setText("Enviar Solicitud");
        btn_enviarSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarSolicitudActionPerformed(evt);
            }
        });

        btn_botonBuscarlibroAnterior.setText("<");
        btn_botonBuscarlibroAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_botonBuscarlibroAnteriorActionPerformed(evt);
            }
        });

        btn_botonBuscarlibroSiguiente.setText(">");
        btn_botonBuscarlibroSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_botonBuscarlibroSiguienteActionPerformed(evt);
            }
        });

        jLabel13.setText("Libros Asignados ");

        txt_librosAsignadosP.setEditable(false);

        jLabel12.setText("Nombre");

        jLabel14.setText("Libro a  prestamo");

        jLabel15.setText("Cantidad de libros");

        btn_botonBuscarlibroSiguiente1.setText(">");
        btn_botonBuscarlibroSiguiente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_botonBuscarlibroSiguiente1ActionPerformed(evt);
            }
        });

        btn_botonBuscarlibroAnterior1.setText("<");
        btn_botonBuscarlibroAnterior1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_botonBuscarlibroAnterior1ActionPerformed(evt);
            }
        });

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_botonBuscarPersona.setText(">");
        btn_botonBuscarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_botonBuscarPersonaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_TipoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_CargarDatos)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(13, 13, 13)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txt_Apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                                .addGap(1, 1, 1))
                                            .addComponent(txt_Cede)
                                            .addComponent(txt_Email)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_TituloLibro)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_librosDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(btn_botonBuscarlibroAnterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_botonBuscarlibroSiguiente))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_librosAlmacenados, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_botonBuscarPersona)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_buscarSolicitarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_librosAsignadosP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_CantidadLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Accion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Buscarlibro)
                                .addGap(43, 43, 43))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(btn_enviarSolicitud))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel14))
                                        .addGap(23, 23, 23)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(libro, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(18, 18, 18)
                                        .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(btn_botonBuscarlibroAnterior1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_botonBuscarlibroSiguiente1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_limpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_TipoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_CargarDatos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(btn_botonBuscarlibroSiguiente)
                    .addComponent(btn_botonBuscarlibroAnterior))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txt_librosAlmacenados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_Cede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txt_librosDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_librosAsignadosP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_buscarSolicitarLibro)
                        .addComponent(jLabel8)
                        .addComponent(btn_botonBuscarPersona))
                    .addComponent(txt_CantidadLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Buscarlibro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Accion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addGap(18, 18, 18)
                .addComponent(btn_enviarSolicitud)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(libro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_botonBuscarlibroSiguiente1)
                    .addComponent(btn_botonBuscarlibroAnterior1)
                    .addComponent(btn_limpiar))
                .addGap(21, 21, 21))
        );

        jTabbedPane1.addTab("Solicitud y entrega de Libros", jPanel1);

        btn_atras.setText("Atras");
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_atras)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_atras)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        FormPrincipal selcam = new FormPrincipal();
        selcam.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void btn_botonBuscarlibroAnterior1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_botonBuscarlibroAnterior1ActionPerformed
        if(data.primeroR()==null){
            JOptionPane.showMessageDialog(rootPane, "No hay datos a Mostrar");
        }else{
           imprimir(data.anterior());
           if(libro.getText().equalsIgnoreCase(txt_TituloLibro.getText())){
                
                txt_librosAsignadosP.setText(cantidad.getText());
            }else{
                txt_librosAsignadosP.setText("");
            }
        }
    }//GEN-LAST:event_btn_botonBuscarlibroAnterior1ActionPerformed

    private void btn_botonBuscarlibroSiguiente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_botonBuscarlibroSiguiente1ActionPerformed
        if(data.primeroR()==null){
            JOptionPane.showMessageDialog(rootPane, "No hay datos a Mostrar");
        }else{
            imprimir(data.siguente());
            if(libro.getText().equalsIgnoreCase(txt_TituloLibro.getText())){
                txt_librosAsignadosP.setText(cantidad.getText());
            }else{
                txt_librosAsignadosP.setText("");
            }        
        } 
    }//GEN-LAST:event_btn_botonBuscarlibroSiguiente1ActionPerformed

    private void btn_botonBuscarlibroSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_botonBuscarlibroSiguienteActionPerformed
        if(datos.primeroL()==null || data.primeroR()==null){
            JOptionPane.showMessageDialog(rootPane, "No hay datos a Mostrar");
        }else{
            imprimir(datos.siguenteL());
            imprimir(data.siguenteR());        
        }
    }//GEN-LAST:event_btn_botonBuscarlibroSiguienteActionPerformed

    private void btn_botonBuscarlibroAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_botonBuscarlibroAnteriorActionPerformed
        if(datos.primeroL()==null || data.primeroR()==null){
            JOptionPane.showMessageDialog(rootPane, "No hay datos a Mostrar");
        }else{
           imprimir(datos.anteriorL());
           imprimir(data.anteriorR()); 
        }
        
    }//GEN-LAST:event_btn_botonBuscarlibroAnteriorActionPerformed

    private void btn_enviarSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarSolicitudActionPerformed
        MasterArchivos reserva = new MasterArchivos();
        String TipoPersona = txt_TipoPersona.getSelectedItem().toString();
        if(datos.primeroL()==null){
            JOptionPane.showMessageDialog(rootPane, "Primero Carge los datos");
        }else{
            if(txt_Accion.getSelectedItem().toString().equalsIgnoreCase("Solicitar Libro")){
            //Libro li = new Libro();
            int c1 = Integer.parseInt(txt_librosAlmacenados.getText());
            int c2 = Integer.parseInt(txt_CantidadLibros.getValue().toString());

            String resto = Integer.toString(c1-c2);

            reserva.GuardarArchivo(txt_Nombre.getText(),txt_TituloLibro.getText(),txt_CantidadLibros.getValue().toString());

            //reserva.GuardarArchivolibro(txt_TituloLibro.getText(), resto);
            //JOptionPane.showMessageDialog(null, "Solicitud Recibida");

            try{
                BufferedReader files = new BufferedReader(new FileReader("Reservaciones2.txt"));
                String lines;String input = "";
                while((lines = files.readLine()) != null){

                    if(lines.contains(txt_TituloLibro.getText())){
                        input += lines.replaceAll(txt_librosDisponibles.getText(),resto)+"\r\n";
                        //input += "\n";
                    }else{
                        input += lines+"\r\n";
                    }

                }
                FileOutputStream fileOut = new FileOutputStream("Reservaciones2.txt");
                fileOut.write(input.getBytes());
                fileOut.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "Dato no modificado");
            }

            JOptionPane.showMessageDialog(null, "Solicitud Recibida");

            }else if(txt_Accion.getSelectedItem().toString().equalsIgnoreCase("Entregar Libro")){
                int c3 = Integer.parseInt(txt_librosDisponibles.getText());
                int c4 = Integer.parseInt(txt_CantidadLibros.getValue().toString());
                String operacion2 = Integer.toString(c3+c4);
                try{
                    BufferedReader files = new BufferedReader(new FileReader("Reservaciones2.txt"));
                    String lines;String input = "";
                    while((lines = files.readLine()) != null){

                        if(lines.contains(txt_TituloLibro.getText())){
                            input += lines.replaceAll(txt_librosDisponibles.getText(),operacion2)+"\r\n";
                            //input += "\n";
                        }else{
                            input += lines+"\r\n";
                        }

                    }
                    FileOutputStream fileOut = new FileOutputStream("Reservaciones2.txt");
                    fileOut.write(input.getBytes());
                    fileOut.close();
                }catch(Exception e){
                    JOptionPane.showMessageDialog(rootPane, "Dato no modificado");
                }

                int c1 = Integer.parseInt(txt_librosAsignadosP.getText());
                int c2 = Integer.parseInt(txt_CantidadLibros.getValue().toString());

                //int operacion = c1-c2;
                String operacion = Integer.toString(c1-c2);

                try{
                    BufferedReader file = new BufferedReader(new FileReader("Reservaciones.txt"));
                    String line;String input = "";
                    while((line = file.readLine()) != null){

                        if(line.contains(txt_Nombre.getText())){
                            input += line.replaceAll(txt_librosAsignadosP.getText(),operacion)+"\r\n";
                            //input += "\n";
                        }else{
                            input += line+"\r\n";
                        }

                    }
                    FileOutputStream fileOut = new FileOutputStream("Reservaciones.txt");
                    fileOut.write(input.getBytes());
                    fileOut.close();
                }catch(Exception e){
                    JOptionPane.showMessageDialog(rootPane, "Dato no modificado");
                }

            }
        }
        //limpiarL();
        //FormPrincipal selcam = new FormPrincipal();
        //selcam.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_btn_enviarSolicitudActionPerformed

    private void BuscarlibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarlibroActionPerformed
        if(datos.primeroL()==null || data.primeroR()==null){
            JOptionPane.showMessageDialog(rootPane, "No hay datos a Mostrar");
        }else{
            imprimir(data.buscarR(txt_TituloLibro.getText()));
            imprimir(datos.buscarL(txt_TituloLibro.getText()));
        }
    }//GEN-LAST:event_BuscarlibroActionPerformed

    private void btn_buscarSolicitarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarSolicitarLibroActionPerformed
        String TipoPersona = txt_TipoPersona.getSelectedItem().toString();
        if(datos.primeroL()==null){
            JOptionPane.showMessageDialog(rootPane, "Primero Carge los datos");
        }else{
           if(TipoPersona.equalsIgnoreCase("Funcionario")){
                imprimir(datos.buscarF(txt_Nombre.getText()));
            }else if(TipoPersona.equalsIgnoreCase("Estudiante")){
                imprimir(datos.buscarE(txt_Nombre.getText()));
            }else if(TipoPersona.equalsIgnoreCase("Profesor")){
                imprimir(datos.buscarP(txt_Nombre.getText()));
            }
           imprimir(data.buscar(txt_Nombre.getText()));
           imprimir(data.buscarR(libro.getText()));
           imprimir(datos.buscarL(libro.getText()));
           txt_librosAsignadosP.setText(cantidad.getText());
           //jj
        }
    }//GEN-LAST:event_btn_buscarSolicitarLibroActionPerformed

    private void btn_CargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CargarDatosActionPerformed
        String TipoPersona = txt_TipoPersona.getSelectedItem().toString();
        
        //######################################################################
        Funcionario funcionario = new Funcionario();
            String lineaF;FileReader fF = null;
            try {
                fF = new FileReader("Funcionarios.txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MasterClass.class.getName()).log(Level.SEVERE, null, ex);
            }
            try (BufferedReader b = new BufferedReader(fF)) {
                while ((lineaF = b.readLine()) != null) {
                    String orden[] = lineaF.split(",");
                    funcionario.setNombre(orden[0]);
                    funcionario.setApellido(orden[1]);
                    funcionario.setDireccionCorreo(orden[2]);
                    funcionario.setTelefono(orden[3]);
                    funcionario.setSede(orden[4]);
                    funcionario.setNumeroEmpleado(orden[5]);
                    funcionario.setPuesto(orden[6]);
                    funcionario.setDepartamento(orden[7]);
                    datos.guardarF(funcionario.getNombre(), funcionario.getApellido(),
                        funcionario.getDireccionCorreo(), funcionario.getTelefono(),
                        funcionario.getSede(), funcionario.getNumeroEmpleado(),
                        funcionario.getPuesto(), funcionario.getDepartamento());
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e);
            }
            //##################################################################
            Estudiante estudiante = new Estudiante();
            String lineaE;FileReader fE = null;
            try {
                fE = new FileReader("Estudiantes.txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MasterClass.class.getName()).log(Level.SEVERE, null, ex);
            }
            try (BufferedReader b = new BufferedReader(fE)) {
                while ((lineaE = b.readLine()) != null) {
                    String orden[] = lineaE.split(",");
                    estudiante.setNombre(orden[0]);
                    estudiante.setApellido(orden[1]);
                    estudiante.setDireccionCorreo(orden[2]);
                    estudiante.setTelefono(orden[3]);
                    estudiante.setSede(orden[4]);
                    estudiante.setNumeroCarnet(orden[5]);
                    estudiante.setCarreraCursando(orden[6]);
                    estudiante.setEstatus(orden[7]);

                    datos.guardarE(estudiante.getNombre(), estudiante.getApellido(),
                        estudiante.getDireccionCorreo(), estudiante.getTelefono(),
                        estudiante.getSede(), estudiante.getNumeroCarnet(),
                        estudiante.getCarreraCursando(), estudiante.getEstatus());
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e);
            }
            //##################################################################
            Profesor profesor = new Profesor();
            String lineaP;FileReader fP = null;
            try {
                fP = new FileReader("Profesores.txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MasterClass.class.getName()).log(Level.SEVERE, null, ex);
            }
            try (BufferedReader b = new BufferedReader(fP)) {
                while ((lineaP = b.readLine()) != null) {
                    String orden[] = lineaP.split(",");
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
        /*if(TipoPersona.equalsIgnoreCase("Funcionario")){
        }else if(TipoPersona.equalsIgnoreCase("Estudiante")){
        }else if(TipoPersona.equalsIgnoreCase("Profesor")){
        }*/
        //############Cargar datos de Libro##########################
        Libro libro = new Libro();
        String lineaL;FileReader fL = null;
        try {
            fL = new FileReader("Libros.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MasterClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        try (BufferedReader b = new BufferedReader(fL)) {
            while ((lineaL = b.readLine()) != null) {
                String orden[] = lineaL.split(",");
                libro.setNombreLibro(orden[0]);
                libro.setAutor(orden[1]);
                libro.setFechaPublicacion(orden[2]);
                libro.setEditorial(orden[3]);
                libro.setCantidadLibrosDisponibles(orden[4]);
                datos.guardarL(libro.getNombreLibro(), libro.getAutor(),
                    libro.getFechaPublicacion(), libro.getEditorial(),
                    libro.getCantidadLibrosDisponibles());
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        //############Cargar datos de Solicitudes##########################
        Solicitudes solicitud = new Solicitudes();
        String lineaS;FileReader fS = null;
        try {
            fS = new FileReader("Reservaciones.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataSolicitudes.class.getName()).log(Level.SEVERE, null, ex);
        }
        try (BufferedReader b = new BufferedReader(fS)) {
            while ((lineaS = b.readLine()) != null) {
                String orden[] = lineaS.split(",");
                solicitud.setNombSolicitante(orden[0]);
                solicitud.setNombLibro(orden[1]);
                solicitud.setLibAsignados(orden[2]);

                data.guardar(solicitud.getNombSolicitante(), solicitud.getNombLibro(),
                    solicitud.getLibAsignados());
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        //############Cargar datos de Solicitudes2##########################
        Reservados Librosdisponibles = new Reservados();
        String lineaS2;FileReader fS2 = null;
        try {
            fS2 = new FileReader("Reservaciones2.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataSolicitudes.class.getName()).log(Level.SEVERE, null, ex);
        }
        try (BufferedReader b = new BufferedReader(fS2)) {
            while ((lineaS2 = b.readLine()) != null) {
                String orden[] = lineaS2.split(",");
                Librosdisponibles.setNombreLibro(orden[0]);
                Librosdisponibles.setDisponibles(orden[1]);

                data.guardarR(Librosdisponibles.getNombreLibro(), Librosdisponibles.getDisponibles());
                //System.out.print(Librosdisponibles.getNombreLibro()+"\n"+Librosdisponibles.getDisponibles());
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btn_CargarDatosActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_botonBuscarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_botonBuscarPersonaActionPerformed
        String TipoPersona = txt_TipoPersona.getSelectedItem().toString();
           
        if(data.primeroR()==null){
            JOptionPane.showMessageDialog(rootPane, "Primero Cargue los Datos");
        }else{
           if(TipoPersona.equalsIgnoreCase("Funcionario")){
            imprimir(datos.siguenteF());
            }else if(TipoPersona.equalsIgnoreCase("Estudiante")){
                imprimir(datos.siguenteE());
            }else if(TipoPersona.equalsIgnoreCase("Profesor")){
                imprimir(datos.siguenteP());
            } 
        } 
    }//GEN-LAST:event_btn_botonBuscarPersonaActionPerformed

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
            java.util.logging.Logger.getLogger(FormentregaYsolicitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormentregaYsolicitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormentregaYsolicitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormentregaYsolicitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormentregaYsolicitudes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscarlibro;
    private javax.swing.JButton btn_CargarDatos;
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_botonBuscarPersona;
    private javax.swing.JButton btn_botonBuscarlibroAnterior;
    private javax.swing.JButton btn_botonBuscarlibroAnterior1;
    private javax.swing.JButton btn_botonBuscarlibroSiguiente;
    private javax.swing.JButton btn_botonBuscarlibroSiguiente1;
    private javax.swing.JButton btn_buscarSolicitarLibro;
    private javax.swing.JButton btn_enviarSolicitud;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JTextField cantidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField libro;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> txt_Accion;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JSpinner txt_CantidadLibros;
    private javax.swing.JTextField txt_Cede;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Telefono;
    private javax.swing.JComboBox<String> txt_TipoPersona;
    private javax.swing.JTextField txt_TituloLibro;
    private javax.swing.JTextField txt_librosAlmacenados;
    private javax.swing.JTextField txt_librosAsignadosP;
    private javax.swing.JTextField txt_librosDisponibles;
    // End of variables declaration//GEN-END:variables
}
