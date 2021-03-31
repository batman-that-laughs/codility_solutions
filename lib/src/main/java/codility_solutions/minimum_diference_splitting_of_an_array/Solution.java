package codility_solutions.minimum_diference_splitting_of_an_array;

class Solution {
    public int solution(int[] A) {
        long total = 0L;
        // initialize final answer to max value
        long finalDifference = Long.MAX_VALUE;
        // find the total sum
        if(A.length > 2){
            for(int a : A){
                total += (long)a;
            }
            long firstHalfTotal = 0L;
            for(int a : A){
                // calculate sum of first half
                firstHalfTotal += (long)a;
                // calculate remainder from the initial total or the sum of the other half of the split
                long remainder = total - firstHalfTotal;
                // find the difference of the two parts
                long interimDiffernece = remainder > firstHalfTotal ? remainder - firstHalfTotal : firstHalfTotal - remainder;
                // store the smaller differnecce value
                finalDifference = finalDifference > interimDiffernece ? interimDiffernece : finalDifference;
            }
        }else if(A.length == 2)
        // if the array has only 2 elements, no need to loop; the differnce between the two elements is the answer
            finalDifference = A[0] > A[1] ? A[0] -A[1] : A[1] - A[0];
        return (int)finalDifference;
    }
}