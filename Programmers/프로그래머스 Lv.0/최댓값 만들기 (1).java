class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int temp=0;
        for(int i=0; i<numbers.length; i++){
            for (int j=0; j<numbers.length; j++){
                answer=numbers[i]*numbers[j];
                if(answer>temp && i!=j){
                    temp=answer;
                }
            }
        }
        return temp;
        }
    }
