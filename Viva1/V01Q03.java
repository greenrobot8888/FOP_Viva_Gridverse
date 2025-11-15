import java.util.Scanner;
public class V01Q03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the number of inquaries (1-50): ");
        int T = input.nextInt();
        //The number of inquiries, T, will be between 1 and 50. 
        if(T>=1&&T<=10){ 
        for(int d=1; d<=T;d++){
             
        System.out.print("Please enter the Height (1-9): ");
        int H = input.nextInt();
        System.out.print("Please enter the Style (A/P): ");
        String S = input.next();
        //the number of H will be 1-9 or else its invalid
        if(H>=1&&H<=9){
        if(S.equals("A")){
            for(int i=1;i<=H;i++){
                for(int u=1;u<=i;u++){
                    System.out.print(i);
                }
                System.out.println();
            }       
    }
        if(S.equals("P")){
            for(int i=1;i<=H;i++){
                for(int s=H;s>=i;s--){
                    System.out.print(" ");
                }
                for(int u=1;u<=i;u++){
                    System.out.print(u);
                }
                for(int r=i-1;r>=1;r--){
                    System.out.print(r);
                }System.out.println();
            }
        }}
    }
    }
    }    
}
