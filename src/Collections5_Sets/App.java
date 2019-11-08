package Collections5_Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

    public static void main(String[] args) {

        //HashSet nie jest uporzadkowany
        Set<String> hashSet = new HashSet<>();
        hashSet.add("dog");
        hashSet.add("lion");
        hashSet.add("cat");
        //Set przechowuje tylko unikalne wartosci
        hashSet.add("cat");//nie wnosi nic do kodu
        System.out.println("Zawartosc HashSet" + hashSet + "\n");

        //LinkedHashSet pamieta kolejnosc w jakiej byly dodawane kolejne elementy
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("dog");
        linkedHashSet.add("lion");
        linkedHashSet.add("cat");
        System.out.println("Zawartosc LinkedHashSet" + linkedHashSet + "\n");

        //TreeSet elementy sa posortowane w naturalnej kolejnosci
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("dog");
        treeSet.add("lion");
        treeSet.add("cat");
        System.out.println("Zawartosc TreeSet" + treeSet + "\n");

//---------------------------------------------------------------------------------------------
        ///////////////Iterations//////////////
        System.out.println("Wykorzystanie petli");
        for(String value: hashSet){
            System.out.println(value);
        }
        System.out.println();
//---------------------------------------------------------------------------------------------
        //////////////PRZYKLADOWE METODY///////////
        //////////////Contains////////////////
        System.out.println("Czy set posiada .... ?");
        if(treeSet.contains("dog")){
            System.out.println("treeSet posiada psa");
        }
        else if(treeSet.contains("mouse")){
            System.out.println("treeSet posiada mysz");//nie wyswietli nic
        }
        System.out.println();
        //////////////IsEmpty////////////////
        Set<String> set1 = new TreeSet<>();
        if(set1.isEmpty()){
            System.out.println("set1 nie posiada elementow");
        }
        set1.add("dog");
        System.out.println("Dodanie do set1 elementu" + set1);
        if(set1.isEmpty()){
            System.out.println("Teraz set posiada elementy");//warunek sie nie wykona
        }

    }
}
