import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 체육복을 도난당한 학생 수를 초기화
        int answer = n - lost.length;

        // Set을 이용하여 중복된 학생을 방지하기 위한 Set 초기화
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();

        // Set에 도난당한 학생들을 추가
        for (int l : lost) lostSet.add(l);

        // Set에 여분의 체육복이 있는 학생들을 추가
        for (int r : reserve) reserveSet.add(r);

        // 여분의 체육복을 가진 학생이 도난당한 학생에게 빌려주기
        for (int l : lost) {
            if (reserveSet.contains(l)) {
                reserveSet.remove(l); // 빌려준 학생은 더 이상 여분의 체육복이 없으므로 Set에서 제거
                lostSet.remove(l);    // 빌린 학생은 더 이상 도난당한 상태가 아니므로 Set에서 제거
                answer++;             // 체육복을 빌려준 학생 수 증가
            }
        }

        // 남은 도난당한 학생에게 앞 또는 뒤의 학생에게 빌려주기
        for (int l : lostSet) {
            if (reserveSet.contains(l - 1)) {
                reserveSet.remove(l - 1); // 앞 번호의 학생에게 빌려줬으므로 Set에서 제거
                answer++;                 // 체육복을 빌려준 학생 수 증가
            } else if (reserveSet.contains(l + 1)) {
                reserveSet.remove(l + 1); // 뒷 번호의 학생에게 빌려줬으므로 Set에서 제거
                answer++;                 // 체육복을 빌려준 학생 수 증가
            }
        }

        return answer;
    }
}
