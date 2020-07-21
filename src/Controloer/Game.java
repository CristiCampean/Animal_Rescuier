package Controloer;

import Controloer.Exception.InvalidException;
import Controloer.utils.ScannerUtils;

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
        dog.name = "Tom";
        dog.age = 4;
        dog.hungryLeavel = 1;
        Cat cat = new Cat();
        cat.name = "Betty";
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
    }
    private void initRescuer() throws InvalidException {
        Rescuer rescuer = new Rescuer();
        System.out.println(" Write your name");
        Scanner s = new Scanner(System.in);
        try {
            rescuer.name = s.next();
             if(rescuer.name!=String);
            
        } catch (Exception e) {
           System.out.println( "Invalid characters");
            throw new InvalidException();
        }
        }
    }
