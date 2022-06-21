package homework.classHomeWork;

import java.util.Scanner;

public class Trijsturis {
        double a = 10;
        double b = 12;
        double c = 18;
        double pusperimetrs = (a + b + c)/2;
        //double laukums = Math.sqrt(pusperimetrs*(pusperimetrs-a)*(pusperimetrs-b)*(pusperimetrs-c));
        public Trijsturis(){
                System.out.println("Veidoju trijsturi...");
        }
        Trijsturis(double a, double b, double c) {
                this.a = a;
                this.b = b;
                this.c = c;
                }

        public Trijsturis(double pusperimetrs) {
                this.pusperimetrs = pusperimetrs;
        }

        public double trijsturaLaukums () {
                        return Math.sqrt(pusperimetrs * (pusperimetrs - a) * (pusperimetrs - b) * (pusperimetrs - c));
                }

        }





