package vista;

/*Clase que representara el tipo de cuenta del usuario/cliente y contendra valores como su numero de cuenta, 
saldo y tipo de moneda.*/
public class TipoCuenta {
    
   private int nroCuenta;
    private double saldo;
    private String tipoMoneda;
     //Se crea una instancia de la clase con los atributos dados.
    public TipoCuenta(int nroCuenta, String tipoMoneda,double saldo) {
        this.nroCuenta=nroCuenta;
        this.saldo = saldo;
        this.tipoMoneda = tipoMoneda;
    }
    //Metodo encargado de retornar el numero de la cuenta.
    public int getNroCuenta() {
        return nroCuenta;
    }
    //Metodo encargado de retornar el saldo de la cuenta.
    public double getSaldo() {
        return saldo;
    }
    //Metodo encargado de retornar el tipo de moneda de la cuenta.
    public String getTipoMoneda() {
        return tipoMoneda;
    }
    //Metodo encargado de establecer el valor del atributo saldo.
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    //Metodo encargado de establecer el valor del atributo tipo de moneda.
    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }
    
}
