package _0_Arrays101;

public class _0_arrayBasics {
    public static void main(String[] args) {
        int[] squareNumbers = new int[1000];

        for(int i=0; i<squareNumbers.length; i++){
            int square = (i+1) * (i+1);
            squareNumbers[i] = square;
        }

        for (int i=0; i<squareNumbers.length;i++){
            int j = i+1;
            System.out.println(j+"-> "+squareNumbers[i]);
        }
    }

}
