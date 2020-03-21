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

}