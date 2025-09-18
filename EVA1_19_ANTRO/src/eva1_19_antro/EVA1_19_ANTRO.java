/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_antro;

import java.util.Scanner;


public class EVA1_19_ANTRO {

   
    public static void main(String[] args) {
      boolean credencial;
      int Edad;
        Scanner input= new Scanner(System.in);
    System.out.println("Cuantos años tienes? ");
    Edad=input.nextInt();
    System.out.println("Cuenta con credencial? (true o false) ");
    credencial=input.nextBoolean();
    //para comparar strings se necesita usar  .equals
   if ((Edad >= 18) && (credencial == true)){ 
    System.out.println("Puedes pasar"); 
    }else{
    System.out.println("No puedes pasar");}
    
            }
    }
    
    
    

