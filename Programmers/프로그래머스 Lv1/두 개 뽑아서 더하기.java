import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> sumList = new ArrayList<>(); //중복방지 하기 위해서 ArrayList 사용

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) { //인덱스 겹치지 않게 하기 위해서 j=i+1
                int sum = numbers[i] + numbers[j];
                if (!sumList.contains(sum)) { // 이전에 있던 값이 아니면
                    sumList.add(sum); //sumList에 새롭게 저장함
                }
            }
        }

        //ArrayList를 array로 바꿈
        int[] answer = new int[sumList.size()]; //ArrayList는 동적으로 크기가 조정이 되기 때문에 size()사용
        for (int i = 0; i < sumList.size(); i++) {
            answer[i] = sumList.get(i);
        }

        //Array를 오름차순으로 정렬
        Arrays.sort(answer);

        return answer;
    }
}
