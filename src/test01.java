import jdk.nashorn.internal.objects.NativeArray;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class test01 {
    public static void main(String[] args){
        System.out.println("请输入数字");
        Scanner in = new Scanner(System.in);

        ArrayList list = new ArrayList();
        while (true) {
            int input= in.nextInt();
            if ( input==0){
                list.sort(Comparator.naturalOrder());
                list.remove(0);
                System.out.println(list);
                break;
            } else {
                list.add(input);
                list.sort(Comparator.naturalOrder());//升序


            }
        }

    }
}
