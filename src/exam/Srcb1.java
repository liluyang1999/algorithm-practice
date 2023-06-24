package exam;

import java.util.Scanner;

public class Srcb1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();

        int[] heights = new int[number];
        for (int i = 0; i < number; i++) {
            heights[i] = scanner.nextInt();
        }

        scanner.nextLine();

        int curMax = 0;
        int curWidth = 0;
        for (int i = 0; i < number; i++) {
            curWidth += 1;

            int numRecord = 0;
            for (int j = 0; j < number; j++) {
                if (heights[j] >= curWidth) {
                    numRecord++;
                }
                if ((curWidth - numRecord) > (number - j)) {
                    break;
                }
            }

            if (numRecord >= curWidth) {
                curMax = curWidth;
            }
        }

        System.out.println(curMax);
    }

}
