/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author utpl
 * 
 */
import org.apache.commons.lang3.math.NumberUtils;


public class clase03 {
  
    
    public static void main(String[] args) {
        
       
        String[] dato = {"100", "90", "1n", "10", "H1", "H2"};
        
        
        int[] resultado = new int[dato.length];
        
      
        for (int i = 0; i < dato.length; i++) {
       
            resultado[i] = NumberUtils.toInt(dato[i], 0);
        }
        
     
        for (int valor : resultado) {
            System.out.print(valor + " ");
        }
    }
}

    

