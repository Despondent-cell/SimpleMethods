import java.util.Scanner;

public class NewLineForDigit {

    public static void main(String[] args) {
        System.out.print("Please, enter any integer: ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        int i=1;
        int j=userInput.length()+1;

        for (i=1;i<j;i++){
            String stringss=userInput.substring(i-1,i);
            System.out.println(stringss);
        }
    }

}