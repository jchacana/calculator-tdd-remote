import com.natalita.StringCalculator;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class StringCalculatorShould {

    private StringCalculator stringCalculator;

    @Before
    public void setUp() throws Exception {

        stringCalculator = new StringCalculator();
    }

    @Test
    public void returnZeroWhenPassingEmptyString(){
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    @Parameters({
            "4, 4",
            "3, 3",
            "2, 2"
    })
    public void returnNumberGivenStringNumber(int expected, String number) {
        assertEquals(expected, stringCalculator.add(number));
    }

    @Test
    public void returnThreeGivenTwoStringNumbersSeparatedByComa(){
        assertEquals(3, stringCalculator.add("1,2"));
    }

    @Test
    public void returnFourtyFiveWhenGettingNumbersFromOneToNine(){
        assertEquals(45, stringCalculator.add("1,2,3,4,5,6,7,8,9"));
    }

    @Test
    public void returnSumWhenUsingNewLineSeparator() {
        assertEquals(6, stringCalculator.add("1\n2,3"));
    }

    @Test
    public void returnSumWhenUsingCustomSeparator() {
        assertEquals(3, stringCalculator.add("//;\n1;2"));
    }

    @Test
    public void returnSumWhenUsingCustomSeparator2() {
        assertEquals(3, stringCalculator.add("//;r\n1;r2"));
    }

}
