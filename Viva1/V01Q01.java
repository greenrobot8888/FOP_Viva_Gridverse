import java.util.Scanner;
public class V01Q01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();  // number of inquiries
        for(int i = 0; i < q; i++) {
            int a = input.nextInt();  // initial value
            int b = input.nextInt();  // multiplier seed
            int n = input.nextInt();  // charm length
            int power = 1;  // represents 2^step

            for(int step = 0; step < n; step++) {

                int result = a + (b * power);
                System.out.print(result);

                if(step < n - 1) {
                    System.out.print(" ");
                }

                power = power * 2;  // next power of 2
            }

            System.out.println();  // move to next line
        }
        input.close();
    }
}
