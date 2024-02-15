package ru.gb.hw;

import static ru.gb.hw.ComparatorArray.compareArrays;

public class Main {
    public static void main(String[] args) {
        // Пример для Задания № 1
        double x = 5;
        int y = 3;

        System.out.println("Сумма: " + Calculator.sum(x, y));
        System.out.println("Произведение: " + Calculator.multiply(x, y));
        System.out.println("Частное: " + Calculator.divide(x, y));
        System.out.println("Разность: " + Calculator.subtract(x, y));

        // Примеры для Задания №2
        Integer[] iArray1 = {1, 2, 3, 4, 5};
        Integer[] iArray2 = {1, 2, 3, 4, 5, 6};
        Integer[] iArray3 = {1, 2, 3, 4, 6};

        String[] sArray1 = {"apple", "banana", "orange"};
        String[] sArray2 = {"apple", "banana", "orange", "pineapple"};
        String[] sArray3 = {"apple", "banana", "grape"};

        System.out.println("iArray1 and iArray2 equal: " + compareArrays(iArray1, iArray2));
        System.out.println("iArray1 and iArray3 equal: " + compareArrays(iArray1, iArray3));

        System.out.println("sArray1 and sArray2 equal: " + compareArrays(sArray1, sArray2));
        System.out.println("sArray1 and sArray3 equal: " + compareArrays(sArray1, sArray3));

        System.out.println("iArray1 and sArray1 equal: " + compareArrays(iArray1, sArray1));

        //Пример для Задания №3
        Pair<Integer, String> pair1 = new Pair<>(1, "one");
        Pair<Double, Character> pair2 = new Pair<>(1.15, 'a');

        System.out.println("Pair 1 the first element: " + pair1.getFirst());
        System.out.println("Pair 2 the second element: " + pair2.getSecond());

        System.out.println("Pair 1: " + pair1.toString());
        System.out.println("Pair 2: " + pair2.toString());

    }
}