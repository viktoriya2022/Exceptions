
/* 1. Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
Метод должен пройтись по каждому элементу и проверить что он не равен null.
А теперь реализуйте следующую логику:
Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

2. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен сумме элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.


*/


package HomeWork_1;

import java.util.Arrays;

public class Exceptions_HW_1 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, null, 4, null, 6};
        checkArray(arr);

        int[] array1 = {1,2,3,4,6};
        int[] array2 = {1,2,3,4,5,6};
        System.out.println("Первый массив: " + Arrays.toString(array1));
        System.out.println("Второй массив: " + Arrays.toString(array2));
        sumOfArray(array1, array2);
    }

    private static void sumOfArray(int[] a, int[] b) {
        if (a.length != b.length) {
            throw new RuntimeException("Длины массивов должны быть равны.");
            }
        System.out.print("Итоговый массив: ");
            int[] newArray = new int[a.length];
            for (int i = 0; i < a.length; ++i) {
                newArray[i] = a[i] + b[i];
            System.out.print(newArray[i] + " ");
        }
    }

    private static void checkArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                System.out.println("Элемент с индексом " +i + " - null. ");
            }
        }
    }
}
