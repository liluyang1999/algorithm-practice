package exam;

import java.util.Scanner;

public class MiHoYo3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ai = new int[n];

        for (int i = 0; i < n; i++) {
            ai[i] = scanner.nextInt();
        }
        scanner.nextLine();

        int length = ai.length;
        long count = 0;
        int lastNum;
        for (int i = 0; i < length; i++) {
            lastNum = ai[i];
            for (int j = i + 1; j < length; j++) {
                if (ai[j] % lastNum == 0 || lastNum % ai[j] == 0) {
                    count += 1;
                    lastNum = ai[j];
                }
            }
        }

        System.out.println((int)(count % (Math.pow(10, 9) + 7)));
    }
    

}
