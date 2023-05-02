package Explorers;

import Planets.Mars;
import Planets.Planet;
import Planets.Mercury;
import Planets.Saturn;
import Planets.Namek;
import Planets.Pluto;
import Planets.UrAnus;



public interface Explorer {

    void visit(Mercury mercury);

    void visit(Mars mars);

    void visit(Saturn saturn);

    void visit(Pluto pluto);

    void visit(Namek namek);

    void visit(UrAnus anus);

    default void visit(Planet planet) {
        System.out.println("Landed on an unknown planet...");
    }
}