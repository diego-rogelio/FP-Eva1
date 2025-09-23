package eva_22_bisiesto;

import java.util.Scanner;

public class EVA_22_BISIESTO {

    public static void main(String[] args) {
        int year, residuo, residuo100, residuo400;
        Scanner input= new Scanner(System.in);
        System.out.println ("Insertar año: ");
        year = input.nextInt();
        residuo = year % 4;
        residuo100 = year %100;
        residuo400 = year % 400;
        if (residuo == 0){
        System.out.println("El año " + year + " es bisiesto");
        }else if (residuo400 ==0){
        System.out.println("El año " + year + " es bisiesto");
        }else if (residuo100 ==0 ){
        System.out.println("El año " + year + " no es bisiesto");
        }else{
        System.out.println("El año " + year + " no es bisiesto");
    
        }
    }
    
}
