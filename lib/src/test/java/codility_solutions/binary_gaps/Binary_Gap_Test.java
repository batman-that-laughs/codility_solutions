package codility_solutions.binary_gaps;


import org.testng.annotations.*;
import org.testng.Assert;

// import codility_solutions.binary_gaps.Solution;

public class Binary_Gap_Test {
  private Solution solution;
 
  @BeforeTest
  public void setUp() {
    solution = new Solution();
  }
 
  @DataProvider(name = "binary_gap_test_data")
  public Object [][] createData1() {
    return new Object [][] {
      new Object [] {          0,  0 },
      new Object [] {          9,  2 },
      new Object [] {         15,  0 },
      new Object [] {         32,  0 },
      new Object [] {        529,  4 },
      new Object [] {       1041,  5 },
      new Object [] {      65536,  0 },
      new Object [] {      65537, 15 },
      new Object [] {     100000,  4 },
      new Object [] {    2147483,  5 },
      new Object [] { 2147483637,  1 }, //max - 10
      new Object [] { 2147483646,  0 }, //max - 1
      new Object [] { 2147483647,  0 }  //max
    };
  }
 
  @Test(dataProvider = "binary_gap_test_data")
  public void verifySolution(int pInput, int expectedBinaryGap) {
    Assert.assertEquals(solution.solution(pInput), expectedBinaryGap);
  }
}