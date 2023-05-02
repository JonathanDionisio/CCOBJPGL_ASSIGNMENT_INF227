import Explorers.*;
import Planets.*;

public class App {

    public static void main(String[] args) {

        Planet mars = new Mars();
        Planet saturn = new Saturn();
        Planet mercury = new Mercury();
        Planet pluto = new Pluto();
        Planet namek = new Namek();
        Planet anus = new UrAnus();

        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();

        mars.accept(astronaut);
        saturn.accept(astronaut);
        mercury.accept(astronaut);
        namek.accept(astronaut);
        pluto.accept(astronaut);
        anus.accept(astronaut);


        mars.accept(rover);
        saturn.accept(rover);
        mercury.accept(rover);
        pluto.accept(rover);
        namek.accept(rover);
        anus.accept(rover);
    }
}
    
