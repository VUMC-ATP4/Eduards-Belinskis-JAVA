package classroomFive.encapsulation;

public class Main {
    public static void main(String[] args) {

        bird putns = new bird();
        putns.name = "Alfons";
        putns.printText();
        //putns.printTextSpecial();
        putns.printDeffaultMethodExample();

        human cilveks = new human();
        cilveks.setAge(1);
        System.out.println(cilveks.getAge());
        cilveks.setHeight(190);
        System.out.println(cilveks.getHeight());
        cilveks.setName("Eduards");
        System.out.println(cilveks.getName());
        cilveks.setSurname("Belinskis");
        System.out.println(cilveks.getSurname());

        Matematika matematika = new Matematika();
        matematika.add(12, 41);

        matematika.add(2.1, 2.3);

        System.out.println(matematika.add(2, 4));
        System.out.println(matematika.add(2.3, 23.2));

        matematika.paraditTekstu("Juris");
        matematika.paraditTekstu("Karlis", true);
        matematika.paraditTekstu("Anna", false);

    }

}
