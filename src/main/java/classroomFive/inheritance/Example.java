package classroomFive.inheritance;

public class Example {
    public static void main(String[] args) {
        Dog Dog1 = new Dog(4, "Reksis");
        Astonkajis Octopus1 = new Astonkajis(8, "Džo");
        Chicken Chicken1 = new Chicken(2, "Bala vista");
        Chicken VistaArVienuKaju = new Chicken(1, "Melna vista");



        Dog1.printLegCount();
        Octopus1.printLegCount();
        Chicken1.printLegCount();
        VistaArVienuKaju.printLegCount();


        System.out.println(Octopus1.waterType);
        Octopus1.printWaterType();

        //Fox lapsa = new  Fox(4, "kumins");

        Animal[] dzivnieki = {Dog1, Octopus1, Chicken1, VistaArVienuKaju};

        for (int i = 0 ; i < dzivnieki.length ; i++) {
            dzivnieki[i].printLegCount();
        }

    Dog1.makeSound();
        Chicken1.makeSound();
        Octopus1.makeSound();

    }

}
