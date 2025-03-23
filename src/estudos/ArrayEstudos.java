package estudos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayEstudos {
    // os array possuem o tamanho fixo, são estaticos
    // podem armazenar apenas um tipo de dado
    // o array possui index (0,1,2,3,4,etc...)
    // o array é um objeto

    //definindo os valores
    public static void valoresDefinindo() {
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println(numeros[0]); // Saída: 1
        System.out.println(numeros[2]); // Saída: 3
        System.out.println(numeros[4]); // Saída: 5

    }

    //definindo o tamanho
    public static void tamanhoDefinido() {
        int[] numeros = new int[5];
        //Percorrendo o array com for
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número na posição " + i + ": " + numeros[i]);
        }

    }

    //Array de Strings
    public static void StringArray() {

        String[] nomes = {"Lucas", "Ana", "Carlos"};
        //Percorrendo com for-each (simplificado)
        for (String n : nomes) {
            System.out.println("Número: " + n);
        }

    }

    //Exemplo 1: Atribuir valores após a instanciação
    public static void Atribuir() {
        // Cria um array com 5 posições (inicialmente com 0)
        int[] numeros = new int[5];

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        System.out.println(numeros[2]); // Saída: 30
    }

    //Exemplo 2: Preenchendo um array com um loop
    public static void Preencher() {
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (i + 1) * 10; // Preenche com 10, 20, 30, 40, 50
        }

        for (int num : numeros) {
            System.out.println(num); // Exibe os valores
        }
    }

    public static void percorrer() {
        int[] numeros = {1, 2, 3, 4, 5};
        for (int num : numeros) {
            System.out.println(num); // Exibe os valores
        }
    }

    //Exemplo 3: Modificando um array já inicializado
    public static void Modificar() {
        int[] numeros = {1, 2, 3, 4, 5};
        // Alterando valores após a inicialização
        numeros[2] = 100;
        numeros[4] = 200;

        System.out.println(numeros[2]); // Saída: 100
        System.out.println(numeros[4]); // Saída: 200
    }

    //Ordenação de Arrays
    public static void Ordenar() {
        //Usando Arrays.sort() (Crescente)
        int[] valores = {5, 2, 9, 1, 3};
        Arrays.sort(valores);
        System.out.println(Arrays.toString(valores)); // [1, 2, 3, 5, 9]

        //Ordenação Decrescente
        Integer[] valores2 = {5, 2, 9, 1, 3};
        Arrays.sort(valores2, Collections.reverseOrder());
        System.out.println(Arrays.toString(valores)); // [9, 5, 3, 2, 1]

    }

    //Cópia de Arrays
    public static void CopiarArrays() {
        //Usando Arrays.copyOf()
        int[] original = {1, 2, 3, 4, 5};
        int[] copia = Arrays.copyOf(original, original.length);
        System.out.println(Arrays.toString(copia)); // [1, 2, 3, 4, 5]

        // Usando System.arraycopy()
        int[] destino = new int[5];
        System.arraycopy(original, 0, destino, 0, original.length);
        System.out.println(Arrays.toString(destino)); // [1, 2, 3, 4, 5]
    }

    //4. Buscar Elementos
    public static void BuscarElementos() {
        //Usando Arrays.binarySearch() (ArrayEstudos Ordenado)
        int[] numeros = {1, 3, 5, 7, 9};
        int indice = Arrays.binarySearch(numeros, 5);
        System.out.println("Número encontrado no índice: " + indice); // Índice 2
    }

    //5. Converter um ArrayEstudos em Lista
    public static void ArrayToLista() {
        String[] nomes = {"Lucas", "Ana", "Carlos"};
        List<String> lista = Arrays.asList(nomes);
        System.out.println(lista); // [Lucas, Ana, Carlos]

        //Para arrays primitivos, converta para Integer[] antes:
        Integer[] numeros = {1, 2, 3};
        List<Integer> lista2 = Arrays.asList(numeros);
    }

    //Preencher um Arraycom um Valor Padrão
    public static void PreencherValorPadrao() {
        //Usando Arrays.fill()
        int[] numeros = new int[5];
        Arrays.fill(numeros, 7);
        System.out.println(Arrays.toString(numeros)); // [7, 7, 7, 7, 7]
    }

    //Reverter um Array
    public static void ReverterArray() {
        //Usando Collections.reverse() (Para Objetos)
        Integer[] numeros = {1, 2, 3, 4, 5};
        Arrays.sort(numeros, Collections.reverseOrder());

        System.out.println(Arrays.toString(numeros)); // [5, 4, 3, 2, 1]

    }

    //Concatenar Dois Arrays
    public static void ConcatenarArrays() {
        //Usando System.arraycopy()
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] c = new int[a.length + b.length];

        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);

        System.out.println(Arrays.toString(c)); // [1, 2, 3, 4, 5, 6]

    }

    public static void c() {

    }

    public static void d() {

    }

    public static void e() {

    }

    public static void f() {

    }

    public static void g() {

    }

    public static void h() {

    }

}
