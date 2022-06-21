package classRoomFour;

public class Rinkis {
    final double PI = 3.14;
    double radiuss;

    Rinkis(){

        System.out.println("Veidoju rinki....");

    }

    Rinkis(double radiuss){
        this.radiuss = radiuss;
    }
    public double rinkaLaukums(){
        return PI * (radiuss * radiuss);
    }

    public double rinkaDiametrs(){
        return radiuss * 2;
    }
}
