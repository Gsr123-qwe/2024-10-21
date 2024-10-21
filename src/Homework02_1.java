import java.util.Random;

public class Homework02_1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[100];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000);
        }


        bubbleSort(arr);


       int sum = Sum(arr);
        int average = Average(arr);
        int max = arr[arr.length - 1];
        int min = arr[0];
        double median = Median(arr);

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Median: " + median);

        // 所有数
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Num " + i + ": " + arr[i]);
        }
    }

    public static int Sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int Average(int[] arr) {
        return Sum(arr) / arr.length;
    }

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }
    }


    public static double Median(int[] arr) {
        if (arr.length % 2 == 0) {
            return (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2.0;
        }
        return 0;
    }
}