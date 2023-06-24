package exam;

import java.util.Scanner;

public class Srcb2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        String[] strArr = new String[t];
        for (int i = 0; i < t; i++) {
            strArr[i] = scanner.nextLine();
        }

        for (int i = 0; i < t; i++) {
            int result = calMaxTimes(strArr[i]);
            System.out.println(result);
        }
    }

    public static int calMaxTimes(String inputStr) {
        char[] chars = inputStr.toCharArray();
        int zero = 0, one = 0;
        for (char ch : chars) {
            if (ch == 0) {
                zero++;
            } else {
                one++;
            }
        }
        if (zero >= one) {
            return zero - one;
        } else {
            return one - zero;
        }
    }

}
