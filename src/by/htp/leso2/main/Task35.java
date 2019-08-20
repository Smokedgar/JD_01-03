package by.htp.leso2.main;
//Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N. 
public class Task35 {
	public static void main(String[] args) {
		double M = 4567;
		double N = 100;
		double a;
		double b;
		double c;
		a = M / N;
		b = (int) a;
		b = a - b;
		b = b * 10;
		b = (int) b;
		System.out.println(b + " Старшая дробной");
		a = a / 10;
		c = (int) a;
		c = a - c;
		c = c * 10;
		c = (int) c;
		System.out.println(c + " Младшая целой");
		
	}
}
