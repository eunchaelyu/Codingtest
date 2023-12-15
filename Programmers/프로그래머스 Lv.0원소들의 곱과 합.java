class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int a=1;
        int b=0;
        int c=0;
        for (int i=0; i<num_list.length; i++){ //리스트의 길이를 표현 할 때는 .lenth()가 아니라 .lenth
            a *= num_list[i];
            b += num_list[i];
        }
        c=b*b;
        if(a<c){
            answer=1;
        }
        return answer;
    }
}
