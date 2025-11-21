package fundamentos;

public class OperadorTernario {

    public static void main(String[] args) {
        double nota = 8.3;
        boolean bomComportamento = true;

        String resultado = nota >= 7 && bomComportamento ? "Aprovado!" : "Reprovado!";
        System.out.println(resultado);
    }
    
}
