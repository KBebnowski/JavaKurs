package Collections8_NaturalOrderingandtheComparableInterface;


import java.util.*;

class Person implements Comparable<Person>{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    //ta metoda sprawia ze sortuje sie list i set w zaleznosci od return
    @Override
    public int compareTo(Person person) {
        //return -name.compareTo(person.name);
        int len1 = name.length();
        int len2 = person.name.length();
        if(len1>len2){
            return 1;
        }
        else if(len1<len2){
            return -1;
        }
        else
        return name.compareTo(person.name);//nie moglo byc return 0, poniewaz nie wyswietlal wszystkich obiektow, nastapil konflik miedzy equals i compareTo
                                           //jesli wyrazy beda mialy taka sama dlugosc to porownaj wzgledem alfabetu
    }
}

public class AppOnMyObject {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        SortedSet<Person> sortedSet = new TreeSet<>();

        addElements(list);
        addElements(sortedSet);//musi byc hashCode i equals

        Collections.sort(list);//sortuje liste, tylko dzieki implements Comparable i metodzie CompareTo

        showElements(list);
        System.out.println("\n");
        showElements(sortedSet);
    }

    private static void addElements(Collection<Person> col){
        col.add(new Person("Sue"));
        col.add(new Person("Bob"));
        col.add(new Person("Joshua"));
        col.add(new Person("Jordan"));
    }

    private static void showElements(Collection<Person> col){
        for(Person person: col){
            System.out.println(person);
        }
    }

}
