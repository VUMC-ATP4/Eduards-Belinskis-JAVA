package classroomFive.Statika;

public class Main {

    public static void main(String[] args) {

    Car auto1 = new Car("Zaz", "Sarkans");
        System.out.println("Auto skaits sistēmā" + auto1.countOfCarsCreatedInSystem);
    Car auto2 = new Car("Mercedes", "Balts");
        System.out.println("Auto skaits sistēmā" + auto1.countOfCarsCreatedInSystem);
        auto1.klasesApraksts = "si ir auto1 klase";
        System.out.println("auto1: " + auto1.getColour() + " " + auto1.getName() + auto1.klasesApraksts);
        auto2.klasesApraksts = "si ir auto2 klase";
        System.out.println("auto2: " + auto2.getColour() + " " + auto2.getName() + auto2.klasesApraksts);

    }

}
