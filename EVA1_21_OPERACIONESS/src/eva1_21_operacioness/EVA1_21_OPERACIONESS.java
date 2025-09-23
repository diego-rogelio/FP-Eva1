package eva1_21_operacioness;

public class EVA1_21_OPERACIONESS {
    
    public static void main(String[] args) {
        // diferentes operaciones
        int valor = 2, expo=3, valor2=100, valor3=125;
        double resu, resu2, resu3;
        resu= Math.pow(valor, expo);
        System.out.println("2 al cubo = " + resu);
        //raiz cuadrada
        resu2=Math.sqrt(valor2);
        System.out.println("Raiz cuadra de 100 = "+resu2);
        //otras raices
        resu3=Math.pow(valor3, 1.0/3.0);
        System.out.println("Raiz cubica de 125 = "+resu3);
        //Division entre entero (el resultado no da decimal, a menos que se ponga un decimal despues, aunque sea un cero)
        System.out.println("1/3 = "+ (1/3));
        System.out.println("7/3 = "+ (7/3));
        //Division exacta
        int num1 = 2024, num2=4;
        int residuo;
        residuo = num1 % num2; //calculo para residuo
        System.out.println("2024/4 = " + residuo);
        
    }
    
}
