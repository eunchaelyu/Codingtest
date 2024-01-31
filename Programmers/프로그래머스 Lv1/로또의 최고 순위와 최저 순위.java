class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        // 결과를 저장할 배열 초기화
        int answer[] = new int[2];
        
        // 각각의 일치하는 숫자에 대한 등수 배열 정의
        int rank[] = {6, 6, 5, 4, 3, 2, 1};

        // 0의 개수와 일치하는 숫자의 개수를 세기 위한 변수 초기화
        int zero = 0, count = 0;

        // 'lottos' 배열에서 0의 개수 세기
        for (int i : lottos) {
            if (i == 0) zero++;
        }

        // 'lottos'와 'win_nums' 배열에서 일치하는 숫자의 개수 세기
        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < lottos.length; j++) {
                if (lottos[i] == win_nums[j]) count++;
            }
        }

        // 0의 개수와 일치하는 숫자의 개수를 고려하여 최고 등수와 최저 등수 계산
        answer[0] = rank[count + zero];  // 가능한 0의 개수를 고려한 최고 등수
        answer[1] = rank[count];         // 0을 고려하지 않은 최저 등수

        // 최종 결과 반환
        return answer;
    }
}
