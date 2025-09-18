/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_califas;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class EVA1_20_CALIFAS {

    public static void main(String[] args) {
    int cali;
    Scanner input= new Scanner(System.in);
    System.out.println("Cual es tu calificacion? ");
    cali=input.nextInt();
    if ((cali >= 90) && (cali <= 100)){
        System.out.println("Tu calificacion es A ");
    }else if ((cali >= 80) && (cali <= 89)){
        System.out.println("Tu calificacion es B ");
    }else if ((cali >= 70) && (cali <= 79)){
        System.out.println("Tu calificacion es C ");
    }else if ((cali >= 60) && (cali <= 69)){
        System.out.println("Tu calificacion es D ");
    }else if ((cali >= 0) && (cali <= 59)){
        System.out.println("Tu calificacion es F ");
    }
    }
    
}
