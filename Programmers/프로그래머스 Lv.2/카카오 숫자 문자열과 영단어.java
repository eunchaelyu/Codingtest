class Solution {
    public int solution(String s) {
        //string 배열 생성한다(각 값을 인덱스값으로 바꿔주어야 함)
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//먼저 String 문자열로 s를 받기 때문에 숫자도 문자처럼 변환한 후에 문자열-> 정수로 변환 하는 방식으로 접근했다 
        String result = s; //초기값
        for (int i = 0; i < words.length; i++) { 
            result = result.replaceAll(words[i], String.valueOf(i)); //인덱스 해당값을 -> 문자열로 꾼 i로 바꾼다
        }

        int answer = Integer.parseInt(result); //문자열을 정수형으로 바꿈

        return answer;
    }
}
