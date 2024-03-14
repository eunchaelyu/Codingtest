import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        // 결과를 저장할 배열
        int[] answer = {};

        // 정답을 비교할 각 수포자들의 패턴 배열
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 각 수포자들이 맞춘 정답 개수를 저장할 배열
        int[] cnt = new int[3];

        // 주어진 정답 배열을 순회하면서 각 수포자의 정답을 비교하고 맞으면 해당 수포자의 정답 개수 증가
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == arr1[i % arr1.length]) cnt[0]++;
            if (answers[i] == arr2[i % arr2.length]) cnt[1]++;
            if (answers[i] == arr3[i % arr3.length]) cnt[2]++;
        }

        // 가장 많이 맞춘 수포자를 찾기 위해 정답 개수를 복사한 배열을 생성하고 정렬
        int[] tmp = new int[cnt.length];
        for (int i = 0; i < cnt.length; i++) {
            tmp[i] = cnt[i];
        }
        Arrays.sort(tmp);

        // 가장 많이 맞춘 수포자들의 인덱스를 리스트에 추가
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] == tmp[2]) {
                list.add(i + 1);
            }
        }

        // 리스트의 값을 결과 배열에 복사
        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        // 최종 결과 반환
        return answer;
    }
}
