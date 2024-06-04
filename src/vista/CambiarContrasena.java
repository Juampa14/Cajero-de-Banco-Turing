package vista;
/*Librerias importadas para escritura de archivos, creacion de cuadros de dialogo e interfaces,
manejo de excepciones, y manipulacion de lista de datos.*/ 
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
//Clase encargada de gestionar la Interfaz de Cmabio de contrasena.
public class CambiarContrasena extends javax.swing.JFrame {

    private String nombre;
    private int nro;
    private String apellido;
    private int idioma;
    private String selec;
    private ArrayList<Cuenta> cuentas;
    
    /*Constructor donde inicializaremos los componentes de la interfaz y creamos una lista de cuentas 
    donde recuperaremos su informacion y la actualizaremos.*/
    public CambiarContrasena() {
        cuentas = new ArrayList<>();
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        BotonAtras = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BotonConfirmar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        contrasenaActual = new javax.swing.JPasswordField();
        contrasenaNew = new javax.swing.JPasswordField();
        verificarContrasena = new javax.swing.JPasswordField();

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 102));
        jButton2.setText("Confirmar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));

        BotonAtras.setBackground(new java.awt.Color(204, 204, 204));
        BotonAtras.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonAtras.setForeground(new java.awt.Color(0, 0, 102));
        BotonAtras.setText("Atras");
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ingrese la contraseña actual:");

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ingrese su nueva contraseña:");

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Confirme la nueva contraseña:");

        BotonConfirmar.setBackground(new java.awt.Color(204, 204, 204));
        BotonConfirmar.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonConfirmar.setForeground(new java.awt.Color(0, 0, 102));
        BotonConfirmar.setText("Confirmar");
        BotonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConfirmarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(153, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Cambiar Contraseña");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        contrasenaActual.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        contrasenaActual.setForeground(new java.awt.Color(0, 0, 102));
        contrasenaActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenaActualActionPerformed(evt);
            }
        });

        contrasenaNew.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        contrasenaNew.setForeground(new java.awt.Color(0, 0, 102));
        contrasenaNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenaNewActionPerformed(evt);
            }
        });

        verificarContrasena.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        verificarContrasena.setForeground(new java.awt.Color(0, 0, 102));
        verificarContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarContrasenaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(BotonConfirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(verificarContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contrasenaNew, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contrasenaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contrasenaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(12, 12, 12)
                .addComponent(contrasenaNew, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verificarContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAtras)
                    .addComponent(BotonConfirmar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Metodo/Boton encargado de redirigirnos a una ventana anterior, que seria MenuTransacciones.
    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        MenuTransacciones menu = new MenuTransacciones();
        menu.datos(nombre, nro,apellido,idioma);
        menu.idioma(idioma);
        menu.cargarDatos();
        menu.mantCuenta(selec);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonAtrasActionPerformed
    /*Metodo/Boton encargado de confirmar el cambio de contrasena, mandandonos un mesaje de se cambio la contrasena exitosamente en caso
    se haya realizado correctamente, y en caso faltara un campo o se proporcione datos incorrectos nos pedira vrificar los datos.*/
    private void BotonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConfirmarActionPerformed
        String passAnt = contrasenaActual.getText();
        String passNew = contrasenaNew.getText();
        String verPass = verificarContrasena.getText();
        llenarListaCuentas();
        boolean contraseñaCambiada = false;
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getNroCuenta() == nro) {
                if (cuentas.get(i).getContraseña().equals(passAnt) && passNew.equals(verPass)) {
                    cuentas.get(i).setContraseña(passNew);
                    guardarCambios("Usuarios");
                    contraseñaCambiada = true;
                    break;
                }
            }
        }
        if (contraseñaCambiada) {
            JOptionPane.showMessageDialog(null, "Se cambió la contraseña exitosamente.");
            new AccederCuenta().setVisible(true);
            this.setVisible(false);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Verifique sus datos por favor, no están correctos.");
            contrasenaActual.setText("");
            contrasenaNew.setText("");
            verificarContrasena.setText("");
        }
    }//GEN-LAST:event_BotonConfirmarActionPerformed
    /*Metodo encargado de guardar los cambios que se hagan en un archivo en especifico de una lista de cuentas.*/
    public void guardarCambios(String Archivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Archivo))) {
            writer.write("");
            // Escribir cada elemento del ArrayList en una línea separada
            for (int i = 0; i < cuentas.size(); i++) {
                writer.write(cuentas.get(i).getNombre() + ";" + cuentas.get(i).getApellido() + ";" + cuentas.get(i).getNroCuenta() + ";" + cuentas.get(i).getLogin() + ";" + cuentas.get(i).getContraseña());
                writer.newLine(); // Agregar un salto de línea después de cada elemento

            }
            System.out.println("ArrayList guardado en " + Archivo + " correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar el ArrayList en el archivo.");
            e.printStackTrace();
        }
    }
    //Metodo encargado de leer un archivo con informacion de las cuentas, tomar los datos importantes y almacenarlos en una lista.
    public void llenarListaCuentas() {
        AccederCuenta acc = new AccederCuenta();
        ArrayList<String> lineas = acc.obtenerTexto("Usuarios");
        if (lineas != null) {
            for (String linea : lineas) {
                StringTokenizer tokens = new StringTokenizer(linea, ";");
                if (tokens.countTokens() >= 5) { // Verificar si hay al menos 5 tokens en la línea
                    String nombrec = tokens.nextToken();
                    String apellido = tokens.nextToken();
                    int nroc = 0;
                    try {
                        nroc = Integer.parseInt(tokens.nextToken());
                    } catch (NumberFormatException e) {
                        System.err.println("Error al convertir a entero: " + e.getMessage());
                    }
                    String login = tokens.nextToken();
                    String contraseña = tokens.nextToken();
                    Cuenta cuenta = new Cuenta(nombrec, apellido, nroc, login, contraseña);
                    cuentas.add(cuenta);
                } else {
                    System.err.println("Error: La línea no tiene el formato esperado.");
                }
            }
        } else {
            System.out.println("No hay líneas en el archivo Usuarios.");
        }
    }
    //No funcionalidad
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed
    //Metodo contenedor del campo contrasena actual, en el cual deberemos digitar la contrasena con la cual entramos a la cuenta.
    private void contrasenaActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenaActualActionPerformed
        
    }//GEN-LAST:event_contrasenaActualActionPerformed
    //Metodo contenedor del campo nueva contrasena.
    private void contrasenaNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenaNewActionPerformed
        
    }//GEN-LAST:event_contrasenaNewActionPerformed
    //Metodo contenedor del campo verificar contrasena, donde deberemos digitar nuestra nueva contrasena denuevo.
    private void verificarContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificarContrasenaActionPerformed
        
    }//GEN-LAST:event_verificarContrasenaActionPerformed
    //Metodo encargado de cargar los datos del cliente para luego recuperarlos.
    public void datos(String nombre, int nro,String apellido,int idioma,String selec) {
        this.nombre = nombre;
        this.nro = nro;
        this.apellido=apellido;
        this.idioma=idioma;
        this.selec=selec;
    }
    //Metodo principal encargado de inicializar la clase.
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambiarContrasena().setVisible(true);
            }
        });
    }
    /*Metodo encargado de gestionar el cambio de idioma a Ingles y Quechua cambiando el idioma por defecto
    (espanol) del programa.*/
    public void idioma(int idioma){
        if (idioma==1){
            ingles();
        }else if(idioma==2){
            quechua();
        }
    }
    //Metodo encargado de traducir todo el texto en espanol de la interfaz "CambiarContrasena" al idioma Ingles.
    public void ingles(){
        jButton2.setText("Confirm");
        BotonAtras.setText("Back");
        jLabel4.setText("Enter the current password:");
        jLabel5.setText("Enter your new password:");
        jLabel6.setText("Confirm the new password:");
        BotonConfirmar.setText("Confirm");
        jLabel1.setText("Change Password");
    }
    //Metodo encargado de traducir todo el texto en espanol de la interfaz "CambiarContrasena" al idioma Quechua.
    public void quechua(){
        jButton2.setText("Kachkanay");
        BotonAtras.setText("Qhipa");
        jLabel4.setText("Kachkanay kay k'itinchik:");
        jLabel5.setText("Kachkanay musoq k'itinchik:");
        jLabel6.setText("Kachkanay musoq k'itinchik ruranay:");
        BotonConfirmar.setText("Kachkanay");
        jLabel1.setText("Simi ñit'iyta tukuy");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton BotonConfirmar;
    private javax.swing.JPasswordField contrasenaActual;
    private javax.swing.JPasswordField contrasenaNew;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField verificarContrasena;
    // End of variables declaration//GEN-END:variables
}
