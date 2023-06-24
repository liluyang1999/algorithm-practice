package exam;

import java.util.*;

public class MeiTuan2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.nextLine();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.nextLine();

        int currRecord = 0;
        for (int i = 0; i < N; i++) {
            int count = 0;
            Set<Integer> set = new HashSet<>();
            for (int j = i; j < N; j++) {
                set.add(arr[j]);
                if (set.size() > K) {
                    currRecord = Math.max(count, currRecord);
                    break;
                } else {
                    count++;
                }
            }
        }

        System.out.println(currRecord);
    }

}
