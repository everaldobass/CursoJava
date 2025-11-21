package fundamentos;

// Aula 11 - Operadores Aritméticos em Java

public class OperadoresAritmetico {

    public static void main(String[] args) {
        // Declaração de variáveis
        int a = 17;
        int b = 5;

        // Operadores Aritméticos
        int soma = a + b;          // Adição
        int subtracao = a - b;    // Subtração
        int multiplicacao = a * b; // Multiplicação
        int divisao = a / b;      // Divisão
        int modulo = a % b;       // Módulo (resto da divisão)

        // Exibir os resultados
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Módulo: " + modulo);
    }
    
}

