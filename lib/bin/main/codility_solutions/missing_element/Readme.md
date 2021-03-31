### Problem Statement: 

Given an array A, returns the value of the missing element.

**Assumptions**
1. Input array is the range of first n natural numbers with one missing number where n being the length of the array, i.e. first element in the sorted array is always 1.

### Solution:
1. Possible total numbers - n+1 where n is the length of the array and given that one number is missing.
2. find the sum of first n+1 natural numbers
3. subtract each element of the array from the sum
4. the remainder is the answer.

**Accomodations:**
1. All calculations done in long as as to accomodate arrays of large sizes(~100000 elements).

