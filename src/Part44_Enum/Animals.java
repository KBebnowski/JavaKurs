package Part44_Enum;

public enum Animals {
    //enum moze miec konstruktor
    CATS("Laki"), DOGS("Rex"), MOUSES("Jerry");

    String name;
    Animals(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                '}';
    }
}
