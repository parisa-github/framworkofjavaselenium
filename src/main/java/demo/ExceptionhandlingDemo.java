package demo;

public class ExceptionhandlingDemo {
	public static void main(String[] args) {
		
		try {
			demo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
	
	//secound way 
	public static void demo() throws Exception{
		System.out.println("...hello world....");
		int i = 1/0;
		System.out.println("completed");
		
	}
		
	/*	
		// first way one way to try and catch exceptions 
		try {
			System.out.println("...hello world....");
			int i = 1/0;
			System.out.println("completed");
			
		}
		catch(Exception exp) {
			System.out.println("i am inside catch block");
			System.out.println("Message is "+exp.getMessage());
			System.out.println("couses is "+exp.getCause());
			exp.printStackTrace();
			
			
		}
		finally {
			System.out.println("i am inside finally block");
		}
	
		*/
	

}
