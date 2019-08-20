package by.htp.leso2.main;
//Найти произведение цифр заданного четырехзначного числа.
public class Task16 {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		double x = 1234;
		double z;
		a = (int) x % 10;
		b = (int) x % 100 / 10;
		c = (int) x % 1000 / 100;
		d = (int) x % 10000 / 1000;
		z = a * b *c * d;
		System.out.println(z);
	}
}
