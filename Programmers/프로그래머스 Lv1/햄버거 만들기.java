class Solution {
    public int solution(int[] ingredients) {
        int burgerCount = 0; // 포장된 햄버거 개수를 저장하는 변수
        StringBuilder burgerIngredients = new StringBuilder(); // 햄버거에 사용된 재료를 저장하는 문자열

        for (int i = 0; i < ingredients.length; i++) {
            burgerIngredients.append(ingredients[i]); // 현재 재료를 문자열에 추가

            if (burgerIngredients.length() > 3) {
                // 햄버거가 완성되었는지 확인
                if (burgerIngredients.charAt(burgerIngredients.length() - 1) == '1' &&   // 가장 마지막 재료가 빵이고
                    burgerIngredients.charAt(burgerIngredients.length() - 2) == '3' &&   // 그 앞 재료가 고기이고
                    burgerIngredients.charAt(burgerIngredients.length() - 3) == '2' &&   // 그 앞 재료가 야채이고
                    burgerIngredients.charAt(burgerIngredients.length() - 4) == '1') {  // 그 앞 재료가 빵이면
                    burgerCount++; // 햄버거 개수 증가

                    // 마지막 4개 재료 삭제
                    burgerIngredients = new StringBuilder(burgerIngredients.substring(0, burgerIngredients.length() - 4)); 
                }
            }
        }
        return burgerCount;
    }
}
