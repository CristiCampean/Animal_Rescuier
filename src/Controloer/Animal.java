package Controloer;

public class Animal {

    String culoare;
    String name;
    int age;
    int healthLevel;
    int hungryLeavel;
    String modeLevel;
    String feed;
    boolean quiet;


    public Animal() {

    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setNume(String name) {
        this.name = name;
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



    public Animal(String name, int health, String mode,int hungryLeavel, String feed) {
        this.name = name;
        this.healthLevel = health;
        this.modeLevel = mode;
        this.hungryLeavel = hungryLeavel;
        this. feed = feed;
    }
}
