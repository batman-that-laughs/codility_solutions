package codility_solutions.frog_jump;

public class Solution {
    public int solution(int X, int Y, int D) {
        // distance between the two points
        int distance = Y - X;
        // number of jumps = distance between two points/ distance per jump
        int numberOfJumps = (int)Math.ceil((double)distance/(double)D);
        return numberOfJumps;
    }
}