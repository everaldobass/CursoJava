## 📓 Apostila de Introdução à Programação JavaAutor: Everaldo do Nascimento
 
###  01 - Introdução
- Java é uma das linguagens de programação mais populares, conhecida por ser Orientada a Objetos (POO) e multiplataforma (graças à JVM - Java Virtual Machine).

- A principal promessa do Java é o "Write Once, Run Anywhere" (Escreva uma vez, execute em qualquer lugar). 

- É usada em desenvolvimento web, mobile (Android), sistemas empresariais, e mais.

###  02 - Conceitos
- Java Virtual Machine (JVM): É o ambiente de execução que permite que o código Java (o bytecode) seja executado em qualquer sistema operacional (Windows, Linux, macOS), sem precisar de recompilação.

- Java Development Kit (JDK): É o kit de desenvolvimento essencial para compilar, executar e depurar programas Java. 

- Inclui o JRE (Java Runtime Environment) e ferramentas de desenvolvimento.Orientação a Objetos (POO): Paradigma de programação que organiza o software em torno de objetos, que são instâncias de classes. 

Os pilares são Encapsulamento, Herança, Polimorfismo e Abstração.

### 03 - Instalar o JDKO 
- JDK (Java Development Kit) é necessário para escrever e compilar o código Java.Download: Acesse o site oficial da Oracle ou OpenJDK e baixe a versão mais recente do JDK para o seu sistema operacional.

- Instalação: Execute o instalador e siga as instruções. O assistente normalmente configura as pastas automaticamente.

- Verificação: Abra o Prompt de Comando/Terminal e digite java -version e javac -version. 

Se a versão for exibida, a instalação foi bem-sucedida.

### 04 - Instalar o Visual Studio Code (VS Code)
- VS Code é um editor de código leve e poderoso, muito popular para desenvolvimento Java.

- Download: Baixe o VS Code no site oficial e instale.Extensões: Abra o VS Code, vá para a aba de Extensões (Ctrl + Shift + X) e pesquise por "Extension Pack for Java" (da Microsoft) e instale-o. 

- Isso adiciona suporte a código, depuração e gerenciamento de projetos Java.

### 05 - Configurar o Ambiente
- Após a instalação do JDK e do VS Code, a configuração principal envolve garantir que o VS Code saiba onde o JDK está.

- Normalmente, o "Extension Pack for Java" configura automaticamente o ambiente.

- Se for necessário, você pode adicionar a pasta bin do JDK à variável de ambiente PATH do seu sistema operacional. 

- No VS Code, as extensões Java fornecem ferramentas para configurar isso de forma simplificada.

### 06 - Estrutura de Classes
- Todo programa Java começa com uma classe. A classe principal que contém o ponto de partida da execução deve ter o método main.

- Estrutura de Classe Explicação

- public class MinhaClasse { ... } Define uma classe chamada MinhaClasse. 

- O nome do arquivo deve ser MinhaClasse.java.public static void main(String[] args) { ... }É o método principal onde a execução do programa Java começa.


### Exemplo Prático (Exemplo.java):Java
```
```
public class Exemplo {
    // Este é o método principal, o ponto de entrada.
    public static void main(String[] args) {
        System.out.println("Minha primeira classe em Java.");
    }
}

```
```
## 07 - Mensagens 
- Para exibir mensagens no console (saída padrão), usamos o objeto System.out.

- Comando Descrição
System.out.println("..."); Imprime a mensagem e pula para a próxima linha (adiciona uma quebra de linha).

System.out.print("..."); Imprime a mensagem, mas não pula para a próxima linha.

### Exemplo Prático:Java
```
```
public class Mensagens {
    public static void main(String[] args) {
        System.out.print("Olá, "); 
        System.out.println("Mundo!"); // Imprime "Mundo!" e pula a linha.
        System.out.println("Fim da Mensagem."); 
    }
}
```
```
// Saída: Olá, Mundo!
//Fim da Mensagem.

### 08 - Variáveis
- Variáveis são espaços na memória para armazenar dados. Devem ser declaradas com um tipo de dado (inteiro, texto, decimal, etc.) e um nome.

### Tipo Primitivo Descrição Exemplo de Uso 
- int Armazena números inteiros.
- int idade = 25;
- double Armazena números de ponto flutuante (decimais).
- double altura = 1.75;
- boolean Armazena valores lógicos: true ou false.
- boolean esta Chovendo = true; char Armazena um único caractere. 
- char inicial = 'E'; String Armazena texto (não é um tipo primitivo, é uma classe).
- String nome = "Everaldo";

### Exemplo Prático: Java
```
```
public class Variaveis {
    public static void main(String[] args) {
        String nomeCompleto = "Everaldo do Nascimento"; // Variável de texto
        int anoNascimento = 1990;                     // Variável inteira
        double precoProduto = 99.99;                  // Variável decimal
        
        System.out.println("Nome: " + nomeCompleto);
        System.out.println("Ano: " + anoNascimento);
        System.out.println("Preço: " + precoProduto);
    }
}
```
```

## 09 - Concatenação
- A concatenação é o ato de juntar strings (textos) com outros valores (variáveis, números) usando o operador +.

### Exemplo Prático:Java
```
```
public class Concatenacao {
    public static void main(String[] args) {
        String nome = "Everaldo";
        int idade = 35;
        
        String mensagem = "Meu nome é " + nome + " e eu tenho " + idade + " anos.";
        System.out.println(mensagem); 
        // Saída: Meu nome é Everaldo e eu tenho 35 anos.
    }
}
```
```
### 10 - Classe Scanner
- A classe Scanner é usada para ler dados de entrada do usuário no console (como números ou textos digitados no teclado).Importar: Precisa ser importada: import java.util.Scanner;Instanciar: Criar um objeto Scanner: Scanner sc = new Scanner(System.in);Ler: Usar métodos como nextInt(), nextDouble(), nextLine().

### Exemplo Prático:Java
```
```
import java.util.Scanner;
public class EntradaDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria o objeto Scanner
        
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();       // Lê a linha de texto digitada
        
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();          // Lê o número inteiro digitado
        
        System.out.println("Olá, " + nome + "! Sua idade é " + idade + ".");
        sc.close(); // Sempre fechar o Scanner ao terminar
    }
}

```
```
### 11 - Operadores Aritméticos 
- São usados para realizar operações matemáticas.
Operador
Operação Exemplo 
- + Adição a + b
- -Subtraçãoa - b 
- * Multiplicaçãoa * b 
- / Divisão a / b 
- % Módulo (resto da divisão) a %
- b++ Incremento (adiciona 1) a++
- --Decremento (subtrai 1) a--


### Exemplo Prático:Java
```
```
public class Aritmeticos {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int soma = a + b;   // 13
        int resto = a % b;  // 1 (o resto da divisão de 10 por 3)
        a++;                // a passa a ser 11 (incremento)
        
        System.out.println("Soma: " + soma);
        System.out.println("Resto: " + resto);
        System.out.println("Novo a: " + a);
    }
}
```
```

### 12 - Operadores Relacionais
- Comparam dois valores e retornam um valor 
- booleano (true ou false).
### Operador Significado
Exemplo
- ==Igual aa == b
- != Diferente de a != b
- > Maior que a > b 
- < Menor quea < b > = Maior ou igual aa >= b<=Menor ou igual aa <= b

### Exemplo Prático:Java
```
```
public class Relacionais {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        
        boolean ehMaior = x > y;     // true
        boolean ehIgual = x == y;    // false
        
        System.out.println("X é maior que Y? " + ehMaior);
        System.out.println("X é igual a Y? " + ehIgual);
    }
}
```
```
### 13 - Operadores Lógicos
- Usados para combinar expressões booleanas e retornar um único valor booleano.

### Operador Significado Exemplo 
- && E lógico (AND)(a > 0) && (b > 0)``!NÃO lógico (NOT)!(a > b)

### Exemplo Prático:Java
```
```
public class Logicos {
    public static void main(String[] args) {
        int idade = 20;
        boolean temCarteira = true;
        
        // Precisa ser maior de 18 E ter carteira
        boolean podeDirigir = (idade >= 18) && temCarteira; 
        
        // Negação: verifica se NÃO tem carteira
        boolean naoTemCarteira = !temCarteira;
        
        System.out.println("Pode dirigir? " + podeDirigir); // true
        System.out.println("Não tem carteira? " + naoTemCarteira); // false
    }
}

```
```
### 14 - Constantes
Constantes são variáveis cujo valor não pode ser alterado após a sua inicialização. Em Java, são declaradas com as palavras-chave final e, por convenção, com letras maiúsculas e underline (_).

### Exemplo Prático:Java
```
```
public class Constantes {
    // Constante (static e final)
    public static final double PI = 3.14159; 
    
    public static void main(String[] args) {
        // Tentativa de mudar o valor daria erro de compilação
        // Constantes.PI = 3.14; 
        
        double raio = 5.0;
        double area = Constantes.PI * raio * raio;
        
        System.out.println("Valor de PI: " + Constantes.PI);
        System.out.println("Área do círculo: " + area);
    }
}
```
```
## 🚦 Estruturas de Controle de Fluxo
### 15 - Condicional (if, else if, else)
- Usadas para executar blocos de código diferentes dependendo de uma condição booleana.
- Estrutura Uso if (condicao)Executa o bloco se a condição for true.else if (condicao)Executa se o if anterior for false e esta condição for true. else Executa se todas as condições anteriores forem false.

### Exemplo Prático:Java

```
```
public class Condicional {
    public static void main(String[] args) {
        int nota = 7;
        
        if (nota >= 7) {
            System.out.println("Aprovado!");
        } else if (nota >= 5) {
            System.out.println("Recuperação.");
        } else {
            System.out.println("Reprovado.");
        }
        // Saída: Aprovado!
    }
}
```
```
### 16 - Operador Ternário
- Uma forma concisa de escrever uma condicional simples de uma linha, que retorna um valor.
Sintaxe: variavel = (condicao) ? valor_se_verdadeiro : valor_se_falso; 

### Exemplo Prático:Java
```
```
public class Ternario {
    public static void main(String[] args) {
        int idade = 17;
        
        String status = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        
        System.out.println("Status: " + status);
        // Saída: Status: Menor de idade
    }
}
```
```
### 17 - Estrutura de Escolha (switch - Clássico)
- Alternativa ao if/else if quando se testa a igualdade de uma única variável contra múltiplos valores fixos. 
- O break é essencial para sair do bloco após a execução de um caso.

### Exemplo Prático:Java
```
```
public class SwitchClassico {
    public static void main(String[] args) {
        int dia = 3;
        String nomeDia;
        
        switch (dia) {
            case 1:
                nomeDia = "Domingo";
                break;
            case 2:
                nomeDia = "Segunda";
                break;
            case 3:
                nomeDia = "Terça";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }
        System.out.println("Dia: " + nomeDia); // Saída: Dia: Terça
    }
}
```
```
### 18 - Expressão Switch (Java 14+)
- Uma forma mais moderna e concisa do switch que pode retornar um valor (como o ternário), eliminando a necessidade de break.
- Usa a seta -> ao invés de case: e break;

### Exemplo Prático:Java
```
```
public class SwitchExpression {
    public static void main(String[] args) {
        int dia = 3;
        
        String nomeDia = switch (dia) {
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            default -> "Dia inválido";
        };
        
        System.out.println("Dia: " + nomeDia); // Saída: Dia: Terça
    }
}
```
```
### 19 - Conversões (Casting)O ato de converter o valor de uma variável de um tipo para outro.Casting Implícito (Automático): 
- Ocorre quando um tipo menor é convertido para um maior (ex: int para double).
- Casting Explícito (Manual): Ocorre quando um tipo maior é convertido para um menor (ex: double para int), exigindo a notação (Tipo). 
- Pode haver perda de informação.

### Exemplo Prático:Java
```
```
public class Conversao {
    public static void main(String[] args) {
        // Implícito (int para double)
        int i = 10;
        double d = i; // d é 10.0 (sem problemas)

        // Explícito (double para int)
        double valorAlto = 9.99;
        int valorInteiro = (int) valorAlto; // Perde o .99, valorInteiro é 9
        
        System.out.println("Conversão Implícita (double): " + d);
        System.out.println("Conversão Explícita (int): " + valorInteiro);
    }
}
```
```
## 🔁 Estruturas de Repetição (Laços)
### 20 - While Repete um bloco de código enquanto uma condição for verdadeira. 
- A condição é verificada antes de cada execução do bloco.
- EstruturaUsowhile (condicao)Repete o bloco zero ou mais vezes.

### Exemplo Prático:Java
```
```
public class LoopWhile {
    public static void main(String[] args) {
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++; // Essencial para evitar loop infinito
        }
        // Imprime de 1 a 5
    }
}
```
```
### 21 - Do While 
- Similar ao while, mas a condição é verificada depois da execução do bloco. 
- Isso garante que o bloco de código seja executado pelo menos uma vez, mesmo que a condição inicial seja falsa.
- EstruturaUsodo { ... } while (condicao);
- Repete o bloco uma ou mais vezes.

### Exemplo Prático:Java
```
```
public class LoopDoWhile {
    public static void main(String[] args) {
        int contador = 10; // Condição inicial é falsa (10 <= 5 é false)
        do {
            System.out.println("Executado uma vez: " + contador);
            contador++;
        } while (contador <= 5);
        // Saída: Executado uma vez: 10 (executa o bloco, verifica e para)
    }
}
```
```
### 22 - For Usado para repetições que têm um número predefinido ou previsível de iterações. 
- É ideal para percorrer sequências.
- Sintaxe: for (inicialização; condição; atualização)

### Exemplo Prático:Java
```
```
public class LoopFor {
    public static void main(String[] args) {
        // Inicialização: int i = 0 (começa em 0)
        // Condição: i < 5 (repete enquanto i for menor que 5)
        // Atualização: i++ (adiciona 1 a i a cada repetição)
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteração For: " + i);
        }
        // Imprime de 0 a 4
    }
}

```
```
### 23 - Vetor (Array)
- Uma estrutura de dados que armazena uma coleção de elementos do mesmo tipo em posições contíguas na memória. 
- Os elementos são acessados por um índice, que começa em 0.
- EstruturaUsoTipo[] nomeArray = new Tipo[Tamanho]; Declara e inicializa um Array.

### Exemplo Prático:Java
```
```
public class Vetor {
    public static void main(String[] args) {
        String[] frutas = new String[3]; // Array de 3 posições (índices 0, 1, 2)
        frutas[0] = "Maçã";
        frutas[1] = "Banana";
        frutas[2] = "Laranja";
        
        System.out.println("A primeira fruta é: " + frutas[0]); // Maçã
        System.out.println("Tamanho do Array: " + frutas.length); // 3
    }
}

```
```
### 24 - Foreach (Enhanced For Loop)

- Uma variação do laço for, simplificada e ideal para percorrer todos os elementos de coleções (como Arrays ou Listas) sem a necessidade de gerenciar índices.EstruturaUsofor (Tipo variavel : colecao)Para cada elemento da coleção, faça.


### Exemplo Prático:Java
```
```
public class Foreach {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40};
        
        for (int num : numeros) { // Para cada 'num' dentro do array 'numeros'
            System.out.println("Elemento: " + num);
        }
        // Imprime 10, 20, 30, 40
    }
}

```
```
### 25 - Matriz (Array Multidimensional)
- Um Array cujos elementos são outros Arrays. 
- O mais comum é o Array de duas dimensões, que se parece com uma tabela (linhas x colunas).
- EstruturaUsoTipo[][] nomeMatriz = new Tipo[Linhas][Colunas];Declara e inicializa uma Matriz.


### Exemplo Prático:Java
```
```
public class Matriz {
    public static void main(String[] args) {
        // Matriz 2x2: 2 linhas e 2 colunas
        int[][] matriz = new int[2][2]; 
        
        matriz[0][0] = 1; // Linha 0, Coluna 0
        matriz[0][1] = 2; // Linha 0, Coluna 1
        matriz[1][0] = 3; // Linha 1, Coluna 0
        matriz[1][1] = 4; // Linha 1, Coluna 1
        
        System.out.println("Elemento (0, 1): " + matriz[0][1]); // 2
        
        // Percorrendo a matriz com laços FOR aninhados
        for (int i = 0; i < matriz.length; i++) { // Laço para as linhas
            for (int j = 0; j < matriz[i].length; j++) { // Laço para as colunas
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Pula linha após cada linha da matriz
        }
        // Saída:
        // 1 2 
        // 3 4 
    }
}

```
```