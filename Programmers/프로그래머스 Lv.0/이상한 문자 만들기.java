class Solution {
    public String solution(String s) {
        String answer="";
        int count=0;
        for(int i=0; i<s.length();i++){
            char word=s.charAt(i);
            if(word==' '){
                answer += " ";
                count = 0;
                continue;
            }
            if((count%2)==0){
                answer+=String.valueOf(Character.toUpperCase(word));
                count++;
            }else{
                answer+=String.valueOf(Character.toLowerCase(word));
                count++;
            }
        }
        return answer;
    }
}
