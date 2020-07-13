import java.util.Scanner;

public class Solution3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();

            StringBuilder resultString = new StringBuilder(s1);
            String resultInt = new String();

            if (x > 9 && x < 100) {
                resultInt = "0" + String.valueOf(x);
            }
            else if (x >= 0 && x < 10) {
                resultInt = "00" + String.valueOf(x);
            } else {
                resultInt = String.valueOf(x);
            }
            if (s1.length() < 15) {
                int loop = 15 - s1.length();
                String temp = new String();
                for (int j = 0; j < loop; j++) {
                    temp = temp + " ";
                }
                resultString.append(temp);
            }
            System.out.println(resultString + resultInt);
        }

        System.out.println("================================");

    }
}