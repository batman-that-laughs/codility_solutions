package codility_solutions.odd_occurrences_in_array;

import java.util.*;

class Solution {
    public int solution(int[] A) {
        int answer = 0;
        // perform action if array not null
        if(A.length > 0){
            Map<Integer, Integer> pairMap = new HashMap<>();
            for(int i =0; i < A.length; i++){
                // initialize count 1
                int count = 1;
                if(pairMap.containsKey(A[i])){
                    // if key already in map, increment value by 1
                    count+=pairMap.get(A[i]);
                    pairMap.put(A[i], count);
                }else{
                    // add key to map with value 1
                    pairMap.put(A[i], count);
                }
            }
            for(Map.Entry<Integer, Integer> pair: pairMap.entrySet()){
                // when value is 1, key is the odd occurrence 
                if(pair.getValue() == 1){
                    answer = pair.getKey();
                    break;
                }
            }
        }
        return answer;
    }

}