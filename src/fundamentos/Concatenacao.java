package fundamentos;
// Aula - 09 Concatenção de Strings em Java
public class Concatenacao {

    public static void main(String[] args) {
        String nome = "João";
        int idade = 30;
        double salario = 2500.75;

        // Concatenando Strings usando o operador +
        String mensagem = "Nome: " + nome + ", Idade: " + idade + ", Salário: R$ " + salario;
        System.out.println(mensagem);

        // Concatenando Strings usando String.format
        String mensagemFormatada = String.format("Nome: %s, Idade: %d, Salário: R$ %.2f", nome, idade, salario);
        System.out.println(mensagemFormatada);
    }
    
}
