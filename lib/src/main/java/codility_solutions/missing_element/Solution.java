package codility_solutions.missing_element;

class Solution {
    public int solution(int[] A) {
        long total = ((long)(A.length + 1) * (long)(A.length + 2))/2L;
        for(int a : A){
            total -= (long)a;
        }
        return (int)total;
    }
}

