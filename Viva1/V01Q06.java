import java.util.Scanner;

public class V01Q06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        String allLogs = sc.nextLine().trim();

        String[] logArray = allLogs.split(" ");

        for (int t = 0; t < T; t++) {
            if (t < logArray.length) {
                String logString = logArray[t];
                processLog(logString);
            }

            if (t < T - 1) {
                System.out.print(" ");
            }
        }
        
        System.out.println();
        sc.close();
    }

    public static void processLog(String log) {
        long decompressedLength = 0;
        boolean isValid = true;

        if (log.isEmpty()) {
            System.out.print(0);
            return;
        }

        if (Character.isDigit(log.charAt(0))) {
            isValid = false;
        }

        if (isValid) {
            for (int i = 0; i < log.length(); i++) {
                char c = log.charAt(i);

                if (c == '0' || c == '1') {
                    isValid = false;
                    break; 
                }

                if (Character.isLetter(c)) {
                    decompressedLength++;
                } else {
                    if (!Character.isDigit(c)) {
                        isValid = false;
                        break;
                    }
                    
                    char prevChar = log.charAt(i - 1);
                    if (Character.isDigit(prevChar)) {
                        isValid = false;
                        break; 
                    }

                    int d = c - '0';
                    decompressedLength += (d - 1);
                }
            }
        }

        if (isValid) {
            System.out.print(decompressedLength);
        } else {
            System.out.print("Invalid Log");
        }
    }
}
