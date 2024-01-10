class Solution {
    public int solution(int[] numbers, int k) {
        int answer = (k * 2 - 2) % numbers.length;
        return numbers[answer];
    }
}