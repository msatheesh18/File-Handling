package ThrowsTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;

public class ThrowsTest {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		// TODO Auto-generated method stub
		dev1();

	}
	
	public static void dev1() throws FileNotFoundException, InterruptedException{
		dev2();
		
	}
	
	public static void dev2() throws FileNotFoundException, InterruptedException{
		dev3();
		
	}
	public static void dev3() throws FileNotFoundException, InterruptedException{
		
		File f=new File("");
		FileInputStream fis=new FileInputStream(f);
		Thread.sleep(1000);
		
	}

}
