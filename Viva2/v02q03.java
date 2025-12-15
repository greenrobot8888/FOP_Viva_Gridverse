import java.util.Scanner;

public class v02q03 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the ticket number: ");

        String ticket = input.next();

        int num = ticket.length();

        int front = 0, back = 0;

        boolean isLuckyTicket = (num % 2 == 0 && ticket.matches("\\d+"));

        if (isLuckyTicket) {

            for (int i = 0; i < num / 2; i++ ) {

                front += ticket.charAt(i) - '0';

            }

            for (int j = num / 2; j < num; j++) {

                back += ticket.charAt(j) - '0';

            }

            if ( front == back) {

                System.out.println("Lucky");

            }else {

                System.out.println("Unlucky");

            }

        } else {

            System.out.println("Invalid ticket number.");

        }

    }

}
