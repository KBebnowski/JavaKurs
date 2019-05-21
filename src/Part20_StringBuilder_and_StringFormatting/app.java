package Part20_StringBuilder_and_StringFormatting;

public class app {

    public static void main(String[] args) {

        //konkatynacja - Mozna robic przy krotkich programach w wiekszych programach NIEWYDAJNE
        String info = "";
        info += "Hi";
        info += " ";
        info += "George";

        System.out.println(info);


        //Bardziej wydajne - StringBuilder i StringBuffer(jest klasa zsynchronizowana tzn taka która zapewnia, że kilka wykonujących się wątków nie będzie równocześnie wykonywać tego samego kodu, w szczególności - działać na tym samym obiekcie.)
        StringBuilder sb = new StringBuilder("");
        sb.append("Hi");
        sb.append(" ");
        sb.append("Sue");

        System.out.println(sb);
        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();
        s.append("Sorry").append(" ").append(" did i know u guys?"); //mozna tak pisac poniewaz append zwraca referencje do s
        System.out.println(s);
        System.out.println(s.toString());//to string zeby uzyskac stringa


/*------------------------------------------------------------------------------------------------------------------------------------------*/System.out.println("\n");

        //formatowanie
        System.out.print("There is \t a big \n dog");
        System.out.println();
        System.out.printf("There are %d %s\n", 5, "dogs");

        System.out.printf("%2d cats\n", 3);
        System.out.printf("%-2d cats", 3);

        System.out.println();

        for(int i=0; i<20; i++){
            System.out.printf("%2d: some text\n", i); //od 1 do 9 ustawi blizej :
        }
        for(int i = 0; i<20; i++){
            System.out.printf("%-2d: some text\n", i); //od 1 do 9 ustawi blizej krawedzi niz :
        }

        System.out.printf("%.2f \n ", 1.123131); //liczba po kropce wskazuje ile ma byc miejsc po przecinku, zaokragla liczbe
        System.out.printf("%3.2f", 1.123131); //liczba przed kropka wskazuje ile miejsc ma byc w liczbie calkowitej


    }
}
