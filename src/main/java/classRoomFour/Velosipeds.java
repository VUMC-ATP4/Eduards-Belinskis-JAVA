package classRoomFour;

public class Velosipeds {
    int atrums = 0;
    int atrumi = 21;
    String nosaukums = "Merida";
    String krasa = "zala";
    int svarsGramos;
    double rataIzmers;
    String bremzuTips = "";

    public void bremze(){
        if(bremzuTips.equals("V-veida")){
            atrums = atrums -2;
        }else if(bremzuTips.equals("diska")) {
            atrums = atrums - 3;
        }else{
            atrums = atrums - 1;
        }

        atrums = atrums - 2;
    }

    public void spiedPedalus(){
        atrums = atrums + 5;
    }

}
