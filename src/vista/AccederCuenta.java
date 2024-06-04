package vista;
/*Librerias importadas para la lectura, ecritura de texto, manipulacion de archivos, 
almacenamiento de listas y creacion de cuadros de dialogo e interfaces.*/ 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
//Clase encargada de administrar el inicio de sesion de una cuenta, dando como parametros el usuario y contrasena.
public class AccederCuenta extends javax.swing.JFrame {

    private String log;
    private String contra;
    public ArrayList<Cuenta> listaCuentas;
    private String Nombre;
    private String Apellido;
    private int idioma;
    //Constructor donde inicializamos los componentes y la lista de cuentas.
    public AccederCuenta() {
        initComponents();
        listaCuentas = new ArrayList<>();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BotonCrearCuenta = new javax.swing.JButton();
        BotonIrAtras = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        login = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        ingresarjb = new javax.swing.JButton();
        LineaAmarilla1 = new javax.swing.JTextField();
        LineaNaranja = new javax.swing.JTextField();
        LineaAmarilla2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 70)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BIENVENIDO");
        jLabel3.setToolTipText("");

        BotonCrearCuenta.setBackground(new java.awt.Color(204, 204, 204));
        BotonCrearCuenta.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonCrearCuenta.setForeground(new java.awt.Color(0, 0, 102));
        BotonCrearCuenta.setText("Crear Cuenta");
        BotonCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearCuentaActionPerformed(evt);
            }
        });

        BotonIrAtras.setBackground(new java.awt.Color(204, 204, 204));
        BotonIrAtras.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonIrAtras.setForeground(new java.awt.Color(0, 0, 102));
        BotonIrAtras.setText("Atras");
        BotonIrAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIrAtrasActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("BANCO TURNIG");

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Usuario :");

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("INGRESE SUS DATOS:");

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setText("Contraseña :");

        login.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 36)); // NOI18N
        login.setForeground(new java.awt.Color(0, 0, 102));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        password.setForeground(new java.awt.Color(0, 0, 102));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        ingresarjb.setBackground(new java.awt.Color(204, 204, 204));
        ingresarjb.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        ingresarjb.setForeground(new java.awt.Color(0, 0, 102));
        ingresarjb.setText("Ingresar");
        ingresarjb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarjbActionPerformed(evt);
            }
        });

        LineaAmarilla1.setBackground(new java.awt.Color(255, 204, 0));
        LineaAmarilla1.setBorder(null);

        LineaNaranja.setBackground(new java.awt.Color(255, 102, 0));
        LineaNaranja.setBorder(null);

        LineaAmarilla2.setBackground(new java.awt.Color(255, 204, 0));
        LineaAmarilla2.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(ingresarjb, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonIrAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LineaAmarilla1)
                    .addComponent(LineaNaranja)
                    .addComponent(LineaAmarilla2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonCrearCuenta))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LineaAmarilla1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LineaNaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LineaAmarilla2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonIrAtras)
                    .addComponent(ingresarjb, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*Metodo/Boton encargado de verificar la autenticación de usuarios, teniendo como parametros
    su nombre y contrasena redirigiendote a la venta de MenuTransacciones en caso de exito o mostrandote
    un mensaje en caso de fallo.*/
    private void ingresarjbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarjbActionPerformed
        log = login.getText();
        contra = String.valueOf(password.getText());
        llenarLista();
        boolean loginExitoso = false;
        int c = 0;

        for (int j = 0; j < listaCuentas.size(); j++) {
            System.out.println("hola");
            mostrar();
            if (listaCuentas.get(j).iniciarSesion(log,contra)) {
                MenuTransacciones menu = new MenuTransacciones();
                String nombre=listaCuentas.get(j).getNombre();
                System.out.println(nombre);
                Nombre = nombre;
                String apellido=listaCuentas.get(j).getApellido();
                System.out.println(apellido);
                Apellido = apellido;
                int nro=listaCuentas.get(j).getNroCuenta();
                menu.datos(nombre, nro,apellido,idioma);
                menu.cargarDatos();
                menu.idioma(idioma);
                this.dispose();
                menu.setVisible(true);
                c = 1;
                loginExitoso = true;
                break;
            }
        }
        if (!loginExitoso) {
        JOptionPane.showMessageDialog(this, "Contraseña incorrecta o usuario no encontrado.", "Error de autenticación", JOptionPane.ERROR_MESSAGE);
        } else {
        System.out.println("BIENVENIDO.");
        }
    }//GEN-LAST:event_ingresarjbActionPerformed
    //Metodo contenedor del campo contrasena para escribir en el.
    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed

    }//GEN-LAST:event_passwordActionPerformed
    //Metodo contenedor del campo nombre de usuario para escribir en el.
    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed

    }//GEN-LAST:event_loginActionPerformed
    //Metodo/Boton encargado de redirigirnos a la Interfaz/Ventana de Inicio/Seleecion de idioma.
    private void BotonIrAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIrAtrasActionPerformed
        new Inicio().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonIrAtrasActionPerformed
    /*Metodo/Boton encargado de redirigirnos a la Interfaz/Ventana de CrearCuenta*/
    private void BotonCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearCuentaActionPerformed
        CrearCuenta crear = new CrearCuenta();
        crear.idioma(idioma);
        crear.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonCrearCuentaActionPerformed
    /*Metodo encargado de proporcionar la lista de cuentas para que el sistema verifique si la cuenta
    que se proporciono existe o no en la "listaCuentas".*/
    public void mostrar() {
        for (int j = 0; j < listaCuentas.size(); j++) {
            System.out.println(listaCuentas.get(j));
        }
    }
    /*Metodo encargado de almacenar la informacion de un archivo de texto como datos de memoria para usarlo
    posteriormente.*/
    public ArrayList<String> obtenerTexto(String nombreA) {
        ArrayList<String> lineasDeTexto = new ArrayList<>();
            try {
                BufferedReader br = new BufferedReader(new FileReader(nombreA));
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                    lineasDeTexto.add(linea);
                }
                br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Se produjo un error al leer el archivo.");
            }
            return lineasDeTexto;
    }
    /*Metodo encargado de leer el contenido del achivo "Usuarios" para luego extraer dicha informacion y crear objetos de tipo cuenta 
    que posteriormente seran agregados al ArrayList "listaCuentas.*/
    public void llenarLista() {
        ArrayList<String> lineas = obtenerTexto("Usuarios");
        if (lineas != null) {
            for (String linea : lineas) {
                StringTokenizer tokens = new StringTokenizer(linea, ";");
                if (tokens.countTokens() >= 5) { // Verificar si hay al menos 5 tokens en la línea
                    String nombre = tokens.nextToken();
                    String apellido = tokens.nextToken();
                    int nro = 0;
                    try {
                        nro = Integer.parseInt(tokens.nextToken());
                    } catch (NumberFormatException e) {
                        System.err.println("Error al convertir a entero: " + e.getMessage());
                    }
                    String login = tokens.nextToken();
                    String contraseña = tokens.nextToken();
                    Cuenta cuenta = new Cuenta(nombre, apellido, nro, login, contraseña);
                    listaCuentas.add(cuenta);
                } else {
                    System.err.println("Error: La línea no tiene el formato esperado.");
                }
            }
        } else {
            System.out.println("No hay líneas en el archivo Usuarios.");
        }
    }
    /*Metodo encargado de gestionar el cambio de idioma a Ingles y Quechua cambiando el idioma por defecto
    (espanol) del programa.*/
    public void idioma(int idioma){
        this.idioma=idioma;
        if (idioma==1){
            ingles();
        }else if(idioma==2){
            quechua();
        }
    }
    //Metodo principal encargado de inicializar la clase.
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccederCuenta().setVisible(true);
            }
        });
    }
    //Metodo encargado de traducir todo el texto en espanol de la interfaz "AccederCuenta" al idioma Ingles.
    public void ingles(){
        jLabel3.setText("WELCOME");
        BotonCrearCuenta.setText("Create Account");
        BotonIrAtras.setText("Back");
        jLabel4.setText("BANK TURNIG");
        jLabel5.setText("User :");
        jLabel6.setText("ENTER YOUR DETAILS:");
        jLabel7.setText("Password :");
        ingresarjb.setText("Log In");
    }
    //Metodo encargado de traducir todo el texto en espanol de la interfaz "AccederCuenta" al idioma Quechua.
    public void quechua(){
        jLabel3.setText("YATICHAÑATAKI");
        BotonCrearCuenta.setText("Ch'ini Ikkhuta");
        BotonIrAtras.setText("Qhipa");
        jLabel4.setText("BANCO TURING");
        jLabel5.setText("Lurata :");
        jLabel6.setText("QILLQAYKITA KAYKUNA:");
        jLabel7.setText("Apatamawka :");
        ingresarjb.setText("Yatiyki");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCrearCuenta;
    private javax.swing.JButton BotonIrAtras;
    private javax.swing.JTextField LineaAmarilla1;
    private javax.swing.JTextField LineaAmarilla2;
    private javax.swing.JTextField LineaNaranja;
    private javax.swing.JButton ingresarjb;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField login;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}