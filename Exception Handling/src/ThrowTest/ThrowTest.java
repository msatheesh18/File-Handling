package ThrowTest;

public class ThrowTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Checking Age");
		
		int age=15;
		
		if(age<18){
			throw new Exception("Under 18");
		}

		System.out.println(" Verified");
	}

}

//o/p:-
//Checking Age
//Exception in thread "main" java.lang.Exception: Under 18
	//at ThrowTest.ThrowTest.main(ThrowTest.java:12)
