import com.natalita.StringCalculator;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class StringCalculatorShould {

    @Test
    public void returnZeroWhenPassingEmptyString(){
        StringCalculator stringCalculator = new StringCalculator();
        Assert.assertEquals(0, stringCalculator.add(""));
    }

    @Test
    @Parameters({
            "4, 4",
            "3, 3",
            "2, 2"
    })
    public void returnNumberGivenStringNumber(int expected, String number) {
        StringCalculator stringCalculator = new StringCalculator();
        Assert.assertEquals(expected, stringCalculator.add(number));
    }

    @Test
    public void returnThreeGivenTwoStringNumbersSeparatedByComa(){
        StringCalculator stringCalculator = new StringCalculator();
        Assert.assertEquals(3, stringCalculator.add("1,2"));
    }

    @Test
    public void returnFourtyFiveWhenGettingNumbersFromOneToNine(){
        StringCalculator stringCalculator = new StringCalculator();
        Assert.assertEquals(45, stringCalculator.add("1,2,3,4,5,6,7,8,9"));
    }
}
