import java.util.Scanner;
import java.util.stream.IntStream;

public class guessNumber {
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int myNumber = scan.nextInt();                                     //guessed number

        int answer;
        int[] arr = IntStream.rangeClosed(0, 1000).toArray();
        int i = 0;
        int start = 0;
        int end = arr.length - 1;
        boolean say = true;
        while(say) {


            int mid = (start + end) / 2;
            System.out.println(mid);
            System.out.printf("Write if the number %d is:\n1 - correct\n2 " +
                    "- less than guessed\n3 - more than guessed\n", mid);
            Scanner sc = new Scanner(System.in);
            answer = sc.nextInt();
            if (answer == 1) {
                System.out.println("The program guessed your number!!!\nIt is " + mid);
                say = false;
            } else {
                if (answer == 2) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            i++;
        }

        System.out.println("The number of attempts: "+i);


    }

}
