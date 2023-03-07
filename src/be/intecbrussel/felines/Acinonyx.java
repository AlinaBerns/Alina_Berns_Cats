package be.intecbrussel.felines;

public class Acinonyx extends Animal {

    private double speed;

    public Acinonyx() {
    }

    public Acinonyx(char size, char coat, String color, double weight) {
        super(size, coat, color, weight);
    }

    public Acinonyx(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void run (double run) {
        System.out.println("Running "+run);
    }

    public void kiauuww() {

        System.out.println("kiaaauuuwww");

    }

    @Override
    public String toString() {
        return "Acinonyx{" +
                super.toString() +
                "speed=" + this.speed +
                '}';
    }
}

