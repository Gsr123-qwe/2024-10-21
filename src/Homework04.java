import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num =in.nextInt();
        if(isPowerofTwo(num)){
            System.out.println("shi");
        }else{
            System.out.println("bushi");
        }
    }
    public static boolean isPowerofTwo(int x){
       return x>0&&(x&(x-1))==0;
    }
}
