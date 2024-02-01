class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        // 입력된 각각의 단어에 대해 반복
        for (String word : babbling) {
            boolean isValid = true;

            // 단어 내 연속하는 같은 문자를 찾기 위한 루프
            for (int i = 1; i < word.length(); i++) {
                // 현재 문자와 이전 문자가 같으면 false 처리
                if (word.charAt(i) == word.charAt(i - 1)) {
                    isValid = false;
                    break;
                }
            }

            // 가능한 발음이면 카운트함
            if (isValid && (word.contains("aya") || word.contains("ye") || word.contains("woo") || word.contains("ma"))) {
                answer++;
            }
        }

        return answer;
    }
}
