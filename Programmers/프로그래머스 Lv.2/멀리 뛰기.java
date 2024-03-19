class Solution {
    public long solution(int n) {
        if (n <= 2)
            return n;
        
        long a = 1, b = 2;
        long result = 0;
        for (int i = 3; i <= n; i++) {
            result = (a + b) % 1234567;
            a = b;
            b = result;
        }
        
        return result;
    }
}
