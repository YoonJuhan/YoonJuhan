import java.util.Scanner;

public class B1330 {

	public static void main(String[] args) {

		String F = " ";
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A>B) {
			F = ">";
		} else if (A<B) {
			F = "<";
		} else {
			F = "==";
		}
		System.out.println(F);
	}

}
