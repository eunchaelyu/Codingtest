class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] x = new int[10];
        int[] y = new int[10];

        // X의 각 자릿수 개수 세기
        for (int i = 0; i < X.length(); i++) {
            x[X.charAt(i) - '0'] += 1;
        }

        // Y의 각 자릿수 개수 세기
        for (int i = 0; i < Y.length(); i++) {
            y[Y.charAt(i) - '0'] += 1;
        }

        // 공통으로 나타나는 숫자 중 짝꿍을 찾아 결과에 추가
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < Math.min(x[i], y[i]); j++) {
                answer.append(i);
            }
        }

        // 결과가 없으면 -1 반환, 결과가 0으로 시작하면 0 반환, 그 외에는 결과 반환
        if ("".equals(answer.toString())) {
            return "-1";
        } else if (answer.toString().charAt(0) == '0') {
            return "0";
        } else {
            return answer.toString();
        }
    }
}
