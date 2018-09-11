package utility;

import java.math.BigDecimal;
import java.lang.Exception;


public class MathOps {

    public static BigDecimal roundToNPlaces(int places, BigDecimal value ) 
        throws Exception {
        if (places < 0) {
            throw new Exception("Cannot round to places less than zero!");
        } else {
            return value.setScale(places, BigDecimal.ROUND_HALF_UP);          
        }
     }

    /*  Convert temperature in any of the four supported units of measurement to 
        degrees Celsius -- rounding result to the specified number of places! */
    public static BigDecimal answerInCelsius(String originalType, BigDecimal temp, int places )
        throws Exception {

        BigDecimal convertedTemp;

        if ( originalType.equalsIgnoreCase(Answers.CELSIUS) ) {
            convertedTemp = roundToNPlaces(places, temp);

        } else if ( originalType.equalsIgnoreCase(Answers.FAHRENHEIT) ) {
            convertedTemp = roundToNPlaces(places, 
            (temp.subtract(BigDecimal.valueOf(32))
                 .multiply(BigDecimal.valueOf(5))
                 .divide(BigDecimal.valueOf(9))));

        } else if ( originalType.equalsIgnoreCase(Answers.KELVIN) ) {
            convertedTemp = roundToNPlaces(places, 
            (temp.subtract(BigDecimal.valueOf(273.15))));

        } else if ( originalType.equalsIgnoreCase(Answers.RANKINE) ) {
            convertedTemp = roundToNPlaces(places, 
            (temp.multiply(BigDecimal.valueOf(9))
                 .divide(BigDecimal.valueOf(5))
                 .subtract(BigDecimal.valueOf(459.67))));

        } else {
            throw new Exception("Invalid Unit of Measure Type");
        }

        return convertedTemp;
    }

    /*  Convert temperature in any of the four supported units of measurement to 
        degrees Fahrenheit -- rounding result to the specified number of places! */
        public static BigDecimal answerInFahrenheit(String originalType, BigDecimal temp, int places )
            throws Exception {

            BigDecimal convertedTemp;
    
            if ( originalType.equalsIgnoreCase(Answers.CELSIUS) ) {
                convertedTemp = roundToNPlaces(places, 
                (temp.divide(BigDecimal.valueOf(5))
                     .multiply(BigDecimal.valueOf(9))
                     .add(BigDecimal.valueOf(32))));
    
            } else if ( originalType.equalsIgnoreCase(Answers.FAHRENHEIT) ) {
                convertedTemp = roundToNPlaces(places, temp);
    
            } else if ( originalType.equalsIgnoreCase(Answers.KELVIN) ) {
                convertedTemp = roundToNPlaces(places, 
                (temp.multiply(BigDecimal.valueOf(9))
                     .divide(BigDecimal.valueOf(5))
                     .subtract(BigDecimal.valueOf(459.67))));

            } else if ( originalType.equalsIgnoreCase(Answers.RANKINE) ) {
                convertedTemp = roundToNPlaces(places, 
                (temp.subtract(BigDecimal.valueOf(459.67))));
    
            } else {
                throw new Exception("Invalid Unit of Measure Type");
            }
    
            return convertedTemp;
        }

    /*  Convert temperature in any of the four supported units of measurement to 
        degrees Kelvin -- rounding result to the specified number of places! */
        public static BigDecimal answerInKelvin(String originalType, BigDecimal temp, int places ) 
            throws Exception {

            BigDecimal convertedTemp;
    
            if ( originalType.equalsIgnoreCase(Answers.CELSIUS) ) {
                convertedTemp = roundToNPlaces(places, 
                (temp.add(BigDecimal.valueOf(273.15))));
    
            } else if ( originalType.equalsIgnoreCase(Answers.FAHRENHEIT) ) {
                convertedTemp = roundToNPlaces(places, 
                (temp.add(BigDecimal.valueOf(273.15))
                     .multiply(BigDecimal.valueOf(5))
                     .divide(BigDecimal.valueOf(9))));
    
            } else if ( originalType.equalsIgnoreCase(Answers.KELVIN) ) {
                convertedTemp = roundToNPlaces(places, temp);
    
            } else if ( originalType.equalsIgnoreCase(Answers.RANKINE) ) {
                convertedTemp = roundToNPlaces(places, 
                (temp.multiply(BigDecimal.valueOf(5))
                 .divide(BigDecimal.valueOf(9))));
    
            } else {
                throw new Exception("Invalid Unit of Measure Type");
            }
    
            return convertedTemp;
        }

    /*  Convert temperature in any of the four supported units of measurement to 
        degrees Rankine -- rounding result to the specified number of places! */
        public static BigDecimal answerInRankine(String originalType, BigDecimal temp, int places ) 
            throws Exception {

            BigDecimal convertedTemp;
    
            if ( originalType.equalsIgnoreCase(Answers.CELSIUS) ) {
                convertedTemp = roundToNPlaces(places, 
                (temp.add(BigDecimal.valueOf(273.15))
                     .multiply(BigDecimal.valueOf(9))
                     .divide(BigDecimal.valueOf(5))));

            } else if ( originalType.equalsIgnoreCase(Answers.FAHRENHEIT) ) {
                convertedTemp = roundToNPlaces(places, 
                (temp.add(BigDecimal.valueOf(459.67))));
    
            } else if ( originalType.equalsIgnoreCase(Answers.KELVIN) ) {
                convertedTemp = roundToNPlaces(places, 
                (temp.multiply(BigDecimal.valueOf(9))
                     .divide(BigDecimal.valueOf(5))));
    
            } else if ( originalType.equalsIgnoreCase(Answers.RANKINE) ) {
                convertedTemp = roundToNPlaces(places, temp);
    
            } else {
                throw new Exception("Invalid Unit of Measure Type");
            }
    
            return convertedTemp;
        }
            
}