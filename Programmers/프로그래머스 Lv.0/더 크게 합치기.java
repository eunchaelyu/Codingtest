class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String c = String.valueOf(a) + String.valueOf(b);
        String d = String.valueOf(b) + String.valueOf(a);
        
        int ab = Integer.parseInt(c);
        int ba = Integer.parseInt(d);
        
        if(ab > ba){
            answer = ab;
        }else if(ab < ba){
            answer = ba;
        }else{
            answer = ab;
        }
        return answer;
    }
}
