class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String c = String.valueOf(a) + String.valueOf(b);
        String d = String.valueOf(2*a*b);
        
        int ab = Integer.parseInt(c);
        int ab2 = Integer.parseInt(d);
        
        if(ab > ab2){
            answer = ab;
        }else if(ab < ab2){
            answer = ab2;
        }else{
            answer = ab;
        }
        return answer;
    }
}
