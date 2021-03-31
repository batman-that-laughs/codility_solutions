## Problem Statement:

Given an array A consisting of N integers, returns the value of the unpaired element.


## Solution:

1. Iterate over each element in the array
2. create entry for element occurrence counter map - key: element of the array; value:count(number of occurrences of the element - initial value: 1)
3. check if the element already exists
    4. add the existing value of count to the newly created entry
5. put the entry in the map
6. Iterate over the element occurrence counter map
7. odd occurrence is the only element with count 1. 

**Assumptions:**
Array is not null - though have built in a check for the same - even though; returns 0 when all pairs and when array is null - result may thus be ambiguous.
