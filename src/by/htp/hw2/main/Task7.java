package by.htp.hw2.main;
// Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х  
public class Task7 {
	public static void main(String[] args) {
		double a = 1;
		double b = 2;
		double c = 3;
		double x = 4;
		double z;
		z = a * x * x + b * x + c;
		System.out.println(Math.abs(z));
	}
}
