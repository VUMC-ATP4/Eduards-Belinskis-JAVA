package classroomFive.encapsulation;

public class bird {

    public String name;

    // varam pieklut no visam klasem
    public void printText(){
        System.out.println("Si ir publiska metode");
        System.out.println("Printeju putnu");
        printTextSpecial();
    }
    // varam pieklut tikai no sis klases
    private void printTextSpecial(){
        System.out.println("Si ir privata metode");
    }
    //varam pieklut vienas pakotnes ietvaros
    void printDeffaultMethodExample(){
        System.out.println("Si ir default metode");
    }

}
