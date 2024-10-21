import java.util.Arrays;
import java.util.Random;

public class Homework02 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[100];
        double sum = 0;
        int max = 0;
        int min = 0;

        // 生成随机数并求和
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000);
            sum += arr[i]; //求和

            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        Arrays.sort(arr);

        // 中位数
        double zhong = 0;
        if (arr.length % 2 == 0) {
            zhong = (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2.0;
       // } else {
       //     zhong = arr[arr.length / 2];
        }

        System.out.println("Zhong: " + zhong);
        //average
        double average = sum / arr.length;
        // sum
        System.out.println("Sum: " + sum);


        // 最大值
        System.out.println("Max: " + max);

        // 最小值
        System.out.println("Min: " + min);
//
        System.out.println("Average: " + average);
        //  all num
        for (int i = 0; i < arr.length; i++) {
            System.out.println("num " + i + ": " + arr[i]);
        }
    }
    }
