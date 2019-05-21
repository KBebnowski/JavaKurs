package Part33_ReadingTextFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class app {
    public static void main(String[] args) throws FileNotFoundException {//FileNotFoundException sprawdza czy dany plik istnieje jesli nie wyswieli blad

//1.podwojny backslash bo inaczej dzialac moga specjalne znaki jak \n,
//3.zwykly slash
//4.Jesli plik znajduje sie w folderze projektu to nazwa pliku
        String fileName1 = "C:\\Users\\Kamil\\IdeaProjects\\Javakurs\\text.txt";
        //String fileName2 = "C:\Users\Kamil\IdeaProjects\Javakurs"; - blad
       String fileName3 = "C:/Users/Kamil/IdeaProjects/Javakurs/text.txt";
       String fileName4 = "text.txt";//plik znajduje sie w folderze Javakurs

        File textFile = new File(fileName4);
        Scanner in = new Scanner(textFile);


        //Wyswietli tylko liczby z tekstu
        try {
            do {
                while (!in.hasNextInt()) {
                    in.next();
                }

                int liczba = in.nextInt();

                System.out.println(liczba);
            }while (in.hasNext());

        } catch(NoSuchElementException a)
        {
            System.out.println("To byly wszystkie liczby calkowite");
        }



        //Wyswietli caly tekst
        /*while(in.hasNextLine()){//czyta po kolei znaki
            String line = in.nextLine();
            System.out.println(line);
        }
*/
        in.close();//pamietaj zawsze o zamknieciu!





    }

}
