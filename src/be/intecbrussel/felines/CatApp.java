package be.intecbrussel.felines;

public class CatApp {

    public static void main(String[] args) {
        PersianCat pers = new PersianCat('s', 'c', "white", 2.5, "Mouna", 12, 333, 540);

        PersianCat pers1 = new PersianCat('s', 'c', "white", 2.5, "Nina", 3, 333, 541);

        SiameseCat siameseCat = new SiameseCat('b', 'c', "black", 2.5, "Orson", 5, 333, 542);

        SiameseCat siameseCat1 = new SiameseCat('s', 'c', "black", 2.5, "Ron", 5, 333, 543);

        NorwegianForestCat norwegianForestCat = new NorwegianForestCat('m', 'c', "black", 2.5, "Eric", 7, 333, 544);

        TurkishVanCat turkishVanCat = new TurkishVanCat('m', 'c', "black", 2.5, "Ella", 7, 333, 545, "Er");

        AndeanMountainCat andeanMountainCat = new AndeanMountainCat('b', 'c', "black", 2.5, "Nora", 25, 333, 546);

        Felis[] catArray = {pers, pers1, siameseCat, siameseCat1, norwegianForestCat, turkishVanCat, andeanMountainCat};
        for (Felis cats: catArray){
            System.out.println(cats+ "\n");
        }

        TurkishVanCat Cat1 = new TurkishVanCat('b', 'c', "black", 2.5, "Rick", 9, 333, 547, "Ricki");
        NorwegianForestCat Cat2 = new NorwegianForestCat('m', 'e', "black", 2.4, "Maya", 3, 333, 547);

        TurkishVanCat Cat5 = new TurkishVanCat('b', 'c', "black", 2.5, "Rick", 9, 333, 548, "Ricki");
        TurkishVanCat Cat6 = new TurkishVanCat('b', 'c', "black", 2.5, "Rick", 9, 333, 549, "Ricki");

        Panthera panthera = new Panthera();
        AndeanMountainCat andeanMountainCat1 = new AndeanMountainCat();

        System.out.println("It's the same cat: " + Cat1.equals(Cat2));
        System.out.println("It's the same cat: " + Cat5.equals(Cat6));

        Cat1.getNoOfVaccinatedCats();
        Cat2.getNoOfVaccinatedCats();
        andeanMountainCat1.getNoOfVaccinatedCats();

        System.out.println("Number of vaccinated cats: "+ Felis.getVaccitationCount());

        NorwegianForestCat Cat3 = new NorwegianForestCat('m', 'e', "black", 2.4, "Maya", 3, 1000, 543);
        NorwegianForestCat Cat4 = new NorwegianForestCat('m', 'e', "black", 2.4, "Maya", 3, 555, -23);

        System.out.println(Cat3.getShelterNo() + "\n"+ "BadgeNo: " + Cat3.getBadgeNo());
        System.out.println(Cat4.getBadgeNo() + "\n"+ "ShelterNo: " + Cat4.getShelterNo());

        System.out.println("Totaal ANIMALS: " + Animal.getCount());

    }


}
