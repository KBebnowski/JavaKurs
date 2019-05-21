package Part41_WritingTextFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class app {

    public static void main(String[] args) {

//Podobnie do BufferedReader - poprzedni Part

        try(BufferedWriter br = new BufferedWriter(new FileWriter(new File("text.txt")))) {
            br.write("Nowa linia");
            br.newLine();
            br.write("Ostatnia linia");
        } catch (IOException e) {
            System.out.println("Unable to read file.");
        }
    }
}
