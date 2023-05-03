package homework;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        // task4();
    }

    private static void task1() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int lenghtNum = inp.nextInt();
        int[] arr = new int[lenghtNum];
        for (int i = 0; i < lenghtNum; i++) {
            System.out.println("Введите элемент массива:");
            int initialValue = inp.nextInt();
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void task2() {
        int[] arr = new int[]{1, 2, 1, 9, 11, 7, 81, 43, 1, 4};
        Arrays.sort(arr);
        System.out.println("минимальный элементы: " + arr[0]);
        System.out.println("максимальный элементы: " + arr[arr.length - 1]);

    }

    private static void task3() {
    Scanner inp = new Scanner(System.in);
    Random rndt = new Random();
    System.out.println("Введите размер массива");
    int num = inp.nextInt();
    int[][] arr = new int[num][num];
    for(int i = 0; i < num; i++){
        for(int j = 0; j < i; j++){
            arr[i][j] = rndt.nextInt(10) + 1;
        }
    }
    for (int i = 0; i < arr.length; i++) {
        System.out.println(Arrays.toString(arr[i]));
    }
    for (int i = 0; i < num; i++) {
        arr[i][i] = 1;
    }
    System.out.println("");
    for(int i = 0; i < arr.length; i++){
        System.out.println(Arrays.toString(arr[i]));
    }
    }

    private static void task4() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите имя; ");
        String name = scr.nextLine();

        final Calendar calen = Calendar.getInstance();
        StringBuilder timeNow = (new StringBuilder().append(calen.get(Calendar.HOUR_OF_DAY))
                .append(":").append(calen.get(Calendar.MINUTE)).append(":")
                .append(calen.get(Calendar.SECOND)).append(" "));
        System.out.println(timeNow);
        int timeResult = (calen.get(Calendar.HOUR_OF_DAY));
        if (timeResult > 5 && timeResult < 12) {
            System.out.printf("Доброе утро, %s!", name);
        }
        if (timeResult > 12 && timeResult < 18) {
            System.out.printf("Добрый день, %s!", name);
        }
        if (timeResult > 18 && timeResult < 23) {
            System.out.printf("Добрый вечер, %s!", name);
        }
        if (timeResult > 0 && timeResult < 5) {
            System.out.printf("Доброй ночи, %s!", name);
        }
        if (timeResult == 24) {
            System.out.printf("Доброй ночи, %s!", name);
        }
        System.out.println();
    }



}



