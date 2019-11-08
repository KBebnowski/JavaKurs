package Part19_Static_and_Final;

class Thing{
//zmienne sa publiczne dla latwiejeszego zrozumienia problemu

    public String name;
    public static String forename;

    public final static int LUCKY_NUMBER=7;

    public static int count=0;
    public int Id;
    public Thing(){
        Id=count;
        count++; //licznik bedzie sie zwiekszal z kazdym stworzonym obiektem
    }


    public void showName(){
        System.out.println(name);
        System.out.println(forename); // - zwykla metoda moze przyjmowac zmienna statyczna
    }

    public static void showForename(){
        System.out.println(forename);
        //System.out.println(name); - metoda static nie moze przyjmowac nie statycznej zmiennej
    }

    public void showId(){
        System.out.println(Id);
    }

}




public class java {
    public static void main(String[] args) {

        //jesli pole lub metoda jest static mozna odwolywac sie do niej nie tworzac obiektu klasy

        Thing.forename="Kowalski";

        Thing Thing1 = new Thing();
        Thing1.forename="Kowalski";

        //Thing.name="Jan"; - nie zadziala bo pole nie jest static
        Thing1.name="Jan";//trzeba stworzyc obiekt

        System.out.println(Thing.forename);
        System.out.println(Thing1.forename);
        System.out.println(Thing1.name);

        Thing.showForename();
        Thing1.showName();
        Thing1.showForename();

        /*---------------------------------------------------------------------------------------------------------------------------------------------*/ System.out.println("\n");


        System.out.println(Math.PI); //przyklad uzycia PI jakos pola static w klasie Math
        //Math.PI=1.3232; - nie mozna zmienic wartosci PI poniewaz jest oznaczone jako final (const-stala)
        //zmienne final pisane sa w javie z wielkich liter.

        System.out.println(Thing.LUCKY_NUMBER);

        /*-------------------------------------------------------------------------------------------------------------------------------------------*/ System.out.println("\n");

        Thing Thing2 = new Thing();

        Thing1.showId();
        Thing2.showId();

    }
}
