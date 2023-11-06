import java.util.Scanner;

public class UserActivitySelector {

    public static void main(String[] args) {
        System.out.print("Please, enter action name: ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        String size;
        switch (userInput) {

            case "login":
                size = "Please enter your username";
                break;
            case "sign_up":
                size = "Welcome";
                break;
            case "terminate_program":
                size = "Thank you! Good bye!";
                break;
            case "main_menu":
                size = "Main menu";
                break;
            case "about_app":
                size = "This app is created by me with support of ";
                break;
            default:
                size = "Please enter one of these values";
        }

        System.out.print(size);
    }
}

