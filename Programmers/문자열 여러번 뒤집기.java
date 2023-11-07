class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray(); // 문자열을 문자 배열로
        
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            
            while (start < end) {
                char temp = arr[start]; //가상공간 temp에 시작값 저장.
                arr[start] = arr[end];
                arr[end] = temp;
                
                start++; //시작값은 하나씩 증가
                end--; //마지막값은 하나씩 감소하며 뒤집는다
            }
        }
        
        return new String(arr); // 문자 배열을 문자열로
    }
}
