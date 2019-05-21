package Part22_Inheritance;

public class Machine {

    int brak = 0; //dostep tylko w tym pakiecie
    public int numer = 2; //tak nie mozna pisac, dostep wszedzie, zmienna moze zostac zmieniona(dlatego nie wolno pisac bez final)
    public final int numerkoncowy = 3; // tak mozna pisac, dostep wszedzie
    protected int liczba = 4; //dziecko nawet jesli jest w innym pakiecie
    private int liczbaprywatna = 1; // tylko dostep w tej klasie

    public void start(){
        System.out.println("Machine started");
    }

    public void stop(){
        System.out.println("Machine stopped");
    }
}
