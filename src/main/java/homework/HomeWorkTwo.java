package homework;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class HomeWorkTwo {

    public static void main(String[] args) {

        System.out.println("Uzdevums 1");


        int x = 9;

        System.out.println((x>2));
        System.out.println((x<0));
        System.out.println((x>5 && x<=10));
        System.out.println((x));
        System.out.println((x==0 && x<10));
        System.out.println((x * x)>10);


        int month = 4;

        System.out.println("Uzdevums 2");

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

        System.out.println("Uzdevums 3");

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

        System.out.println("Uzdevums 5");

        printBusinescard("Eduards", "Belinskis", "371 24531245", 1992);
        printBusinescard("Karlis", "Zarins", "371 23256432", 1952);
        printBusinescard("Ingmars", "Lidaka", "371 24523455", 1956);


        System.out.println("Uzdevums 4");


        luksofors("zala");


        System.out.println("Uzdevums 6");

        sum(5,5);
        System.out.println(sum(3,1));


        System.out.println("Uzdevums 7");

        avg(1.4,1.6, 1.4 );
        System.out.println(avg(1.7, 6.5, 8.3));

        businesCardTwo("Eduards ", "Belinskis ", "371 24531245  ", 1992);
        businesCardTwo("janis ", "zarins " , "1356 ", 5242);

        }

        static void luksofors (String krasa){
        if(krasa.equals("sarkana")){
                System.out.println("Stavi!");
            }else if(krasa.equals("dzeltena")){
                System.out.println("Gatavojies");
            }else if(krasa.equals("zala")){
                System.out.println("Vari doties!");
            }else{
            System.out.println("Tada krasa nav luksofora");
        }

        }

        static void printBusinescard(String name, String surname, String telephone, int yearOfBirth){

            System.out.println("Vizitkarte");
            System.out.println("###########");
            System.out.println("Vards" + name);
            System.out.println("Uzvards" + surname);
            System.out.println("Telefona nr" + telephone);
            System.out.println("Dzimsanas gads" + yearOfBirth);
            System.out.println("###########");



        }

        static String businesCardTwo(String name, String surname, String telephone, int yearOfBirth){
            return "#######\nVizitkarte\nVārds:" + name + "\n Uzvārds:" + surname + "\nTelefona nr:" + telephone + "\nDzimšanas gads:" + yearOfBirth;
        }

        static int sum(int a, int b){
        return a + b;
        }

        static double avg(double a, double b, double c){
        return (a + b + c)/3;
        }

    }

