class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String a= "";
        String b= "";
        for(int i=0; i<num_list.length; i++){
        if(num_list[i]%2==0){
        a +=Integer.toString(num_list[i]); //짝수일 경우 문자열로 바꿔서 합치기
    }else{
        b +=Integer.toString(num_list[i]); //홀수일 경우 문자열로 바꿔서 합치기
    }
    }
        answer=Integer.parseInt(a)+Integer.parseInt(b); // 문자열을 다시 정수형으로 바꿈
        return answer;
    }
}
