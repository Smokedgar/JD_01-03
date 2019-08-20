package by.htp.hw2.main;
//Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные. 
public class Task12 {
	public static void main(String args[]){
		double a = 4;
		double b = 4;
		double c = -3;
		if (a >= 0) a = a * a;
		else a = a * a * a * a;
		if (b >= 0) b = b * b;
		else b = b * b * b * b;
		if (c >= 0) c = c * c;
		else c = c * c * c * c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
}
