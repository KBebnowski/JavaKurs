package Part43_InnerClasses;

public class app {

    public static void main(String[] args) {

        Robot robot = new Robot(7);
        robot.start();


        //Jesli klasa weewnetrzna bylaby publiczna to mozna byloby sie do niej odwolac
        //Robot.Brain brain = Robot.new Brain();

        Robot.Battery battery = new Robot.Battery();
        battery.charge();

    }



}
