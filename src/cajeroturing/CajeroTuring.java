package cajeroturing;
import vista.Inicio;

//La clase CajeroTuring es la que inicializa el programa debido a que es la clase principal
public class CajeroTuring {
//Este metodo es el principal que se encargara de crear una instancia del inicio 
//y inicializar el programa
    public static void main(String[] args) {
        Inicio formInicio = new Inicio();
        formInicio.setVisible(true);
    }
    
}
