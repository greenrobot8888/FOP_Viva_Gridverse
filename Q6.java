import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
    
        System.out.print("Array A: ");
        String line1 = scan.nextLine();
        int[] arrayA = toIntArray(line1); 
        
    
        System.out.print("Array B: ");
        String line2 = scan.nextLine();
        int[] arrayB = toIntArray(line2); 
        

        if (isMirror(arrayA, arrayB)) {
            System.out.println("Mirror pattern: true");
        } else {
            System.out.println("Mirror pattern: false");
        }

        scan.close();
    }


    public static int[] toIntArray(String line) {

        String array[] = line.split(",");

        int numbers[] = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            numbers[i] = Integer.parseInt(array[i].trim());
        }
        return numbers;
    }


public static boolean isMirror(int[] a, int[] b) {

    if (a.length != b.length) {
        return false;
    }

    for (int i = 0; i < a.length; i++) {
        //b.length - 1 as indexes start from 0

        if (a[i] != b[b.length - 1 - i]) {
            return false; 
        }
    }
    return true;
}
}