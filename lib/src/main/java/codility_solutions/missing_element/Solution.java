package codility_solutions.missing_element;

class Solution {
    public int solution(int[] A) {
        // find the sum of all expected numbers
        // using long to accomodate larger array sizes
        long total = ((long)(A.length + 1) * (long)(A.length + 2))/2L;
        for(int a : A){
            // subtract each element of the array from the sum
            total -= (long)a;
        }
        // remainder is the answer
        return (int)total;
    }
}

