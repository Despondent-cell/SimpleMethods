import java.util.Scanner;

public class PyramidInConsole {

    public static void main(String[] args) {
        System.out.print("Please, enter height of the pyramid: ");
        Scanner sc = new Scanner(System.in);
        Long userInput = Long.valueOf(sc.nextLine());
        String sign="*";
        String stringss= "";
        int i=0;

        for (;i<userInput;i++){
            stringss=stringss.concat(sign);
            System.out.println(stringss);
        }
        for (long j=userInput;j>0;j--){

            System.out.println(stringss.substring(0, (int) (j-1)));
        }
    }

}