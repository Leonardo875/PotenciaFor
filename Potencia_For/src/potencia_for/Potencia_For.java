/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potencia_for;

import java.util.Scanner;
public class Potencia_For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
        int i = 0;
       
        
        for( i = 0;i<=15;i = i + 1 )
        {
            int p =(int) Math.pow(3,i);
            System.out.println(p);
        }
            
      
    }
    
}
