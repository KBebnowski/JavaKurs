package Collections9_Queues;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {

    public static void main(String[] args) {
        // (head) <- ooooooooooooooooooooooooo <- (tail), first in first out (FIFO)

// Queue dokumentacja, tabela
// 1. Throws exception: add(), remove(), element()

        //////////DODAWANIE ELEMENTOW////////////////
        Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);//ArrayBlockingQueue posiada koniec kolejki -> dokumentacja Queue
        //Queue<Integer> q1 = new LinkedList<>();//LinkedList nie ma konca kolejki
        q1.add(10);
        q1.add(20);
        q1.add(30);
        //Nie mozna dodac wiecej elementow niz zadeklarowalismy
        try{
            q1.add(40);
        }catch (IllegalStateException e){
            System.out.println("Add to many items to the queue");
        }

        //////////WYSWIETLANIE ELEMENTOW////////////////
        for(Integer value: q1){
            System.out.println("Queue value: " + value);
        }

        //////////POCZATEK ELEMENTOW////////////////
        System.out.println("Head of queue is: " + q1.element());
        //Jesli uzylibysmy metody przed dodaniem elementow, otrzyamlibysmy wyjatek - Throws NoSuchElement exception - brak elementow w q1

        //////////USUWANIE ELEMENTOW////////////////
        Integer value;
        value = q1.remove();//zostanie usuniety 1 element (FIFO)
        System.out.println("Remove from queue " + value);
        //Usuwanie pozostalych elementow
        System.out.println("Remove from queue " + q1.remove());
        System.out.println("Remove from queue " + q1.remove());
        //Nie mozna usuwac elementow, ktore nie znajduja sie w q1
        try {
            System.out.println("Remove from queue" + q1.remove());
        }catch(NoSuchElementException e){
            System.out.println("Try to remove to many items from queue");
        }

//-----------------------------------------------------------------------------------------------------------------------------------------------
//2.Returns special value: offer(), poll(), peek()

        //////////DODAWANIE ELEMENTOW////////////////
        Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);
        q2.offer(10);
        q2.offer(20);
        q2.offer(30);
        //Mozna dodac wiecej elementow niz zadeklarowalismy, poniewaz jesli jest za duzo to zostanie zwrocona wartosc false
        System.out.println(q2.offer(30)); // zwroci false

        //////////WYSWIETLANIE ELEMENTOW////////////////
        for(Integer val: q2){
            System.out.println("Queue 2 value: " + val);
        }

        //////////POCZATEK ELEMENTOW////////////////
        System.out.println("Head of queue 2 is: " + q1.peek());//zwroci null, poniewaz w q1 zostala uzyta metoda add, a peek z nia z nie wspolpracuje
        System.out.println("Head of queue 2 is: " + q2.peek());//offer->peek, add->element()
        //Jesli uzylibysmy metody przed dodaniem elementow, otrzyamlibysmy wyjatek - Throws NoSuchElement exception - brak elementow w q1

        //////////USUWANIE ELEMENTOW////////////////
        //System.out.println("Remove from queue" + q2.remove());//w przeciwienstwie do peek wspolpracuje
        System.out.println("Remove from queue 2 " + q2.poll());
        System.out.println("Remove from queue 2 " + q2.poll());
        System.out.println("Remove from queue 2 " + q2.poll());

        //podinterfejs BlockingQueues zawiera kolejne metody, m.in. put()-zachowuje dodana wartosc poki nie zwolni sie miejsce w kolejce, itp. ->dokumentacja
    }
}
