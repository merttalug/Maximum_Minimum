import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n, num, max = 0, min = 0;

        System.out.println("How many numbers will you entered ? : ");
        n = keyboard.nextInt();


        for (int i = 1; i <= n; i++) {
            do {
                System.out.println("Please input the " + i + ". number: ");
                num = keyboard.nextInt();
            }
            while (num < 0);


            if (num > max) {
                if (min == 0) {
                    min = num;
                }
                max = num;
            } else if (num < min) {

                min = num;
            }

        }

        System.out.println("Minimum Number is : "+min);
        System.out.println("Maximum Number is : "+max);


    }

}
