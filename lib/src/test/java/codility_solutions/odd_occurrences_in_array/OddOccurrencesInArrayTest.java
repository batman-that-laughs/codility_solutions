package codility_solutions.odd_occurrences_in_array;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OddOccurrencesInArrayTest {

    private Solution solution;

    @BeforeTest
    public void setUp(){
        solution = new Solution();
    }

    @DataProvider(name = "odd_occurrences_in_array_test_data")
    public Object [][] createData1() {
        return new Object [][] {
            new Object [] { new int[] {1,2,3,4,3,2,1}, 4 }
        };
    }
    
    @Test(dataProvider = "odd_occurrences_in_array_test_data")
    public void verifySolution(int[] inputArray, int expectedOutput){
        Assert.assertEquals(solution.solution(inputArray), expectedOutput);
    }

}
