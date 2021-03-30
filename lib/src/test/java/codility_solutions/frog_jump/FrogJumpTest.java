package codility_solutions.frog_jump;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class FrogJumpTest {

    private Solution solution;

    @BeforeTest
    public void setUp(){
        solution = new Solution();
    }

    @DataProvider(name = "frog_jump_test_data")
    public Object [][] createData1() {
        return new Object [][] {
            new Object [] { 10, 85, 30, 3 }
        };
    }
    
    @Test(dataProvider = "frog_jump_test_data")
    public void verifySolution(int x, int y, int d, int expectedOutput){
        Assert.assertEquals(solution.solution(x,y,d), expectedOutput);
    }

}
