package vista;
/*Librerias importadas para escritura de archivos, creacion de cuadros de dialogo e interfaces,
manejo de excepciones, porcesamineto de cadenas divididas y manipulacion de lista de datos.*/
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
//Clase encargada de gestionar la Interfaz del deposito en cuenta propia.
public class DepositoCuentaPropia extends javax.swing.JFrame {
  private String nombre;
  private int nro;
  private String selec;
  private String apellido;
  private int idioma;
  private ArrayList<TipoCuenta> saldos;
  
    /*Constructor donde inicializamos los componentes y creamos un lista de saldos para actualizarlos 
    posteriormente con la informacion que se tiene.*/
    public DepositoCuentaPropia() {
        initComponents();
        saldos = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BotonAtras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        deposito = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
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
        jLabel3.setText("dinero a depositar:");

        deposito.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        deposito.setForeground(new java.awt.Color(0, 0, 102));
        deposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositoActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(153, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Depositar en Cuenta Propia ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(deposito, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addComponent(deposito, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAtras)
                    .addComponent(jButton1)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Metodo/Boton encargado de redirigirnos a una ventana anterior, que seria DepositarDinero.
    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        DepositarDinero deposi=new DepositarDinero();
        deposi.idioma(idioma);
        deposi.datos(nombre, nro,selec,apellido,idioma);
        deposi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonAtrasActionPerformed
    /*Metodo/Boton encargado de confirmar el deposito de dinero, mandandonos un mesaje de deposito exitoso en caso
    se haya realizado correctamente, y en caso faltara un campo o se proporcione letras y no numeros nos mostrara una
    serie de mensajes segun la situacion.*/ 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //RetirarDinero obtener=new RetirarDinero();
        //String selectedOption = (String) moneda.getSelectedItem();
        llenarLista("" + nro);
    double depo;
    try {
        depo = Double.parseDouble(deposito.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Por favor, introduzca una cantidad válida");
        return;
    }

    boolean monedaEncontrada = false;
    for (int i = 0; i < saldos.size(); i++) {
        if (selec.equals(saldos.get(i).getTipoMoneda())) {
            monedaEncontrada = true;
            double sal = saldos.get(i).getSaldo();
            saldos.get(i).setSaldo(sal + depo);
            Historial(selec);
            guardarCambios(nro + "");
            JOptionPane.showMessageDialog(null, "Se realizó el depósito con éxito!!");
            deposito.setText("");
            break;
        }
    }

    if (!monedaEncontrada) {
        JOptionPane.showMessageDialog(null, "Cantidad Incorrecta");
    }
        
    }//GEN-LAST:event_jButton1ActionPerformed
    //Metodo contenedor del campo cantidad de dinero a depositar donde se escribira, el monto de dinero que queramos depositar.
    private void depositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depositoActionPerformed
    //Metodo encargado de registrar en un archivo los depositos de dinero realizados en cuenta propia por el cliente.
    public void Historial(String selecte){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nro+selecte,true))) {
            writer.write("");
            // Escribir cada elemento del ArrayList en una línea separada
                writer.write("Se realizo un deposito de : "+deposito.getText()+" "+selecte);
                writer.newLine(); // Agregar un salto de línea después de cada elemento
            System.out.println("ArrayList guardado en " + nombre+"historial" + " correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar el ArrayList en el archivo.");
            e.printStackTrace();
        }
    }
    //Metodo encargado de guardar los cambios que se hagan en un archivo en especifico de una lista de cuentas.
    public void guardarCambios(String Archivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Archivo))) {
            writer.write("");
            // Escribir cada elemento del ArrayList en una línea separada
            for (int i = 0; i < saldos.size(); i++) {
                writer.write(saldos.get(i).getNroCuenta()+";"+saldos.get(i).getTipoMoneda() + ";" + saldos.get(i).getSaldo());
                writer.newLine(); // Agregar un salto de línea después de cada elemento
            }
            System.out.println("ArrayList guardado en " + Archivo + " correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar el ArrayList en el archivo.");
            e.printStackTrace();
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
                    String monedas = tokens.nextToken();
                    double saldo = Double.parseDouble(tokens.nextToken());
                    TipoCuenta tipoMoneda = new TipoCuenta(nros,monedas, saldo);
                    saldos.add(tipoMoneda);
                } else {
                    System.err.println("Error: La línea no tiene el formato esperado.");
                }
            }
        } else {
            System.out.println("No hay líneas en el archivo Usuarios.");
        }

    }
    //Metodo encargado de cargar los datos del cliente para luego recuperarlos.
    public void datos(String nombre, int nro,String selec,String apellido,int idioma) {
        this.nombre = nombre;
        this.apellido=apellido;
        this.nro = nro;
        this.selec=selec;
        this.idioma=idioma;
    }
    //Metodo principal encargado de inicializar la clase.
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepositoCuentaPropia().setVisible(true);
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
    //Metodo encargado de traducir todo el texto en espanol de la interfaz "DepositoCuentaPropia" al idioma Ingles.
    public void ingles(){
    jLabel2.setText("Enter the amount of");
    BotonAtras.setText("Back");
    jLabel3.setText("money to deposit:");
    jButton1.setText("Confirm");
    jLabel1.setText("Deposit in Own Account");
}
    //Metodo encargado de traducir todo el texto en espanol de la interfaz "DepositoCuentaPropia" al idioma Quechua.
    public void quechua(){
        jLabel2.setText("Qillqayki ruray");
        BotonAtras.setText("Qhipa");
        jLabel3.setText("ñananchasqa:");
        jButton1.setText("Kachkanay");
        jLabel1.setText("Sapaq qillqaypi qullqi churay");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JTextField deposito;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}