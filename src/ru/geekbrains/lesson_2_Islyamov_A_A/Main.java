package ru.geekbrains.lesson_2_Islyamov_A_A;

public class Main {
    public static void main(String[] args) {
        System.out.println(summAandB(-15, 10));
        positiveOrNegative(1000);
        System.out.println(falseIfNegativeAndTrueIfPositive(-10));
        stringLooptimes("hgf", 10);
    }
    static boolean summAandB(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }
    public static void positiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
    public static boolean falseIfNegativeAndTrueIfPositive(int a) {
        //     return a < 0 ? true : false;
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void stringLooptimes(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }
    public static boolean leapYearsOrNot(int b) {
        return (b % 4 == 0 && b % 100 != 0 || b % 400 == 0);
    }
}



