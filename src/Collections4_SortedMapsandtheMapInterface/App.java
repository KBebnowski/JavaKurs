package Collections4_SortedMapsandtheMapInterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Temp{};

public class App {

        public static void main(String[] args) {
            //Moze ale nie musi byc posortowana
            Map<Integer, String> hashMap = new HashMap<>();
            //Posortowana jest w sposob kolejnosci dodania
            Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
            //Posortowana wzgledem klucza, naturalne uporzadkowanie
            Map<Integer, String> treeMap = new TreeMap<>();

            System.out.println("HashMap order");
            testMap(hashMap);
            System.out.println();
            System.out.println("LinkedHashMap order");
            testMap(linkedHashMap);
            System.out.println();
            System.out.println("TreeMap order");
            testMap(treeMap);
            System.out.println();

//--------------------------------------------------------------------------------------------------------------------------
            //HashCode, czyli kod po ...Temp@ sluzy do przechowywania rzeczy w HashMap
            System.out.println("HashCode, czyli kod po ...Temp@ sluzy do przechowywania rzeczy w HashMap");
            System.out.println(new Temp());
        }


        public static void testMap(Map<Integer, String> map){
            map.put(9, "nine");
            map.put(4, "four");
            map.put(8, "eight");
            map.put(1, "one");
            map.put(0, "zero");
            map.put(15, "fifteen");
            map.put(6, "six");

            for(Integer key: map.keySet()){
                String value = map.get(key);
                System.out.println(key + ": " + value);
            }
        }
}
