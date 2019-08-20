package by.htp.hw3.mail;
/*Вводится натуральное число. 
 * Найти сумму четных цифр, входящих в его состав. 
 * Преобразовать его в другое число, цифры которого будут следовать в обратном порядке по сравнению с введенным числом. 
 */
public class Task24 {
	public static void main(String[] args) {
		int a;
		int b;
		int m = 0;
		int n = 123456;
		int d = n;
		int sum = 0;
		double x = 1234;
		double z;
		a = (int) x % 10;
		b = (int) x % 100 / 10;
		while (n > 0) {
			if (n % 10 % 2 == 0) 
			sum =sum + n % 10;
			n = n / 10;
		}
		System.out.println(sum);
		n = d;
		while (n > 0) {
		a = n % 10;
		n = n / 10;
		m = m * 10 + a;
		}
		System.out.println(m);	
	}
}
