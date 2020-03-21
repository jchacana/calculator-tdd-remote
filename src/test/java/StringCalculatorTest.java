import com.natalita.StringCalculator;
import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void shouldReturnZeroWhenEmptyString (){
        StringCalculator stringCalculator = new StringCalculator();
        Assert.assertEquals(0, stringCalculator.add(""));
    }

}
