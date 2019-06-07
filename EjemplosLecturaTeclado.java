/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploslecturateclado;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EjemplosLecturaTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int edad=0;
        Scanner x=new Scanner(System.in);
        System.out.println("Introduzca nombre");
        
        String nombre_usuario=x.nextLine();
        
        
        System.out.println("Introduzca su edad");
        
        try{
        edad=x.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Ha habido algún roblema con la edad");
        }
        
        System.out.println("Te llamas  "+nombre_usuario+" y tienes "+
                edad+" años");
    }
    
}
