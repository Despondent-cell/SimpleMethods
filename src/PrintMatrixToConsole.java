public class PrintMatrixToConsole {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5,},
                {6, 7},
                {8, 9, 10}
        };
        int a=0;
		int j= matrix[a].length;
        String t=matrix[1].toString();
        System.out.println(t);
    }

}