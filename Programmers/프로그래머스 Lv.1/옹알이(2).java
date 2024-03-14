import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for (int i = 0; i < babbling.length; i++) {
            // 중복 발음 대체
            babbling[i] = babbling[i].replaceAll("(ayaaya|yeye|woowoo|mama)", "1");
            // 나머지 발음 대체
            babbling[i] = babbling[i].replaceAll("(aya|ye|woo|ma)", " ");

            // 문자열이 모두 공백인 경우 유효한 발음
            if (babbling[i].trim().isEmpty()) {
                ans++;
            }
        }

        return answer;
    }
}
