package NivelIntermediario.List;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> idades = new Stack<>();
        idades.push(10);
        idades.push(20);
        idades.push(30);


        System.out.println(idades.peek());
        System.out.println(idades.pop());
        System.out.println(idades.pop());
        System.out.println(idades.pop());
        System.out.println(idades.size());
        System.out.println("idades = " + idades);

        Queue<String> queue = new LinkedList<>();
        queue.add("Lucas");
        queue.add("Erike");

        System.out.println("queue = " + queue);
        queue.poll();
        System.out.println("queue = " + queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println("queue.isEmpty() = " + queue.isEmpty());
    }
}
