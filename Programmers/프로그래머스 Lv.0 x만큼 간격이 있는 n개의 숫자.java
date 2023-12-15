class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];  
        long s=x;  
        for (int i=0; i<n; i++){ 
            answer[i]=s; 
            s=s+x; //s에 x만큼 증가한 수를 담는다
        }
        return answer;
    }
}
