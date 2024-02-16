import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        // 각 질문에 대해 성격 유형 점수 누적
        Map<Character, Integer> typeMap = new HashMap<>();
        int[] score = {0, 3, 2, 1, 0, 1, 2, 3}; // 선택지에 따른 점수
        
        // 각 지표별로 더 높은 점수를 가진 성격 유형 선택
        StringBuilder result = new StringBuilder();
        char[] types = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        
        for (char type : types)
            typeMap.put(type, 0);
        
        for (int i = 0; i < survey.length; i++) {
            int pos = choices[i] >= 5 ? 1 : 0; // 선택지에 따른 인덱스 설정
            char type = survey[i].charAt(pos); // 해당 질문의 유형
            int currentScore = typeMap.get(type); // 현재까지의 점수
            int additionalScore = score[choices[i]]; // 선택지에 따른 추가 점수
            typeMap.put(type, currentScore + additionalScore); // 점수 누적
        }
        
        for (int i = 0; i < types.length; i += 2) {
            char type1 = types[i];
            char type2 = types[i + 1];
            if (typeMap.get(type1) >= typeMap.get(type2))
                result.append(type1);
            else
                result.append(type2);
        }
        
        return result.toString();
    }
}
