package exerciciosEstruturaDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class QueueExercicio {   
/*

FIFO (First In, First Out)

offer(E e): Adiciona um item à fila.
poll(): Remove e retorna o item da frente da fila.
peek(): Retorna o item da frente da fila sem removê-lo.
isEmpty(): Verifica se a fila está vazia.
*/    

    public static void queue() {
        Queue<Integer> fila = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
                //adicionanmos alguns valores iniciais na fila
        fila.offer(1);
        fila.offer(2);
        fila.offer(3);

        int op = 0;

        //tela de menu se repete até que usuario insirá a opção 6 (sair)
        while (op != 6) {
            System.out.println("\ndigite 1 para adicionar");
            System.out.println("digite 2 para remover");
            System.out.println("digite 3 para verificar primeiro item");
            System.out.println("digite 4 para verificar se fila esta vazia");
            System.out.println("digite 5 para imprimir a fila");
            System.out.println("digite 6 para sair\n");

            op = scan.nextInt();

            switch (op) {
                case 1:
                    adicionar(fila,scan);
                    break;
                case 2:
                    remover(fila);
                    break;
                case 3:
                    verificarPrimeiroItem(fila);
                    break;
                case 4:
                    verificarFilaVazia(fila);
                    break;
                case 5:
                    imprimirFila(fila);
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
    
        private static void adicionar(Queue<Integer> fila, Scanner scan) {
        System.out.println("digite o valor a ser inserido");
        fila.offer(scan.nextInt());
        System.out.println("o valor " + fila.peek() + " foi inserido");
    }

    private static void remover(Queue<Integer> fila) {
        if (fila.isEmpty()) {
            System.out.println("nenhum item a ser removido");
        } else {
            System.out.println("o valor " + fila.peek() + " sera removido");
            fila.poll();
            System.out.println("o ultimo item foi removido");
        }
    }

    private static void verificarPrimeiroItem(Queue<Integer> fila) {
        if (fila.isEmpty()) {
            System.out.println("nenhum item na fila");
        } else {
            System.out.println("o item do comeco eh: " + fila.peek());
        }
    }

    private static void verificarFilaVazia(Queue<Integer> fila) {
        String empty = (fila.isEmpty()) ? "esta vazia" : "contem itens";
        System.out.println("a fila " + empty);
    }

    private static void imprimirFila(Queue<Integer> fila) {
        System.out.println("Elementos da fila:");
        for (int f : fila) {
            System.out.print(f + " ");
        }
    }
}
