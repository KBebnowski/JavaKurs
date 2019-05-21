package Part42_Equals;

import java.util.Objects;

class Person{
    int id;
    String name;

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


//Te dwie przeciazone metody sprawdzaja czy jest to samo id i name (mozna ustawic zeby sprawdzal np. tylko po id)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class app {

    public static void main(String[] args) {

        System.out.println(new Object());//Po @ wyswietla hashCode ktory powinien byc unikalny i tak najczesciej jest,
                                         //Jest to wartosc zwracana przez metode hashCode

            Person person1 = new Person(1, "Arek");
            Person person2 = new Person(2, "Mateusz");

        System.out.println(person1==person2); //False
                                              //== wskazuje tylko czy 2 referencje wskazuja na te sam obiekt, nie porownuje wartosci

            Person person3 = new Person(3, "Jan" );
            Person person4 = new Person(3, "Jan" );

        System.out.println(person3==person4);//Tez wyswietli False poniewaz to sa inne obiekty, mimo ze maja te same wartosci

            person1=person2;

        System.out.println(person1==person2);//Teraz wyswietli true

        System.out.println(person3.equals(person4));//Wyswietli false jesli nie ma przeciazonej metody w klasie Person
                                                    //Teraz wyswietla True, poniewaz mamy ta metode przeciazona


/*-----------------------------------------------------------------------------------------------------------------------------------*/System.out.println();
        double value11=7.2;//double to typ a Double obiekt typu double
        double value22=7.2;
        System.out.println(value11==value22);//True
       //System.out.println(value11.equals(value22));// nie mozna uzyc metody equals poniewaz to nie jest obiekt tylko typ

        Double value1=7.2;
        Double value2=7.2;
        System.out.println(value1==value2);//False
        System.out.println(value1.equals(value2));//True

        Integer number1 = 3;
        Integer number2 = 3;
        System.out.println(number1==number2);//W tym przypadku wyswietli True
        System.out.println(number1.equals(number2));//True, bezpieczniejsza metoda equals

//Na podstawie String'ow pokaze ze lepiej uzywac metody .equals niz ==
        String s1 = "Dom";
        String s2 = "Domasda".substring(0,3);

        System.out.println(s1==s2);//False, zle
        System.out.println(s1.equals(s2));//True, dobrze





    }




}
