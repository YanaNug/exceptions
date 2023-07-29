// Дан следующий код, исправьте его там, где требуется 
// (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

public class task2_3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        // Исключения NullPointerException и IndexOutOfBoundsException не будут обрабатываться 
        // в отдельных блоках, потому что уже обработаны в блоке catch Throwable
        // Решение - переместить блок catch Throwable ниже, как менее информативный
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
     }
     // Не тот тип исключения: был FileNotFoundException, а нужно проверку на соответствие типу. 
     // Например, чтобы не складывать строку с числом
     public static void printSum(Integer a, Integer b) throws IllegalArgumentException {
        System.out.println(a + b);
     }
     
}