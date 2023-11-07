class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
        
                int temp = arr[start]; //가상공간 temp에 시작값 저장.
                arr[start] = arr[end];
                arr[end] = temp;
                
            }
        return arr;
    }
}
