package fundamentos;
// Aula - 08 Variáveis em Java
public class Variaveis_08 {
    public static void main(String[] args) {
        /**
         * Tipos de variáveis em Java:
         * int: para números inteiros
         * double: para números de ponto flutuante
         * char: para caracteres
         * boolean: para valores booleanos (true/false)
         * String: para cadeias de caracteres (texto)
         * Exemplo de declaração e uso de variáveis
         * 
         * Regras para nomes de variáveis:
         * 1 - Não pode começar com número, não pode ter espaços, não pode usar palavras reservadas
         * 2 - Deve ser descritivo e seguir a convenção camelCase
         * 3 - Não diferencia maiúsculas de minúsculas
         */

        // Declaração de variáveis
        int idade = 25; // variável do tipo inteiro
        double salario = 4500.50; // variável do tipo ponto flutuante
        char genero = 'M'; // variável do tipo caractere
        boolean ativo = true; // variável do tipo booleano

        // Exibir valores das variáveis
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Gênero: " + genero);
        System.out.println("Ativo: " + ativo);
    }
    
}
