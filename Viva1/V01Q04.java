import java.util.Scanner;

public class V01Q04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        //all text changed to lowercase for easier comparison// 

        String text = scan.nextLine().toLowerCase();


        int k = scan.nextInt();

        /*why text.length() - k? this is because, if lets say word : morning
        , mor = 0,1,2  orn = 1,2,3 rni = 2,3,4 ing = 3,4,5 what happens when
        it reaches ng? there is no third value, which is where the minus k comes
        in as it put limits so that error doesnt occur, the i, i+k has the same logic
        here */
        String firstWhisper = null;
        String coreValue = null;
        String lastEcho = null;
        int maxAsciiSum = -1;

        for (int i = 0; i <= text.length() - k; i++) {
            String sub = text.substring(i, i + k);

            if ((firstWhisper == null) || sub.compareTo(firstWhisper) < 0) {
                firstWhisper = sub;
            }

            if (lastEcho == null || sub.compareTo(lastEcho) > 0) {
                lastEcho = sub;
            }

            int sum = 0;
            for (int j = 0; j < sub.length(); j++) {
                sum += sub.charAt(j);
            }

            if (sum > maxAsciiSum) {
                maxAsciiSum = sum;
                coreValue = sub;
            }

        }
    System.out.println(firstWhisper);
    System.out.println(lastEcho);
    System.out.println(coreValue);
    }
}




    

