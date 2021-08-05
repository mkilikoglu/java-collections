package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        //ilk giren ilk çıkar. giriş sırasına bakar.
        //element() Kuyruğun başındaki elemanı verir
        //offer(E,O)  girilen ögeyi kuyruğa ekler
        //peek() Kuyruğun başındaki elemanı verir, boş ise  null döner
        //pool() kuyruğun başındaki elemanı verir, kuyruktan çıkarır kuyruk boş işe null döner
        //remove() kuyruğun başındaki elemanı verir ve kuyruktan çıkarır


        Queue<String> queue = new LinkedList<>();//polipormphism
        queue.add("Osman");
        queue.add("Hakan");
        queue.add(null);




        queue.forEach(i->System.out.println(i));
        System.out.println("-------------");
        queue.offer("Veli");
        queue.offer("Mehmet");


        queue.forEach(i->System.out.println(i));
        System.out.println("-------------");
        queue.remove();

        queue.forEach(i->System.out.println(i));
        System.out.println("-------------");
        queue.element();
        System.out.println(" ELement() En baştaki "+queue.element());
        System.out.println("-------------");

        System.out.println("Peek "+  queue.peek());
        System.out.println("-------------");

        System.out.println("Poll "+  queue.poll());
        System.out.println("-------------");
        System.out.println(" ELement() En baştaki "+queue.element());
        System.out.println("-------------");

    }
}
