package Part43_InnerClasses;

import java.nio.ReadOnlyBufferException;

public class Robot {

    private int id;
    private static int idTest;

    private class Brain{//klasa wewnetrzna, ma dostep do pol klasy Robot. Aby byla widoczna dla pozostalych klas procz klasy Robot nalezy dodac static
        public void think(){
            System.out.println("Robot " + id + " is thinking.");
        }
    }

    public static class Battery{//ta klasa jest widoczna dla wszystkich klas, oraz oczywiscie nie moze przyjmowac zmiennych niestatycznych
        public void charge(){
            System.out.println("Battery charging..." );
            //System.out.println("Battery charging..." + id);   //id zmmienna nie static
            System.out.println("Batery charging ..." + idTest); //idTest zmienna static
        }
    }

    public Robot(int id) {
        this.id = id;
    }

    public void start(){
        System.out.println("Starting robot " + id);

        //Mozemy stworzyc obiekt klasy wewnetrznej w klasie w ktorej powstala
        Brain brain = new Brain();
        brain.think();


    //Mozna deklarowac klasy wewnetrzne w metodach

        String name = "Robert";
        class Temp{ //nie moze byc ani public ani private ani protected, typ dostepu zalezy od metody w ktorej sie znajduje
            public void doSomething(){
                System.out.println("ID is: " + id);
                System.out.println("My name is " + name);
            }
        }

        Temp temp = new Temp();
        temp.doSomething();

    }
}
