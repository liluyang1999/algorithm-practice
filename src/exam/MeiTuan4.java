package exam;

import java.util.Scanner;

public class MeiTuan4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        scanner.nextLine();

        int[][] price = new int[N][2];
        for (int i = 0; i < N; i++) {
            price[i][0] = scanner.nextInt();
            price[i][1] = scanner.nextInt();
            scanner.nextLine();
        }

        calMaxQuantityMinMoney(N, X, Y, price);
    }

    private static void calMaxQuantityMinMoney(int N, int X, int Y, int[][] price) {
        int numCount = 0, payCount = 0;
        calMaxQuantity(0, 0, true, N, X, Y, price, numCount, payCount);
        calMaxQuantity(0, 0, false, N, X, Y, price, numCount, payCount);
    }

    private static void calMaxQuantity(int currNum, int currPay, boolean ifDiscount, int N, int X, int Y, int[][] price, int numCount, int payCount) {
//        if (currNum == N || currPay >= X) {
//            return currNum;
//        }
//
//        if (ifDiscount && currPay + price[currNum][1] <= X) {
//            calMaxQuantity(currNum + 1, currPay + price[currNum][1], true, N, X, Y, price, numCount, payCount);
//        }

    }

}
