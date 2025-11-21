// Aula - Scanner em Java
package fundamentos;
import java.util.Scanner;

public class ScannerLeitura {

    public static void main(String[] args) {
        
        ScannerLeitura entrada = new ScannerLeitura(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        
        System.out.print("Digite sua altura: ");
        double altura = entrada.nextDouble();
        
        System.out.printf("Seu nome é %s, você tem %d anos e sua altura é %.2f metros.%n", nome, idade, altura);
        
        entrada.close();
    }
    
}