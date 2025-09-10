/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_mayor;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class EVA1_15_MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n1,n2;
    Scanner input= new Scanner(System.in);
    System.out.print("Inserta numero 1: ");
    n1 = input.nextDouble();
    System.out.print("Inserta numero 2: ");
    n2 = input.nextDouble();
    if (n1>n2){
    System.out.println( n1 + " es mayor que " + n2);
    System.out.println("La diferencia es de: " + (n1-n2));
    }else{
        if (n2>n1){
    System.out.println(n2+" es mayor que " +n1);
    System.out.println("La diferencia es de: " + (n2-n1));
    }else{
        System.out.println( n1 + " y "+ n2 +" son iguales ");


        }
    }
    }
}
