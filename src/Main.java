import Controloer.Adoptator;
import Controloer.Animal;
import Controloer.Medic;

public class Main {
    public static void main(String [] args){

        Animal animal = new Animal("Tom" ,4, "happy");
        Adoptator adoptator = new Adoptator("Cristi",100);
        Medic medic = new Medic("chirurg");
        Animal.animal2 = new Animal();

    }
}
