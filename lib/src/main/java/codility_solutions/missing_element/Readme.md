### Problem Statement: 


An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

Your goal is to find that missing element.

Write a function:

    class Solution { public int solution(int[] A); }

that, given an array A, returns the value of the missing element.

For example, given array A such that:
  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5

the function should return 4, as it is the missing element.

Write an efficient algorithm for the following assumptions:

        N is an integer within the range [0..100,000];
        the elements of A are all distinct;
        each element of array A is an integer within the range [1..(N + 1)].

### Solution:
1. Possible total numbers - n+1 where n is the length of the array and given that one number is missing.
2. find the sum of first n+1 natural numbers
3. subtract each element of the array from the sum
4. the remainder is the answer.

**Accomodations:**
1. all calculations done using long data type so as to deal with larger test cases. using int fails in the larger test cases(where n is ~100000).
