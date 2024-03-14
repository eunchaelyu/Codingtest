class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for (int a:arr){  
            answer+=a;   
        }
        answer=answer/arr.length; //answer에 배열의 length 로 나눈다(평균)
        return answer;
    }
}
