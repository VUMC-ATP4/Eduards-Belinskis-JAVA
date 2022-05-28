package calssroomTwo;

import java.util.Scanner;

public class PracticalTaskTwo {

    public static void main(String[] args) {
//    tips,     nosaukums   deklaracija
        Scanner scanner = new Scanner(System.in);
        int vecums;

        System.out.println("Paskaties cilveka pase!");
        vecums = scanner.nextInt();
        if (vecums >=18){
            System.out.println("Drikst balsto!");
        }
        else{
            System.out.println("Ej majas!");
        }

            int month = 6;

            switch(month){
                case 1:
                    System.out.println("Janvaris");
                break;
                case 2:
                    System.out.println("Februaris");
                    break;
                case 12:
                    System.out.println("Decembris");
                default:
                    System.out.println("Menesis " + month + " nav definets");
            }

            int cilvekaVecums = 59;
            char dzimums = 'V';
            boolean drikstDoties = false;

            if(dzimums =='V' && cilvekaVecums>=65){
                drikstDoties=true;}
                else if (dzimums =='S' && cilvekaVecums>60){
                    drikstDoties=true;
                }
        System.out.println("Cilveks doties pensija " + drikstDoties);

                int skaitlisX = 15;
                if (skaitlisX % 2 == 0) {
                    System.out.println("Skaitlis ir para!");
                }else{
                        System.out.println("Skaitlis ir nepara!");
                    }



        int x =10;
        int y = 20;

        if(y>x && x>5){
            System.out.println("Y ir lielaks par X un X ir lielaks par 5");
        }


        if(y>x || x>2){
            System.out.println("Šis izpildās!");
        }


        int skaitlis =0;
        if(skaitlis >0){
            System.out.println(skaitlis + " ir pozitivs!");
        }else if(skaitlis <0){
            System.out.println(" ir negativs");
        }else
        {
            System.out.println(skaitlis + " skaitlis ir 0");
        }


        int skaitlis1 = 20;
                if(skaitlis1 ==10){
                    System.out.println("Skaitlis ir 10");
                }else if(skaitlis1 == 15){
                    System.out.println("Skaitlis ir 15");
                }else if(skaitlis1 == 20){
                    System.out.println("Skaitlis ir 20");
                } else{
                    System.out.println("Skaitlis ir nezinams!");
                }




        System.out.println("Ievadi savu vārdu");

        String vards = scanner.nextLine();

        System.out.println("Labdien "+vards + "!");
        System.out.println("Esi sveicinats kalkulators programmā!");
        System.out.println("Seit jabut nepatiesam" + (5>10));
        System.out.println((5<10));
        System.out.println((6==5));
        System.out.println((5==5));
        System.out.println((6!=5));
        int vecumsA = 18;
        System.out.println(vecumsA >= 18);
        int bernaVecums = 5;
        System.out.println(bernaVecums <=5);
        System.out.println(vecumsA>bernaVecums);
        boolean isEligibleToVote = vecumsA >=18;
        System.out.println("Vai cilveks ddrikst balstot " + isEligibleToVote);

        String nameOne = "Ansis";
        String nameTwo = "Ansis";
        System.out.println(nameOne.equals(nameTwo));

        System.out.println("Ievadi x");
        int r = 4;
        int summa = 10;
        System.out.println(summa);
        boolean vaIrPaties = (r<5 && r<10 && 1!=1);
        r=5;
        System.out.println((r<5 && r<10)); //false
        System.out.println((r<5 || r<10)); //true
        System.out.println(vaIrPaties);

//        int a;
//        int b;
//        int summa;
//
//        System.out.println("Ievadi skaitli a");
//        a = scanner.nextInt();
//        System.out.println("Ievadi skaitli b");
//        b = scanner.nextInt();
//        System.out.println(a > b);
//
//
//        summa = a + b;
//        System.out.println(String.format("%s, %s + %s = %s", vards, a, b, summa));


        System.out.println("Šī ir mana pirmā lekcija");
        String teksts;
        String name = "Eduards";
        teksts = String.format("Mani sauc %s", name);

        System.out.println(teksts);

        String avards = "Eduards";
        String surname = "Belinskis";
        String role = "Students";
        double videjaAtzime = 7.41312;

        String teikums = String.format("Mani sauc %s. Mans uzvārds ir %s. Es esmu %s. Mana " +
                "videja atzime ir %.1f", avards, surname, role, videjaAtzime);
        System.out.println(teikums);





    }
}
