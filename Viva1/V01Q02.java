import java.util.Scanner;
public class V01Q02 {
   public static void main(String [] args) {
       Scanner input = new Scanner(System.in);

       int q = input.nextInt();
       input.nextLine();

       for (int i = 0; i < q; i++) {
           String N = input.next(); // read number as string
           int L = input.nextInt();

           int lucky = 0;
           int zero = 0;
           int even = 0;
           int odd = 0;

           for (int j = 0; j < N.length(); j++) {
               int digit = N.charAt(j) - '0';  // // convert char to int

               if (digit == L) {
                   lucky++;
               } else if (digit == 0) {
                   if (L != 0) zero++;
               } else if (digit % 2 == 0) {
                   even++;
               } else {
                   odd++;
               }
           }

           // Determine signature by strict highest
           if (lucky > zero && lucky > even && lucky > odd) {
               System.out.println("LUCKY");
           } else if (even > lucky && even > zero && even > odd) {
               System.out.println("BALANCED");
           } else if (odd > lucky && odd > zero && odd > even) {
               System.out.println("ENERGETIC");
           } else {
               System.out.println("NEUTRAL");
           }
       }

       input.close();;
   }
}
