package Part22_Inheritance; //dziedziczenie

public class app {

    public static void main(String[] args) {
        Machine m1 = new Machine();
        m1.start();
        m1.stop();

        Car c1 = new Car();
        c1.start();
        c1.stop();

        System.out.println(m1.numer);
        System.out.println(m1.liczba);

    }

}
