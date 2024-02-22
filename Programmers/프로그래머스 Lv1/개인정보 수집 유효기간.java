import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Solution {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyy.MM.dd");

    public int[] solution(String today, String[] terms, String[] privacyArray) {
        List<Integer> indexList = new ArrayList<>();
        Map<String, LocalDate> termMap = new HashMap<>();

        for (String term : terms) {
            String[] parts = term.split(" ");
            String key = parts[0];
            long monthsToAdd = Long.parseLong(parts[1]);

            LocalDate date = LocalDate.parse(today, DATE_FORMATTER).minusMonths(monthsToAdd).plusDays(1);
            termMap.put(key, date);
        }

        for (int i = 0; i < privacyArray.length; i++) {
            String[] parts = privacyArray[i].split(" ");
            LocalDate privacyDate = LocalDate.parse(parts[0], DATE_FORMATTER);
            String privacyKey = parts[1]; // privacyArray의 각 요소는 약관 날짜와 약관 종류를 포함합니다.

            if (termMap.containsKey(privacyKey) && termMap.get(privacyKey).isAfter(privacyDate)) {
                indexList.add(i + 1); // privacyArray의 해당 요소가 이전 약관일 경우 인덱스를 리스트에 추가합니다.
            }
        }

        int[] result = new int[indexList.size()];
        for (int i = 0; i < indexList.size(); i++) {
            result[i] = indexList.get(i);
        }
        return result;
    }
}
