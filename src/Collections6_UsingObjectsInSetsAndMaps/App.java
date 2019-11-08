package Collections6_UsingObjectsInSetsAndMaps;

// Elementy w set i map sa unikalne
// Obiekty tez tylko pod warunkiem, ze dodamy do klas metody equals i hashCode.
// Bez tych metod jesli maja stworzony obiekt person1 i person2 to dla nich sa to inne wartosci, set i map przestaja przechowywac wtedy wartosci unikalne

import java.util.*;

class Person{
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}

public class App {

    public static void main(String[] args) {

        Person person1 = new Person(1, "Marek");
        Person person2 = new Person(2, "Jurek");
        Person person3 = new Person(3, "Stefan");
        Person person4 = new Person(4, "Wladek");
        Person person5 = new Person(1, "Marek");// takie same wartosci jak person1

        Set<Person> set = new LinkedHashSet<>();
        set.add(person1);
        set.add(person2);
        set.add(person3);
        set.add(person4);
        set.add(person5);
        System.out.println(set);

        Map<Person, Integer> map = new LinkedHashMap<>();
        map.put(person1, 1);
        map.put(person2, 2);
        map.put(person3, 3);
        map.put(person4, 4);
        map.put(person5, 5);//nadpisze person1, 1
        for(Person key: map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }




    }
}
