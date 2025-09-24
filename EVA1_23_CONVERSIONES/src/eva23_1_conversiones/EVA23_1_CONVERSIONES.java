package eva23_1_conversiones;

public class EVA23_1_CONVERSIONES {
     
    public static void main(String[] args) {
        int temp;
        double tempDecimal;
        tempDecimal=24.5;
        temp=(int)tempDecimal;
        System.out.println(temp);
        String cade, mensaje;
        mensaje=("La temperatura es:");
        cade = mensaje + temp;
        System.out.println(cade);
        
    }
    
}