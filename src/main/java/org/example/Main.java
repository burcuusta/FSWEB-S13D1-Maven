package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true, 22));

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34)); // false

        System.out.println(isCatPlaying(false,43));

        System.out.println(area(15,20));
        System.out.println(area(20));
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {


        if (clock < 0 || clock > 23) {
            return false;
        }

        if (isBarking) {
            if (clock < 8 || clock >= 20) {
                return true;
            }
        }
        return false;


    }


    public static boolean hasTeen(int yas1, int yas2, int yas3) {
        return (yas1 >= 13 && yas1 <= 19) ||
                (yas2 >= 13 && yas2 <= 19) ||
                (yas3 >= 13 && yas3 <= 19);
    }



    public static boolean isCatPlaying(boolean isSummer, int temp) {

        if (isSummer) {
            return temp >= 25 && temp <= 45;
        } else {
            return temp >= 25 && temp <= 35;
        }
    }

    public static double area(double width, double height) {
        if(width<0 || height<0)
        {
            return -1;
        }
        return width*height;

    }

    public static double area(double radius) {
        if(radius<0)
        {
            return -1;
        }
        return radius*radius*Math.PI;
    }
}