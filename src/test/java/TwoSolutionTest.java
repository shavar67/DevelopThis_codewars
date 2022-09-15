import org.junit.jupiter.api.Test;
import codewars.TwoSumSolution;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSolutionTest {
TwoSumSolution numbers = new TwoSumSolution();
 int [] array = {1,3,0,5,7,4};
 int expectedResults [] = {4,3};
 int answer [] = new int[2];

@Test
public void testSolution(){

    answer = numbers.solution(array,7);
    assertArrayEquals(expectedResults,answer);

}




}
