class Solution {
    public long minEnd(int n, int x) {
        
        long temp = x;

        while(--n > 0){
            temp = (temp + 1) | x;
        }
        return temp;
    }
}