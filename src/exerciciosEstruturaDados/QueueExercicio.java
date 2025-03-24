package exerciciosEstruturaDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueExercicio {   
/*
Implemente um sistema de fila de atendimento utilizando uma Queue (Fila). 
O programa deve permitir que os usuários adicionem clientes à fila 
e atendam os clientes na ordem de chegada (FIFO – First In, First Out).
    O usuário pode digitar um nome para adicionar um cliente à fila.
    Digitar "atender" para chamar o próximo cliente.
    Digitar "sair" para encerrar o programa.*/    

    public static void queue() {
        Queue<String> fila = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o nome do cliente (ou 'atender' para chamar, 'sair' para encerrar): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("sair")) {
                break;
            }

            if (input.equalsIgnoreCase("atender")) {
                if (fila.isEmpty()) {
                    System.out.println("⚠ Nenhum cliente na fila!");
                } else {
                    System.out.println("🟢 Atendendo: " + fila.poll());
                }
            } else {
                fila.offer(input);
                System.out.println("✅ Cliente adicionado à fila.");
            }
        }

        scanner.close();
    }
}
