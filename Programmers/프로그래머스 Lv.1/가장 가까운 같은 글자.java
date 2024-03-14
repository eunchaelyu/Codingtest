import java.util.*;
class Solution {
    public int[] solution(String s) {
        // 결과를 담을 배열 선언
        int[] answer = new int[s.length()];
        // 문자와 마지막으로 본 인덱스를 저장할 Map 선언
        Map<Character, Integer> map = new HashMap<>();
        
        // 문자열의 각 문자에 대해 반복
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // 만약 Map에 해당 문자가 없다면 결과를 -1로 설정
            if (!map.containsKey(currentChar)) {
                answer[i] = -1;
            } else {
                // 만약 Map에 이미 존재하는 문자라면 현재 인덱스와 이전에 본 인덱스의 차이 계산
                answer[i] = i - map.get(currentChar);
            }

            // Map을 현재 문자와 현재 인덱스로 업데이트
            map.put(currentChar, i);
        }
        
        return answer;
    }
}
