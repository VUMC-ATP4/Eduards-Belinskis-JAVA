package classRoomFour;

public class House {
    String ielasNosaukums;
    int majasNumurs;
    int stavuSkaits;
    int ieejuSkaits;
    int istabuSkaits;
    Cena cena;
    double platiba;
    boolean isStavvieta;


    public double cenaKvadratmetra(){
        return cena.cena/platiba;
    }

    public void printetAdresi(){
        System.out.println("Majas adrese ir " + ielasNosaukums + "" + majasNumurs );



    }
    public void papildusInfo(){

        System.out.println("Majas stavu skaits = " + stavuSkaits + ", majas ieeju skaits = " + ieejuSkaits +
                ", majas istabu skaits" +
                istabuSkaits +
                ", majas cena = "  +
                cena + "" + "ir stavvieta = " + isStavvieta
        + "cena kvadratmetra = " + cena.cena/platiba + '}');
    }
}
