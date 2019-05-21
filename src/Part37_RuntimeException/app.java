package Part37_RuntimeException;

public class app {

    public static void main(String[] args) {

/*
        int liczba = 7/0;
        System.out.println(liczba);         // nie trzeba pisac catch, on juz jakby istnieje, nazywa sie to Runtime Exception.
                                            // Kazdy taki wyjatek ktory dziedziczy po RunTime Exception nie wymaga pisania wlasnego catcha
                                            //ArithmeticException
*/

/*
        String tekst = null;
        System.out.println(tekst.length()); //Zlapie wyjatek poniewaz tekst jest rowny null wiec jest to tylko referencja ktora
                                            //wskazuje na null wiec nie jest stworzony obiekt
                                            //NullPointerException
*/

/*
        String [] tab = {"one", "two", "three"};
        System.out.println(tab[3]);         //ostatni indeks tablicy jaki jest stworzony przez nas to 2
                                            // ArrayIndexOutOfBoundsException
*/

        /*String[] tab = {"one","two","three"};

        try{
            System.out.println(tab[3]);
        }catch(Exception e){
            System.out.println(e.toString());  //wyswietli to co wyzej
            System.out.println(e.getMessage());//cos innego, mozemy tak szukac bledu
        }*/

    }

}
