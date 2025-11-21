package fundamentos;

// Aula 25 - sobre Matrizes (arrays multidimensionais) em Java
public class Matriz {

    public static void main(String[] args) {
        
        double[][] notasAlunos = new double[3][4];
        
        notasAlunos[0][0] = 7.9;
        notasAlunos[0][1] = 8.9;
        notasAlunos[0][2] = 6.5;
        notasAlunos[0][3] = 10;
        
        notasAlunos[1][0] = 9.9;
        notasAlunos[1][1] = 8.9;
        notasAlunos[1][2] = 7.5;
        notasAlunos[1][3] = 9.5;
        
        notasAlunos[2][0] = 6.9;
        notasAlunos[2][1] = 7.9;
        notasAlunos[2][2] = 8.5;
        notasAlunos[2][3] = 7.5;
        
        for (int i = 0; i < notasAlunos.length; i++) {
            System.out.println("Notas do aluno " + (i + 1));

            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.println(notasAlunos[i][j] + " ");
            }
            
            System.out.println();
        }
    }
    
}
