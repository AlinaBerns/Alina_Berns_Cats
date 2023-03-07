package be.intecbrussel.felines;

public class Panthera extends Animal {

    public String roar() {
        return "RRRRRRR!";
    }

    public void hunt() {
        System.out.println("Hunting!");
    }

    @Override
    public String toString() {
        return "Panthera{ "
                + super.toString() +
                isAlive(true) +
                "}";
    }
}

