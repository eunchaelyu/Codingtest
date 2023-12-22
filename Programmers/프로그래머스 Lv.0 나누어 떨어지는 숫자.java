import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                answer = Arrays.copyOf(answer, answer.length + 1);
                answer[j]=arr[i];   
                j++;
            }
        }
        if(answer.length==0){
            answer = new int[]{
                -1
                };
        }
        Arrays.sort(answer);
        return answer;
    }
}
