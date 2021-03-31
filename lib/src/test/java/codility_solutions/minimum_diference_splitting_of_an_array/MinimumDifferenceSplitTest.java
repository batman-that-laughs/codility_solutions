package codility_solutions.minimum_diference_splitting_of_an_array;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MinimumDifferenceSplitTest {
      private Solution solution;

    @BeforeTest
    public void setUp(){
        solution = new Solution();
    }

    @DataProvider(name = "minimum_difference_split_data")
    public Object [][] createData1() {
        return new Object [][] {
            new Object [] { new int[] {1,2,3,4,3}, 1 }
        };
    }
    
    @Test(dataProvider = "minimum_difference_split_data")
    public void verifySolution(int[] input, int expectedOutput){
        Assert.assertEquals(solution.solution(input), expectedOutput);
    }

}
