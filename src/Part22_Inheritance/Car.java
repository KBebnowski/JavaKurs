package Part22_Inheritance;

public class Car extends Machine{

    @Override
    public void start() {//jesli napisze sie startd specjalnie zmieni nazwe metody to mozna sprawdzic czy jest dobrze przeciazona, podkresli wtedy override
        System.out.println("Car started"); //przeciazy metode z klasy po ktorej dziedziczy ale wyswietli to co napisane jest w metodzie w
                                            //klasie Car, czyli nie Machine started lecz Car started
    }

    @Override
    public void stop() {
        super.stop();//wyswietli to co w jest w metodzie w klasie po ktorej dziedziczy (po rodzicu)
        System.out.println(numer);
    }
}
