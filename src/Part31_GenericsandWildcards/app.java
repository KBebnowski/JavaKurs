package Part31_GenericsandWildcards;

import java.util.ArrayList;

class Machine{
    @Override
    public String toString() {
        return "I am a machine";
    }

    public void Prove(){//metoda stworzona do udowodnienia tego co jest opisane w metodzie showRepairList
        System.out.println("Prawda");
    }
}

class Camera extends Machine{
    @Override
    public String toString() {
        return "I am a camera";
    }
}

class Plant{
//klasa zrobiona do porownywania z innymi
}
public class app {

    public static void main(String[] args) {

    //Krok 1
    System.out.println("Krok 1");

        ArrayList<String> StringList = new ArrayList<>(); // tworzeznie listy (String)
        StringList.add("Daniel"); //dodawanie do listy
        StringList.add("Kazimierz");

        showStringList(StringList);//w argumencie po prostu przesylamy nasza liste


/*---------------------------------------------------------------------------------------------------------------------------------------*/System.out.println();
    //Krok 2
    System.out.println("Krok 2");

        //to samo tylko nie na String lecz na klasie Machine dzieki uzytej metodzie toString wyswietlimy w konsoli napis I am a machine
        ArrayList<Machine> MachineList = new ArrayList<>(); // tworzeznie listy (Machine)
        MachineList.add(new Machine()); //dodawanie do listy obiektu klasy Machine
        MachineList.add(new Machine());

        showMachineList(MachineList);

/*---------------------------------------------------------------------------------------------------------------------------------------*/System.out.println();
    //Krok 3
    System.out.println("Krok 3");

       //Nie mozemy przslac listy CameraList do metody showMachineList poniewaz w argumencie metody musi byc lista stworzona na klasie Machine
        ArrayList<Camera> CameraList= new ArrayList<>();
        CameraList.add(new Camera());
        CameraList.add(new Camera());

        //showMachineList(CameraList); - wyswietli blad o czym mowa w opisie wyzej
        showList(CameraList);// zadziala

/*---------------------------------------------------------------------------------------------------------------------------------------*/System.out.println();
    //Krok 4
    System.out.println("Krok 4");

        //Przyklad z klasa ktora nie dziedziczy po Machine, tak jak ArrayList<String> StringList
        ArrayList<Plant> PlantList = new ArrayList<>();
        PlantList.add(new Plant());
        PlantList.add(new Plant());
        //showRepairList(PlantList); - metoda showRepairList wymaga klasy ktora dziedziczy po klasie Machine

        showRepairList(CameraList);// dziala

/*---------------------------------------------------------------------------------------------------------------------------------------*/System.out.println();
    //Krok 5
    System.out.println("Krok 5"); //Opisany w metodzie showSuperList
        showSuperList(CameraList);
        showSuperList(MachineList);
        //showSuperList(PlantList); - wyswietli blad poniewaz klasa nie jest rodzicem klasy Camera czego wymaga metoda showSuperList
    }

//Krok 1
    public static void showStringList(ArrayList<String> list){//w argumencie po prostu przesylamy nasza liste
        for(String value: list){
            System.out.println(value);
        }

        // to te same petle
        /*for (int i= 0; i< list.size();i++) {
            String value = list.get(i);
            System.out.println(value);
        }*/
    }

//Krok 2
    public static void showMachineList(ArrayList<Machine> list){//Machine zamiast String
        for(Machine value: list){//to samo co w komentarzu wyzej
            System.out.println(value);
        }
    }

//Krok 3
    public static void showList(ArrayList<?> list){ // ? -> Wildcart, oznacza to nieznany typ, dzieki temu mozemy do tej metody przeslac
                                                    //liste z dowolnym typem danych. Minusem tego jest to, że mozemy wywolywac w tej metodzie
                                                    //tylko metody klasy Object, nie mozemy uzyc np. metod klasy Machine.
                                                    //Stworzona nizej metoda rozwiazuje ten problem.
        //for(Machine value: list){ - nie moze byc Machine, musi byc Object, moze byc poniewaz jest rodzicem kazdej klasy w javie
        for(Object value: list){
            System.out.println(value);
        }
    }

//Krok 4
    public static void showRepairList(ArrayList<? extends Machine> list){//extends Machine spowoduje ze mozliwe bedzie wywolanie metod
                                                                        //ktore znajduja sie w klasie Machine, lecz w argumencie metody
                                                                        //showRepairList musi byc przeslana Lista ktorej typem danych jest
                                                                        //klasa ktora dziedziczy po klasie Machine
        for(Machine value: list){
            System.out.println(value);
            value.Prove();
        }
    }


//Krok 5
    public static void showSuperList(ArrayList<? super Camera> list){//1.Super umozliwia przesylanie list z typami danych ktore sa
                                                                    //klasa Camera lub sa jej rodzicem, np Machine
                                                                    //2.Mozna odwolywac sie tylko do metod klasy Object
        for(Object value: list){ //musi byc Object
            System.out.println(value);
        }

    }


}
