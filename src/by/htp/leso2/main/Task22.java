package by.htp.leso2.main;
/*
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc
 */
public class Task22 {
	public static void main(String[] args) {
		double a = 3661;
		double b;
		int c;
		int d;
		int e;
		c = (int) a / 3600;
		b = a % 3600;
		d = (int) b / 60;
		e = (int) b % 60;
		System.out.print(c + "ч ");
		System.out.print(d + "мин ");
		System.out.print(e + "с");
		
	}
}
