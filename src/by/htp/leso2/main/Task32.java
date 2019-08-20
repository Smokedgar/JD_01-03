package by.htp.leso2.main;
// Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59). Какое время будут показывать часы через р ч q мин r с? //
public class Task32 {
	public static void main(String[] args) {
		double m = 21;
		double n = 3;
		double k = 3;
		double p = 1;
		double q = 67;
		double r = 1;
		double x;
		double y;
		double z;
		double c;
		double b;
		double d;
		double e;
		x = m * 3600 + n * 60 + k; // начальное время в секундах //
		y = p * 3600 + q * 60 + r; // добавочное время в секундах //
		z = x + y;
		c = (int) z / 3600;
		b = z % 3600;
		d = (int) b / 60;
		e = (int) b % 60;
		c = c % 24;
		System.out.print(c + "ч ");
		System.out.print(d + "мин ");
		System.out.print(e + "с");
	}
}
