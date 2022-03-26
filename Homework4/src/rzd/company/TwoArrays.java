package rzd.company;
/*
- Есть два массива числовых. Необходимо сделать деление каждого элемента первого массива на второй массив.
Если при делении получаем exception, то есть возникла ситуация деления на 0. В этом случае вывести вместо
результата сообщение об ошибке и продолжить деление.
 */
public class TwoArrays {
    public static void main(String[] args) {
        int Q = 0;

        System.out.println("Array1:");
        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = ((int)(Math.random() * (100+15)) - 15);
            System.out.print(array1[i] + " ");
        }

        System.out.println();

        System.out.println("Array2:");
        int[] array2 = new int[10];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = ((int)(Math.random() * (100+15)) - 15);
            System.out.print(array2[i] + " ");
        }

        System.out.println();

        System.out.println("Result:");
        for (int i = 0; i < array1.length; i++){
            try {
                Q = array1[i] / array2[i];
            } catch (ArithmeticException e){
                System.out.println("На ноль делить нельзя! Причина: " + e.getMessage());
            }
            System.out.print(Q + " ");
        }
    }
}
