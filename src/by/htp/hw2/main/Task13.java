package by.htp.hw2.main;
//Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится ближе к началу координат.
public class Task13 {
	public static void main(String args[]){
		double A;
		double B;
		double x1 = 2;
		double y1 = 1;
		double x2 = 1;
		double y2 = 2;
	A = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
	B = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
	if (A == B) System.out.println("равноудалены");
	else {
	if (A > B) System.out.println("точка B ближе");
	else System.out.println("точка А ближе");
	}
	}
}
