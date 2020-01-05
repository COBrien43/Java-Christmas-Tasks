# Java-Christmas-Tasks
--Testing Process
When thinking of approaches to unit testing, my knowledge with JUnit is limited. But I know that unit tests are just simulated user inputs,
so I wrote down the thoughts in psuedo code. I knew that that I would have to start the test with the annotation '@Test' followed by test method, within the test
method it needed to start with Assert, so I wrote assert(expected, actual) as a boiler plate. I then researched assertations, there are a few different assertation variables
the ones that stood out to me where Equals and True/False. 

I then started with the first of the considerations that needed to test the 'divisbleBy()' method, I wrote my first test. I created the variable 'FourIsDivisibleByTwoTest'
Assert.assertTrue(FizzBuzzGenerator.divisibleBy(numerator: 4, Denominator: 2). This creates a boolean that expects the outcome to be True and will fail if it is returned as false.	
Then you reference the Class from the other java file, FizzBuzzGenerator. You can then access the divisibleBy() method, I had to change it to static for it to work with this test,
then you put the two numbers you want to test, in this case we want to see if we can divide 4 by 2. The test came back false to begin with, I went back through the test
to make sure there was nothing wrong and then I went through the divisibleBy method, I changed the equals to (==2) to equals to (==0), this came through trial and error
to see if anything changed in the test outcome. I then added an output message that will only display if the test passes, it just says what the outcome of the test is. 
This is because when a test passes it doesnt display a message.

The next consideration was to check that opposite works for the divisibleBy method, so I changed the assertTrue to assertFalse, then substituted the 4 for a 3.
So it became Assert.assertFalse(FizzBuzzGenerator.divisibleBy(numerator 3, Denominator 2). This test passed first time, once again I put my own message to display what the test outcome meant.

The last consideration was to create a test that tested the arrayList in the second part of the FizzBuzzGenerator class. I started off the method by creating a new variable for the
FizzBuzzGenerator, putting it under tester so it is easier to access. Then I saw that I would have to use assertEquals, but I also knew that I would have to create an array in order to get the right answer.
So after a bit of investigating, I started the test with Assert.assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"}, tester.FizzBuzz(1,15).toArray());
it has similar aspects to the other assert statements, you access the class the same way but this time we want to access FizzBuzz, then put the numbers we want to test, and then put it into an array.
I tested it and it failed so I went through the FizzBuzz method, I changed <endName to <=endName because using <= is better than < because it checks both sides at the same time rather than just left against the right.
The last thing to do was to add a custom message so when the test passes you know what the outcome is.


