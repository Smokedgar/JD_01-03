package by.htp.leso2.main;
//Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел. 
public class Task17 {
	public static void main(String[] args) {
		double a = 4;
		double b = 2;
		double c;
		double d;
		c = (a * a * a + b * b * b)	/ 2;
		d = Math.cbrt(Math.abs(a) * Math.abs(b));
		System.out.println(c);
		System.out.println(d);
	}
}
