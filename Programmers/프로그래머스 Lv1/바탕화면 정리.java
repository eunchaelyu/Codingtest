public class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        
        int left = wallpaper[0].length(); // 왼쪽 끝의 초기값은 바탕화면의 가로 길이로 설정
        int right = 0; // 오른쪽 끝의 초기값은 0으로 설정
        int up = wallpaper.length; // 위쪽 끝의 초기값은 바탕화면의 세로 길이로 설정
        int down = 0; // 아래쪽 끝의 초기값은 0으로 설정
        
        // 바탕화면을 순회하며 '#'이 있는 영역의 좌상단과 우하단 좌표를 찾음
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                // '#'이 발견되면 좌표 갱신
                if (wallpaper[i].charAt(j) == '#') {
                    left = Math.min(left, j); // 최소값 갱신
                    right = Math.max(right, j); // 최대값 갱신
                    up = Math.min(up, i); // 최소값 갱신
                    down = Math.max(down, i); // 최대값 갱신
                }
            }
        }
        
        // 결과 배열에 좌표 저장
        answer[0] = up; // 위쪽 끝의 좌표
        answer[1] = left; // 왼쪽 끝의 좌표
        answer[2] = down + 1; // 아래쪽 끝의 좌표 + 1
        answer[3] = right + 1; // 오른쪽 끝의 좌표 + 1
        
        // 결과 배열 반환
        return answer;
    }
}
