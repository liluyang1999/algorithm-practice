package exam;

import java.util.*;

public class XieCheng5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();

        String[] arr = inputStr.split(" ");
        int k = scanner.nextInt();
        scanner.nextLine();

        calFrequency(arr, k);
    }

    public static void calFrequency(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String each: arr) {
            if (!map.containsKey(each)) {
                map.put(each, 1);
            } else {
                int curFre = map.get(each);
                map.put(each, ++curFre);
            }
        }

        int[] rank = new int[map.size()];
        int index = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            rank[index] = value;
            index++;
        }
        Arrays.sort(rank);

        StringBuilder builder = new StringBuilder("{");
        for (int i = 0; i < k; i++) {
            int fre = rank[rank.length - 1 - i];

            Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().stream().filter(each -> each.getValue().equals(fre)).iterator();
            String strTemp = iterator.next().getKey();
            while (iterator.hasNext()) {
                Map.Entry<String, Integer> entry = iterator.next();
                if (entry.getKey().compareTo(strTemp) < 0) {
                    strTemp = entry.getKey();
                }
            }
            builder.append("\"").append(strTemp).append("\":").append(map.get(strTemp));
            if (i < k - 1) {
                builder.append(", ");
            }
            map.remove(strTemp);
        }
        builder.append("}");
        System.out.println(builder);
    }

}
