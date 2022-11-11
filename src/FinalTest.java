import java.util.Scanner;

public class FinalTest {

    public static void main(String[] args) {
        int finalScore;
        System.out.println("Pick a score between 0 and 100");
        Scanner Num = new Scanner(System.in);

        finalScore = Num.nextInt();

        if (finalScore > 70){
            System.out.println("You approved, congratulations!!!");
        }else{
            System.out.println("You did not approve");
        }
    }
}
