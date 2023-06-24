package exam;

import java.util.Scanner;

public class MiHoYo2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        scanner.nextLine();

        boolean[] results = new boolean[q];
        for (int i = 0; i < q; i++) {
            String s = scanner.nextLine();
            String t = scanner.nextLine();
            results[i] = ifFromSToT(s, t);
        }

        for (int i = 0; i < q; i++) {
            System.out.println(results[i] ? "Yes" : "No");
        }
    }

    private static boolean ifFromSToT(String s, String t) {
        StringBuilder builderS = new StringBuilder(s);
        StringBuilder builderT = new StringBuilder(t);

        if (s.length() == t.length()) {
            return s.equals(t);
        } else if (s.length() < t.length()){
            int index1 = builderT.indexOf("m");
            int index2 = builderT.indexOf("h");
            int index3 = builderT.indexOf("y");
            while (builderT.length() > s.length() && index1 != -1 && index2 != -1 && index3 != -1) {
                builderT.deleteCharAt(index1);
                builderT.deleteCharAt(builderT.indexOf("h"));
                builderT.deleteCharAt(builderT.indexOf("y"));
                index1 = builderT.indexOf("m");
                index2 = builderT.indexOf("h");
                index3 = builderT.indexOf("y");
            }
            return builderT.toString().equals(s);
        } else {
            int index1 = builderS.indexOf("m");
            int index2 = builderS.indexOf("h");
            int index3 = builderS.indexOf("y");
            while (builderS.length() > t.length() && index1 != -1 && index2 != -1 && index3 != -1) {
                builderS.deleteCharAt(index1);
                builderS.deleteCharAt(builderS.indexOf("h"));
                builderS.deleteCharAt(builderS.indexOf("y"));
                index1 = builderS.indexOf("m");
                index2 = builderS.indexOf("h");
                index3 = builderS.indexOf("y");
            }
            return builderS.toString().equals(t);
        }
    }

}
