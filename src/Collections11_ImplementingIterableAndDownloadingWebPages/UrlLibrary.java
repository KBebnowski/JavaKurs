package Collections11_ImplementingIterableAndDownloadingWebPages;

import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String> {

    private LinkedList<String> urls = new LinkedList<>();//zamiast <String> moze byc podane cokolwiek

    public UrlLibrary() {
        urls.add("facebook.pl");
        urls.add("pudelek.pl");
        urls.add("meczyki.pl");
    }


    //Nalezy zwrocic obiekt Iterator, a taki obiekt posiada metody next hasnext i remove
    @Override
    public Iterator<String> iterator() {
        return urls.iterator();//najprosciej uzyc iteratora ktory juz istnieje
    }
}
