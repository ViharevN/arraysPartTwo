import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //задание 1

        int [] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        System.out.println("Сумма трат за месяц составила "+ sum +" рублей");

        //задание 2

        int minSpending = 200_000;//указываем большее значение, т.к. ищем минимальное значение в массиве
        int maxSpending = 0;//указываем меньшее значение, т.к. ищем большее значение. В эту переменнуюю запишем наибольшее значение
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i] < minSpending) {
                minSpending = arr[i];
            }
            if (arr[i]>maxSpending) {
                maxSpending=arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+ minSpending +" рублей. Максимальная сумма трат за день составила "+ maxSpending +" рублей");




    }
    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr =new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }
}