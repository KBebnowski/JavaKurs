package Part44_Enum;

public class app {

    public static void main(String[] args) {

        Animal animal = Animal.DOG;

        switch (animal){
            case CAT:
                System.out.println("Cat");
                break;
            case DOG:
                System.out.println("Dog");
                break;
            case MAOUSE:
                break;
            default:
                break;
        }

        //DOG jest obiektem klasy Animal
        System.out.println(Animal.DOG);
        System.out.println(Animal.DOG.getClass());
        System.out.println(Animal.DOG instanceof Animal);//instanceof operator mowi nam czy obiekt zostal stworzony przez podana klase
        System.out.println(Animal.DOG instanceof Enum);//dziecko rodzic

        System.out.println(Animals.DOGS.getName());
        System.out.println("Enum name as a string " + Animals.DOGS.name());//name() wyswietli nazwe obiektu
        System.out.println("This animal is called " + Animals.DOGS.name);//wyswietli to co znajduje sie w argumencie obiektu

    }

}
