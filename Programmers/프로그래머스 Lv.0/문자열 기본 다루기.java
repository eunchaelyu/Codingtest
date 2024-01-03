class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return answer;
    }
}
