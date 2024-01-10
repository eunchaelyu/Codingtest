class Solution {
    public int solution(String t, String p) {
        int count = 0;
        int length= t.length()-p.length()+1;
        for(int i=0; i<length; i++){
            String a = t.substring(i,i+p.length()); //p의 길이만큼 i번 인덱스부터 자름
            if(a.compareTo(p)<=0) //문자열의 순서를 비교할 때 
                count += 1;
        }
            return count;
    }
}
