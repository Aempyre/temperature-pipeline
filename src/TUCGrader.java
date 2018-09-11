import utility.Answers;
import utility.MathOps;
import userinterface.Menu;

import java.util.Scanner;   // for line by line keyboard input.
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;


public class TUCGrader {

    // Authoritative answers
    private static Answers answers = new Answers();

    private static String elements[] = { "C", "F", "K", "R" };
    private static Set<String> unitTypes = new HashSet<>(Arrays.asList(elements));


    public static void main(String[] args) {

        Menu.showGreetingHeader();

        // Create a line by line scanner to collect keyboard information
        Scanner inputLineScanner = new Scanner(System.in);

        String currentInputString = "continue please!";

        String originalTemp;
        String originalUnit;
        String studentTemp;
        String targetUnit;


        while ( !currentInputString.toLowerCase().equalsIgnoreCase("exit")  &&
                !currentInputString.toLowerCase().equalsIgnoreCase("") ) {

            Menu.showPromptOriginalTemperature();
            currentInputString = inputLineScanner.nextLine();
            if ( !currentInputString.toLowerCase().equalsIgnoreCase("exit")  &&
                    !currentInputString.toLowerCase().equalsIgnoreCase("") ) {
                originalTemp = currentInputString;
            } else {
                continue;
            }
            Menu.showPromptOriginalUnitOfMeasure();
            currentInputString = inputLineScanner.nextLine();
            if ( !currentInputString.toLowerCase().equalsIgnoreCase("exit")  &&
                    !currentInputString.toLowerCase().equalsIgnoreCase("") ) {

                if ( !unitTypes.contains(currentInputString) ) {
                    Menu.showInvalidUnitOfMeasureBetterLuckNextTime();
                    continue;
                }
                originalUnit = currentInputString;
            } else {
                continue;
            }
        
            Menu.showPromptStudentTemperature();
            currentInputString = inputLineScanner.nextLine();
            if ( !currentInputString.toLowerCase().equalsIgnoreCase("exit")  &&
                 !currentInputString.toLowerCase().equalsIgnoreCase("") ) {
                studentTemp = currentInputString;
            } else {
                continue;
            }

            Menu.showPromptTargetUnitOfMeasure();
            currentInputString = inputLineScanner.nextLine();
            if ( !currentInputString.toLowerCase().equalsIgnoreCase("exit")  &&
                 !currentInputString.toLowerCase().equalsIgnoreCase("") ) {

                if ( !unitTypes.contains(currentInputString) ) {
                    Menu.showInvalidUnitOfMeasureBetterLuckNextTime();
                    continue;
                }
                targetUnit = currentInputString;
            } else {
                continue;
            }

            try {
                Menu.showResult(
                    answers.checkAnswer(originalTemp, originalUnit, studentTemp, targetUnit)
                );     
            } catch (Exception e) {
                System.out.println("Caught exception:  " + e.getMessage());
            }

        }

        Menu.showFarewellFooter();

    }

}