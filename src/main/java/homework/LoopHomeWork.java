package homework;

import java.util.Scanner;

public class LoopHomeWork {

    public static void main(String[] args) {

//        // pirmais uzdevums
//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi skaitli: ");
        int number = scanner.nextInt();
        int summa = 0;
        while (summa < 100){
            summa = summa + number;
            System.out.println("Ievadi skaitli: ");
            number = scanner.nextInt();
            if(summa > 100){
                break;
            }
            System.out.println("Gatavs!");
        }


            // Otrais uzdevums

//        int number, s, e;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a number: ");
//        number = scanner.nextInt();
//        s = 1;
//        e = 0;
//        while(s <= number)
//        {
//            if((number % s) == 0)
//                e = e + 1;
//            s++;
//        }
//        if(e == 2)
//        {
//            System.out.println(number + " is not a number.");
//        }
//        else
//        {
//            System.out.println(number + " is a prime number.");
//        }
//        scanner.close();

//         int[] masivs = new int[100];

//        // trešais uzdevums

        for (int j = 1; j <= 100; j++) {
//            if ((j % 3 == 0) || (j % 5 == 0)) {
//                System.out.println("Šis numurs mums neder " + j);
//            } else {
//                System.out.println("Šis numurs mums der " + j);
//            }
        }


        }
    }

