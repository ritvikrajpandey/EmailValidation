
import java.util.*;
import java.util.regex.Matcher; 
import java.util.regex.Pattern;
public class Email
{
public static boolean  checkemail(String s)
{
	String[] a = {"ramesh@gmail.com", "ritvikrajpandey@gmail.com", "harsh@orkut.com" };
	for (int i=0; i<a.length; i++) {
        if (a[i].matches(s)) {
   
        	return true;
        }
  
	}
	return false;
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T;
		System.out.println("Number of  Tries");
		T=sc.nextInt();
		while(T!=0)
		{
	    String s; 
	    System.out.println("Enter Email id");
	    s=sc.next();
	    if(checkemail(s))
	    {
	        System.out.println("Correct Email Address");
	    }
	    else{
	        System.out.println("Email not found , Please Check");
	    }
	    T--;
		}
		
	}
}
