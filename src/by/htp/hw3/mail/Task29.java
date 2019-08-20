package by.htp.hw3.mail;
//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа. 
public class Task29 {
	public static void main(String args[]){
		int a = 137;
		int b = 127;
		int c;
		int d;
		while (a > 0) {
			d = a % 10;
			a = a / 10;
			c = b;
			while (c > 0) {
				if (c % 10 == d) {System.out.println(d);
				break;
				}
				c = c / 10;
			}			
		}
		
	}
}
