package Collections10_UsingIterators;

import java.util.Iterator;
import java.util.LinkedList;

public class App {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();//linkedlist poniewaz usuwa sie szybciej elementy niz w arraylist

        linkedList.add("Dog");
        linkedList.add("Fox");
        linkedList.add("Cat");
        linkedList.add("Tiger");
        linkedList.add("Hamster");


        //w taki spobo mozna usuwac w petlach elementy z listy
        Iterator<String> it = linkedList.iterator();//jesli zamiast iterator() uzyjemy ListIterator to bedziemy mieli dostepne metody previous i add

        while (it.hasNext()){
            String value = it.next();
            System.out.println(value);

            if(value.equals("Cat")){
                it.remove();
            }
        }

        System.out.println("\nPo usunieciu Cat \n");


        //ten sposob tego nie umozliwia
        for(String animal: linkedList){
            System.out.println(animal);
        }

    }
}
