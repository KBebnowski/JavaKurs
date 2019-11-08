package Part23_Interfaces;

public class App {
    public static void main(String[] args) {

        Machine mach1 = new Machine();
        mach1.start();

        Person person1 = new Person("Joe");
        person1.grid();


        //Info info1 = new Info(); // - tak nie mozna

        Info info1 = new Info() {
            @Override
            public void showInfo() {
                System.out.println("da sie stworzyc w taki sposob");
            }
        };
        info1.showInfo();

        Info info2 = new Machine();//tak mozna poniewaz Machine implementuje interfejs Info
        info2.showInfo();
        ((Machine) info2).start();


        Info info3 = person1;
        info3.showInfo();


        Answer answer1 = new Person("Steff");
        Answer answer2 = person1;
        outputInfo(answer1);//mozemy przeslac answer1 poniewaz implementuje interfejs Answer
        outputInfo(answer2);// tak tez mozna
        //outputInfo(info3);// tak nie mozna

    }

    //TO SPOSOB JAK UZYC TYLKO JEDNEJ METODY Z INTERFEJSU, LUB 2 Z 5 ETC.
    //static zeby uzyc jej nie ma obiektu App
    //jesli bylyby 2 metody w intefejsie info moglibysmy wywolac tylko jedna
    private static void outputInfo(Answer answer){
        answer.option1();
    }
}
