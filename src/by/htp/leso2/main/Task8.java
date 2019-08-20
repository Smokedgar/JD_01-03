package by.htp.leso2.main;
//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
public class Task8 {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		double d;
		d = (double) (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
		System.out.println(d);
	}
}
