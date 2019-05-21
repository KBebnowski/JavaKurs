package Part35_ThrowingExceptions;

import java.io.IOException;

public class app {

    public static void main(String[] args) {

        Test test = new Test();
        try {
            test.start();
        } catch (IOException e) {
            System.out.println("Blad");//wyswietli to co tutaj napisane
            System.out.println(e.getMessage());//wyswietli to co napisane jest w throws w klasie Test
            e.printStackTrace();//pokaze o jaki blad chodzi
        }

        try {
            test.stop();//metoda ktora zawiera ServerException - klase stworzona przez nas samych
        } catch (ServerException e) {
            System.out.println(e.getMessage());
        }

    }



}
