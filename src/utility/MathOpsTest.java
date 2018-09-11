import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

public class MathOpsTest {
  @Test
  public void evaluatesExpression() {

    // public static BigDecimal answerInFahrenheit(String originalType, BigDecimal temp, int places )

    BigDecimal temp = new BigDecimal("-40");
    int      places = 2;
    BigDecimal result = null;
    try {
        result = utility.MathOps.answerInFahrenheit("C", temp, places);        
    } catch (Exception e) {
        System.out.println("Caught exception:  " + e.getMessage());
    }

    assertEquals("-40.00", result.toString());
  }

}