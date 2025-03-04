package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
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

}
public class YasTespiti {
    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge >= 13 && firstAge <= 19) ||
                (secondAge >= 13 && secondAge <= 19) ||
                (thirdAge >= 13 && thirdAge <= 19);
    }
public static void main(String[] args) {
    System.out.println(hasTeen(9, 99, 19));
    System.out.println(hasTeen(23, 15, 42));
    System.out.println(hasTeen(22, 23, 34));
}
     }


public class KediOyunu {
    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer) {
            return temp >= 25 && temp<= 45;
        } else {
            return temp >= 25 && temp<= 35;
        }
    }
}

public class AlanHesaplama {
    public static double area(double width, double height) {
        if (height < 0 || width < 0) {
            return -1.0;
        }
        return height * width;
    }


public static double area(double radius) {
    if (radius < 0) {
        return -1.0;
    }
    return radius * radius * Math.PI;
}

public static void main(String[] args) {
    System.out.println(area(5.0, 4.0));
    System.out.println(area(-1.0, 4.0));
    System.out.println(area(5.0));
    System.out.println(area(-1.0));
}
}

