class Solution {
    public int solution(int n) {
        String answer = "";
        
        while(n!=0){ //n이 0이 아닐 때까지 나누는 작업을 반복함
            answer += n%3; //나머지를 answer에 더함(3진법에서 앞뒤 반전한 것과 동일)
            n/=3; //몫을 n에 저장함 다시 while문으로 반복
        }
        return Integer.parseInt(answer, 3); //3진수의 answer를 10진수로 변환한다
    }
}
