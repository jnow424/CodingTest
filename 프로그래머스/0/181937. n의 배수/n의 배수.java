class Solution {
    public int solution(int num, int n) {
        int answer = 0;

        if (2 <= num && num <= 100 && 2<= n && n <= 9 ) {
            
            if (0 == (num % n) ) {
                answer = 1;
            } else {
                answer = 0;
            }
        }
        return answer;
    }
}