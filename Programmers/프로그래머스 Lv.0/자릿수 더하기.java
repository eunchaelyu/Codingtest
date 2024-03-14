import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0; 
        String s = Integer.toString(n); 
        int[] array = new int[s.length()]; 
        
        for (int i=0; i<s.length(); i++){
            array[i] += s.charAt(i)-'0';
            answer+= array[i]; 
        }
        
         while (n>0){
             answer += n % 10;
             n /= 10;
         }
        return answer;
    }
}
