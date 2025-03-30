package PilhaExercicio;

import java.util.Scanner;
import java.util.Stack;

public class StackExercicio {
//----------------------------------------------------------------------
    //Last In, First Out
    //push(E item): Adiciona um item ao topo da pilha.
    //pop(): Remove o item do topo da pilha e o retorna.
    //peek(): Retorna o item no topo da pilha sem removê-lo.
    //isEmpty(): Verifica se a pilha está vazia.
    //search(Object o): Retorna a posição do item na pilha (onde o topo da pilha é 1).*/

    public static void pilha() {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<>(); //pilha de Interger
        //adicionanmos alguns valores iniciais na pilha
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);

        int op = 0;

        //tela de menu se repete até que usuario insirá a opção 6 (sair)
        while (op != 6) {
            System.out.println("\ndigite 1 para adicionar");
            System.out.println("digite 2 para remover");
            System.out.println("digite 3 para verificar primeiro item");
            System.out.println("digite 4 para verificar se pilha esta vazia");
            System.out.println("digite 5 para imprimir a pilha");
            System.out.println("digite 6 para sair\n");

            op = scan.nextInt();

            switch (op) {
                case 1:
                    adicionar(pilha,scan);
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
                    System.out.println("saindo...");
                    break;
                default:
                    System.out.println("valor invalido, digite uma opcao entre 1 e 6");
            }

        }
        scan.close();
    }
//--------------------------------------------------------------------------

    private static void adicionar(Stack<Integer> pilha, Scanner scan) {
        System.out.println("digite o valor a ser inserido");
        pilha.push(scan.nextInt());
        System.out.println("o valor " + pilha.peek() + " foi inserido");
    }

    private static void remover(Stack<Integer> pilha) {
        if (pilha.isEmpty()) {
            System.out.println("nenhum item a ser removido");
        } else {
            System.out.println("o valor " + pilha.peek() + " sera removido");
            pilha.pop();
            System.out.println("o ultimo item foi removido");
        }
    }

    private static void verificarPrimeiroItem(Stack<Integer> pilha) {
        if (pilha.isEmpty()) {
            System.out.println("nenhum item na pilha");
        } else {
            System.out.println("o item do topo eh: " + pilha.peek());
        }
    }

    private static void verificarPilhaVazia(Stack<Integer> pilha) {
        String empty = (pilha.isEmpty()) ? "esta vazia" : "contem itens";
        System.out.println("a pilha " + empty);
    }

    private static void imprimirPilha(Stack<Integer> pilha) {
        System.out.println("Elementos da pilha:");
        for (int p : pilha) {
            System.out.print(p + " ");
        }
    }

    /*
    Crie um programa em Java que implemente uma pilha de números inteiros utilizando a classe Stack<>. 
    O programa deve permitir ao usuário realizar as seguintes operações através de um menu interativo:
        Adicionar um número à pilha
        Remover o elemento do topo da pilha (se houver)
        Exibir o elemento no topo da pilha (se houver)
        Verificar se a pilha está vazia
        Sair do programa

    Regras:
    Utilize a estrutura de repetição while para manter o menu funcionando até que o usuário escolha a opção de saída.
    Caso o usuário tente remover ou visualizar um elemento de uma pilha vazia, exiba uma mensagem apropriada.
    Utilize switch-case para tratar as opções do menu.
    Sempre que um novo elemento for inserido, informe o valor inserido.
     */
}
