package estruturaDadosExercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExercicio {

    /*Desenvolva um dicionário de palavras usando um Map (estrutura chave-valor). 
O usuário poderá digitar uma palavra e o programa retornará seu significado. 
Se a palavra não existir no dicionário, o programa avisará que a palavra não foi encontrada.*/
    public static void dicionario() {
        Map<String, String> dicionario = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        
                // Adicionando palavras ao dicionário
        dicionario.put("java", "Linguagem de programação orientada a objetos.");
        dicionario.put("computador", "Máquina eletrônica para processar dados.");
        dicionario.put("algoritmo", "Sequência finita de passos para resolver um problema.");
        dicionario.put("variável", "Espaço na memória onde armazenamos um valor.");
        dicionario.put("compilador", "Programa que traduz código-fonte para código executável.");
        dicionario.put("backend", "Parte de um sistema que processa dados e lógica de negócios.");
        dicionario.put("frontend", "Parte visual de um sistema com a qual o usuário interage.");
        dicionario.put("framework", "Conjunto de ferramentas e bibliotecas para desenvolvimento de software.");
        dicionario.put("banco de dados", "Sistema organizado para armazenar e gerenciar informações.");
        dicionario.put("API", "Interface que permite a comunicação entre sistemas diferentes.");
        dicionario.put("debug", "Processo de encontrar e corrigir erros em um código.");
        dicionario.put("recursão", "Técnica onde uma função chama a si mesma para resolver um problema.");
        dicionario.put("thread", "Fluxo de execução independente dentro de um programa.");
        dicionario.put("sintaxe", "Regras que definem a estrutura de um código em uma linguagem de programação.");
        dicionario.put("pilha", "Estrutura de dados baseada no princípio LIFO (Last In, First Out).");
        dicionario.put("carro", "Veículo automotor de quatro rodas.");
        dicionario.put("java", "Linguagem de programação orientada a objetos.");
        dicionario.put("computador", "Máquina eletrônica para processar dados.");
        dicionario.put("cachorro", "Animal de estimação leal e brincalhão.");

        // Loop para opções do menu
        while (true) {
            exibirMenu();
            int opcao = lerOpcao();

            switch (opcao) {
                case 1:
                    buscarPalavra(dicionario);
                    break;
                case 2:
                    adicionarPalavra(dicionario);
                    break;
                case 3:
                    sair();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

    }
// métodos
    
    // Exibir o menu de opções
    private static void exibirMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Buscar palavra");
        System.out.println("2. Adicionar nova palavra");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
    }
    
        // Ler a opção escolhida pelo usuário
    private static int lerOpcao() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    // Buscar palavra no dicionário
    private static void buscarPalavra(Map<String, String> dicionario) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // Para consumir o '\n' restante
        System.out.print("Digite uma palavra para buscar: ");
        String palavraBusca = scanner.nextLine().trim();

        String significado = dicionario.get(palavraBusca);
        if (significado != null) {
            System.out.println("?Definição: " + significado);
        } else {
            System.out.println("Palavra não encontrada no dicionário.");
        }
    }

    // Adicionar nova palavra ao dicionário
    private static void adicionarPalavra(Map<String, String> dicionario) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // Para consumir o '\n' restante
        System.out.print("Digite a nova palavra: ");
        String novaPalavra = scanner.nextLine().trim();

        System.out.print("Digite a tradução/significado da palavra: ");
        String traducao = scanner.nextLine().trim();

        dicionario.put(novaPalavra, traducao);
        System.out.println("✅ Palavra adicionada com sucesso!");
    }

    // Sair do programa
    private static void sair() {
        System.out.println("Saindo...");
    }
}
