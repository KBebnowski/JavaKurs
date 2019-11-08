// W arrayList<String> uzylismy wlasnych klas implemetujacych Comparator
// W arrayList<Integer> skorzystalismy z klas anonimowych, oraz wyrazen lambda
// W arrayList<Person> skorzystalismy z wyrazen lambda oraz klasy Person

package Collections7_SortingListsusingComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        int len1 = o1.length();
        int len2 = o2.length();
        if(len1>len2){
            return 1;
        }
        else if(len1<len2){
            return -1;
        }
        return 0;
    }
}

class AlphabeticalComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);//bez minusa jest to sortowanie naturalne
    }
}

public class App {

    public static void main(String[] args) {

        ////////////// SORTOWANIE WYRAZOW ///////////////////
        List<String> animals = new ArrayList<>();
        animals.add("lion");
        animals.add("elephant");
        animals.add("tiger");
        animals.add("hamster");
        //Collections.sort(animals);//naturalne sortowanie
        //Collections.sort(animals, new StringLengthComparator());//od najkrotszego wyrazu do najdluzszego (jesli zamienimy -1 z 1 to bez odwrotnie)
        //Collections.sort(animals, new AlphabeticalComparator());//naturalne sortowanie od konca
        for(String animal: animals){
            System.out.println(animal);
        }

        ////////////// SORTOWANIE LICZB ////////////////////
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(6);
        numbers.add(4);
        numbers.add(2);
        //Collections.sort(numbers);//naturalne sortowanie
        //metoda na wzor StringLengthComparator, TAK SZYBCIEJ
    /*    Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });*/
        numbers.sort((o1, o2)->-o1.compareTo(o2));//to samo co wyzej tylko krocej napisane za pomoca lambda
        for(Integer number: numbers){
            System.out.println(number);
        }

        /////////// SORTOWANIE OBIEKTOW /////////////////////
        List<Person> people = new ArrayList<>();
        people.add(new Person(3, "Henry"));
        people.add(new Person(1, "Joe"));
        people.add(new Person(4, "Bob"));
        people.add(new Person(2, "Steff"));
        //people.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));//sortuj wzgledem imienia
        //sortuj wzgledem id
        people.sort(((o1, o2) -> {
            if (o1.getId() > o2.getId()) return 1;
            else if(o1.getId()<o2.getId()) return -1;
            else return 0;
        }));

        for(Person person: people){
            System.out.println(person);
        }
    }
}
