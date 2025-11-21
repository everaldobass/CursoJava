package fundamentos;

// Aula 24 - Foreach
public class Foreach {

    public static void main(String[] args) {

        System.out.println("--------------------Exemplo 1 ----------------------------");
        // Exemplo de Foreach   
        int[] notas = {6, 7, 8, 9, 10};

        for (int nota : notas) {
            System.out.println("Nota: " + nota);
        }

        System.out.println("--------------------Exemplo 2 ----------------------------");

        // Outro exemplo
        String[] nomes = {"Ana", "Bia", "Lia", "Gui"};

        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }
    }
    
}
