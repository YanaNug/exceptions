// Если необходимо, исправьте данный код 
//(задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

public class task2_2 {
    // В коде не были определены класс и метод main
    public static void main(String[] args) throws Exception {
        // Не был задан массив
        int[] intArray = {0, 1, 2, 3, 4, 5};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Не была задана проверка границ массива
            System.out.println("Ошибка! В массиве нет такого элемента! " + e);
         }
         catch (ArithmeticException e) {
            System.out.println("Ошибка! На ноль делить нельзя! " + e);
         }
    }
}