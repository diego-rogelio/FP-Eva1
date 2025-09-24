package eva1_24_juego_aguila_sol;

import java.util.Scanner;

public class EVA1_24_JUEGO_AGUILA_SOL {

    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    int decision,aguila=1,sello=0;
    double aleatorio;
    System.out.println("Aguila o sello? 1 = aguila, 0 = sello");
    decision = input.nextInt();
    aleatorio= Math.random();
    //System.out.println("Numero = " + aleatorio);
    
    if(aleatorio>0.5){
    System.out.println("Salio sello");}
    else{
    System.out.println("Salio aguila");}
    
    if((decision == aguila && aleatorio <0.5)||(decision==sello && aleatorio >0.5)){ //las barras representan un OR, para poner es alt +124
    System.out.println("Adivinaste :D");}
    else{
    System.out.println("No adivinaste D:");}
        
    }
    
}
