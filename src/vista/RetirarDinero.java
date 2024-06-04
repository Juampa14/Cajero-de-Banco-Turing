package vista;
/*Librerias importadas para la lectura y escritura de archivos, creacion de cuadros de dialogo e interfaces,
manejo de excepciones y manipulacion de lista de datos.*/ 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
/*Clase encargada de gestionar la Interfaz/ventana de retiro de dinero de una cuenta con la cual se podra sacar 
dinero del cajero.*/
public class RetirarDinero extends javax.swing.JFrame {

    private String nombre;
    private int nro;
    private String selecte;
    private String apellido;
    private int idioma;
    private ArrayList<TipoCuenta> saldos;

    /*Constructor donde inicializamos los componentes y creamos un lista de saldos para actualizarlos 
    posteriormente con la informacion que se tiene.*/
    public RetirarDinero() {
        saldos = new ArrayList<>();

        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BotonAtras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        montoRetiro = new javax.swing.JTextField();
        jbRetiro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ingrese la cantidad de");

        BotonAtras.setBackground(new java.awt.Color(204, 204, 204));
        BotonAtras.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonAtras.setForeground(new java.awt.Color(0, 0, 102));
        BotonAtras.setText("Atras");
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("dinero a retirar:");

        montoRetiro.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        montoRetiro.setForeground(new java.awt.Color(0, 0, 102));
        montoRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                montoRetiroActionPerformed(evt);
            }
        });

        jbRetiro.setBackground(new java.awt.Color(204, 204, 204));
        jbRetiro.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jbRetiro.setForeground(new java.awt.Color(0, 0, 102));
        jbRetiro.setText("Confirmar");
        jbRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRetiroActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(153, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Retirar Dinero");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jbRetiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(montoRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(293, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(montoRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAtras)
                    .addComponent(jbRetiro)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Metodo/Boton encargado de redirigirnos a una Interfaz/Ventana posterior la cual sera el Menu de transacciones.
    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        MenuTransacciones menu = new MenuTransacciones();
        menu.datos(nombre, nro,apellido,idioma);
        menu.idioma(idioma);
        
        menu.cargarDatos();
        menu.mantCuenta(selecte);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonAtrasActionPerformed
    //Metodo encargado de registrar en un archivo los retiros de dinero realizados por el cliente.
    public void Historial(String selecte){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nro+selecte,true))) {
            writer.write("");
            // Escribir cada elemento del ArrayList en una línea separada
                writer.write("Se realizo un retiro de : "+montoRetiro.getText()+" "+selecte);
                writer.newLine(); // Agregar un salto de línea después de cada elemento
            System.out.println("ArrayList guardado en " + nombre+"historial" + " correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar el ArrayList en el archivo.");
            e.printStackTrace();
        }
    }
    //Metodo encargado de cargar los datos del cliente para luego recuperarlos.
    public void datos(String nombre, int nro,String selecte,String apellido,int idioma) {
        this.nombre = nombre;
        this.apellido=apellido;
        this.nro = nro;
        this.selecte=selecte;
        this.idioma=idioma;
    }
    //Metodo encargado de leer un archivo con informacion de las cuentas, tomar los datos importantes y almacenarlos en una lista.
    public void llenarLista(String archivo) {
        AccederCuenta acc = new AccederCuenta();
        ArrayList<String> lineas = acc.obtenerTexto(archivo);
        if (lineas != null) {
            for (String linea : lineas) {
                StringTokenizer tokens = new StringTokenizer(linea, ";");
                if (tokens.countTokens() >= 3) {
                    
                    int nros = Integer.parseInt(tokens.nextToken());// Verificar si hay al menos 5 tokens en la línea
                    String moneda = tokens.nextToken();
                    double saldo = Double.parseDouble(tokens.nextToken());
                    TipoCuenta tipoMoneda = new TipoCuenta(nros,moneda, saldo);
                    //System.out.println(nros+moneda+saldo);
                    saldos.add(tipoMoneda);
                } else {
                    System.err.println("Error: La línea no tiene el formato esperado.");
                }
            }
        } else {
            System.out.println("No hay líneas en el archivo Usuarios.");
        }

    }
    //Metodo contenedor del campo monto de retiro donde se escribira en el, el monto de dinero que queramos sacar.
    private void montoRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montoRetiroActionPerformed

    }//GEN-LAST:event_montoRetiroActionPerformed
    /*Metodo/Boton encargado de confirmar el retiro de dinero de una cuenta, si es exitoso se vera un mensaje de dialogo
    de retiro exitoso y sino mostrara que introduzca bien los datos o tambien en el caso de que no haya dinero suficiente 
    para el retiro.*/
    private void jbRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRetiroActionPerformed
        llenarLista(nro + "");
        double retiro;
        try {
            retiro = Double.parseDouble(montoRetiro.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, introduzca una cantidad válida");
            return;
        }
        for (int i = 0; i < saldos.size(); i++) {
            if (selecte.equals(saldos.get(i).getTipoMoneda())) {
                if (saldos.get(i).getSaldo() >= retiro) {
                    double money = saldos.get(i).getSaldo();
                    saldos.get(i).setSaldo(money - retiro);
                    Historial(selecte);
                    guardarCambios("" + nro);
                    JOptionPane.showMessageDialog(null, "Se realizó el Retiro con Éxito.");
                    montoRetiro.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "No tiene suficiente monto para realizar el retiro.");
                }
                break; // Se rompe el bucle después de encontrar la moneda, ya que no es necesario seguir buscando
            }
        }
        montoRetiro.setText("");
    }//GEN-LAST:event_jbRetiroActionPerformed
    /*Metodo encargado de guardar los cambios que se hagan en un archivo en especifico de una lista de cuentas.*/
    public void guardarCambios(String Archivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Archivo))) {
            writer.write("");
            // Escribir cada elemento del ArrayList en una línea separada
            for (int i = 0; i < saldos.size(); i++) {
                long n=saldos.get(i).getNroCuenta();
                String m=saldos.get(i).getTipoMoneda();
                double s=saldos.get(i).getSaldo();
                writer.write(n+";"+m + ";" + s);
                writer.newLine(); // Agregar un salto de línea después de cada elemento
                
            }
            System.out.println("ArrayList guardado en " + Archivo + " correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar el ArrayList en el archivo.");
            e.printStackTrace();
        }
    }
    //Metodo principal encargado de inicializar la clase.
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RetirarDinero().setVisible(true);
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
    //Metodo encargado de traducir todo el texto en espanol de la interfaz "RetirarDinero" al idioma Ingles.
    public void ingles(){
      jLabel2.setText("Enter the amount of");
      BotonAtras.setText("Back");
      jLabel3.setText("Amount to withdraw:");
      jbRetiro.setText("Confirm");
      jLabel1.setText("Withdraw money");
    }
    //Metodo encargado de traducir todo el texto en espanol de la interfaz "RetirarDinero" al idioma Quechua.
    public void quechua(){
      jLabel2.setText("Qullqiyta ch'isqay");
      BotonAtras.setText("Qhipa");
      jLabel3.setText("Qullqi apaq:");
      jbRetiro.setText("Kachkanay");
      jLabel1.setText("Qullqi apaq");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbRetiro;
    private javax.swing.JTextField montoRetiro;
    // End of variables declaration//GEN-END:variables
}