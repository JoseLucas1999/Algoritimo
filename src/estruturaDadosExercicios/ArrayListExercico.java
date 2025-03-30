package estruturaDadosExercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercico {
    public static void gerenciadorTarefa() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        
        // Adicionando algumas tarefas iniciais
        tarefas.add("comprar pão");
        tarefas.add("passear com o cachorro");
        tarefas.add("ir na academia");
        tarefas.add("lavar a moto");
        tarefas.add("ir ao mercado");

        while (true) {
            exibirMenu();
            int option = lerOpcao();
            processarOpcao(option, tarefas);
        }
    }

    //menu
    private static void exibirMenu() {
        System.out.println("\nGerenciador de Tarefas");
        System.out.println("1. Adicionar tarefa");
        System.out.println("2. Listar tarefas");
        System.out.println("3. Remover tarefa");
        System.out.println("4. Buscar tarefa");
        System.out.println("5. Contar tarefas");
        System.out.println("6. Sair\n");
        System.out.print("Escolha uma opcao: ");
    }

//leroptiob
    private static int lerOpcao() {
        Scanner scanner = new Scanner(System.in);
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida! Digite um número entre 1 e 6.");
            return -1; // Retorna um valor inválido para ser tratado
        }
    }
//processar opcão

    private static void processarOpcao(int option, ArrayList<String> tarefas) {
        Scanner scanner = new Scanner(System.in);
        switch (option) {
            case 1 ->
                adicionarTarefa(tarefas);
            case 2 ->
                listarTarefas(tarefas);
            case 3 ->
                removerTarefa(tarefas);
            case 4 ->
                buscarTarefa(tarefas);
            case 5 ->
                totalTarefas(tarefas);
            case 6 ->
                sair();
            default ->
                System.out.println("Opção inválida! Digite um número entre 1 e 6.");
        }
    }

//adicionar tarefas

private static void adicionarTarefa(ArrayList<String> tarefas) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nova tarefa: ");
        String novaTarefa = scanner.nextLine();
        tarefas.add(novaTarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }
//listar tarefas

    private static void listarTarefas(ArrayList<String> tarefas) {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa na lista.");
        } else {
            System.out.println("Lista de Tarefas:");
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + " - " + tarefas.get(i));
            }
        }
    }
// remover tarefa

    private static void removerTarefa(ArrayList<String> tarefas) {
        Scanner scanner = new Scanner(System.in);
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa para remover.");
        } else {
            System.out.print("Digite o número da tarefa para remover: ");
            try {
                //meos "-1" pois o indice começa em "0"
                int indice = Integer.parseInt(scanner.nextLine()) - 1;
                if (indice >= 0 && indice < tarefas.size()) {
                    String removida = tarefas.remove(indice);
                    System.out.println("Tarefa removida: " + removida);
                } else {
                    System.out.println("Índice inválido!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número válido.");
            }
        }
    }

//buscar tarefa
    private static void buscarTarefa(ArrayList<String> tarefas) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a tarefa para buscar: ");
        String busca = scanner.nextLine();
        if (tarefas.contains(busca)) {
            System.out.println("A tarefa está na lista!");
        } else {
            System.out.println("A tarefa não foi encontrada.");
        }
    }

//total tarefas  
    private static void totalTarefas(ArrayList<String> tarefas) {
        System.out.println("Total de tarefas: " + tarefas.size());
    }

//sair
    private static void sair() {
        System.out.println("Saindo...");
        return;
    }
}

/*
Exercício: Gerenciador de Lista de Tarefas
Crie um programa em Java que implemente um gerenciador de tarefas usando ArrayListExercico. O programa deve permitir ao usuário:
✅ Adicionar uma nova tarefa
✅ Listar todas as tarefas
✅ Remover uma tarefa pelo índice
✅ Buscar se uma tarefa específica está na lista
✅ Exibir o número total de tarefas

Requisitos:
Use um ArrayListExercico<String> para armazenar as tarefas.
O programa deve rodar em um loop até que o usuário escolha sair.
Utilize o Scanner para capturar entradas do usuário.
Valide as entradas para evitar erros, como remover uma tarefa de um índice inválido.*/