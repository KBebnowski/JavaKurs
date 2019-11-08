package Part23_Interfaces;

public class Person implements Info, Answer{

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void grid(){
        System.out.println("hello there");
    }

    @Override
    public void showInfo() {
        System.out.println("Person name is: " + name);
    }

    @Override
    public void option1() {
        System.out.println("A: Yes");
    }

    @Override
    public void option2() {
        System.out.println("B: No");
    }
}
