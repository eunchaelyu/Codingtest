import java.util.Arrays;

class Solution {
    public String solution(String s) {
        // 문자열을 공백을 기준으로 분할하여 문자열 배열로 변환
        String[] numbers = s.split(" ");
        
        // 문자열 배열을 정수 배열로 변환
        int[] nums = Arrays.stream(numbers)
                          .mapToInt(Integer::parseInt)
                          .toArray();
        
        // 정수 배열을 정렬하여 최소값과 최대값을 얻음
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length - 1];
        
        // 최소값과 최대값을 문자열로 반환
        return min + " " + max;
    }
}
