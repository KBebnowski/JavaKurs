package Part36_MultipleExceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Test {

    public void run() throws IOException, ParseException {

        int stan = 0;
        if (stan == 1) {
            throw new IOException();
        }
        if (stan == 2) {
            throw new ParseException("Error in command list.", 2);
        }
    }


    public  void stop() throws IOException, FileNotFoundException{
        int stan = 0;
        if (stan == 1) {
            throw new IOException("Zle");
        }
        if (stan == 2) {
            throw new FileNotFoundException("Error in command list.");
        }
        System.out.println("Proces zakonczony pomyslnie");
    }
}
