import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FizzBuzzTests {

    @Test
    public void FourIsDivisibleByTwoTest(){

        //Assert Statements
        //* *divisibleBy(4,2) should return true*
        Assert.assertTrue(FizzBuzzGenerator.divisibleBy(4,2));
        System.out.print("This statement is true, 4 can be divided by 2");
    }

    @Test
    public void ThreeIsNotDivisibleByTwoTest(){
        //Assert Statement
        //* *divisibleBy(3,2) should return false*
        Assert.assertFalse(FizzBuzzGenerator.divisibleBy(3,2));
        System.out.print("This statement is false, 3 cannot be divided by 2");
    }


@Test
    public void FizzBuzzGeneratorFirstToFifteenTest(){

        FizzBuzzGenerator tester = new FizzBuzzGenerator();



        //Assert Statements
        //fizzBuzzGenerator(1,15)
        Assert.assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"}, tester.FizzBuzz(1,15).toArray());
        System.out.println("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz");
        //should return ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "buzz", "11", "Fizz", "13", "14", "FizzBuzz"]*
        //* *Keep note that the list must contain String items*

    }
}
