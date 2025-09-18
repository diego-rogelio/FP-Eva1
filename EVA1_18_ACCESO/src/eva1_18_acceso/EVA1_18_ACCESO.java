/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_acceso;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class EVA1_18_ACCESO {
    //para poner constantes se usa final static y debe estar arriba de main
    final static String USUARIO = "Diego";
    final static String PASSWORD = "manolito123";
    
    public static void main(String[] args) {
        String user, contra;
        Scanner input= new Scanner(System.in);
    System.out.println("Inserta usuario: ");
    user=input.nextLine();
    System.out.println("Inserta contraseña: ");
    contra=input.nextLine();
    //para comparar strings se necesita usar  .equals
    if (user.equals(USUARIO)){ 
         if (contra.equals(PASSWORD)){
    System.out.println("Acceso concedido");        
    }else{
    System.out.println("Acceso denegado");
    
            }
    }else{
    System.out.println("Acceso denegado");}
        
    }
    
}
