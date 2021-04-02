package codility_solutions.playing_with_counters;

class Solution {
    public int[] solution(int N, int[] A) {
        int[] answer = new int[N];
        int currMax = 0, prevMax = 0;
        for(int i =0; i < A.length; i++){
            if(A[i] <= N && A[i] > 0){
                answer[A[i] - 1] = Math.max(prevMax, answer[A[i] - 1]) + 1;
                if(currMax < answer[A[i] - 1])
                    currMax = answer[A[i] - 1];
            }else
                prevMax = currMax;
        }
        for(int i =0; i < answer.length; i++)
            answer[i] = Math.max(prevMax, answer[i]);
        return answer;
    }
}

