package ru.gb.hw;
/*
Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые,
и false в противном случае. Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать
элементы одного типа.
 */
public class ComparatorArray {
    public static <T, E> boolean compareArrays(T[] arr1, E[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        return arr1.getClass().getComponentType().equals(arr2.getClass().getComponentType());
    }

}
