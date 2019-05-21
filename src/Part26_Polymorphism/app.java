package Part26_Polymorphism;

public class app {
    public static void main(String[] args) {
        Plant plant1 = new Plant();

        Tree tree1 = new Tree();

        Plant plant2 = new Tree();   //tak mozna poniewaz klasa Tree dziedziczy po klasie Plant, plant2 jest referencja
        // Tree tree2 = new Plant(); - nie mozna

        plant1.Grow();//wyswietli metode z klasy Plant poniewaz do referencji Plant zostal stworzony obiekt klasy Plant
        plant2.Grow();//wyswietli metode z klasy Tree poniewaz do referencji Plant zostal stworzony obiekt klasy Tree
        tree1.Grow();//wyswietli to samo co plant2.Grow

/*--------------------------------------------------------------------------------------------------------------------------------------------*/ System.out.println();

        //nie dziala w przypadku gdy w klasie Plant nie ma metody ktora znajduje sie w klasie Tree a ktora chcemy wywolac
        //poniewaz tworzac referencje (Plant plant1) Plant wskazuje z jakiej klasy mozemy korzystac z metod
        //przyklad

        //plant2.Try(); - nie zadziala o czym mowa wyzej
        ((Tree) plant2).Try();//zadziala





    }
}
