package fundamentos;

// Aula - 15 sobre estruturas condicionais em Java
public class Condicional {

    public static void main(String[] args) {
        // Declaração de variável
        int numero = 17;

        // Estrutura condicional if-else
        if (numero % 2 == 0) {
            System.out.println(numero + " é um número par.");
        } else {
            System.out.println(numero + " é um número ímpar.");
        }


        
        // Estrutura condicional if-else if-else
        double nota = 8.5;

        if(nota >= 7) {
            System.out.println("Aprovado!");
        } else if (nota >= 5) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }
    }
    
}
