import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
	    
		System.out.print("Enter expression: ");
		String expression = input.nextLine();
		
		if(isBalanced(expression)){
	            System.out.println("Balanced");
	        }
	        else{
	            System.out.println("Not balanced");
	        }
	}
	
	static boolean isBalanced(String s){
	    int openingParenthesis = 0;
	    int closingParenthesis = 0;
	    
	    for(int i = 0; i < s.length(); i++){
	        char c = s.charAt(i);
	        
	        if(c == '('){ 
	        openingParenthesis++;
	        }
	        else if(c == ')'){ 
	        closingParenthesis++;
	        }
	        
	        if(closingParenthesis > openingParenthesis){
	            return false;
	        }
	    }
	
	       return openingParenthesis == closingParenthesis;
	}
} 
