import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<Integer> check(String[] park, int row, int col) {
        List<Integer> result = new ArrayList<>();
        if (row < 0 || col < 0 || row >= park.length || col >= park[0].length() || park[row].charAt(col) == 'X') {
            result.add(-1); // False를 나타내는 값 -1 추가
        } else {
            result.add(1); // True를 나타내는 값 1 추가
        }
        return result;
    }
    
    public static int[] move(String[] park, int row, int col, String location, int count) {
        int tempRow = row;
        int tempCol = col;
        for (int i = 0; i < count; i++) {
            switch (location) {
                case "E":
                    col++;
                    break;
                case "W":
                    col--;
                    break;
                case "S":
                    row++;
                    break;
                case "N":
                    row--;
                    break;
            }
            List<Integer> checkResult = check(park, row, col);
            if (checkResult.get(0) == -1) { // X를 만나거나 범위를 벗어날 경우
                row = tempRow; // 이전 위치로 되돌아감
                col = tempCol;
                break; // 명령 무시
            }
        }
        int[] result = {row, col};
        return result;
    }
    
    public static int[] solution(String[] park, String[] routes) {
        int startRow = 0;
        int startCol = 0;
        
        // 시작 위치 "S" 찾기
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    startRow = i;
                    startCol = j;
                    break;
                }
            }
        }
        
        for (String route : routes) {
            String[] s = route.split(" ");
            String location = s[0];
            int count = Integer.parseInt(s[1]);
            int[] newPosition = move(park, startRow, startCol, location, count);
            startRow = newPosition[0];
            startCol = newPosition[1];
        }
        
        int[] answer = {startRow, startCol};
        return answer;
    }
}
