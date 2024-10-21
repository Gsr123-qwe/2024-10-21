import java.util.*;

public class test03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        StringBuilder str = new StringBuilder(in.nextLine());

        ArrayList<Character> list = new ArrayList();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            list.add(c);
        }
        for (int i = 0; i < list.size(); i++) {
            char c = list.get(i);
            if (c < 'a') {
                list.set(i, (char) (c + 32));
            }

        }
        Collections.sort(list);
        System.out.println(list);
    }
}