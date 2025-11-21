package fundamentos;
// Aula 21 - sobre Do While
public class DoWhile {
    public static void main(String[] args) {
        int contador = 1;
        
        do {
            System.out.printf("Contador = %d%n", contador);
            contador++;
        } while (contador <= 10);



        // Laço similar ao acima, mas com while
        int indice = 10;

        do  {
            System.out.printf("indice = %d%n", indice);
            indice--;
        }while(indice >= 1);
    }
    
}
