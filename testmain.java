import java.util.Random;

public class testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Random random = new Random();
		for (int i = 0; i<10; i++) {
			int value = random.nextInt((3)- 0 + 1) + 0;
			System.out.println(value);
		}
		
	}

}
