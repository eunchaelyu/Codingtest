class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for(int i=0; i<number.length-2; i++){
            for(int j=i+1; j<number.length-1; j++){ //중복되는 경우를 제외시키기 위해 j는 i보다 1 큰 값
                for(int k=j+1; k<number.length; k++){ //중복되는 경우를 제외시키기 위해 k는 j보다 1 큰 값
                    if(number[i]+number[j]+number[k]==0){  //3개 수를 더해서 0이 되는 경우
                        answer+=1; //카운트 업
                    }
                    
                }
            }
        }
        return answer;
    }
}
