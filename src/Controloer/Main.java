package Controloer;

import Controloer.Exception.InvalidException;

public class Main {
    public static void main(String[] args) throws InvalidException {
        Game game = new Game();
        game.start();

        Animal animal = new Animal();
        Adoptator adoptator = new Adoptator("Cristi", 100);
        Medic medic = new Medic();
        Animal animal1 = new Animal();

        medic.setSpecialization("chirurg");

    }
}
