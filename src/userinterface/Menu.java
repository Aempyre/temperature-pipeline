package userinterface;

public class Menu {

    public static void showGreetingHeader() {
        System.out.println(
            "Welcome to the Temperature Unit Conversion Grading application"
          + "\nPlease follow the prompts exactly (as this version 0.1 app lacks handholding)"
          + "\nType \"exit\" to quit or simply hit enter in response to any prompt.\n\n");
    }
 
        
    public static void showPromptOriginalTemperature() {
        System.out.println(
            "Enter the number, including leading sign if any, of the original temperature.");
    }
    public static void showPromptOriginalUnitOfMeasure() {
        System.out.println(
            "Enter the one character symbol of the unit of measurement of the original temperature."
          + "\nanswer -- use C, F, K, or R.");
    }

    public static void showPromptStudentTemperature() {
        System.out.println(
            "Enter the number, including leading sign if any, of the students answer.");
    }

    public static void showPromptTargetUnitOfMeasure() {
        System.out.println(
            "Enter the one character symbol of the TARGET unit of measurement:"
          + "\n -- use C, F, K, or R.");
    }

    public static void showFarewellFooter() {
        System.out.println(
            "Thank you for letting us serve you, Goodbye (for now).");
    }


    /*  Messages  */

    public static void showInvalidUnitOfMeasureBetterLuckNextTime() {
        System.out.println(
            "\nSorry that was an invalid Unit, please be careful on the do-over!\n\n");
    }

    public static void showResult(String result) {
        System.out.println(
            "\nThe student's answer was:  " + result +".\n\n");
    }


}