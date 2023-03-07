package be.intecbrussel.felines;

public class AndeanMountainCat extends Felis {

    public AndeanMountainCat() {

        --animal_count;

    }

    public AndeanMountainCat(String name, int lifespan) {
        super(name, lifespan);
        --animal_count;
    }

    public AndeanMountainCat(char size, char coat, String color, double weight) {
        super(size, coat, color, weight);

        --animal_count;
    }

    public AndeanMountainCat(char size, char coat, String color, double weight, String name, int age, int shelterNo, int badgeNo) {
        super(size, coat, color, weight, name, age, shelterNo, badgeNo);

        --animal_count;
    }

    public String miauw (String customSound) {
        System.out.println("Miaaaaauuuwww");

        --animal_count;
        return customSound;
    }

    public String isAlive(boolean catIsAlive) {

        this.catIsAlive = catIsAlive;

        if (this.catIsAlive) {
            return "The cat in the shelter";
        } else {
            return "Sorry, the cat died";

        }
    }

    void getNoOfVaccinatedCats() {
        System.out.println("Sorry, the cat died");
    }

    @Override
    public String toString() {
        return "AndeanMountainCat{" +
                super.toString() +
                isAlive(false) +
                '}';
    }
}



