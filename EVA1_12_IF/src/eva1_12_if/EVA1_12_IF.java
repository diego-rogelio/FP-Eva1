/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_if;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class EVA1_12_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double calificacion;
        Scanner input= new Scanner(System.in);
        System.out.println("Inserta tu calificacion, en escala de 1 a 10");
        calificacion = input.nextDouble();
        if (calificacion >=7){ //bloque verdadero
        System.out.println(calificacion + " = Calificacion aprobatoria :)");
        }else{ //bloque de falso
        System.out.println(calificacion + " = Calificacion NO aprobatoria :(");                                       
    }
    } 
}
