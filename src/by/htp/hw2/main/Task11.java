package by.htp.hw2.main;
// Составить программу, которая определит площадь какого треугольника больше.
public class Task11 {
	public static void main(String args[]){
		double a = 4;
		double b = 4;
		double c = 3;
		double A = 2;
		double B = 3;
		double C = 1;
		double s, S;
		double p, P;
		p = (a + b + c) / 2;
		s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		P = (A + B + C) / 2;
		S = Math.sqrt(P * (P - A) * (P - B) * (P - C));
		if (s == S) System.out.println("Площади равны");
		else {
		if (s < S) System.out.println("площадь треугольника со сторонами A, B и C - большая");
		else System.out.println("Площадь треугольника со сторонами a, b и c - меньшая");
		}
	}
}
