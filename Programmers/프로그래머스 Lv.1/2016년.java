class Solution {
    public String solution(int a, int b) {
        // 2016년 1월 1일부터의 요일 패턴을 저장
        String[] daysOfWeek = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

        // 각 월의 일 수를 저장한 배열
        int[] daysInMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 입력받은 월과 일에 해당하는 날짜까지의 전체 일 수 계산
        int totalDays = 0;
        for (int i = 1; i < a; i++) {
            totalDays += daysInMonth[i];
        }
        totalDays += b - 1;

        // 요일 패턴을 이용하여 요일 계산
        int dayOfWeekIndex = totalDays % 7;
        return daysOfWeek[dayOfWeekIndex];
    }
}
