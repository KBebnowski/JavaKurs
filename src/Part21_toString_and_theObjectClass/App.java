package Part21_toString_and_theObjectClass;

import javax.management.StringValueExp;

class klasa { //ma te same metody co Object, kazda klasa dziedziczy po klasie Obiekt

    private int id;
    private String name;

    public klasa(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);

        return sb.toString();
    }
}


public class App {
    public static void main(String[] args) {
        Object obj = new Object();
        obj.toString();

        klasa obj1 = new klasa(1, "Maja");
        obj1.toString();

        System.out.println(obj1);  //wyswietli nazwe klasy i jej hashcode (przed dodaniem metody toString do klasy i przed stworzeniem konstruktora)
                                    //po stworzeniu metody i konstruktora wyswietli w konsoli napis 1: Maja



    }

}
