import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int userNum;
		int a, b, c, d;
		int temp1, temp2, temp3, temp4;
		
		System.out.println("Please enter four numbers  that you wish to be decrypted (ex. 1234): ");
		userNum = scnr.nextInt();
		System.out.println("You entered: " + userNum);
		
		a = (userNum / 1000) % 10;
		// System.out.println("a = " + a);
		b = (userNum / 100) % 10;
		// System.out.println("b = " + b);
		c = (userNum / 10) % 10;
		// System.out.println("c = " + c);
		d = userNum % 10;
		// System.out.println("d = " + d);
		
		// a = a;
		// System.out.println("a encrypted is: " + a);
		// b = b;
		// System.out.println("b encrypted is: " + b);
		// c = c;
		// System.out.println("c encrypted is: " + c);
		// d = d;
		// System.out.println("d encrypted is: " + d);
		
		temp1 = a;
		temp2 = b;
		temp3 = c;
		temp4 = d;
		
		a = temp3;
		b = temp4;
		c = temp1;
		d = temp2;
		
		a = (a + 3) % 10;
		b = (b + 3) % 10;
		c = (c + 3) % 10;
		d = (d + 3) % 10;
		
		System.out.println("The encrypted integer is: " + a + b + c + d);
	}

}