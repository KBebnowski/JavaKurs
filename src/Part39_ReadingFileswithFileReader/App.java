package Part39_ReadingFileswithFileReader;

import java.io.*;

public class App {


    public static void main(String[] args) {

        File file = new File("text.txt");

        BufferedReader br = null; //przypisalismy wartosc null poniewaz inaczej wyswietla blad w try przy zamknieciu

        try {
            FileReader fr = new FileReader(file); // 1 catch
            //BufferedReader br = new BufferedReader(fr);//BufferReader musi byc stworzony poza klamrami try poniewaz inaczej nie go zamkniemy
            br = new BufferedReader(fr);

            String line;

            // line = br.readLine(); // 2 catch, readLine zawszze czyta 1 linie, wiec zrobimy tak:

            while((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File don't found: " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file.toString());
        }

        finally {// finally wykona zawsze
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Unable to close file: " + file.toString());
            } catch (NullPointerException ex) {
                //Plik najprawdopodobniej nie zostal otwarty
            }
        }

    }



}
