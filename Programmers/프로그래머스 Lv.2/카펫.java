class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for(int i=3;i<brown+yellow;i++){
            int height = (brown+yellow)/i; //직사각형 성립 조건
            if(height>=i){
                 if ((i - 2) * (height - 2) == yellow) { //노란색 타일 개수 조합
                answer[0] = height;
                answer[1] = i;
                break;
                }
            }
        }
        return answer;
    }
}
