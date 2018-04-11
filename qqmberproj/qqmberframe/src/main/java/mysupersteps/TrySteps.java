package mysupersteps;

import org.hamcrest.core.Is;
import org.junit.Assert;


public class TrySteps
{
    int result = 0;
    public void givenThijs()
    {
        Assert.assertTrue("A".equals("A"));
    }

    public void addTwoRandomNumbers(int anInt, int anotherInt)
    {
        result = anInt+anotherInt;
    }

    public void assertResult(int someInt)
    {
        Assert.assertThat( String.format("Expected %d but outcome was actually %d", someInt, result), result,Is.is(someInt));
    }


}
