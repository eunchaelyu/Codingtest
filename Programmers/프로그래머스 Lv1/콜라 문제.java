class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0; //변수 초기화
        
        while(a <=n){ // n이 a개 미만일 때까지 while 루프 동작 
            answer+= n/ a * b; // n/a의 병을 가져다주면 하나당 b씩의 병을 더 갖게 된다
            n = (n/a*b)+(n%a); //n은 빈 병을 내고 현재 가지고 있는 병 개수 + 나머지 병 개수
        }
        return answer;
    }
}
