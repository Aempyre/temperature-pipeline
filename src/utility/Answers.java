package utility;

import java.math.BigDecimal;

public class Answers {

    /*  This class judges student answers  */

    public static String CELSIUS    = "C";
    public static String FAHRENHEIT = "F";
    public static String KELVIN     = "K";
    public static String RANKINE    = "R";

    public static String CORRECT   = "correct";
    public static String INCORRECT = "correct";
    public static String INVALID   = "correct";

    private static int roundToPlaces = 2;


    public String checkAnswer(String originalTemperature,
                              String originalUnitOfMeasure,
                              String studentTempNumber,
                              String targetUnitOfMeasure)  throws Exception {

        String response = INVALID;

        if ( targetUnitOfMeasure.equalsIgnoreCase(CELSIUS) ) {
            if ( new BigDecimal(studentTempNumber).equals(MathOps.answerInCelsius(
                originalUnitOfMeasure, new BigDecimal(originalTemperature), roundToPlaces )))  {
                response = CORRECT;
            } else {
                response = INCORRECT;
            }

        } else if ( targetUnitOfMeasure.equalsIgnoreCase(FAHRENHEIT) ) {
            if ( new BigDecimal(studentTempNumber).equals(MathOps.answerInFahrenheit(
                originalUnitOfMeasure, new BigDecimal(originalTemperature), roundToPlaces )))  {
                response = CORRECT;
            } else {
                response = INCORRECT;
            }

        } else if ( targetUnitOfMeasure.equalsIgnoreCase(KELVIN) ) {
            if ( new BigDecimal(studentTempNumber).equals(MathOps.answerInKelvin(
                originalUnitOfMeasure, new BigDecimal(originalTemperature), roundToPlaces )))  {
                response = CORRECT;
            } else {
                response = INCORRECT;
            }

        } else if ( targetUnitOfMeasure.equalsIgnoreCase(RANKINE) ) {
            if ( new BigDecimal(studentTempNumber).equals(MathOps.answerInRankine(
                originalUnitOfMeasure, new BigDecimal(originalTemperature), roundToPlaces )))  {
                response = CORRECT;
            } else {
                response = INCORRECT;
            }

        } 

        return response;
    }

}