package logica;

import igu.Pantalla;
//import java.util.List;

public class Vicente_Paola_tpo2 {

    public static void main(String[] args) {
        
        //usuario:admin password:pelu1234
        
        Controladora control = new Controladora();
        Pantalla datos = new Pantalla(control);
        datos.setVisible(true); //hace visible a la pantalla
        datos.setLocationRelativeTo(null); //pantalla relativa a nada
             
    }
    
}
