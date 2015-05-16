package TrainingDay3;

public class trycatchBlockConcept {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		try{
			System.out.println("A");
			System.out.println(1/0);
			System.out.println("B");
		}catch(Exception e){
			System.out.println("From the catch block");
			e.printStackTrace();
		}finally{
			
		}
		
		System.out.println("Outside catch block");
		
		
		
	}

}
