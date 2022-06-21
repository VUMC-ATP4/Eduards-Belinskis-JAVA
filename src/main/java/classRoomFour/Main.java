package classRoomFour;

import homework.classHomeWork.Trijsturis;

public class Main {

    public static void main(String[] args) {

        House majasViens = new House();
        majasViens.majasNumurs = 1;
        majasViens.ielasNosaukums = "Brivibas iela ";
        majasViens.ieejuSkaits = 3;
        Cena cena1 = new Cena();
        cena1.valuta = '$';
        cena1.cena = 300000;
        majasViens.cena = cena1;
        majasViens.isStavvieta = true;
        majasViens.istabuSkaits = 5;
        majasViens.stavuSkaits = 2;
        majasViens.platiba = 250;


        House majasDivi = new House();
        majasDivi.majasNumurs = 2;
        majasDivi.ielasNosaukums = "Gertrūdes iela ";


        majasDivi.printetAdresi();
        majasViens.printetAdresi();

        majasViens.papildusInfo();


        Velosipeds velosipeds1 = new Velosipeds();
        Velosipeds velosipeds2 = new Velosipeds();
        velosipeds2.bremzuTips = "diska";
        System.out.println(velosipeds1.atrumi);
        System.out.println(velosipeds1.nosaukums);
        velosipeds1.atrumi = 28;

        System.out.println("Velosipeda atrums ir " + velosipeds1.atrums);
        velosipeds1.spiedPedalus();
        System.out.println("Velosipeda atrums ir " + velosipeds1.atrums);
        velosipeds1.spiedPedalus();
        velosipeds1.spiedPedalus();
        velosipeds1.spiedPedalus();
        System.out.println("Velosipeda atrums ir " + velosipeds1.atrums);
        System.out.println("Priekšā gājējs!!");
        velosipeds1.bremze();
        velosipeds1.bremze();
        System.out.println("Velosipeda atrums ir " + velosipeds1.atrums);

        System.out.println("Velo 2 atrums ir " + velosipeds2.atrums);
        velosipeds2.spiedPedalus();
        velosipeds2.spiedPedalus();
        System.out.println("Velo 2 atrums ir " + velosipeds2.atrums);
        velosipeds2.spiedPedalus();
        velosipeds2.spiedPedalus();
        velosipeds2.spiedPedalus();
        System.out.println("Velo 2 atrums ir " + velosipeds2.atrums);
        System.out.println("Gajejs!");
        velosipeds2.bremze();
        System.out.println("Velo 2 atrums ir " + velosipeds2.atrums);

        Rinkis rinkis1 = new Rinkis(5.34);
        Rinkis rinkis2 = new Rinkis();

        rinkis2.radiuss = 4.7;

        System.out.println(rinkis1.rinkaLaukums());
        System.out.println(rinkis2.rinkaLaukums());

        System.out.println(rinkis1.rinkaDiametrs());
        System.out.println(rinkis2.rinkaDiametrs());



    }
}
