package exception;

public class UseException {

	public static void main(String[] args) {
		
		int number = 10;
		try{
			int result = number/0;
			System.out.println(result);
		}catch(Exception ex){
			ex.printStackTrace();
			//System.out.println("you can not divide a number by zero");
		}

	}

}
