package Part36_MultipleExceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class app {

    public static void main(String[] args)// throws IOException, ParseException - 1 sposob
    {

        Test test = new Test();

        //2 sposob
    /*
        try {
            test.run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    */


        //3 sposob
        try {
            test.run();
        } catch (IOException | ParseException e) { //multicatch
            e.printStackTrace();
        }

    //Po nacisnieciu alt+enter nie tworzy 2 catchow tylko 1
    //Sami musimy napisac 2 catcha, ktory musi byc nad IOException poniewaz dziedziczy po nim, jest jego dzieckiem.
    //Taka kolejnosc jest zawsze zachowywana
        try {
            test.stop();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Multicatch w tym przypadku nie zadziala
        /*try {
            test.stop();
        } catch (FileNotFoundException | IOException e) {
            e.printStackTrace();
        }*/

    }


}
