// Aula 12 - Operadores Relacionais em Java
package fundamentos;
public class OperadoresRelacionais {
    public static void main(String[] args) {
        // Declaração de variáveis
        int x = 10;
        int y = 20;

        // Operadores Relacionais
        boolean igual = (x == y);          // Igualdade
        boolean diferente = (x != y);     // Diferença
        boolean maior = (x > y);          // Maior que
        boolean menor = (x < y);          // Menor que
        boolean maiorOuIgual = (x >= y);  // Maior ou igual a

        boolean menorOuIgual = (x <= y);  // Menor ou igual a
        // Exibir os resultados
        System.out.println("Igual: " + igual);
        System.out.println("Diferente: " + diferente);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Maior ou Igual: " + maiorOuIgual);  
        System.out.println("Menor ou Igual: " + menorOuIgual);
    }
    
}
