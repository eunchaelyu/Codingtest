class Solution {
        public static int solution(int[] nums) {
        int answer = 0;
        int n = nums.length;
        // 3개의 수를 선택하기 위한 세 중첩된 반복문
        for (int i=0; i<n-2; i++) {
            for (int j=i+1; j<n-1; j++) {
                for (int k=j+1; k<n; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    // 소수 체크
                    boolean isPrime = true;
                    for (int l=2; l*l<= sum; l++) {
                        if (sum % l == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    // 소수인 경우 answer 증가
                    if (isPrime) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
