package Controloer;

public class Animal {

    String culoare;
    String nume;
    int age;
    int healthLevel;
    int hungryLeavel;
    String modeLevel;
    boolean quiet;


    public Animal() {

    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHealth(int health) {
        this.healthLevel= health;
    }

    public void setHungryleavel(int hungryleavel) {
        this.healthLevel = hungryleavel;
    }

    public void setMode(String mode) {
        this.modeLevel = mode;
    }

    public void setQuiet(boolean quiet) {
        this.quiet = quiet;
    }



    public Animal(String nume, int health, String mode) {
        this.nume = nume;
        this.healthLevel = health;
        this.modeLevel = mode;
    }
}
