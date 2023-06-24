package exam;

import java.util.Scanner;

public class XieCheng2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        scanner.nextLine();

        String initStr = scanner.nextLine().toLowerCase();
        StringBuilder initStrBuilder = new StringBuilder(initStr);

        for (int i = 0; i < q; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            scanner.nextLine();
            int offsetRecord = 0;

            for (int j = 0; j < r - l + 1; j++) {
            char ch = initStr.charAt(l - 1 + j);
                initStrBuilder.insert(l - 1 + j + offsetRecord, ch);
                offsetRecord++;
            }

            initStr = initStrBuilder.toString();
            initStrBuilder = new StringBuilder(initStr);
        }
        System.out.println(initStrBuilder);
    }

}
