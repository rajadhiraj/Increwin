
public class Increwin1 {

	public static void main(String[] args) {
		
		String s ="This is our company";
		
		String s1[]=s.split(" ");
		
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i] +"size of "+ i + " word is : " + s1[i].length());
		/*if()
		{
			
		}*/
		}
		

	}

}


//Given a string e.g. “This is our company”. Print the smallest word in the string.
//Your program must be a reusable function
//handling various inputs. (Time: 15 minutes)