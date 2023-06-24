package exam;

import java.util.Scanner;

public class MeiTuan1 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.nextLine();

        int[][] enemyPos = new int[N][2];
        for (int i = 0; i < N; i++) {
            int pos1 = scanner.nextInt();
            int pos2 = scanner.nextInt();
            scanner.nextLine();
            enemyPos[i][0] = pos1;
            enemyPos[i][1] = pos2;
        }

        int currRecord = 0;
        for (int i = 0; i < N; i++) {
            int min1 = enemyPos[i][0];
            int max1 = enemyPos[i][1];
            int min2 = enemyPos[i][0];
            int max2 = enemyPos[i][1];
            int count = 1;
            for (int j = 1; j < N; j++) {
                int diff1 = Math.max(Math.abs(enemyPos[j][0] - min1), Math.abs(enemyPos[j][0] - max1));
                int diff2 = Math.max(Math.abs(enemyPos[j][1] - min2), Math.abs(enemyPos[j][1] - max2));
                if (diff1 <= A && diff2 <= B) {
                    count += 1;
                    min1 = Math.min(min1, enemyPos[j][0]);
                    max1 = Math.max(max1, enemyPos[j][0]);
                    min2 = Math.min(min2, enemyPos[j][1]);
                    max2 = Math.min(max2, enemyPos[j][1]);
                }
            }
            if (count > currRecord) {
                currRecord = count;
            }
        }

        System.out.println(currRecord);
    }

}
