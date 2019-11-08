package Collections1_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        //Dodawanie
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        //Pozyskiwanie
        System.out.println(list.get(0));

        System.out.println("\n#Iteration 1: ");

        for (int i=0; i<list.size(); i++){   //list.size() ma nawiasy okragle a array.length nie ma
            System.out.println(list.get(i));
        }

        //Usuwa ostatni element - szybkie dzialanie
        list.remove(list.size()-1);
        //Usuwa pierwszy wiec musi pozostale kopiowac na poprzednie miejsca - wolne dzialanie
        list.remove(0);

        System.out.println("\n#Iteration 2: ");

        for (Integer value: list){
            System.out.println(value);
        }

        //List interface, nie mozna new List bo to nie klasa
        List<String> values = new ArrayList<String>();

    }
}
