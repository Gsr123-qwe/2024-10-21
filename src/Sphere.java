import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        System.out.println("请输入半径");
        Scanner in = new Scanner(System.in);


        while (in.hasNext()) {
            double r = in.nextDouble();
            System.out.printf("%.3f\n",Math.PI * (4.0 / 3.0) * r * r * r);

        }
}}