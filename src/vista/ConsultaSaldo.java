package vista;
/*Librerias importadas para la lectura de archivos, creacion de cuadros de dialogo e interfaces,
manejo de excepciones, procesar linesa de texto divididas.*/ 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
//Clase encargada de gestionar la Interfaz de consulta de saldo de una cuenta.
public class ConsultaSaldo extends javax.swing.JFrame {
    private String nombre;
    private int nro;
    private String apellido;
    private int idioma;
    private String cuen;
    private ArrayList<TipoCuenta> saldos;
    private String cuenta = " | Nro. cuenta :";
    private String text = "Su saldo es de :";
    
    /*Constructor donde inicializamos los componentes y creamos un lista de saldos para actualizarlos 
    posteriormente con la informacion que se tiene.*/
    public ConsultaSaldo() {
        saldos=new ArrayList<>();
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        saldo = new javax.swing.JLabel();
        BotonAtras = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        lineaNaranja = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));

        saldo.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        saldo.setForeground(new java.awt.Color(255, 204, 0));
        saldo.setText("Saldo Actual:");

        BotonAtras.setBackground(new java.awt.Color(204, 204, 204));
        BotonAtras.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        BotonAtras.setForeground(new java.awt.Color(0, 0, 102));
        BotonAtras.setText("Atras");
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(382, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Consulta de Saldo");

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
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jTextArea.setColumns(20);
        jTextArea.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextArea.setForeground(new java.awt.Color(255, 102, 0));
        jTextArea.setRows(5);
        jScrollPane1.setViewportView(jTextArea);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("HISTORIAL TRANSACCIONAL");

        lineaNaranja.setBackground(new java.awt.Color(255, 102, 0));
        lineaNaranja.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
                                    .addComponent(lineaNaranja))))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lineaNaranja, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonAtras))
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
    //Metodo/Boton encargado de redirigirnos a la Interfaz/Ventana anterior a la que estamos, la cual seria el Menu de Transacciones.
    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        MenuTransacciones tran=new MenuTransacciones();
        tran.idioma(idioma);
        tran.datos(nombre, nro,apellido,idioma);
        tran.cargarDatos();
        tran.mantCuenta(cuen);
        tran.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonAtrasActionPerformed
    //Metodo encargado de mostrar el contenido de un archivo, el cual en nuestro caso seria el historial transaccional
    public void mostrarContenidoArchivo(String moneda) {
        cuen=moneda;
        try (BufferedReader br = new BufferedReader(new FileReader(nro+moneda))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                jTextArea.append(linea + "\n");
                
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al leer el archivo: " + e.getMessage());
        }
    }
    //Metodo encargado de cargar los datos del cliente para luego recuperarlos.
    public void datos(String nombre,int nro,String apellido,int idioma){
        this.apellido =apellido;
        this.nombre=nombre;
        this.nro=nro;
        this.idioma=idioma;
    }
    /*Metodo encargado de cargar o recuperar los datos relacionados con la cuenta del usuario como ser su 
    saldo y su numero de cuenta.*/
    public void cargarDatos(String cunt){
        llenarLista(nro+"");
        for(int i=0;i<saldos.size();i++){
            if(saldos.get(i).getTipoMoneda().equals(cunt)){
                saldo.setText(text + " " + saldos.get(i).getSaldo()+ cuenta + " " + saldos.get(i).getNroCuenta());
                System.out.println(text+saldos.get(i).getSaldo()+cuenta+saldos.get(i).getNroCuenta());
            }else{
                
            }
        }
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
    //Metodo principal encargado de inicializar la clase.
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaSaldo().setVisible(true);
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
    //Metodo encargado de traducir todo el texto en espanol de la interfaz "ConsultaSaldo" al idioma Ingles.
    public void ingles(){
      text = "Your balance is :";
      cuenta = " | Account Number :";
      saldo.setText("Current Balance:");
      BotonAtras.setText("Back");
      jLabel1.setText("Balance inquiry");
      jLabel3.setText("TRANSACTION HISTORY");
    }
    //Metodo encargado de traducir todo el texto en espanol de la interfaz "ConsultaSaldo" al idioma Quechua.
    public void quechua(){
      cuenta = " | Qillqayki Unu :";
      text = "Qullqisqa unu :";
      saldo.setText("Qullqi Qhipa:");
      BotonAtras.setText("Quipa");
      jLabel1.setText("Qullqisqa Yachay");
      jLabel3.setText("LLAQTANAKUQ WAKT'AYNIN");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField lineaNaranja;
    private javax.swing.JLabel saldo;
    // End of variables declaration//GEN-END:variables
}