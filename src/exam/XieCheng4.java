package exam;

import java.util.Scanner;

public class XieCheng4 {

    public static int[] ai;
    public static int[] bi;
    public static int n;
    public static int x;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        x = scanner.nextInt();
        scanner.nextLine();

        ai = new int[n];
        for (int i = 0; i < n; i++) {
            ai[i] = scanner.nextInt();
        }
        scanner.nextLine();

        bi = new int[n];
        for (int i = 0; i < n; i++) {
            bi[i] = scanner.nextInt();
        }
        scanner.nextLine();

        int maxDegree = calLove(0,false, 0);
        System.out.println(maxDegree);
    }

    public static int calLove(int productNum, boolean canHalf, int curSpent) {
        if (productNum >= n) {
            return 0;
        }

        if (!canHalf) {
            //只能原价购买
            if (curSpent + ai[productNum] > x) {
                //原价购买超出预算，只能不买
                return calLove(productNum + 1, false, curSpent);
            } else {
                //在预算范围里，可买可不买
                int result1 = bi[productNum] + calLove(productNum + 1, true, curSpent + ai[productNum]);
                int result2 = calLove(productNum + 1, false, curSpent);
                return Math.max(result1, result2);
            }
        } else {
            //可以原价、半价、不买
            if (curSpent + ai[productNum] > x) {
                //原价超出预算
                if(curSpent + ai[productNum] / 2 > x) {
                    //半价超出预算
                    return calLove(productNum + 1, false, curSpent);
                } else {
                    //半价没超出预算，两种情况
                    int result1 = bi[productNum] + calLove(productNum + 1, false, curSpent + ai[productNum] / 2);
                    int result2 = calLove(productNum + 1, false, curSpent);
                    return Math.max(result1, result2);
                }
            } else {
                //原价没有超出预算，三种情况
                int result1 = bi[productNum] + calLove(productNum + 1, false, curSpent + ai[productNum] / 2);
                int result2 = calLove(productNum + 1, false, curSpent);
                int result3 = bi[productNum] + calLove(productNum + 1, true, curSpent + ai[productNum]);
                return Math.max(result1, Math.max(result2, result3));
            }
        }
    }

}
