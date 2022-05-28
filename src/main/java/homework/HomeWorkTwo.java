package homework;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class HomeWorkTwo {

    public static void main(String[] args) {

        int x = 9;

        System.out.println((x>2));
        System.out.println((x<0));
        System.out.println((x>5 && x<=10));
        System.out.println((x));
        System.out.println((x==0 && x<10));
        System.out.println((x * x)>10);


        int month = 4;

                switch(month){
                    case 1:
                        System.out.println("Janvaris");
                        break;
                    case 2:
                        System.out.println("Februaris");
                        break;
                    case 3:
                        System.out.println("Marts");
                        break;
                    case 4:
                        System.out.println("Aprilis");
                        break;
                    case 5:
                        System.out.println("Maijs");
                        break;
                    case 6:
                        System.out.println("Junijs");
                        break;
                    case 7:
                        System.out.println("Julijs");
                        break;
                    case 8:
                        System.out.println("Augusts");
                        break;
                    case 9:
                        System.out.println("Septemrbis");
                        break;
                    case 10:
                        System.out.println("Oktobris");
                        break;
                    case 11:
                        System.out.println("Novembris");
                        break;
                    case 12:
                        System.out.println("Decembris");

                }

                int a = 2;
                int b = 3;
                int c = 4;

        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();
        if(a >b && a > c){
            System.out.println("The largest number is: " + a);
        } else if (b > a && b > c){
            System.out.println("The largest number is: "+ b);
        } else if (c > a && c > b){

            System.out.println("The largest number is: " + c);
        } else {
            System.out.println("Numbers are equal");
        }






        Scanner luksofors = new Scanner(System.in);

        String krasa = "zala";

        System.out.println("Kada ir luksofora krasa?");

        if (krasa == "zala"){
            System.out.println("Vari iet pāri");
        }



    }
}
