package be.intecbrussel.felines;

public class NorwegianForestCat extends Felis {

    public NorwegianForestCat() {
        super();

    }

    public NorwegianForestCat(char size, char coat, String colour, double weight, String name, int age, int shelterNo, int badgeNo) {
        super(size, coat, colour, weight, name, age, shelterNo, badgeNo);
    }


    //custom methods
    public void miauwInNorwegian() {
        System.out.println("Mrrrr");
    }

    @Override
    public String toString() {
        return "NorwegianForestCat{ "
                + super.toString()
                +
                isAlive(true) +
                '}';

    }
}

