import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
	    
	    System.out.println("Number of tiles?");
	    
	    Scanner sc = new Scanner(System.in);
	    int input = sc.nextInt();
	    
	    int ans = 1;
	    
	    if(input <= 0) {
	        System.out.println("Please enter postive integer.");
	    } else {
    	    	while(ans < (int)Math.sqrt(input)) {
    	    	    ans++;
    	    	}
	    }
	    
		System.out.println("The largest square has side length " + ans);
	}
}