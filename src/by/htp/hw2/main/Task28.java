package by.htp.hw2.main;
//Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не равно d, то найти max(d — a, d — b, d — c). 
public class Task28 {
	public static void main(String args[]){
		double a = 6;
		double b = 2;
		double c = 1;
		double d = 8;
		double x;
		if (a == d) System.out.println("a = d");
			else if (b == d) System.out.println("b = d");
				else if (c == d) System.out.println("c = d");
					else {
						x = Math.max(Math.max(d - a, d - b), (d - c));
						System.out.println(x);
					}
	}
}
