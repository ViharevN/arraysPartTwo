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

        //задание 3
        double summ = 0;//сумма общая
        double mean = 0;//среднее значение, получаем от деления суммы на количество элементов массива
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
            mean = summ/arr.length;
        }
        System.out.println("Общая сумма трат за месяц составила "+summ+" рублей");
        System.out.println("Средняя сумма трат за месяц составила "+mean+" рублей");


        //задание 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1 ; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        //int i = reverseFullName.length-1 инициализируем цикл с последнего элемента массива,
        // указываем, что индекс не может быть меньше 0 и включаем счетчик i-- в обратную сторону
        //выводим элементы в обратном порядке



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