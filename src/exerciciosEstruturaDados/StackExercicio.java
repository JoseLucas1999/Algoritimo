package exerciciosEstruturaDados;

import java.util.Scanner;
import java.util.Stack;

public class StackExercicio {
/*
Crie um programa que simule um histórico de navegação de um navegador. 
O usuário pode adicionar páginas visitadas a uma Stack (Pilha) 
e usar a opção "voltar" para retornar à página anterior (LIFO – Last In, First Out).
    O usuário pode digitar uma URL para armazená-la no histórico.
    Digitar "voltar" para retornar à página anterior.
    Digitar "sair" para encerrar o programa.*/    

    public static void pilha() {
        Stack<String> historico = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite uma URL (ou 'voltar' para página anterior, 'sair' para encerrar): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("sair")) {
                break;
            }

            if (input.equalsIgnoreCase("voltar")) {
                if (historico.size() > 1) {
                    historico.pop();
                    System.out.println("🔙 Voltando para: " + historico.peek());
                } else {
                    System.out.println("⚠ Nenhuma página anterior!");
                }
            } else {
                historico.push(input);
                System.out.println("✅ Página salva no histórico.");
            }
        }

        scanner.close();
    }
}
