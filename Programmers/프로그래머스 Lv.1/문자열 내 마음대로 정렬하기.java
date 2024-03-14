import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length]; //strings의 길이만큼 배열 생성, 선언
        // 1. 각 단어마다 해당 인덱스 번호 문자열 뽑아오기
        for(int i=0; i< strings.length; i++){
            strings[i] = strings[i].charAt(n) + strings[i];
        } //strings의 각 단어의 해당 인덱스 번호 문자열 뽑아오기(charAt()메서드 사용하기)
        // 이후
        
        // 2. 오름차순 정렬
        Arrays.sort(strings); //맨 앞 문자열을 가지고 오름차순 완료(Arrays.sort()메서드 사용하기)
        
        // 3. 맨 앞 문자열 제거하기
        for ( int i=0; i < strings.length; i++ ){
            answer[i] = strings[i].substring(1);
        } //추가해줬던 해당 인덱스 번호 문자열 제거하기(substring()메서드 사용)
        return answer;
    }
}
