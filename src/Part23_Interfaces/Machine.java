package Part23_Interfaces;

public class Machine implements Info{//implementujac interfejs musimy zaimplementowac wszystkie metody tego interfejsu

    private int id = 7;

    public void start(){
        System.out.println("Machine started");
    }

    @Override
    public void showInfo() {
        System.out.println("Machine id is: " + id);
    }
}
