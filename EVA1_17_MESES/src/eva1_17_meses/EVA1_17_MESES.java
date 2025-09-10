/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_meses;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class EVA1_17_MESES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mes;
        Scanner input= new Scanner(System.in);
        System.out.print("Numero del mes? ");
        mes=input.nextInt();
        if (mes ==1){
        System.out.println("Ese mes es Enero");
            }else if (mes ==2){
        System.out.println("Ese mes es Febrero ");
            }else if (mes ==3){
        System.out.println("Ese mes es Marzo ");
            }else if (mes ==4){
        System.out.println("Ese mes es Abril ");
            }else if (mes ==5){
        System.out.println("Ese mes es Mayo ");
            }else if (mes ==6){
        System.out.println("Ese mes es Junio ");
            }else if (mes ==7){
        System.out.println("Ese mes es Julio ");
            }else if (mes ==8){
        System.out.println("Ese mes es Agosto ");
            }else if (mes ==9){
        System.out.println("Ese mes es Septiembre ");
            }else if (mes ==10){
        System.out.println("Ese mes es Octubre ");
            }else if (mes ==11){
        System.out.println("Ese mes es Noviembre ");
            }else if (mes ==12){     
        System.out.println("Ese mes es Diciembre ");        
        }else{
        System.out.println("Numero no valido");
    }
    }
}
