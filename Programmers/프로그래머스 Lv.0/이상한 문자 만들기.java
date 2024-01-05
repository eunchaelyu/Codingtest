class Solution {
    public String solution(String s) {
        char[] charArray=s.toCharArray();
        for(int i=0; i<charArray.length; i++){ 
            if(i%2 ==0) 
                charArray[i]=Character.toUpperCase(charArray[i]);
        }
        return new String(charArray);
    }
}
