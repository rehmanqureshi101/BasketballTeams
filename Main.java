import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Enter Your first and last name to open your bank account");
        String actualName = x.nextLine();


        System.out.println("Account opened by:" + " " + actualName);

        Scanner teamNameEntry = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Basketball Team name");

        String teamNameByUser = teamNameEntry.nextLine();  // Read user input
        System.out.println("team name is: " + teamNameByUser);

        BasketballTeam basketballTeam = new BasketballTeam();
        basketballTeam.teamName= teamNameByUser;


        Scanner teamNameInitialByUser = new Scanner(System.in);
        System.out.println("Enter Basketball Team Initial");

        String initialByUser = teamNameInitialByUser.nextLine();
        System.out.println("team initial is: " + initialByUser);
        basketballTeam.initials = initialByUser;


        Scanner staffName = new Scanner(System.in);
        System.out.println("Enter Staff member's name");

        String staffNameByUser = staffName.nextLine();
        System.out.println("staff member name is: " + staffNameByUser);
        Staff staff = new Staff();
        staff.name= staffNameByUser;



        // Output user input*/
    }
    }
