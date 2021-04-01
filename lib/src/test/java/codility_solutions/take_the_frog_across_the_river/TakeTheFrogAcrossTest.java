package codility_solutions.take_the_frog_across_the_river;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TakeTheFrogAcrossTest {
        private Solution solution;

    @BeforeTest
    public void setUp(){
        solution = new Solution();
    }

    @DataProvider(name = "take_the_frog_across_test_data")
    public Object [][] createData1() {
        return new Object [][] {
            new Object [] { 5,new int[] {1,2,3,4,3,2,5}, 6 }
        };
    }
    
    @Test(dataProvider = "take_the_frog_across_test_data")
    public void verifySolution(int steps, int[] inputArray, int expectedOutput){
        Assert.assertEquals(solution.solution(steps, inputArray), expectedOutput);
    }
}