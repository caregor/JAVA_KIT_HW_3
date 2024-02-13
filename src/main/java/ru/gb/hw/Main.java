package ru.gb.hw;

public class Main {
    public static void main(String[] args) {
        // Пример для Задания № 1
        double x = 5;
        int y = 3;

        System.out.println("Сумма: " + Calculator.sum(x, y));
        System.out.println("Произведение: " + Calculator.multiply(x, y));
        System.out.println("Частное: " + Calculator.divide(x, y));
        System.out.println("Разность: " + Calculator.subtract(x, y));

    }
}