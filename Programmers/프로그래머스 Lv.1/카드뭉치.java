class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int i1 = 0; 
        int i2 = 0; 
        
        // goal 배열 순회
        for (String current : goal) {
            // current가 cards1[i1] 또는 cards2[i2]에 포함하는지 확인
            if (i1 < cards1.length && current.equals(cards1[i1])) {
                i1++; // cards1[i1]에 포함하는 경우 i1 증가
            } else if (i2 < cards2.length && current.equals(cards2[i2])) {
                i2++; // cards2[i2]에 포함하는 경우 i2 증가
            } else {
                return "No"; // 둘 다 포함하지 않는 경우
            }
        }
        
        return "Yes";
    }
}
