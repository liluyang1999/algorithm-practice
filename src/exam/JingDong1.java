package exam;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JingDong1 {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = 0;
        try {
            t = Integer.parseInt(reader.readLine());

            int[] result = new int[t];
            for (int i = 0; i < t; i++) {
                String content = reader.readLine();
                String[] splitInt = content.split(" ");
                int a = Integer.parseInt(splitInt[0]);
                int b = Integer.parseInt(splitInt[1]);
                int l = Integer.parseInt(splitInt[2]);
                int r = Integer.parseInt(splitInt[3]);
                result[i] = countTriangles(a, b, l, r);
            }
            for (int i = 0; i < t; i++) {
                System.out.println(result[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int countTriangles(int a, int b, int l ,int r) {
        int count = 0;
        int cMin = Math.abs(a - b) + 1;
        int cMax = a + b - 1;

        if (r < cMin || l > cMax) {
            return 0;
        }

        int max = Math.max(l, cMin);
        int min = Math.min(r, cMax);
        for (int c = max; c <= min; c++) {
            if (a + b > c && a + c > b && c + b > a) {
                count++;
            }
        }
        return count;
    }

}


