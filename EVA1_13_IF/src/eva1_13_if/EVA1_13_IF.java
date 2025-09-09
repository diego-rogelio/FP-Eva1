/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class EVA1_13_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int año, edad;
        Scanner input= new Scanner(System.in);
    System.out.println("En que año naciste?");
    año= input.nextInt();
    edad = 2025-año;
    if (edad >= 18){
        System.out.println("tienes: " + edad + " años, puedes comprar bebidas alcoholicas :) ");
    }else{
        System.out.println("tienes: " + edad + " años, No puedes comprar bebidas alcoholicas :( ");
        
    }
            
       
    }
    
}
