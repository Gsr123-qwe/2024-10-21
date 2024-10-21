import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        System.out.println("请输入大于6的偶数:");
        Scanner myScanner = new Scanner(System.in);

        int num = myScanner.nextInt();


        if (num > 6 && num % 2 == 0) {
            for (int i = 2; i < num; i++) {
                int j = num - i;
                if (j % i != 0 && i != 1 && j != 1) {
                    if (isPrime(i) && isPrime(j)) {
                        System.out.println("num=" + j + "+" + i);
                    }
                }
            }
        } else {
            System.out.println("输入错误");
        }

    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            } }
        return true;
    }
}