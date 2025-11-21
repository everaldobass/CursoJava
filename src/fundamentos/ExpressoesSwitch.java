package fundamentos;
// Aula - 18 sobre expressões switch (Java 12+)
public class ExpressoesSwitch {

    public static void main(String[] args) {
        
        String faixa = "verde";

        String resultado = switch (faixa.toLowerCase()) {
            case "preta" -> "Faixa preta: 10º kyu";
            case "marrom" -> "Faixa marrom: 9º kyu";
            case "roxa" -> "Faixa roxa: 8º kyu";
            case "azul" -> "Faixa azul: 7º kyu";
            case "verde" -> "Faixa verde: 6º kyu";
            case "amarela" -> "Faixa amarela: 5º kyu";
            default -> "Faixa não reconhecida";
        };

        System.out.println(resultado);
    }
    
}
