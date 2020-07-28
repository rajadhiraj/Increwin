
class smallesWord{
		public static void main(String[] args) {
			
		    /*Scanner sc = new Scanner(System.in);
		    String myString=sc.nextLine();
		    System.out.println("Enter the string value :" + myString);*/
		    
		    String myString = "I want to become a good coder";
    	    String[] myWords = myString.split(" ");
		    int shortestLength,shortestLocation;
		
		    shortestLength=(myWords[0]).length();
		    shortestLocation=0;
		
		    for (int i=1;i<myWords.length;i++) {
		    	
		        if ((myWords[i]).length() < shortestLength) {
		            shortestLength=(myWords[i]).length();
		            shortestLocation=i;
		        }
		    }
		    System.out.println(myWords[shortestLocation]);
		}
}
