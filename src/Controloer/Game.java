package Controloer;
import java.util.Scanner;
public class Game {
    String adaptor;
    String  medic;
    String animal;

    public String getAdaptor() {
        return adaptor;
    }

    public String getMedic() {
        return medic;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAdaptor(String adaptor) {
        this.adaptor = adaptor;
    }

    public void setMedic(String medic) {
        this.medic = medic;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public void initAnimal(){
        Dog dog = new Dog();
        dog.name = "Tom";
        dog.age = 4;
        dog.hungryLeavel = 1;

         Scanner s = new Scanner(System.in);
     System.out.println( "enter 1");


        }




    public void start(){
      initAnimal();
    }
}
