import java.util.Scanner;

public class AmountOfWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any text: ");

        String numbers = sc.nextLine();
        int amountOfWords=getWordsAmount(numbers);

        System.out.println("Amount of words in your text: " + amountOfWords);
    }

    public static int getWordsAmount(String numbers) {
        String array[]=numbers.split("\\s+");
        return array.length;
    }
}