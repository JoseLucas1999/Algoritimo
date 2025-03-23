package exercicios;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Arrays {

    /*1. Crie um programa que receba um array de números inteiros e calcule a **soma de todos os seus elementos*/
    public static void somaArray() {
        int[] numeros = new int[5];
        Scanner scan = new Scanner(System.in);
        int soma = 0;

        int i = 0;
        while (i < numeros.length) {
            System.out.println("digite um valor");
            numeros[i] = scan.nextInt();;
            i++;
        }
        scan.close();

        for (int n : numeros) {
            soma = soma + n;
        }
        System.out.println("a soma dos valores eh: " + soma);
    }
//--------------------------------------------------------------------------
/*2.Crie um programa que receba um array de números inteiros e encontre **o maior e o menor valor** dentro do array.*/
    public static void maiorMenor() {
        int[] numeros = new int[5];
        Scanner scan = new Scanner(System.in);
        int maior = 0, menor = 0;

        int i = 0;
        while (i < numeros.length) {
            System.out.println("digite um valor");
            numeros[i] = scan.nextInt();;
            i++;
        }

        maior = numeros[0];
        menor = numeros[0];
        for (int n : numeros) {
            if (maior < n) {
                maior = n;
            }
            if (menor > n) {
                menor = n;
            }
        }

        System.out.println("o maior valor eh: " + maior);
        System.out.println("o menor valor eh: " + menor);

        scan.close();

    }
//--------------------------------------------------------------------------
/*3. Crie um programa que receba um array de números inteiros e inverta a ordem dos elementos.*/

    public static void inverterOrdem() {
        int[] numeros = new int[5];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um valor para a posição " + i + ":");
            numeros[i] = scan.nextInt();
        }

        int inicio = 0;
        int fim = numeros.length - 1;

        while (inicio < fim) {
            int temp = numeros[inicio];
            numeros[inicio] = numeros[fim];
            numeros[fim] = temp;

            inicio++;
            fim--;
        }

        System.out.println("Array invertido:");
        for (int n : numeros) {
            System.out.println(n);
        }

        scan.close();
    }
//--------------------------------------------------------------------------
/*4. Crie um programa que receba um array de números inteiros e ordene a ordem dos elementos.*/
    public static void Ordenar() {
        int[] numeros = new int[5];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um valor para a posição " + i + ":");
            numeros[i] = scan.nextInt();
        }

        int inicio = 0;
        int fim = numeros.length - 1;
        while (inicio < fim) {
            int temp = numeros[inicio];
            numeros[inicio] = numeros[fim];
            numeros[fim] = temp;

            inicio++;
            fim--;
        }

        System.out.println("Array ordenado:");
        for (int n : numeros) {
            System.out.println(n);
        }

        scan.close();
    }
//--------------------------------------------------------------------------
/*5. Crie um programa que receba um array de números inteiros e um número específico. 
O programa deve contar **quantas vezes esse número aparece no array*/
    public static void a() {

    }
//--------------------------------------------------------------------------
/* 6. Crie um programa que calcule a **média** dos elementos de um array de inteiros.  */

    public static void b() {

    }
}
