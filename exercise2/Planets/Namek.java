package Planets;

import Explorers.Explorer;

public class Namek implements Planet {
    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}