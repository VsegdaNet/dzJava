package homework3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
//        task1();
        task2();
    }

    private static void task1() {

        ArrayList<String> differentThingsArr = new ArrayList<>(Arrays.asList("Яблоко", "11", "13", "Апельсин", "Дыня", "17"));
        System.out.println(differentThingsArr);
        ArrayList<String> orderlyArr = new ArrayList<>();

        for (int i = 0; i < differentThingsArr.size(); i++) {
            String lengthElem = differentThingsArr.get(i);
            try {
                Integer.parseInt(lengthElem);
                orderlyArr.add(lengthElem);
            }
            catch (Exception r) {
            }
        }
        differentThingsArr.removeAll(orderlyArr);
        System.out.println(differentThingsArr);
    }

    private static void task2() {

        Scanner iScanner = new Scanner(System.in);
        List<ArrayList<String>> bookList = new ArrayList<>();
        int Cool = 1;

        for (int i = 0; i < Cool; i++) {
            System.out.println("Введите Жанр книги: ");
            String inputGenre = iScanner.nextLine();
            ArrayList<String> bookGenre = new ArrayList<>();
            bookGenre.add(inputGenre);

            System.out.println("Введите количество книг в жанре: ");
            int bookinput = Integer.parseInt(iScanner.nextLine());

            for (int j = 0; j < bookinput; j++) {
                System.out.println("Введите название книги: ");
                String booktitle = iScanner.nextLine();
                bookGenre.add(booktitle);
            }
            bookList.add(bookGenre);
        }
        bookList.forEach(System.out::println);
    }

}
