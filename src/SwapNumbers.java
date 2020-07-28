import java.util.*;
public class SwapNumbers {

	public static void main(String[] args) {
		
		int x,y,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number X and Y");
		
		x=sc.nextInt();
		y=sc.nextInt();
		
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("after swapping numbers are :"+ x +" and " + y);
		
	}

}
