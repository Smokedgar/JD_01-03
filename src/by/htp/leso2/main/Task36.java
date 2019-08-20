package by.htp.leso2.main;
// Найти частное произведений четных и нечетных цифр четырехзначного числа. 
public class Task36 {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		double x = 1222;
		double z = 1;
		a = (int) x % 10;
		b = (int) x % 100 / 10;
		c = (int) x % 1000 / 100;
		d = (int) x % 10000 / 1000;
		if (a % 2 == 0) z = z * a;
			else z = z / a; 
		if (b % 2 == 0) z = z * b;
			else z = z / b; 
		if (c % 2 == 0) z = z * c;
			else z = z / c; 
		if (d % 2 == 0) z = z * d;
			else z = z / d; 
		System.out.println(z);
	}
}
