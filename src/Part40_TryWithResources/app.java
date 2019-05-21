package Part40_TryWithResources;

import java.io.*;

public class app {

    public static void main(String[] args) {

        File file = new File("text.txt");

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {//tak piszac sam zamyka plik
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find file " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to open file " + file.toString());
        }


    }


}
