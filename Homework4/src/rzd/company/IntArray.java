package rzd.company;
/*
- Ввести массив целых чисел в консоль. При попытке ввести значение нецелого типа автоматически генерировать
исключение. Введенный массив, в случае отсутствия ошибок, вывести в обратном порядке, выполняя переворачивания
массива. То есть первый элемент должен поменяться местами с последним, второй с предпоследним.
Массив изначально содержит четное количество элементов. Используйте методы.
 */
import java.util.Scanner;

// Метод разворачивания массива
public class IntArray{
    static int[] ReversArray(int[] array) {
        int j = 0;
        int[] result = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--, j++) {
            result[j] = array[i];
//            System.out.print(result[j] + " ");
        }
        return result;
    }

    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[10];

        try {
        for (int i = 0; i < array1.length; i++) {
            if (!sc.hasNextInt()) {
                throw new Exception("Вы ввели не целое число!!!");
                }
            array1[i] = sc.nextInt();}

            System.out.print("Первоначальный массив: ");
            for(int a : array1){ System.out.print(a + " "); }

            System.out.print("\nПеревёрнутый массив: ");
            int [] array2 = ReversArray(array1);
            for(int a : array2){
                System.out.print(a + " ");
            }
        }
        finally {
            System.out.println("\nОстанавливаем Scanner");
            sc.close();
        }
    }
}

