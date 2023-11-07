class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        
        for(int number:numbers){
            answer+=number;
        }
        answer /= (double)numbers.length;
        return answer;
    }
}