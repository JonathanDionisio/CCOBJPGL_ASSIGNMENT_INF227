package Planets;

import Explorers.Explorer;

public class UrAnus implements Planet {
    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}