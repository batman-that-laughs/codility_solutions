## Problem Statement

Given an integer N and a non-empty array A consisting of M integers, returns a sequence of integers representing the values of the counters.
Calculating counters:
    1. when 0 < A[i] <= N, counter ++
    2. when A[i] > N, each counter = max counter

## Solution
1. create an array of length N.
2. for each occurrence of 1 <= x <= N, increment max of counter and max counter till that iteration(prevMax in code) by 1.
    3. check and set value of max counter.
4. for each value where x > N, capture the value of the max counter till that iteration.
5. once the input loop is iterated, iterate over the answer array, assign the max value of the counter and prevMax to the counter as the final value.
