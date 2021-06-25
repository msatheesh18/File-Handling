package ThrowableTest;

public class TryCatchTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("program initiated");
		
		try{
			
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

		
		System.out.println("program completed");
	}

}
