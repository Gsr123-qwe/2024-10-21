import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {

        for (int num = 100; num < 999; num++) {
            if (isShuiXian(num)) {
                System.out.println(num+"是水仙花数");
            }
        }

        }
    public static boolean isShuiXian(int num){
        int bai = num / 100;
        int shi = (num % 100) / 10;
        int ge = num % 10;
        double sum =  Math.pow(bai, 3) + Math.pow(shi, 3) + Math.pow(ge, 3);
        return sum == num;
    }
}
