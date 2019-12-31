/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lindasonrisa_desktop;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author benja
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException{
              
        String fecha = "2019-10-25";
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format.parse(fecha);        
        DateFormat formatNuevo = new SimpleDateFormat("dd-MM-yyyy");
        String fechaNueva = formatNuevo.format(date);
        
        
        System.out.println(fechaNueva); 
    }
  
    
}
