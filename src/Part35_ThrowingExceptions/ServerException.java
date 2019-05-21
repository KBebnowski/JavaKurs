package Part35_ThrowingExceptions;

public class ServerException extends Exception {//Mozna samemu tworzyc klasy ktore dziedzicza po Exception


    public ServerException(String message) {
        super(message);
    }
}
