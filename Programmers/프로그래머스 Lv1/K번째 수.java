import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; //배열 길이 지정
        //int commands에서 i,j,k값 추출
        for(int n=0; n<commands.length; n++){
            int i = commands[n][0];
            int j = commands[n][1];
            int k = commands[n][2];
            //int arr 생성(자른배열)
            int[] arr=Arrays.copyOfRange(array, i-1, j);
            //arr 오름차순 정렬
            Arrays.sort(arr);
            //arr의 k-1번째 값 answer배열에 넣기 
            answer[n]=arr[k-1];
        }
            return answer;
        
//풀이2
//         int[] answer = new int[commands.length]; //배열길이 지정
//         for (int i=0; i<commands.length;i++){
//             answer[i]= kNum(array, commands[i]); //kNum메서드 호출
//             System.out.println(answer[i]);}
//         return answer;
//     }

//     public int kNum(int[] array, int[] command){
//         int[] arr= Arrays.copyOfRange(array, command[0]-1, command[1]);
//         Arrays.sort(arr);
//         return arr[command[2]-1];
    }
}
