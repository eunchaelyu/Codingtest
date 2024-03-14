import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        // 각 질문에 대해 성격 유형 점수 누적
        Map<Character, Integer> typeMap = new HashMap<>();
        int[] score = {0, 3, 2, 1, 0, 1, 2, 3}; // 선택지에 따른 점수

        // 각 성격 유형 초기화
        char[] types = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        for (char type : types)
            typeMap.put(type, 0);

        // 각 질문에 대한 점수 누적
        for (int i = 0; i < survey.length; i++) {
            char type = survey[i].charAt(choices[i] >= 5 ? 1 : 0); // 해당 질문의 유형
            typeMap.put(type, typeMap.get(type) + score[choices[i]]); // 점수 누적
        }

        // 각 지표별로 더 높은 점수를 가진 성격 유형 선택
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < types.length; i += 2) {
            char type1 = types[i];
            char type2 = types[i + 1];
            result.append(typeMap.get(type1) >= typeMap.get(type2) ? type1 : type2);
        }

        return result.toString();
    }
}
