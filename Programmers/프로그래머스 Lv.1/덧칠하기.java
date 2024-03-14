import java.util.*;
public class Solution {
    public static int solution(int n, int m, int[] section) {
        // 구역을 오름차순으로 정렬
        Arrays.sort(section);
        int answer = 0;
        int current = 0; // 현 롤러 위치 초기화

        for (int start : section){
            if(start > current) {
                answer++; //페인트칠 횟수 증가
                current = start + m-1; // 새로운 롤러의 위치를 현재 구역의 시작으로 설정
            }
        }
        return answer;
    }
}
