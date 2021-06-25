package ThrowableTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;

public class TryCatchTest5 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
			System.out.println("program initiated");
		
		try{
			
			File f=new File("global file not present");
			FileInputStream fis=new FileInputStream(f);

			Hashtable hashtable=new Hashtable();
			hashtable.put(null, null);
			
			String[] attempt = new String[3];
			attempt[0] = "sucess";// 1
			attempt[1] = "failed";// 2
			attempt[2] = "sucess";// 3
		    attempt[3] = "sucess";//4
		    
		    
				int a=1;
				int b=0;
				
				int c=a/b;
			
				System.out.println("Your result is "+c);
		}
		
		catch(ArithmeticException e){
				System.out.println("Alert :-  Your input is not valid - "+e.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Alert :-  You have reached your max count - " + e.getMessage());
		}
			catch (FileNotFoundException e) {
				System.out.println("Alert     :-  You global file not found - " + e.getMessage());
			System.out.println("Operation :- program executed with local file");
		}
		
		catch (Exception e) {
			System.out.println("Alert     :-  sorry somthing went wrong -" + e.getMessage());
		}
		catch (Throwable t) {
			System.out.println("Alert     :-  Unexpected critical error casued, please contact support team -" + t.getMessage());
		}
		
		System.out.println("program completed");
	}

}
