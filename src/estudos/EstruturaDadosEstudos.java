package estudos;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class EstruturaDadosEstudos {

    public static void Pilha() {
//push(E item): Adiciona um item ao topo da pilha.
//pop(): Remove o item do topo da pilha e o retorna.
//peek(): Retorna o item no topo da pilha sem removê-lo.
//isEmpty(): Verifica se a pilha está vazia.

        Stack<Integer> pilha = new Stack<>();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);

        System.out.println(pilha.peek());  // Mostra 3
        pilha.pop();
        System.out.println(pilha.peek());  // Mostra 2
        System.out.println(pilha.isEmpty());  // false
    }

    public static void Fila() {
//offer(E e): Adiciona um item à fila.
//poll(): Remove e retorna o item da frente da fila.
//peek(): Retorna o item da frente da fila sem removê-lo.
//isEmpty(): Verifica se a fila está vazia.

        Queue<Integer> fila = new LinkedList<>();
        fila.offer(1);
        fila.offer(2);
        fila.offer(3);

        System.out.println(fila.peek());  // Mostra 1
        fila.poll();
        System.out.println(fila.peek());  // Mostra 2
        System.out.println(fila.isEmpty());  // false
    }

    public static void deque() {
//addFirst(E e): Adiciona um item no início da fila.
//addLast(E e): Adiciona um item no final da fila.
//removeFirst(): Remove o primeiro item da fila.
//removeLast(): Remove o último item da fila.
//peekFirst(): Retorna o primeiro item sem removê-lo.
//peekLast(): Retorna o último item sem removê-lo.

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(3);

        System.out.println(deque.peekFirst());  // Mostra 3
        System.out.println(deque.peekLast());   // Mostra 2
        deque.removeLast();
        System.out.println(deque.peekLast());   // Mostra 1

    }

    public static void lista() {
//add(E e): Adiciona um item ao final da lista.
//add(int index, E element): Adiciona um item em uma posição específica.
//get(int index): Obtém o item no índice especificado.
//remove(int index): Remove o item na posição especificada.
//size(): Retorna o número de elementos na lista.

        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(3, 4);

        System.out.println(lista.get(0));  // Mostra 1
        lista.remove(1);
        System.out.println(lista.size());  // Mostra 2
    }

    public static void set() {
//add(E e): Adiciona um item ao conjunto.
//remove(Object o): Remove um item do conjunto.
//contains(Object o): Verifica se o conjunto contém o item.
//size(): Retorna o número de elementos no conjunto.

        Set<Integer> conjunto = new HashSet<>();
        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(3);

        System.out.println(conjunto.contains(2));  // true
        conjunto.remove(2);
        System.out.println(conjunto.contains(2));  // false
    }

    public static void mapa() {
//put(K key, V value): Adiciona um par chave-valor.
//get(Object key): Obtém o valor associado à chave.
//remove(Object key): Remove a chave e o valor associado.
//containsKey(Object key): Verifica se a chave está presente no mapa.

        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("um", 1);
        mapa.put("dois", 2);

        System.out.println(mapa.get("um"));  // Mostra 1
        mapa.remove("dois");
        System.out.println(mapa.containsKey("dois"));  // false
    }
}

/*1. Pilha (Stack)
A pilha é uma estrutura de dados do tipo LIFO (Last In, First Out), 
onde o último item a ser inserido é o primeiro a ser removido.

push(E item): Adiciona um item ao topo da pilha.
pop(): Remove o item do topo da pilha e o retorna.
peek(): Retorna o item no topo da pilha sem removê-lo.
isEmpty(): Verifica se a pilha está vazia.
search(Object o): Retorna a posição do item na pilha (onde o topo da pilha é 1).


2. Fila (Queue)
A fila é uma estrutura de dados do tipo FIFO (First In, First Out), 
onde o primeiro item a ser inserido é o primeiro a ser removido.

offer(E e): Adiciona um item à fila.
poll(): Remove e retorna o item da frente da fila.
peek(): Retorna o item da frente da fila sem removê-lo.
isEmpty(): Verifica se a fila está vazia.


3. Deque (Double-Ended Queue)
O Deque é uma estrutura de dados que permite inserção 
e remoção de elementos tanto nas extremidades (início quanto final).

Usando a interface Deque e implementações como ArrayDeque:

addFirst(E e): Adiciona um item no início da fila.
addLast(E e): Adiciona um item no final da fila.
removeFirst(): Remove o primeiro item da fila.
removeLast(): Remove o último item da fila.
peekFirst(): Retorna o primeiro item sem removê-lo.
peekLast(): Retorna o último item sem removê-lo.


4. Lista (List)
A Lista é uma estrutura de dados que armazena elementos de forma ordenada, onde os itens podem ser acessados por índice.

add(E e): Adiciona um item ao final da lista.
add(int index, E element): Adiciona um item em uma posição específica.
get(int index): Obtém o item no índice especificado.
remove(int index): Remove o item na posição especificada.
size(): Retorna o número de elementos na lista.

5. Conjunto (Set)
O Set é uma coleção que não permite elementos duplicados.
Usando a interface Set e implementações como HashSet ou LinkedHashSet:

add(E e): Adiciona um item ao conjunto.
remove(Object o): Remove um item do conjunto.
contains(Object o): Verifica se o conjunto contém o item.
size(): Retorna o número de elementos no conjunto.

6. Mapa (Map)
O Mapa é uma estrutura de dados que armazena pares de chave-valor.

Usando a interface Map e implementações como HashMap ou TreeMap:
put(K key, V value): Adiciona um par chave-valor.
get(Object key): Obtém o valor associado à chave.
remove(Object key): Remove a chave e o valor associado.
containsKey(Object key): Verifica se a chave está presente no mapa.

 */
