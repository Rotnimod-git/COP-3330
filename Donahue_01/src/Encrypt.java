import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int userNum;
		int a, b, c, d;
		int temp1, temp2, temp3, temp4;
		
		System.out.println("Please enter four numbers  that you wish to be encrypted (ex. 1234): ");
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
		
		a = (a + 7) % 10;
		b = (b + 7) % 10;
		c = (c + 7) % 10;
		d = (d + 7) % 10;
	
		temp1 = a;
		temp2 = b;
		temp3 = c;
		temp4 = d;
		
		a = temp3;
		b = temp4;
		c = temp1;
		d = temp2;
		
		System.out.println("The encrypted integer is: " + a + b + c + d);
	}

}
