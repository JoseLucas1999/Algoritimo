package exercicios;

import java.util.Scanner;

public class EstruturaControle {

    public static void ParOuImpar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se é par ou impra: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        scanner.close();
    }
}

/*1. Par ou Ímpar
Peça para o usuário digitar um número e informe se ele é par ou ímpar.

2. Maior de Três Números
Peça para o usuário digitar três números e informe qual é o maior número.

3. Positivo, Negativo ou Zero
Peça para o usuário digitar um número e informe se ele é positivo, negativo ou zero.

4. Cálculo de Média
Peça para o usuário digitar 5 notas de um aluno e calcule a média. 
Se a média for maior ou igual a 7, informe que o aluno está aprovado, caso contrário, reprovado.

5. Impressão de Números de 1 a N
Peça para o usuário digitar um número N e imprima todos os números de 1 até N (inclusive).

6. Fatorial
Peça para o usuário digitar um número e calcule o fatorial desse número. (Exemplo: 5! = 5 * 4 * 3 * 2 * 1)

7. Tabuada
Peça para o usuário digitar um número e imprima a tabuada desse número de 1 a 10.

8. Cálculo de Potência
Peça para o usuário digitar a base e o expoente, e calcule a potência (base^expoente).

9. Verificação de Número Primo
Peça para o usuário digitar um número e informe se ele é primo ou não.

10. Desafio de Fibonacci
Imprima os n primeiros números de Fibonacci, onde F(0) = 0 e F(1) = 1. 
O próximo número é a soma dos dois anteriores.*/