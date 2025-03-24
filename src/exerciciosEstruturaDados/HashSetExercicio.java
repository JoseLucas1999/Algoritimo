package exerciciosEstruturaDados;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetExercicio {
/*Crie um programa que gerencie uma lista de convidados para um evento. 
Os nomes dos convidados devem ser armazenados em um conjunto (Set), 
para evitar duplicatas. O programa deve permitir ao usuário adicionar nomes à lista 
e exibir os convidados únicos cadastrados*/

    public static void convidados() {
        Set<String> convidados = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o nome do convidado (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine().trim();
            if (nome.equalsIgnoreCase("sair"))
                break;
            
            if (convidados.add(nome)) {
                System.out.println("✅ Convidado adicionado.");
            } else {
                System.out.println("⚠ Esse convidado já está na lista!");
            }
        }
        
        System.out.println("\n📋 Lista de Convidados:");
        for (String convidado : convidados) {
            System.out.println("- " + convidado);
        }

        scanner.close();
    }

}
