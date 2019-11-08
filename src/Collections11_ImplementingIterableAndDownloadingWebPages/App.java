package Collections11_ImplementingIterableAndDownloadingWebPages;

public class App {

    public static void main(String[] args) {

        UrlLibrary urlLibrary = new UrlLibrary();

        //nie bylo to wczesnie mozliwe bez implementacji interfejsu Iterable, ktory wymusil przeciazenie metody Iterator
        for(String url: urlLibrary) {
            System.out.println(url);
        }

        UrlLibrary2 urlLibrary2 = new UrlLibrary2();

        for(String html: urlLibrary2){
            System.out.println(html.length());
            System.out.println(html);
        }

    }
}
