import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        System.out.println("请输入数字");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int[] arr = new int[str.length()];
        for (int i = 0; i < arr.length; i++) {
            if (arr.length % 2 != 0 && arr[i] == arr[arr.length - i - 1]) {
                System.out.println("是");
                break;
            }else{
                System.out.println("不是");
            }
        }
//       String str = in.nextLine();
//        int[] newArr = new int[str.length()];
//      for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            int num = Character.getNumericValue(c);
//            newArr[i] = num;
//        }
//        boolean isH = true;
//        for (int start = 0, end = newArr.length - 1; start < end; start++, end--) {
//            if (newArr[start] != newArr[end]) {
//                isH = false;
//                break;
//            }
//        }
//        if (isH) {
//            System.out.println("是回文数");
//        } else {
//            System.out.println("不是回文数");
//        }
    }
}
