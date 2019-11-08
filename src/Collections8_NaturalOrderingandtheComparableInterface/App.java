package Collections8_NaturalOrderingandtheComparableInterface;

import java.util.*;

public class App {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Set<String> set = new TreeSet<>();

        addElements(list);
        addElements(set);

        Collections.sort(list);

        showElements(list);
        System.out.println();
        showElements(set);
    }

    private static void addElements(Collection<String> col){
        col.add("Joe");
        col.add("Sue");
        col.add("Bob");
        col.add("Caitlyn");
    }

    private static void showElements(Collection<String> col){
        for(String element: col){
            System.out.println(element);
        }
    }

}
