package classroomFive.inheritance;

public class Astonkajis extends Animal {

    String waterType = "Salsudens";

    public Astonkajis(int legCount, String name) {
        super(legCount, name);
    }
    public void printWaterType(){
        System.out.println(waterType);
    }

    @Override
    public void makeSound(){
        super.makeSound();
    }
}
