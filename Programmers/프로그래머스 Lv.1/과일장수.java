import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        //점수를 오름차순으로 정렬
        Arrays.sort(score);
        //최저 점수를 score[i]로 설정, 한 상자에 담긴 사과 개수를 m으로 설정
        for(int i = score.length - m; i >= 0; i -= m)
            answer += score[i] * m; //answer에 상자의 개수 만큼 더해지게 됨
        return answer;
    }
}
