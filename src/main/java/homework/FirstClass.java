package homework;

public class FirstClass {

    public static void main(String[] args) {
        System.out.println("This is homework");

        String valstsNosaukums = "Latvija";
        int population = 1902000;
        double area = 64589.6;
        String capital = "Riga";
        String officialLanguage = "Latvian";
        boolean isEU = true;
        char currency = '€';

        System.out.println("Valsts nosaukums ir " + valstsNosaukums + " un tās iedzīvotāju skaits ir " + population + "cilvēku, tās " +
                "galvas pilsēta ir " + capital + "kā arī oficiālā valsts valoda ir " + officialLanguage);

        System.out.println("Vai LV ir EU savienībā? " + isEU);

        System.out.println("Latvijas teritorija ir " + area + "km2 liela, un tās valūta ir " + currency + ".");

        

    }
}
