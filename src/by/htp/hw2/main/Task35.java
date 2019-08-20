package by.htp.hw2.main;
//Вычислить число и месяц в невисокосном году по номеру дня
import java.io.IOException;
import java.util.Scanner;
public class Task35 {
	public static void main(String args[]) throws IOException{
		int a;
		System.out.println(">");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
			if (a < 31 && a > 0) 
				System.out.println(a + ".01");		
			a = a - 31; 
			if (a < 28 && a > 0) 
				System.out.println(a + " .02");		
			
			a = a - 28;
			if (a < 31 && a > 0)
				System.out.println(a + " .03");
			a = a - 31; 
			if (a < 30 && a > 0) 
				System.out.println(a + " .04");		
			a = a - 30; 
			if (a < 31 && a > 0) 
				System.out.println(a + " .05");		
			a = a - 31; 
			if (a < 30 && a > 0) 
				System.out.println(a + " .06");		
			a = a - 30; 
			if (a < 31 && a > 0) 
				System.out.println(a + " .07");		
			a = a - 31; 
			if (a < 31 && a > 0) 
				System.out.println(a + " .08");		
			a = a - 31; 
			if (a < 30 && a > 0) 
				System.out.println(a + " .09");		
			a = a - 30; 
			if (a < 31 && a > 0) 
				System.out.println(a + " .10");		
			a = a - 31; 
			if (a < 30 && a > 0) 
				System.out.println(a + " .11");		
			a = a - 30; 
			if (a < 31 && a > 0) 
				System.out.println(a + " .12");		
			a = a - 31; 
			System.in.close(); 
	}
}
