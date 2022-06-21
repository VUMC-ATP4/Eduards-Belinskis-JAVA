package classroomFive.Statika;

public class Car {

    private String name;
    private String colour;
    public static String klasesApraksts = "Si ir masinas klase";
    public static int countOfCarsCreatedInSystem;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Car(String name, String colour) {
        this.name = name;
        this.colour = colour;
        countOfCarsCreatedInSystem++;
    }
}
