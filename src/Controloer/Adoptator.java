package Controloer;

public class Adoptator {

     private String nume;
     private int buget;
    private String foodAnimal;
    private String game;

    public String getNume() {
        return nume;
    }

    public int getBuget() {
        return buget;
    }

    public String getFoodAnimal() {
        return foodAnimal;
    }

    public String getGame() {
        return game;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setBuget(int buget) {
        this.buget = buget;
    }

    public void setFoodAnimal(String foodAnimal) {
        this.foodAnimal = foodAnimal;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public Adoptator(String nume, int buget) {
        this.nume = nume;
        this.buget = buget;
    }
}
