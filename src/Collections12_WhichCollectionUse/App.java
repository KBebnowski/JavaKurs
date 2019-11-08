package Collections12_WhichCollectionUse;

public class App {

        ///////////LIST/////////////////
        /*
         1. Np. Lista sklepowa
         2. Elementy moga sie powtarzac
         3. Elementy sa w takiej kolejnosci w jakiej zostaly dodane
         4. Nie sa posortowane naturalnie (a-z, 0-10) ale mozna je posortowac pozniej
         5. Indexy elementow sa integerami
         6. Sprawdzanie szczegolnego elementu na liście jest wolne, czyli na przyklad czy w liscie istnieje napis "Cat"
         7. Sprawdzanie po indexie jest szybkie
         8. Iterowanie jest szybkie
         9. Mozna posortowac elementy w liscie jesli chcemy
         10. Jesli chcesz dodac lub usunac element na koncu listy uzyj ArrayList
         11 .Jesli chcesz dodac lub usunac element na poczatku listy lub w srodku uzyj LinkedList
         */

        ////////////SET////////////////
        /*
        1. Przechowuje tylko unikalne wartosci
        2. Dobre do eliminowania duplikatow
        3. Nie posiada index'ow w przeciwienstwie do Listy
        4. Sprawdzanie szczegolnego elementu na liscie jest szybkie
        5. Jesli uzywamy wlasnego obiektu klasy ktora sami stworzylismy, np. <Person>, trzeba zaimplementowac hashCode() and equals()
        6. HashSet nie jest posortowany, TreeSet jest posortowany, LinkedHashSet jest posortowany w takiej kolejnosci w jakiej zostaly dodane elementy
        7. Definiujemy naturalne uporzadkowanie dla wlasnych obiektow implementujac interfejs Comparable
        */

        ////////////MAPS///////////////
        /*
        1. Para Klucz Wartosc
        2. Wyszukiwanie jak tablicach, wyszukiwanie po kluczu aby odnalezc inny obiekt
        3. Pobieranie wartosci po kluczu jest szybkie
        4. Iterowanie po kluczu jest szybkie, a po wartosci bardzo wolne
        5. Mapy nie sa zoptymalizowane do iterowania, lepiej uzyc set lub list, jesli jednak decydujesz sie na mapy to nie po wartosciach tylko kluczu
        6. Jesli uzywamy swoich obiektow jako klucza trzeba zaimplementowac hashCode() i equals()
        7. HashMap nie jest posortowane i nie mozna posortowac, TreeMap jest posortowane, a LinkedHashMap jest posortowane w kolejnosci w jakiej zostaly dodane elem.
        8. Definiujemy naturalne uporzadkowanie dla wlasnych obiektow implementujac interfejs Comparable
         */

        //Sa jeszcze interfejsy SortedSet i SortedMap


}
