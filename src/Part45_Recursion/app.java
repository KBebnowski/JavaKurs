package Part45_Recursion;

public class app {

    public static void main(String[] args) {

        int liczba = 4;
       // Silnia(liczba);
        System.out.println(Silnia(liczba));
    }

    private static int Silnia(int liczba) {


        int suma = liczba;

        if(liczba == 1){
            return liczba;
        }

        return Silnia(liczba-1) * suma;
      //  return Silnia(liczba-3) Silnia (liczba-2) Silnia(liczba-1) * suma; // tak to wyglada dla liczby 4

    }


}
