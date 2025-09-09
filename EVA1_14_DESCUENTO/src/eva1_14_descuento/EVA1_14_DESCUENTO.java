/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_descuento;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class EVA1_14_DESCUENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double gastado, total, descuento;
    Scanner input= new Scanner(System.in);
    System.out.println("Monto de la venta:");
    gastado = input.nextDouble();
    if (gastado > 1000){
        descuento = gastado*0.15;
    total = gastado-(gastado*0.15);
    System.out.println("Total sin descuento: " + gastado);
    System.out.println("Total con descuento: " + total + " el total descontado es de: "+descuento);
    System.out.println("Total descontado: "+descuento);
    }else{
        System.out.print("Total de: " + gastado + " no aplica el descuento");
    }              

    }
    
}
