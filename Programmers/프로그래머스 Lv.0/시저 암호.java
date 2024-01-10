class Solution {
    public String solution(String s, int n) {
        StringBuilder answer= new StringBuilder();
        for(char c : s.toCharArray()){ //문자열을 한 글자씩 가져오면서 비교
            if(Character.isLetter(c)){ //글자라면
                char a = Character.isUpperCase(c) ? 'A':'a'; //대문자인지 소문자인지 판단(아스키코드 번호가 다르므로)
                answer.append((char) ((c-a+n)%26 + a)); //answer에 n만큼 민 문자열을 하나씩 추가
            }else{
                answer.append(c);
            }
        }
        return answer.toString();
    }
}
