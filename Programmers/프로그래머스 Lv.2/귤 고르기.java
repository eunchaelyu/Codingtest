import java.util.*;

class Solution {
    public int solution(int target, int[] oranges) {
        int sum = 0; 
        int count = 0; 
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num : oranges) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> valueList = new ArrayList<>(map.values());
        Collections.sort(valueList, Collections.reverseOrder());
        for (int v : valueList) {
            if (sum + v >= target) {
                count++;
                break;
            } else {
                sum += v;
                count++;
            }
        }
        return count;
    }
}
