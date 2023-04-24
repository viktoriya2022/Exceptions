/*
3.  Дан следующий код, исправьте его там, где требуется
*/

package HomeWork_2.HW_2_3;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
            ex.printStackTrace();
        }
    }

    public static void printSum(Integer a, Integer b){

        System.out.println(a + b);
    }
}
