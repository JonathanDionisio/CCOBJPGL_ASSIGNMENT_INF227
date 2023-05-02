package Explorers;

import Planets.*;

public class HumanExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("Deploying tools specific to Mercury... exploring life");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Deploying tools specific to Mars... exploring life");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Deploying tools specific to Saturn... exploring life");
    }

    @Override
    public void visit(Pluto pluto) {
        System.out.println("IS PLUTO A PLANET????");
    }

    @Override
    public void visit(Namek namek) {
        System.out.println("LET'S GO FIGHT FRIEZA!");
    }

    @Override
    public void visit(UrAnus anus) {
        System.out.println("UrAnus is so huge omg!");
    }
}