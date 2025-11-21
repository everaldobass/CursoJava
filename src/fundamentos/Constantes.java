package fundamentos;

// Aula 14 - Constantes em Java
/**
 * Nesta aula, aprendemos sobre a declaração e o uso de constantes em Java.
 * Utilizamos a palavra-chave 'final' para definir valores que não podem ser alterados
 * após sua inicialização. Isso é útil para valores que devem permanecer constantes
 * ao longo do programa, como PI ou configurações do sistema.
 */
public class Constantes {

    public static void main(String[] args) {
        final double PI = 3.14159; // Declaração de uma constante
        final String NOME_DO_SISTEMA = "Sistema de Gerenciamento";

        System.out.println("Valor de PI: " + PI);
        System.out.println("Nome do Sistema: " + NOME_DO_SISTEMA);
    }
    
}
