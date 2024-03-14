public class Solution {
    public int[] solution(String str) {
        int[] result = {};
        int zeroCount = 0;
        String binaryString = "";
        int steps = 0;

        while (!str.equals("1")) {
            String trimmedStr = str.replace("0", "");
            zeroCount += str.length() - trimmedStr.length();
            int trimmedLength = trimmedStr.length();
            binaryString = Integer.toBinaryString(trimmedLength);
            str = binaryString;
            steps += 1;
        }
        result = new int[]{steps, zeroCount};
        return result;
    }
}
