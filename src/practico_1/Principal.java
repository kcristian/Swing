package practico_1; //paquete al que pertenece esta clase

import com.login.Login;


/**
 *
 * @author INTEL
 */
public class Principal { //clase principal
    //comentario de linea
    /*este es un comentario
    de multiples lineas
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //metodo main
        
        Login l = new Login();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
    }
    
}
