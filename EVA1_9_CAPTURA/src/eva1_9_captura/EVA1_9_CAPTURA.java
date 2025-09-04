/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_captura;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class EVA1_9_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        int edad;
        double promedio;
        System.out.println("Introduce tu nombre completo: ");
        //Captura de datos: scanner es para capturar texto
        //Input no esta registrado aun para hacerlo se pone lo de enseguida
        //Se utiliza solo una vez en el codigo y de ahi lo demas puede utilizarlo,  se reusa
        Scanner input= new Scanner(System.in); //Scanner es una instruccion para dar input, para agregarla se la da al foquito al lado
        //next line es para lineas de texto
        nombre = input.nextLine();
        System.out.print("Nombre capturado: ");
        System.out.println(nombre);
        System.out.println("Dime tu edad: ");
        edad = input.nextInt();
        System.out.println("Edad capturada: " + edad);
        System.out.println("Promedio de preparatoria: ");
        promedio= input.nextDouble();
        System.out.println("Promedio capturado: " + promedio);
    }
    
}
