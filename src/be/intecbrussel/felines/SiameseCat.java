package be.intecbrussel.felines;

public class SiameseCat extends Felis {

    public SiameseCat() {
        super();

    }

    public SiameseCat(char size, char coat, String colour, double weight, String name, int age, int shelterNo, int badgeNo) {
        super(size, coat, colour, weight, name, age, shelterNo, badgeNo);

    }


    //custom methods
    @Override
    public String toString() {
        return "SiameseCat{ "
                + super.toString()+
                isAlive(true) +
                "}";
    }
}


