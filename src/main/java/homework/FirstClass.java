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

                String.format("Galvas pilsēta ir %s", capital);
        System.out.println(capital);

        System.out.println("Valsts nosaukums ir " + valstsNosaukums + " un tās iedzīvotāju skaits ir " + population + "cilvēku, tās " +
                "galvas pilsēta ir " + capital + "kā arī oficiālā valsts valoda ir " + officialLanguage);

        System.out.println("Vai LV ir EU savienībā? " + isEU);

        System.out.println("Latvijas teritorija ir " + area + "km2 liela, un tās valūta ir " + currency + ".");

        // Aritmētikas atkārtojums

        int aboliJanim = 4;
        int aboliPeterim = 6;
        int aboliAnnai = 8;

        int parCikPeterimVairakKaJanim = aboliPeterim - aboliJanim;
        int parCikPeterimMazakKaAnnai = aboliAnnai - aboliPeterim;
        int cikJanimUnPeterimKopa = aboliJanim + aboliPeterim;
        int cikReizuAnnaiVairakKaJanim = aboliAnnai/aboliJanim;
        int cikPaliksPeterimJaVisiApedis4Abolus = aboliPeterim % aboliJanim;
        int janaAboliNakamajaDienaJaVinsPacenstosStradat2xVairak = aboliJanim * 2;


        System.out.println("Abolu skaits Janim: " + aboliJanim + "gb.");
        System.out.println("Abolu skaits Peterim: " + aboliPeterim + "gb.");
        System.out.println("Abolu skaits Annai: " + aboliAnnai + "gb");
        System.out.println("Par cik Peterim vairak ka Janim? " + parCikPeterimVairakKaJanim + "gb.");
        System.out.println("Cik abolu Janim un Peterim kopā? " + cikJanimUnPeterimKopa + "gb.");
        System.out.println("Par cik Peterim mazak abolu kā Annai? " + parCikPeterimMazakKaAnnai + "gb.");
        System.out.println("Cik reižu Annai vairāk abolu ka Janim? " + cikReizuAnnaiVairakKaJanim + "gb.");
        System.out.println("Cik abolu paliks Peterim, ja visi apedis 4 abolus? " + cikPaliksPeterimJaVisiApedis4Abolus + "gb");
        System.out.println("Ja Janis bus cakls, cik abolu vinam bus nakamaja diena? " + janaAboliNakamajaDienaJaVinsPacenstosStradat2xVairak + "gb.");



    }
}
