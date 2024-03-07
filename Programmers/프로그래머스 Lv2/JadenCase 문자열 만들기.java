class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder(); 
        boolean isFirstChar = true; // 단어의 첫 번째 문자 여부

        for (char character : s.toCharArray()) { 
            if (isFirstChar) { 
                answer.append(Character.toUpperCase(character)); // 대문자로 변환하여 결과에 추가
                isFirstChar = false; 
            } else {
                answer.append(Character.toLowerCase(character)); 
            }

            if (character == ' ') { // 현재 문자가 공백인 경우
                isFirstChar = true; // 다음 문자는 단어의 첫 번째 문자임을 표시하는 플래그를 true로 설정
            }
        }

        return answer.toString(); 
    }
}
