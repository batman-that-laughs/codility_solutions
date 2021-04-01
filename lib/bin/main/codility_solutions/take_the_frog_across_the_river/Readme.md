### Problem Statement:

A small frog has to traverse X number of steps to reach the other side of the river.

Given a non-empty array A consisting of N integers and integer X.

The array A contains the information at which second will which step be made available for the frog to take.

Calculate the earliest time when the frog can jump through 1..X to the other side of the river, if the frog makes it across, else return -1.

### Solution:

**Easy Solution**
1. Add each distinct value to a list.
2. once the size of the list equals the number of steps to be traversed(X), return the last index.
3. if the list always remains smaller than number of steps to be traversed, the frog never makes it across.

**Solution for better performance**
1. Create a boolean array to store whether each step appears or not, and a step counter to store how many steps remain to be taken(initially X).
2. For each element in the input array, change the state of that step indicating it is available.
3. Reduce the step counter by 1. 
4. When step counter is 0, the last index is the earliest when the from can make it across.
5. if the step never reaches 0, the frog never makes it across.