
import java.util.Scanner;

class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose a mode : C/D");
        char mode = scan.next().charAt(0);
        scan.nextLine();
        System.out.println("Provide the text : ");
        String text = scan.nextLine();
        if (mode == 'C') {

           System.out.println(compress(text));

        }
        else if (mode == 'D') {

            System.out.println(decompress(text));

        }


        scan.close();

    }

    public static String compress(String s) {

        StringBuilder result = new StringBuilder();

        int count = 1;

        for (int i = 0; i < s.length(); i++) {

            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {

                count++;

            }

            else {

                result.append(count);
                result.append(s.charAt(i));
                count = 1;
            }

        }
        return result.toString();
    }


    public static String decompress(String s) {

        StringBuilder result = new StringBuilder();
        StringBuilder numStr = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i))) {

                numStr.append(s.charAt(i));
            }

            else {

                if (numStr.length() == 0) {
                    return "Invalid encoding.";
                }

                int count = Integer.parseInt(numStr.toString());

                for (int j = 0; j < count; j++) {
                    result.append(s.charAt(i));
                }
                numStr.setLength(0);

            }



        }

        if (numStr.length() > 0) {
            return "Invalid encoding.";
        }


        return result.toString();

    }
}
