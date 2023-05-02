package Explorers;

import Planets.*;

public class RobotExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("Loading instructions from system... exploring Mercury");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("Loading instructions from system... exploring Mars");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("Loading instructions from system... exploring Saturn");
    }

    @Override
    public void visit(Pluto pluto) {
        System.out.println("Pluto is a dwarf planet google told me, boss");
    }

    @Override
    public void visit(Namek namek) {
        System.out.println("COLLECTING 'DRAGONBALLS' HEHE");
    }

    @Override
    public void visit(UrAnus anus) {
        System.out.println("UrAnus is so huge I'm not able to scan this boss");
    }
}