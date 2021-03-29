package codility_solutions.cyclic_rotaion_of_arrays;

public class Solution {
    public int[] solution(int[] A, int K) {
        // perfom action if array is not null
        if(A.length > 0)
        // loop for each rotation
            for(int rotationIndex=0; rotationIndex<K; rotationIndex++){
                // capture last element
                int lastElement = A[A.length - 1];
                // shift each element to the right
                for(int arrayIndex = A.length-1; arrayIndex>0; arrayIndex--)
                    A[arrayIndex] = A[arrayIndex-1];
                // add the captured value of the last element
                A[0] = lastElement;
            }
        return A;
    }
}

