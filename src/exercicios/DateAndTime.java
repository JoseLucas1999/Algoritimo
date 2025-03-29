package exercicios;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateAndTime {
    //crie um programa que receba a data de nascimento do usuario e calcule sua idade atual

    public static void CalcularIdade() {
        Scanner scan = new Scanner(System.in);

        // Solicita a data de nascimento
        System.out.print("Digite sua data de nascimento (YYYY-MM-DD): ");
        String nascimento = scan.nextLine();

        // Converte a string para LocalDate
        LocalDate dataNascimento = LocalDate.parse(nascimento);
        LocalDate dataAtual = LocalDate.now();

        // Calcula a idade
        int idade = Period.between(dataNascimento, dataAtual).getYears();

        System.out.println("Sua idade atual eh: " + idade + " anos.");
        scan.close();
    }
    
    
}
