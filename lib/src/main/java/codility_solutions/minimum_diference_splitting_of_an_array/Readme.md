### Problem Statement

Given a non-empty array A of N integers, returns the minimal difference between the two parts of the array that can be achieved.

### Solution
1. find the total sum of the array
2. iterate over the array again,
    3. find the sum of the first half of the supposed split
    4. find the difference between the first half sum and the remainder from the difference of total and first half sums.
    5. the minimum of these interim differences is the answer
6. when there are only two elements, their difference is the answer.

**Accomodations**
1. All calculations done in long as as to accomodate arrays of large sizes(~100000 elements).