package Controloer;

import Controloer.Exception.InvalidException;
import Controloer.utils.ScannerUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    String adaptor;
    String  medic;
    String animal;
    int choose;
    private Object String;


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

        dog.age = 4;
        dog.hungryLeavel = 1;
        Cat cat = new Cat();

        cat.age = 2;
        cat.hungryLeavel = 2;

        System.out.println( " For a dog enter 1 or for a cat enter 2");
        ScannerUtils.ReadScannerInt();
        choose = ScannerUtils.ReadScannerInt();
        if( choose ==1){
            System.out.println( "Your choose is a dog");
        } if( choose==2){
            System.out.println( "Your choose is a cat");
        }
        }


    public void start() throws InvalidException {
      initAnimal();
      initRescuer();
      nameAnimal();
      requireFeeding();
    }
    private void initRescuer() throws InvalidException {
        Rescuer rescuer = new Rescuer();
        System.out.println(" Write your name");
        Scanner s = new Scanner(System.in);
        try {
            rescuer.name = ScannerUtils.ReadScannerString();
             if(rescuer.name!=String);
            
        } catch (Exception e) {
           System.out.println( "Invalid characters");
            throw new InvalidException();
        }
        }

         private void nameAnimal() {
        System.out.println(" Give the animal a name");
        Animal animal = new Animal();
        animal.name= ScannerUtils.ReadScannerString();
        System.out.println( "Your Animal have the name " + animal.name);
    }
    private void requireFeeding(){
        System.out.println(" Please feed your animal. Choose something from the meniu");
        List<String> foodList = new ArrayList<>();
        foodList.add("vegetable");
        foodList.add("meat");
        foodList.add("vitamin");
        for (String element: foodList){
            System.out.println(element);
        }
        this.animal = ScannerUtils.ReadScannerString();


    }
}

