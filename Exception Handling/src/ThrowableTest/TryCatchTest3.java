package ThrowableTest;

public class TryCatchTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("program initiated");
		
		try{
				int a=1;
				int b=0;
				
				int c=a/b;
			
				System.out.println("Your result is "+c);
		}
		
		catch (Exception e) {
			System.out.println("Alert :-  sorry somthing went wrong -" + e.getMessage());
		}
		
		
		System.out.println("program completed");
	}

}
