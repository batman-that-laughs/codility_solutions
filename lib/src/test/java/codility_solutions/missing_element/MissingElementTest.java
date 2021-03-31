package codility_solutions.missing_element;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MissingElementTest {
    
    private Solution solution;

    @BeforeTest
    public void setUp(){
        solution = new Solution();
    }

    @DataProvider(name = "missing_element_in_array_test_data")
    public Object [][] createData1() {
        return new Object [][] {
            new Object [] { new int[] {1,3,5,2}, 4 }
        };
    }
    
    @Test(dataProvider = "missing_element_in_array_test_data")
    public void verifySolution(int[] inputArray, int expectedOutput){
        Assert.assertEquals(solution.solution(inputArray), expectedOutput);
    }
}
