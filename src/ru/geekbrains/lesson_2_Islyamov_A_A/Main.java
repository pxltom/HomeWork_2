package ru.geekbrains.lesson_2_Islyamov_A_A;

public class Main {
    public static void main(String[] args) {
        System.out.println(summAandB(-15, 10));
        positiveOrNegative(1000);
    }

    static boolean summAandB(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }
    public static void positiveOrNegative (int a){
        if(a>=0){
            System.out.println("Положительное");
        }else {
            System.out.println("Отрицательное");
        }

    }

}



