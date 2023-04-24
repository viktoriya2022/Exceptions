/*
2. Если необходимо, исправьте данный код (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
*/

package HomeWork_2.HW_2_2;

public class Main {
    public static void main(String[] args) {

        int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (Exception e) {
            System.out.println("Непредвиденная ошибка");
            e.printStackTrace();
        }
    }
}
