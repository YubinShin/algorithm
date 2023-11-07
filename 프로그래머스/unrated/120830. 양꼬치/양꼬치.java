class Solution {
    public int solution(int n, int k) {
        int sodaCount = 0;
        int copy = n;
        
        while(copy >= 10){
            copy -= 10;
            sodaCount++;
        }

        return (n * 12000) + (k - sodaCount)  * 2000;
    }
}