package exercicios;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class LacosRepeticao {

//1. Escreva um programa que imprima todos   os números inteiros de 0 a 50
    public static void imprimirFrom0To50() {
        for (int i = 0; i <= 50; i++) {
            System.out.print(i + "-");
        }
    }
//------------------------------------------------------------------------
//2. Escreva um programa que imprima todos os números inteiros de 100 a 1.

    public static void imprimirfrom100To0() {
        for (int i = 100; i >= 0; i--) {
            System.out.print(i + "-");
        }
    }

//------------------------------------------------------------------------
//03. Escrever o programa que leia os valores n1 e n2  e imprima o intervalo fechado entre esses dois valores.
    public static void lerN1AndN2() {
        System.out.println("Digite dois valores");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        //verificar se n1 é maior que n2
        if (n1 > n2) {
            int aux = n2;
            n2 = n1;
            n1 = aux;
        }
        for (int i = n1; i <= n2; i++) {
            System.out.println("intervalo entre os números: " + i);
        }

        scanner.close();
    }
//------------------------------------------------------------------------
/*04. Faça um programa que calcule e mostre valores de graus Celsius e graus Fahrenheit, 
cujos graus variem de 40 a 70 F de 1 em 1. A conversão de graus Fahrenheit (F)  
    para graus Celsius (C) é dada por: C=5/9*(F-32)*/

    public static void CelsiusToFahrenheit() {

        for (int fahrenheit = 40; fahrenheit <= 70; fahrenheit++) {
            double celsius = 5.0 / 9 * (fahrenheit - 32);
            DecimalFormat df = new DecimalFormat("#.#");
            System.out.println(" fahrenheit: " + fahrenheit + "f" + " | celsius: " + df.format(celsius) + "c");
        }
    }
//------------------------------------------------------------------------
/* 05. Escrever um programa que leia um número não determinado de valores e 
calcule  a média aritmética dos valores lidos,  a quantidade de valores positivos, 
a quantidade de valores negativos e o percentual de valores negativos e positivos. */

    public static void lerNumeroMedia() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("Digite os numeros. Para parar, digite 'sair'.");

        while (true) {
            System.out.print("Digite um numero: ");
            if (scanner.hasNextInt()/*isInteger(scanner.nextInt())*/) {
                numeros.add(scanner.nextInt());
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("sair")) {
                    break; //quebramos o fluxo do while
                } else {
                    System.out.println("Entrada inválida. Digite um número ou 'sair' para terminar.");
                }
            }
        }
        float media = 0;
        int negativos = 0, possitivos = 0;

        for (int i = 0; i < numeros.size(); i++) {
            media += numeros.get(i);
            if (numeros.get(i) < 0) {
                negativos++;
            } else {
                possitivos++;
            }
        }
        media = media / numeros.size();
        int porcentagemNegativos = negativos * 100 / numeros.size();
        int porcentagemPossitivos = possitivos * 100 / numeros.size();

        System.out.println("Numeros digitados: " + numeros);
        System.out.println("Media Numeros: " + media);
        System.out.println("Possitivos: " + possitivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Porc. Possitivos: " + porcentagemPossitivos + "%");
        System.out.println("Porc. Negativos: " + porcentagemNegativos + "%");

        scanner.close();
    }
//------------------------------------------------------------------------
/*06. Escrever um programa que leia uma quantidade desconhecida de números 
    e conte quantos deles estão nos seguintes intervalos: 
    [0,25], [26,50], [51,75] e [76,100]. */

    public static void lerIntervalo() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("Digite os numeros entre 0 e 100. Para parar, digite 'sair'.");

        while (true) {
            System.out.println("Digite um numero");

            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num > 100 || num < 0) {
                    System.out.println("Numero invalido, digite entre 0 e 100!");
                } else {
                    numeros.add(num);
                }
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("sair")) {
                    break; //quebramos o fluxo do while
                } else {
                    System.out.println("valor invalido, Digite sair");
                }
            }
        }
        scanner.close();

        int a = 0, b = 0, c = 0, d = 0;
        for (int num : numeros) {
            if (num >= 0 && num <= 25) {
                a++;
            } else if (num >= 26 && num <= 50) {
                b++;
            } else if (num >= 51 && num <= 75) {
                c++;
            } else if (num >= 76 && num <= 100) {
                d++;
            }
        }

        System.out.println("quantidade de numeros entre 0 e 25: " + a);
        System.out.println("quantidade de numeros entre 26 e 50: " + b);
        System.out.println("quantidade de numeros entre 51 e 75: " + c);
        System.out.println("quantidade de numeros entre 76 e 100: " + d);

    }
//------------------------------------------------------------------------

    /*07. Faça um programa que leia dois valores inteiros x e y, 
    e que calcule e mostre a potência "x elevado a y"*/
    public static void potencia() {
        int x = 0, y = 0;

        System.out.println("digite dois valores: x e y");
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        do {
            System.out.println("digite o " + (i + 1) + " numero ");
            if (i == 0) {
                x = scanner.nextInt();
            } else {
                y = scanner.nextInt();
            }
            i++;
        } while (i < 2);

        scanner.close();

        double potencia = Math.pow(x, y);
        System.out.println(x + " elevado a " + y + " eh igual: " + potencia);

    }
//------------------------------------------------------------------------

    /*08.Construa um programa que apresente o valor de H, 
    sendo H calculado por: H = 1 + 2 + 3 + 4 + ... + N. 
    O valor de N será apresentado pelo usuário*/
    public static void decrescente() {
        System.out.println("digite um numero entre 1 e 100");
        Scanner scan = new Scanner(System.in);
        double H = 0;
        int num;
        if (scan.hasNextInt()) {
            num = scan.nextInt();
            if (num > 100 || num < 0) {
                System.out.println("valor invalido, insira um numero entre 1 e 100");
            } else {
                for (int i = num; i > 0; i--) {
                    H = H + i;
                }
            }
        } else {
            System.out.println("entrada invalida, insira um numero entre 1 e 100");
        }

        System.out.println("o valor de H eh de: " + H);
    }
//------------------------------------------------------------------------

    /*9. Faça um programa que leia um número inteiro n, 
    se n maior que 1 imprima a soma dos múltiplos de 5 no intervalo de 1 a n.*/
    public static void imprimirMultiplo() {
        System.out.println("digite um numero inteiro");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if (num > 1) {
            for (int i = 5; i <= num; i += 5) { // Começa em 5 e aumenta de 5 em 5
                System.out.println(i);
            }
        }
        scan.close();
    }
//------------------------------------------------------------------------

    /*10. Elaborar um programa que deve pedir ao usuário dois números 
    e em seguida fazer a operação de divisão dos mesmos. 
    Existe a condição que o numerador deve ser maior que o denominador. 
    O denominador também deve ser diferente de zero. */
    public static void numeradorDenominador() {
        System.out.println("digite dois numero, numerador e denominador");

        Scanner scan = new Scanner(System.in);
        int num = 0;
        int i = 0;
        int numerador = 0, denominador = 0;
        double divisao = 0;

        do {
            System.out.println("insira o dominador maior que zero");
            denominador = scan.nextInt();
            if (denominador == 0) {
                System.out.println("o denominador deve ser maior que zero!");
            }
        } while (denominador == 0);

        do {
            System.out.println("insira o numerador maior que o denominador");
            numerador = scan.nextInt();
            if (numerador < denominador) {
                System.out.println("o numerador dever ser maior que o denominador");
            }
        } while (numerador < denominador);

        divisao = numerador / denominador;
        System.out.println("a divisao de numerador por denominador eh: " + divisao);

        scan.close();
    }
//------------------------------------------------------------------------
    }