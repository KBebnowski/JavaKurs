package Part32_AnonymousClasses;

class Machine{
    public void start() {
        System.out.println("Machine starting");
    }
  public void stop(){
      System.out.println("stop");
  }
}

interface Plant{
    public void grow();
}

class Grass implements Plant{

    @Override
    public void grow() {
        System.out.println("I am Plant");
    }
}

public class app {

    public static void main(String[] args) {

    //Anonimowa klasa przeciaza jakas metode juz wczesniej stworzonej klasy. Nie jest ona obiektem tej klasy lecz jakims jej dzieckiem.
        // W interfejsach nie mozna tworzyc obiektu, chyba ze tworzysz inna klase ktora extends, dziedziczy po klasie interfejs, jednak jesli nie chcesz tworzyc nowej klasy tylko po to to uzwasz klasy anonimowej
        Machine machine = new Machine(){ //to juz nie jest klasa Machine, to jakies dziecko klasy Machine, poniewaz metoda start jest inna.
            @Override                    //Klasa ta nie ma nazwy, dlatego nazywa sie anonimowa
            public void start() {
                System.out.println("Camera starting");
            }
        };
        machine.start();//przeciazy metode tylko w obiekcie machine
        machine.stop();

        Machine machine2 = new Machine();
        machine2.start();//zwykla metoda klasy Machine

/*---------------------------------------------------------------------------------------------------------------------------------------*/System.out.println();
        //Plant plant = new Plant(); - tak nie mozna pisac poniewaz interaface nie moze byc obiektem
        //Mozna stworzyc klase, napisac implements interface Plant i w tej klasie opisac metode grow()
        Grass grass = new Grass();
        grass.grow();


        //Mozna tez uzyc anonimowej klasy
        Plant plant = new Plant() {
            @Override
            public void grow() {
                System.out.println("I am not class Grass");
            }
        };
        plant.grow();//wywolanie metody

//wyrazenia lambda to skrocenie czytelnosci kodu klasy anonimowej
Plant plant2 =() ->{
        System.out.println("goerge");
};
plant2.grow();

    }

}
