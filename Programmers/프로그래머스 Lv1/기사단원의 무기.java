public class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            int divisorCount = 0;
            // 약수 개수 = 공격력 계산
            for (int j = 1; j*j <= i; j++) {
                if (j*j == i) divisorCount ++;
                else if (i% j == 0) divisorCount+=2;
            }
            // 공격력 제한을 넘지 않는 경우
            if (divisorCount <= limit) {
                answer += divisorCount;
            }else {
                answer += power; // 넘는 경우 power를 더함(1kg씩 필요)
            }
        }
        return answer;
    }
}
