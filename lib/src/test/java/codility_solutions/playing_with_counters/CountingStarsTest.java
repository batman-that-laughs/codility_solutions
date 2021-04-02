package codility_solutions.playing_with_counters;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CountingStarsTest {
    
    private Solution solution;

    @BeforeTest
    public void setUp(){
        solution = new Solution();
    }

    @DataProvider(name = "counting_stars_test_data")
    public Object [][] createData1() {
        return new Object [][] {
            new Object [] { 5,new int[] {1,2,3,3,6,2,3}, new int[] {2,3,3,2,2} }
        };
    }
    
    @Test(dataProvider = "counting_stars_test_data")
    public void verifySolution(int steps, int[] inputArray, int[] expectedOutput){
        Assert.assertEquals(solution.solution(steps, inputArray), expectedOutput);
    }
}
