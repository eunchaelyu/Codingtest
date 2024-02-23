import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        int num = players.length;
        Map<String, Integer> ranking = new HashMap<>();
        
        // 플레이어의 이름과 순위를 매핑하여 저장
        for (int i = 0; i < num; i++) {
            ranking.put(players[i], i);
        }
        
        // 해설진이 부른 이름을 기준으로 순위 변경
        for (String player : callings) {
            int playerRanking = ranking.get(player);
            
            // 맨 앞에 있는 플레이어는 처리하지 않음
            if (playerRanking == 0) {
                continue;
            }
            
            // 앞에 있는 플레이어와 순위를 교환
            String temp = players[playerRanking - 1];
            players[playerRanking - 1] = player;
            players[playerRanking] = temp;
            
            // 순위 갱신
            ranking.put(player, playerRanking - 1);
            ranking.put(temp, playerRanking);
        }
        
        return players;
    }
}
