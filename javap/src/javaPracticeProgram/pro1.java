package javaPracticeProgram;

public class pro1 {

	public static void main(String[] args) {
		String s = "123";
		int count = 1;
		while(count<=3){
			for (int i = 0; i < s.length(); i++) {
				for (int j = 0; j < count; j++) {
					System.out.print(s.charAt(i));
				}
			}
			count++;
			System.out.print(" ");
		}
		

	}

}
