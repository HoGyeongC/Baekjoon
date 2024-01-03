class Solution {
    public int solution(float num1, int num2) {
        float answer = num1/num2;
        answer *= 1000;
        return (int)answer;
    }
}