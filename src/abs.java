import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class abs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            double num = in.nextDouble();
            DecimalFormat decimalFormat = new DecimalFormat(("00"));
            System.out.println(decimalFormat.format(Math.abs(num)));






            StringBuilder builder = new StringBuilder("guang si ru");
            builder.setCharAt(0, (char) (builder.charAt(0) - 32));

            for (int i = 1; i < builder.length() - 1; i++) {
                if (builder.charAt(i) == ' ') {
                    builder.setCharAt(i + 1, (char) (builder.charAt(i + 1) - 32));
                }


            } System.out.println(builder);

        }
    }
}