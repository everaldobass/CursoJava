package fundamentos;
// Aula 23 - Vetores (Arrays)
public class Vetor {
    public static void main(String[] args) {


        System.out.println("--------- Percorrendo um Vetor de notas ------------");
        double[] notas = new double[4];
        notas[0] = 7.9;
        notas[1] = 8.9;
        notas[2] = 6.3;
        notas[3] = 9.1;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        System.out.println("\n--------- Percorrendo um Vetor de nome ------------\n");

        // Array inicializado
        String[]  nomes = {"João", "Maria", "Pedro", "Ana"};
        for (int indice = 0; indice <= nomes.length; indice++) {
            System.out.println("Nome " + (indice + 1) + ": " + nomes[indice]);
        }
    }
    
}
