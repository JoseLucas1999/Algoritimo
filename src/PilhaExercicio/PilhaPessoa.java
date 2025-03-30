package PilhaExercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class PilhaPessoa {
        public static void pilhaPessoas() {
        Scanner scan = new Scanner(System.in);
        Stack<Pessoa> pilha = new Stack<>();

        // Adicionando valores iniciais
        pilha.push(new Pessoa("Alice", 25));
        pilha.push(new Pessoa("Bruno", 30));
        pilha.push(new Pessoa("Carlos", 22));

        int op = 0;

        while (op != 6) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Adicionar Pessoa");
            System.out.println("2 - Remover Pessoa");
            System.out.println("3 - Verificar primeira Pessoa");
            System.out.println("4 - Verificar se a pilha está vazia");
            System.out.println("5 - Imprimir a pilha");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                op = scan.nextInt();
                scan.nextLine(); // Limpa o buffer
                switch (op) {
                    case 1:
                        adicionar(pilha, scan);
                        break;
                    case 2:
                        remover(pilha);
                        break;
                    case 3:
                        verificarPrimeiroItem(pilha);
                        break;
                    case 4:
                        verificarPilhaVazia(pilha);
                        break;
                    case 5:
                        imprimirPilha(pilha);
                        break;
                    case 6:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida! Digite um número entre 1 e 6.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida! Digite um número.");
                scan.next(); // Limpa o buffer do scanner
            }
        }
        scan.close();
    }
//-------------------------------------------------
//Métodos
    private static void adicionar(Stack<Pessoa> pilha, Scanner scan) {
        System.out.print("Digite o nome da pessoa: ");
        String nome = scan.nextLine();
        System.out.print("Digite a idade da pessoa: ");
        try {
            int idade = scan.nextInt();
            scan.nextLine(); // Limpa o buffer
            pilha.push(new Pessoa(nome, idade));
            System.out.println("Pessoa adicionada: " + nome + " (" + idade + " anos)");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Idade inválida! Digite um número inteiro.");
            scan.next(); // Limpa o buffer
        }
    }

    private static void remover(Stack<Pessoa> pilha) {
        if (pilha.isEmpty()) {
            System.out.println("Nenhuma pessoa a ser removida.");
        } else {
            System.out.println("Pessoa removida: " + pilha.pop());
        }
    }

    private static void verificarPrimeiroItem(Stack<Pessoa> pilha) {
        if (pilha.isEmpty()) {
            System.out.println("Nenhuma pessoa na pilha.");
        } else {
            System.out.println("Pessoa no topo: " + pilha.peek());
        }
    }

    private static void verificarPilhaVazia(Stack<Pessoa> pilha) {
        System.out.println("A pilha " + (pilha.isEmpty() ? "está vazia." : "contém pessoas."));
    }

    private static void imprimirPilha(Stack<Pessoa> pilha) {
        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.println("Pessoas na pilha (do topo para a base):");
            List<Pessoa> lista = new ArrayList<>(pilha);
            Collections.reverse(lista);
            for (Pessoa p : lista) {
                System.out.println(p);
            }
        }
    }        
}
