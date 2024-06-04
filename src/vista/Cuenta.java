package vista;
//Libreria importada para tener lista dinamica de elementos
import java.util.ArrayList;
/*Clase que representara la cuenta del cliente y contendra valores como su nombre, apellido,
contrasena, etc.*/
public class Cuenta {
    private String nombre ;
     private int nroCuenta;
    private String apellido  ;
    private String login;
    private String contraseña ;
    private ArrayList <TipoCuenta> listaTipoCuenta;
    //Se crea una instancia de la clase con los atributos dados.
    public Cuenta(String nombre,String apellido,int nrocuenta,  String login, String contraseña) {
        this.nombre = nombre;
        this.nroCuenta=nrocuenta;
        this.apellido = apellido;
        this.login = login;
        this.contraseña = contraseña;
        listaTipoCuenta = new ArrayList<TipoCuenta>();
    }
    //Metodo encargado de retornar el numero de la cuenta.
    public int getNroCuenta() {
        return nroCuenta;
    }
    //Metodo encargado de verificar el nombre de usuario y la contrasena.
    public boolean iniciarSesion(String loginn,String pass){
        return contraseña.equals(pass)&&login.equals(loginn);
    }
    //Metodo encargado de anadir una nueva moneda a la cuenta del cliente/usuario.
    public void añadirMoneda(String moneda){
        TipoCuenta añadirmoneda=new TipoCuenta(0,moneda,0);
        listaTipoCuenta.add(añadirmoneda);
    }
    //Metodo encargado de retornar el nombre del cliente.
    public String getNombre() {
        return nombre;
    }
    //Metodo encargado de retornar el apellido del cliente.
    public String getApellido() {
        return apellido;
    }
    //Metodo encargado de retornar el nombre de usuario del cliente.
    public String getLogin() {
        return login;
    }
    //Metodo encargado de retornar la contrasena del cliente.
    public String getContraseña() {
        return contraseña;
    }
    //Metodo encargado de obtener la lista de tipos de cuenta del usuario.
    public ArrayList<TipoCuenta> getListaTipoCuenta() {
        return listaTipoCuenta;
    }
    //Metodo encargado de establecer el valor del atributo nombre.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Metodo encargado de establecer el valor del atributo apellido.
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    //Metodo encargado de establecer el valor del atributo nombre de usuario.
    public void setLogin(String login) {
        this.login = login;
    }
    //Metodo encargado de establecer el valor del atributo contrasena.
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    //Metodo encargado de establecer el valor del atributo lista de cuentas.
    public void setListaTipoCuenta(ArrayList<TipoCuenta> listaTipoCuenta) {
        this.listaTipoCuenta = listaTipoCuenta;
    }
}