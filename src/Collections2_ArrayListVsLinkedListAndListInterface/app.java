package Collections2_ArrayListVsLinkedListAndListInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class app {

    public static void main(String[] args) {

        // ArrayList zarzadza tablicami wewnatrz
        // [0][1][2][3][4][5]...
        // Jesli przy tworzeniu ArrayListy<>() nie podales wielkosci w nawiasach okraglych to standardowo jest to 10
        // po dodaniu 11 elementu elementu lista kopiuje tablice tworzy 20 elementowa tablice i wkleja poprzednia,
        // wiec dodawanie na koncu listy jest szybkie
        // jesli jest to w srodku listy to trzeba przesunac wszystkie pozostale a to kosztuje nas wiecej czasu
        List <Integer> arrayList = new ArrayList<>();

        // LinkedList składa się z elementów, w których każdy element ma odniesienie do poprzedniego i następnego elementu
        // [0]->[1]->[2]->[3]...
        //    <-   <-   <-   ...
        // strzalki sa referencjami do kolejnych i poprzednich elementow
        // aby dodac kolejne elementy musisz przesuwac sie po kolei po elementach zeby dostac sie do nastepnych
        // wiec jesli dodajesz element na koncu listy to trwa to dluzej
        // natomiast jesli dodajesz na poczatku listy lub w srodku kolejny element to wykona sie o wiele szybciej niz dla ArrayList
        List <Integer> linkedList = new LinkedList<>();

        // Metoda doTimings porownuje czas dodawania na koncu listy lub w srodku list kolejnych elementow dla ArrayList i LinkedList
        doTimings("ArrayList", arrayList);
        doTimings("LinkedList", linkedList);
    }

    private static void doTimings(String typeList, List<Integer> list) {

        //1E5 - E5 to 5*10
        for(int i=0; i<1E5; i++){
            list.add(i);
        }

        long start = System.currentTimeMillis();

        //dodawanie elementow na koniec listy
        for(int i=0; i<1E5; i++){
            list.add(i);
        }

     /*   //dodawanie elementow gdziekolwiek w liscie
        for(int i=0; i<1E5; i++){
            list.add(0, i);
        }
*/
        long stop = System.currentTimeMillis();


        System.out.println("Tima taken: " + (stop-start) + " ms for " + typeList);

    }
}
