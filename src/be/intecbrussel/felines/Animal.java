package be.intecbrussel.felines;

public class Animal {

    static int animal_count = 0;

    private char size;
    private char coat;
    private String color;
    private double weight;
    protected boolean catIsAlive = true;

    public Animal(char size, char coat, String color, double weight) {
        this.size = size;
        this.coat = coat;
        this.color = color;
        this.weight = weight;
        ++animal_count;
    }

    public Animal() {
        ++animal_count;
    }

    public static int getCount() {
        return animal_count;
    }

    public static void setCount(int count) {
        Animal.animal_count = count;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public char getCoat() {
        return coat;
    }

    public void setCoat(char coat) {
        this.coat = coat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String makeNoise(String sound) {

        return sound;
    }

    public String eat(String eat) {
        System.out.println("Omnomnom");

        return eat;
    }

    public String sleep(String sleep) {
        System.out.println("Zzz...");

        return sleep;
    }

    public String isAlive(boolean catIsAlive) {

        this.catIsAlive = catIsAlive;

        if (this.catIsAlive) {
            return "The cat in the shelter";
        } else {
            return "Sorry, the cat died";

        }

    }

    @Override
    public String toString() {
        return "Animal{" +
                "size=" + size +
                ", coat=" + coat +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", catIsAlive=" + catIsAlive +
                '}';
    }
}