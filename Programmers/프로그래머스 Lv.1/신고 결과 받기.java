import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 결과를 저장할 배열
        int[] answer = new int[id_list.length];
        
        // 이미 신고한 사용자 목록을 저장할 리스트
        ArrayList<String> reportedUsers = new ArrayList<>();

        // 각 사용자의 신고 횟수를 저장할 맵
        Map<String, Integer> reportCountMap = new HashMap<>();
        
        // 중복을 제거하고 각 사용자의 신고 횟수를 카운트하여 맵에 저장
        Arrays.stream(report).distinct().forEach((rp) -> {
            String[] rpArray = rp.split(" ");
            int count = 1;
            if (reportCountMap.containsKey(rpArray[1]))
                count = reportCountMap.get(rpArray[1]) + 1;
            reportCountMap.put(rpArray[1], count);
            reportedUsers.add(rp);
        });

        // 이미 신고한 사용자 목록을 순회하면서
        for (String reportedUser : reportedUsers) {
            String[] reportedUserArray = reportedUser.split(" ");

            // 해당 사용자가 신고당한 횟수가 k 이상인 경우
            if (reportCountMap.get(reportedUserArray[1]) >= k)
                // 해당 사용자를 신고한 횟수를 증가시킴
                answer[Arrays.asList(id_list).indexOf(reportedUserArray[0])]++;
        }
        // 결과 반환
        return answer;
    }
}
