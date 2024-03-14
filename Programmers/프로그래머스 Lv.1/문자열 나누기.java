class Solution {
    public int solution(String s) {
        int count = 0; // 분해된 문자열의 개수를 세는 변수
        char first = s.charAt(0);
        int firstCount = 0;
        int otherCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (firstCount == otherCount) {
                count++;
                first = s.charAt(i);
            }
            if (s.charAt(i) == first) firstCount++;    
            else otherCount++;
        }
        return count;
    }
}
