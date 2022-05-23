public class Main {

    public static void main(String[] args) {

        System.out.println("Eduards");

        int x = 5;
        int y = 10;
        System.out.println("X ir vienads ar:");
        System.out.println(x);
        System.out.println("Y ir vienads ar:");
        System.out.println(y);
        System.out.println(x + y);

        // Vārdi un teikumi tiek saglabāti mainīgā tipā "String"

        String dogName = "Demons";
        int dogAge = 5;
        double dogWeight = 40.5;
        String dogBreed = "Stafs";

        // Ja(True)/Ne (False) jautajums tiek definets ar mainiga tipu boolean
        boolean isHungry = true;

        // Vienu simbolu definē ar mainīgo "char"
        char currency = '$';

        char dogGender = 'M';
        int puppyPrice = 100;

        System.out.println("Suņa vārds: " + dogName);
        System.out.println("Suņa vecums: " + dogAge);
        System.out.println("Suņa vecums: " + dogWeight);
        System.out.println("Suņa šķirne: " + dogBreed);
        System.out.println("Vai suns ir izsalcis: " + isHungry);
        System.out.println("Suņa dzimums: " + dogGender);
        System.out.println("Suņa kucēni maksā: " + puppyPrice + currency);


        int summa;
        int pirmaisSkaitlis = 20;
        int otraisSkaitlis = 10;


        int starpiba = pirmaisSkaitlis - otraisSkaitlis;
        summa = pirmaisSkaitlis + otraisSkaitlis;
        int dalijums = pirmaisSkaitlis / otraisSkaitlis;
        int reizinajums = pirmaisSkaitlis * otraisSkaitlis;
        int atlikums = pirmaisSkaitlis % otraisSkaitlis;

        System.out.println("starpiba " + starpiba);
        System.out.println("dalijums " + dalijums);
        System.out.println("reizinajums " + reizinajums);
        System.out.println("atlikums " + atlikums);
        System.out.println("summa " + summa);

        int a = 2;
        int b = 4;
        int c = 7;
        System.out.println((double)b);

        System.out.println("Ja atlikums nulle, tad para skaitlis " + b % 2);
        if (b % 2 == 0) {
            System.out.println("ir para skaitlis");
        } else {
            System.out.println("Nav para skaitlis");
        }

    }
}

