package fundamentos;

// Aula 19 - Conversoes de tipos primitivos

public class Conversoes {

    public static void main(String[] args) {

        String valor = "1";
        int n1 = Integer.parseInt(valor); // conversao de String para int
        System.out.println(n1);

        String valor2 = "1.99";
        double n2 = Double.parseDouble(valor2); // conversao de String para double
        System.out.println(n2);


        
        double a = 1; // conversao implicita
        System.out.println(a);
        
        float b = (float) 1.123456789; // conversao explicita (cast)
        System.out.println(b);
        
        int c = 340;
        byte d = (byte) c; // conversao explicita (cast)
        System.out.println(d);
        
        double e = 1.99999;
        int f = (int) e; // conversao explicita (cast)
        System.out.println(f);
    }
    
}
