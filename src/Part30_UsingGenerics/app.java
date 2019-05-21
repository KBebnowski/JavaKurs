package Part30_UsingGenerics;

import java.util.ArrayList;
import java.util.HashMap;

class Klasa{

}

public class app {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        ArrayList<Klasa> list2 = new ArrayList<>();

        list.add("Buty");
        list.add("Plaszczyki");
        list.add("Sukienki");

        String szafa = list.get(0);
        System.out.println(szafa);
        System.out.println(list.get(1));

        String sklep = list.get(0)+" "+list.get(1);
        System.out.println(sklep);
        System.out.println(list.get(0)+" "+list.get(1));

        HashMap<Integer, String> more = new HashMap<>();
        more.put(1,"Kowalski");
        System.out.println(more);// wyswietli 1=Kowalski
        System.out.println(more.get(1));// 1 oznacza numer ktory podalismy wyzej, wyswietli tylko Kowalski
        System.out.println(more.get(0));// nie przypisalismy do 0 nic wiec wyswietli napis null

    }

}
