/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_captura;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class EVA1_10_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // velocidad = distancia / tiempo
        double velocidad, distancia, tiempo;
        Scanner input= new Scanner(System.in);
        System.out.println("Cual es la distancia en metros? ");
        distancia = input.nextDouble();
        System.out.println("En cuantos segundos se recorre esa distancia? ");
        tiempo = input.nextDouble();
        velocidad = distancia / tiempo;
        System.out.println("La velocidad de un objeto que recorre:"+ distancia + 
        " metros en un periodo de:" + tiempo + " segundos, es de:" + velocidad + " m/s");
          }
    
}
