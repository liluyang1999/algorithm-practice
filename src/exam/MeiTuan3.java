package exam;

import java.util.Scanner;

public class MeiTuan3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        StringBuilder builder = new StringBuilder(inputStr);
        int strLen = builder.length();
        int count = 0;
        int changeRecord = 0;
        for (int i = 0; i <= strLen / 2 - 1; i++) {
            int char1 = builder.charAt(i);
            int char2 = builder.charAt(strLen - 1 - i);
            if (char1 != char2) {
                count += 1;
                int minChar = Math.min(char1, char2);
                builder.setCharAt(i, (char) minChar);
                builder.setCharAt(strLen - 1 - i, (char) minChar);
                changeRecord = i;
            }

            if (count == 2) {
                break;
            }
        }

        if (count == 1) {
            //只改了一次，说明要将两个不对成的数都换成最小的a或者最中间的数
            if (strLen % 2 != 0) {
                int char1 = builder.charAt(changeRecord);
                int char2 = builder.charAt(strLen / 2);
                if (char1 >= char2) {
                    builder.setCharAt(changeRecord, 'a');
                    builder.setCharAt(strLen - 1 - changeRecord, 'a');
                } else {
                    builder.setCharAt(strLen / 2, 'a');
                }
            } else {
                builder.setCharAt(changeRecord, 'a');
                builder.setCharAt(strLen - 1 - changeRecord, 'a');
            }
        }

        if (count == 0) {
            //没有改过，找出两个最大的对称数换成a
//            int searchNum;
//            if (strLen % 2 == 0) {
//                searchNum = strLen / 2 - 1;
//            } else {
//                searchNum = strLen / 2;
//            }

            int charTemp = builder.charAt(0);
            int indexTemp = 0;
            for (int j = 1; j <= strLen / 2 - 1; j++) {
                int currChar = builder.charAt(j);
                if (currChar > charTemp) {
                    indexTemp = j;
                }
            }

            if (strLen % 2 != 0) {
                int char1 = builder.charAt(strLen / 2);
                int char2 = builder.charAt(indexTemp);
                if (char1 >= char2) {
                    builder.setCharAt(strLen / 2, 'a');
                } else {
                    builder.setCharAt(indexTemp, 'a');
                    builder.setCharAt(strLen - 1 - indexTemp, 'a');
                }
            } else {
                builder.setCharAt(indexTemp, 'a');
                builder.setCharAt(strLen - 1 - indexTemp, 'a');
            }
        }

        System.out.println(builder);
    }

}
