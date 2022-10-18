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