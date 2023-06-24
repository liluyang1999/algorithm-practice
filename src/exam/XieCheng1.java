package exam;

import java.util.Scanner;

public class XieCheng1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrNum = scanner.nextInt();
        int[] arr = new int[arrNum];
        for (int i = 0; i < arrNum; i++) {
            arr[i] = scanner.nextInt();
        }

        int curMax = 1;
        int curRecord = 1;
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i] - arr[i -1]) <= 1) {
            curRecord = curRecord + 1;
            } else {
                curRecord = 1;
            }

            if (curRecord > curMax) {
                curMax = curRecord;
            }
        }
        System.out.println(curMax);
    }

}
