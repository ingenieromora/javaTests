package codility;

import org.junit.Test;
import org.junit.Assert;

import java.util.Vector;

/**
 * @author Leandro Mora <leandro.mora@globant.com>
 * Test based on the codility/MissingElement class
 */
public class testMissingElement {

    @Test
    public void testMissingElementUsingFactorial(){
        MissingElement.FieldFinder factSolution = new MissingElement.FactorialSolution();
        int[] inputVector = {2,3,1,5};

        Assert.assertEquals(4, factSolution.solution(inputVector));

        inputVector = new int[]{2,3,1,5,4};
        Assert.assertEquals(6, factSolution.solution(inputVector));

    }


}
