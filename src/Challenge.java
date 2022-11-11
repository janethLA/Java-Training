import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        String question = "What is the most polluting country in the world?";
        String option1 = "United States";
        String option2 = "China";
        String option3 = "India";
//        String question2 = "What is the world's largest country?";
//        String option1ForQ2 = "Canada";
//        String option2ForQ2 = "China";
//        String option3ForQ2 = "India";

        String message = "";
        int pickedOption = 0;
        int counter = 0;
        boolean flag = false;

//        System.out.println("QUESTION 2: "+question2);
//
//        System.out.println("Pick an option:");
//        System.out.println("    1: "+option1ForQ1);
//        System.out.println("    2: "+option2ForQ1);
//        System.out.println("    3: "+option3ForQ1);

        while (counter < 2) {
            System.out.println("QUESTION " + (counter+1)+" : "+question);
            System.out.println("Pick an option:");
            System.out.println("    1: " + option1);
            System.out.println("    2: " + option2);
            System.out.println("    3: " + option3);

            Scanner pickedOptionInput = new Scanner(System.in);
            pickedOption = pickedOptionInput.nextInt();

            message += "* QUESTION "+(counter+1)+" : ";
            if (pickedOption == 1) {
                message += "You pick the option 1 (" + option1 + ") of the question " + question +". The option is NOT correct  ";
            } else {
                if (pickedOption == 2  && counter == 0) {
                    message += "You pick the option 2 (" + option2 + ") of the question " + question +".The option is correct  ";
                } else {
                    if (pickedOption == 2  && counter == 1) {
                        message += "You pick the option 2 (" + option2 + ") of the question " + question +".The option is NOT correct  ";
                    }else{
                        if (pickedOption == 3 && counter == 0) {
                            message += "You pick the option 3 ( " + option3 + ") of the question " + question +". The option is NOT correct  ";
                        }
                        if (pickedOption == 3 && counter == 1) {
                            message += "You pick the option 3 (" + option3 + ") of the question " + question +". The option is correct ";
                        }
                    }
                }
            }
            question = "What is the world's largest country?";
            option1 = "Canada";
            option2 = "China";
            option3 = "Russia";
            counter++;
        }
        System.out.println("MESSAGE : "+message);
        }
}
