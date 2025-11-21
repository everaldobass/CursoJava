package fundamentos;

// Aula - 17 sobre Switch Case
public class SwitchCase {

    public static void main(String[] args) {
        String faixa = "preta";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Faixa preta: 10º kyu");
                break;
            case "marrom":
                System.out.println("Faixa marrom: 9º kyu");
                break;
            case "roxa":
                System.out.println("Faixa roxa: 8º kyu");
                break;
            case "azul":
                System.out.println("Faixa azul: 7º kyu");
                break;
            case "verde":
                System.out.println("Faixa verde: 6º kyu");
                break;
            case "amarela":
                System.out.println("Faixa amarela: 5º kyu");
                break;
            default:
                System.out.println("Faixa não reconhecida");
        }
    }
    
}
