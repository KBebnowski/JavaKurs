package Part29_Upcasting_and_Downcasting;

import Part22_Inheritance.Machine;

class Roslina{

    void grow(){
        System.out.println("Roslina rosnie");
    }

}

class Drzewo extends Roslina{
    @Override
    void grow() {
        System.out.println("Drzewo rosnie");
    }

    void Zywica(){
        System.out.println("Jestem nierozpuszczalna w wodzie");
    }

}


public class app {

    public static void main(String[] args) {

        Roslina roslina1 = new Drzewo();

        //upcasting
        roslina1.grow();
        //roslina1.Zywica(); w upcastingu nie mozna tak robic

        //downcasting
        Drzewo drzewo = (Drzewo) roslina1;
        drzewo.Zywica();//mozna


        ((Drzewo) roslina1).Zywica();//tak tez mozna



        //Wyswietli blad poniewaz roslina2= new Roslina() a nie new Drzewo();
        Roslina roslina2 = new Roslina();
        //Drzewo drzewo2 = (Drzewo) roslina2;
        //drzewo2.Zywica();
    }

}
