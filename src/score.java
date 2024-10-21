import java.util.Scanner;

public class score {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            double score = in.nextDouble();
            if (score < 0 || score > 100) {
                System.out.println("Score is error");
            } else {
                switch ((int) (score / 10)) {
                    case 10:
                        System.out.println("A");
                        break;
                    case 9:
                        System.out.println("A");
                        break;
                    case 8:
                        System.out.println("B");
                        break;
                    case 7:
                        System.out.println("C");
                        break;
                    case 6:
                        System.out.println("D");
                        break;
                    default:
                        System.out.println("E");
                        break;
                }

            }
        }
    }
}
