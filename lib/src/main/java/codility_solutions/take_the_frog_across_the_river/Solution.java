package codility_solutions.take_the_frog_across_the_river;

class Solution {
    public int solution(int X, int[] A) {
        int answer = -1;
// =============================================================
        // Easy solution - fails performance test - 
        // List<Integer> firstOccurenceList = new ArrayList<>();
        // if(A.length > 0)
        //     for(int i = 0; i < A.length; i++){
        //         if(!firstOccurenceList.contains(A[i]))
        //             firstOccurenceList.add(A[i]);
        //         if(firstOccurenceList.size() == X )
        //             return i;
        //     }
// =============================================================
        // better solution - performance wise
        boolean[] passable = new boolean[X];
        int notYet = X;
        for(int i = 0; i < A.length; i++){
            if(passable[A[i] - 1] == false){
                passable[A[i] - 1] = true;
                notYet--;
                if(notYet == 0)
                    return i;
            }
        }
        return answer;
    }
}