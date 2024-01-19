import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
    	// score 길이만큼 배열 선언
        int[] answer = new int[score.length];
        
        // 순위를 담을 List 선언
        List<Integer> r = new ArrayList<>();
        
        // score를 반복
        for (int i = 0; i < score.length; i++) {
            // r리스트에 score 추가
            r.add(score[i]);
            
            // r 리스트의 크기가 k보다 크면 가장 낮은 점수 제거 
            if (r.size() > k) {
                r.remove(Collections.min(r));
            }
            
            // 남은 점수 중 가장 작은 점수 answer에 담기
            answer[i] = Collections.min(r);
        }
        return answer;
    }
}
