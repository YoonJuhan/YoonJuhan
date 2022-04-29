import java.util.Scanner;

public class B2753 {

	public static void main(String[] args) {
		
		char Y = ' ' ;
		int year = 0 ;
		
		Scanner sc = new Scanner(System.in) ;
		
		year = sc.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			Y = '1' ;
		} else {
			Y = '0' ;
		}
		System.out.println(Y);
	}

}
