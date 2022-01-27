package calci;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("What do you want perform");
		char c = sc.next().charAt(0);
		switch(c)
		{
		case '+':
		{
	        result=a+b;
			System.out.println("Addition is "+result);
			break;
		}
		case '-':
		{
			result=a-b;
			System.out.println("Substraction is "+result);
			break;
		}
		case '*':
		{
			result = a*b;
			System.out.println("Multiplication is "+result);
			break;
		}
		case '/':
		{
			result=a/b;
			System.out.println("Divition is "+result);
			break;
		}
			
		default:
		{
			System.out.println("Invalid input");
		}
				
						
		}

	}
}
