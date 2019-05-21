package Part35_ThrowingExceptions;

import java.io.IOException;

public class Test {


    public void start() throws IOException{ //IOException jest klasa, https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/lang/Exception.html

        //status - wartosc zwrocona przez jakas metode
        //0 - success
        //0! - blad

        int status = 0;

        if(status!=0){
            throw new IOException("Something goes wrong");
        }
        System.out.println("Running...");

    }

    public void stop() throws ServerException{
        //status - wartosc zwrocona przez jakas metode
        //0 - success
        //0! - blad

        int status = 1;

        if(status!=0){
            throw new ServerException("Something goes wrong");
        }
        System.out.println("Stoped!");
    }
}
