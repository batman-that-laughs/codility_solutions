package codility_solutions.cyclic_rotation_of_arrays;

import org.testng.annotations.*;
import org.testng.Assert;
import codility_solutions.cyclic_rotaion_of_arrays.Solution;

public class CyclicRotationTest {
    private Solution solution;

    @BeforeTest
    public void setUp(){
        solution = new Solution();
    }

    @DataProvider(name = "cyclic_rotation_test_data")
    public Object [][] createData1() {
    return new Object [][] {
      new Object [] { new int[] {1,2,3,4}, 4,  new int[] {1,2,3,4} },
      new Object [] { new int[] {1,2,3,4}, 1,  new int[] {4,1,2,3}  },
      new Object [] { new int[] {1,2,3,4}, 2,  new int[] {3,4,1,2}  },
      new Object [] { new int[] {1,2,3,4}, 3,  new int[] {2,3,4,1}  },
      new Object [] { new int[] {5,9,8,1}, 1,  new int[] {1,5,9,8}  },
      new Object [] { new int[] {5,9,8,1}, 2,  new int[] {8,1,5,9}  },
      new Object [] { new int[] {5,9,8,1}, 3,  new int[] {9,8,1,5}  },
      new Object [] { new int[] {5,9,8,1}, 5,  new int[] {1,5,9,8}  }
    };
  }

    @Test(dataProvider = "cyclic_rotation_test_data")
    public void verifySolution(int[] inputArray, int numberOfRotaions, int[] expectedOutput){
        Assert.assertEquals(solution.solution(inputArray, numberOfRotaions), expectedOutput);
    }

}
