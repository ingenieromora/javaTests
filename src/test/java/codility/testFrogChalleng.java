package codility;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Leandro Mora <leandro.mora@globant.com>
 * Test based on the codility/FrogChallenge class.
 */
public class testFrogChalleng {

    @Test
         public void testCicleSolution(){

        System.out.println("Cicle Solution Test" );

        runTests(new FrogChallenge.CicleSolution());

        System.out.println("Finished" );

    }

    @Test
    public void testMathSolution(){

        System.out.println("Math Solution Test" );

        runTests(new FrogChallenge.MathSolution());

        System.out.println("Finished" );

    }

    private void runTests(FrogChallenge.SolutionRunner fgr){

        int numberOfJumps = fgr.solution(1, 85, 30);
        Assert.assertEquals(3,numberOfJumps);

        numberOfJumps = fgr.solution(10, 10, 30);
        Assert.assertEquals(0,numberOfJumps);

        numberOfJumps = fgr.solution(1, 85, 84);
        Assert.assertEquals(1,numberOfJumps);

        numberOfJumps = fgr.solution(1, 85, 83);
        Assert.assertEquals(2,numberOfJumps);

    }

}
