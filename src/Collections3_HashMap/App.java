package Collections3_HashMap;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        //Key and Value
        //HashMap nie jest posortowana, moze zdarzyc sie tak, ze nie bedzie posortowana
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        String text = map.get(2);//Two
        System.out.println(text);

        text = map.get(6);//wyswietli null, bo nie ma w mapie takiego klucza
        System.out.println(text);

        //Drugi put nadpisuje poprzedni, dlatego sout wyswietli NewTwo a nie Two, elementy w map sa unikalne
        map.put(2,"NewTwo");
        System.out.println(map.get(2));

        int key;
        String value;
        for(Map.Entry<Integer, String> entry: map.entrySet()){
            key = entry.getKey();
            value = entry.getValue();

            System.out.println(key + ": "+ value);
        }


    }
}
