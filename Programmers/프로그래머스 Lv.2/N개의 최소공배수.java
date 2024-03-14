class Solution {
    public int solution(int[] arr) {
        int lcm = arr[0];
        
        // 배열의 모든 숫자들에 대해 최소공배수를 반복적으로 계산
        for (int i = 1; i < arr.length; i++) {
            lcm = findLCM(lcm, arr[i]);
        }
        
        return lcm;
    }
    
    // 최소공배수 계산
    private int findLCM(int a, int b) {
        return a * b / gcd(a, b);
    }
    
    // 최대공약수 계산
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
