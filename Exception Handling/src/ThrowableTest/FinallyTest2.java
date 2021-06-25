package ThrowableTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Hashtable;

public class FinallyTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("program initiated");

		try {
		
			int a = 1;
			int b = 0;

			int c = a / b;

			System.out.println("Your result is " + c);
		} 
		finally {
			System.out.println("Thank you for visting us");
		}

		System.out.println("program completed");

	}

}

	