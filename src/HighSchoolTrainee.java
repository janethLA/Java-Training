import java.util.Scanner;

public class HighSchoolTrainee {
    public static void main(String[] args) {
        int StudentAge = 23;
        double Prom = 7.5;
        String Midlename = "anet";
        char Firsinitial = 'J';
        char lastinitial = 'h';
        boolean Attendance = true;

        String Name = "Janeth";
        String LastName = "Lopez";

        System.out.println("My Age is " +StudentAge);
        System.out.println("My Prom is "+Prom);
        System.out.println("My Name is "+Name);
        System.out.println("My LastName is "+LastName);
//        System.out.println("My Midlename is "+Midlename);
//        System.out.println("My Firsinitial is  "+Firsinitial);
//        System.out.println("My lastinitial is "+lastinitial);
        System.out.println("My Attendance is "+Attendance);
        System.out.println("===================================================");
        System.out.println("You are the student : "+ Name +" "+ LastName +" And your initials are: " + Firsinitial + lastinitial );

        System.out.println("Your prom is " + Prom + ", Please modify this prom ");
        Scanner promInput = new Scanner(System.in);
        Prom = promInput.nextDouble();
        System.out.println("Your new Prom is "+ Prom);

        System.out.println("Your LastName is " + LastName + ", Please modify this LastName ");
        Scanner lastnameInput = new Scanner(System.in);
        LastName = lastnameInput.nextLine();
        System.out.println("Your new LastName is "+ LastName);


    }

}
