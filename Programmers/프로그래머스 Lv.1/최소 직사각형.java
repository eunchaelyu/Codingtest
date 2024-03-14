import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int max_v=0;
        int max_h=0; // 가로, 세로 길이를 초기화
        for(int[] a : sizes){ //sizes의 원소에 포함되면 for문 반복
            max_h=Math.max(max_h, Math.max(a[0],a[1])); 
            // 현재까지의 최대 가로길이와 지금까지의 가로길이 중 더 큰 값을 넣는다
            max_v=Math.max(max_v, Math.min(a[0],a[1])); 
            // 현재까지의 최대 세로 길이와 지금까지의 세로 길이 중 더 작은 값을 넣는다
            }         
        return max_h*max_v;
    }
}
