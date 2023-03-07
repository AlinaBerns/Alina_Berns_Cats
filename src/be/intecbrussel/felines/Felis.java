package be.intecbrussel.felines;

import java.util.Objects;

public class Felis extends Animal{

    protected static int vaccitationCount = 0;
    private String name;
    private int age;
    private int shelterNo;
    private int badgeNo;
    private int lifespan;

    public Felis(char size, char coat, String color, double weight, String name, int lifespan) {
        super(size, coat, color, weight);
        this.name = name;
        this.lifespan = lifespan;
    }

    public Felis(String name, int lifespan) {
        this.name = name;
        this.lifespan = lifespan;

    }

    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }


    public Felis() {
    }


    public Felis(char size, char coat, String color, double weight, String name, int age, int shelterNo, int badgeNo) {
        super(size, coat, color, weight);
        setName(name);
        setAge(age);
        setShelterNo(shelterNo);
        setBadgeNo(badgeNo);


    }



    public Felis(char size, char coat, String color, double weight) {
        super(size, coat, color, weight);

    }

    public static int getVaccitationCount() {

        return vaccitationCount;
    }

    public static void setVaccitationCount(int vaccitationCount) {
        Felis.vaccitationCount = vaccitationCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getShelterNo() {

        if(this.shelterNo>999||this.shelterNo<=0){
            System.out.println("ShelterNo: not possible");
            this.shelterNo = 0;
        }

        return shelterNo;
    }
    public void setShelterNo(int shelterNo) {
        this.shelterNo = shelterNo;

    }

    public int getBadgeNo() {

        if(this.badgeNo>999||this.badgeNo<=0){
            System.out.println("BadgeNo: not possible");
            this.badgeNo = 0;
        }
        return badgeNo;
    }

    public void setBadgeNo(int badgeNo) {
        this.badgeNo = badgeNo;
    }

    public void miauw(){
        makeNoise("Miaaauuuw");

    }

    public int times (int times) {
        for (int i = times; i>0; i--){
            this.makeNoise("Miaauww");
        }

        return times;
    }

    void getNoOfVaccinatedCats() {
        ++vaccitationCount;
        System.out.println("The cat is vaccinated");
    }

    static void show_Arr (Object [] arr) {
        for (Object ob : arr)
            System.out.println(ob + " \n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Felis)) return false;
        Felis felis = (Felis) o;
        return getShelterNo() == felis.getShelterNo() && getBadgeNo() == felis.getBadgeNo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getShelterNo(), getBadgeNo());
    }

    @Override
    public String toString() {
        return super.toString() +
                "name='" + name + '\'' +
                ", age=" + age +
                ", shelterNo=" + shelterNo +
                ", badgeNo=" + badgeNo +
                '}';
    }
}


