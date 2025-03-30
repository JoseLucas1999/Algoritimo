package exerciciosEstruturaDados;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetExercicio {

    /*add(E e): Adiciona um item ao conjunto.
remove(Object o): Remove um item do conjunto.
contains(Object o): Verifica se o conjunto contém o item.
size(): Retorna o número de elementos no conjunto.*/
    public static void hashSet() {
        Set<Integer> conjunto = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        //adicionanmos alguns valores iniciais na fila
        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(3);

        int op = 0;

        //tela de menu se repete até que usuario insirá a opção 6 (sair)
        while (op != 6) {
            System.out.println("\ndigite 1 para adicionar");
            System.out.println("digite 2 para remover");
            System.out.println("digite 3 para verificar um item");
            System.out.println("digite 4 para verificar se fila esta vazia");
            System.out.println("digite 5 para imprimir a fila");
            System.out.println("digite 6 para sair\n");

            op = scan.nextInt();

            switch (op) {
                case 1:
                    adicionar(conjunto, scan);
                    break;
                case 2:
                    remover(conjunto, scan);
                    break;
                case 3:
                    verificarItem(conjunto, scan);
                    break;
                case 4:
                    verificarTamanhoConjunto(conjunto);
                    break;
                case 5:
                    imprimirConjunto(conjunto);
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

    private static void adicionar(Set<Integer> conjunto, Scanner scan) {
        System.out.println("digite o valor a ser inserido");
        int valor = scan.nextInt();
        if (conjunto.contains(valor)) {
            System.out.println("o valor já existe no conjunto e nao pode ser adicionado");
        } else {
            conjunto.add(valor);
            System.out.println("o valor foi inserido");
        }
    }

    private static void remover(Set<Integer> conjunto, Scanner scan) {
        if (conjunto.isEmpty()) {
            System.out.println("nenhum item a ser removido");
        } else {
            System.out.println("digite o valor a ser removido");
            conjunto.remove(scan.nextInt());
            System.out.println("o ultimo item foi removido");
        }
    }

    private static void verificarItem(Set<Integer> conjunto, Scanner scan) {
        if (conjunto.isEmpty()) {
            System.out.println("nenhum item no conjunto");
        } else {
            System.out.println("digite o valor a ser pesquisado");
            String check = (conjunto.contains(scan.nextInt())) ? "encontrado" : "nao encontrado";
            System.out.println("o item : " + check);
        }
    }

    private static void verificarTamanhoConjunto(Set<Integer> conjunto) {
        int check = conjunto.size();
        String empty = (conjunto.isEmpty()) ? "esta vazia" : "contem " + check + " itens";
        System.out.println("a conjunto " + empty);
    }

    private static void imprimirConjunto(Set<Integer> conjunto) {
        if (conjunto.isEmpty()) {
            System.out.println("nenhum item no conjunto");
        } else {
            System.out.println("Elementos da conjunto:");
            for (int f : conjunto) {
                System.out.print(f + " ");
            }
        }
    }

}
