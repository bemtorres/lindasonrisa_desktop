/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author benja
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        String texto = new ConectarMail().formatoCorreoInterno("hola", "buenos dias");
//        int enviado = new ConectarMail().enviarMensaje("benja.mora.torres@gmail.com", "b.morat@alumnos.duoc.cl","",texto,"Buenos dias buenas tardes", 0);
//        System.out.println("enviado " + enviado);
        
        
        
    DateFormat parseHora = new SimpleDateFormat("dd/MM/yyyy");
    
    DateFormat hora2 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(parseHora);
            
    System.out.println(hora2.getCalendar());
        
    }
    
}
