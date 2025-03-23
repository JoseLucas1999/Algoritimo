package exercicios;

import java.util.Scanner;

public class Condicional {

/* 1. Número Primo
    Crie um programa que leia um número inteiro e informe se ele é primo ou não. 
    (Lembre-se, um número primo é um número maior que 1, 
    que só pode ser dividido por 1 e por ele mesmo).*/
 
    public static void primo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int num = scanner.nextInt();
        
        if (num <= 1) {
            System.out.println("O numero nao eh primo. (Primos sao maiores que 1)");
        } else {
            boolean ehPrimo = true;
            
            // Testa divisores de 2 até a raiz quadrada do número
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num% i == 0) {
                    ehPrimo = false;
                    break; // Se encontrar um divisor, não é primo
                }
            }
            
            if (ehPrimo) {
                System.out.println("O numero " + num + " eh primo.");
            } else {
                System.out.println("O numero " + num + " nao eh primo.");
            }
        }
        
        // Fecha o scanner
        scanner.close();
    }
    }
/*


Dica: Utilize um laço de repetição e verifique se o número tem divisores além de 1 e ele mesmo.

2. Fatorial
Escreva um programa que calcule o fatorial de um número. O fatorial de um número é o produto de todos os números inteiros positivos menores ou iguais a ele. Exemplo: 5! = 5 × 4 × 3 × 2 × 1.

Dica: Use um laço de repetição e condicionais para calcular o fatorial.

3. Condição de Triângulo
Peça ao usuário para inserir três lados de um triângulo. Determine se é possível formar um triângulo com esses lados e, em caso afirmativo, informe o tipo de triângulo (equilátero, isósceles ou escaleno).

Dica: Verifique a condição de existência de um triângulo (a soma de dois lados deve ser sempre maior que o terceiro) e depois classifique os triângulos.

4. Sequência de Fibonacci
Crie um programa que gere os primeiros N números da sequência de Fibonacci, onde N é um número inserido pelo usuário. A sequência de Fibonacci começa com 0 e 1, e cada número subsequente é a soma dos dois anteriores.

Dica: Use um laço e condicionais para gerar a sequência.

5. Verificando um Palíndromo
Crie um programa que leia uma palavra e informe se ela é um palíndromo. Um palíndromo é uma palavra que pode ser lida da mesma forma de trás para frente (exemplo: "arara", "radar").

Dica: Use condicionais para comparar a palavra original com a palavra invertida.

6. Raiz Quadrada Aproximada
Escreva um programa que calcule a raiz quadrada de um número de forma aproximada, utilizando um método de aproximação (como o método de Newton). O programa deve continuar calculando até que a diferença entre os valores da raiz seja suficientemente pequena.

Dica: Use condicionais para verificar a precisão e parar quando a aproximação for boa o suficiente.

7. Jogo de Par ou Ímpar
Crie um jogo entre o usuário e o computador. O programa deve escolher um número aleatório entre 0 e 9, enquanto o usuário escolhe um número também entre 0 e 9. O programa deve verificar se a soma dos dois números é par ou ímpar e, em seguida, determinar quem ganhou de acordo com a escolha do jogador (se o jogador escolheu "par", a soma tem que ser par para o jogador ganhar, e o mesmo vale para "ímpar").

Dica: Use Random para gerar o número do computador e if-else para verificar a soma.

8. Número de Vezes que um Dígito Aparece
Peça ao usuário para inserir um número inteiro e um dígito específico (de 0 a 9). O programa deve contar quantas vezes o dígito aparece dentro do número fornecido.

Dica: Utilize operações de divisão e resto para separar os dígitos do número e contar as ocorrências.

9. Ordenação por Condições
Crie um programa que leia três números inteiros e, dependendo das condições fornecidas, os organize de maneira crescente, decrescente ou de forma alternada (crescente, depois decrescente). Pergunte ao usuário qual tipo de ordenação ele deseja.

Dica: Use if-else if-else para implementar as diferentes condições de ordenação.

10. Validando uma Data
Crie um programa que leia uma data no formato dd/mm/aaaa e valide se ela é uma data válida. Verifique se o mês está entre 1 e 12, se o dia é válido para o mês (considere a quantidade de dias dos meses e ano bissexto), e se o ano é válido (um número positivo).

Dica: Use condicionais para verificar o intervalo de valores e também para verificar anos bissextos (se o ano for divisível por 4, mas não por 100, a menos que seja divisível por 400).
 */
