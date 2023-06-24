package exam;

import java.util.Scanner;

public class XieCheng3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v0 = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.nextLine();

        double t = 0.0;
        double totalCost = Double.MAX_VALUE;
        int record = 0;
        while (true) {
            t += 0.0000002;
            double spent = (y / (v0 + t * x)) + t;
            if (spent < totalCost) {
                totalCost = spent;
            } else {
                record++;
                if (record == 5) {
                    break;
                }
            }
        }
        System.out.println(totalCost);
    }

}
