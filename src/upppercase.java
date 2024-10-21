import java.util.Scanner;

public class upppercase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            StringBuilder stringbuilder = new StringBuilder(in.nextLine());
            stringbuilder.setCharAt(0, (char) (stringbuilder.charAt(0) - 32));
            for(int i =0;i<stringbuilder.length()-1;i++){
                if(stringbuilder.charAt(i)==' '){
                    stringbuilder.setCharAt(i+1,(char) (stringbuilder.charAt(i+1) - 32));
                }
            }
            System.out.print(stringbuilder.toString());
        }
    }
}
