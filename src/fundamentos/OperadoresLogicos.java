package fundamentos;

// Aula 13 - Operadores Lógicos em Java
public class OperadoresLogicos {

    public static void main(String[] args) {
        // Declaração de variáveis
        boolean a = true;
        boolean b = false;

        // Operadores Lógicos
        boolean and = a && b;  // E lógico
        boolean or = a || b;   // OU lógico
        boolean notA = !a;     // Negação de A
        boolean notB = !b;     // Negação de B

        // Exibir os resultados
        System.out.println("A AND B: " + and);
        System.out.println("A OR B: " + or);
        System.out.println("NOT A: " + notA);
        System.out.println("NOT B: " + notB);
    }
    
}
