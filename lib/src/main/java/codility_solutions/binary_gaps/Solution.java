package codility_solutions.binary_gaps;

import java.util.*;


class Solution {
    public int solution(int N) {
        // convert integer to binary
        String binaryNumber = Integer.toBinaryString(N);

        // define variables to store indexes of 1
        int firstIndex = -1, lastIndex = -1;
        // create list to store all the gaps
        List<Integer> gapList = new ArrayList<>();

        for(int i =0; i < binaryNumber.length(); i++){
            if(binaryNumber.charAt(i) == '1'){
                // setting first index at current index + 1 to exclude current index from gap calculation
                if(firstIndex == -1)
                    firstIndex = i + 1;
                else
                    lastIndex = i;

                // calculate gap and reset indexs once last index is populated
                if(lastIndex != -1){
                    int gap = lastIndex - firstIndex;
                    gapList.add(gap);
                    // to calculate next gap; set first index at current index + 1
                    firstIndex = lastIndex + 1;
                    lastIndex = -1;
                }
            }
        }

        if(gapList.size() > 1)
            return Collections.max(gapList);
        else if(gapList.size() == 1)
            return gapList.get(0);
        else
            return 0;
    }
}
