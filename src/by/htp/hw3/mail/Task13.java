package by.htp.hw3.mail;
//Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5. 
public class Task13 {
	public static void main(String args[]){
		int a = 1;
		int b = 5;
		double y;
		double h = 0.5;
		double x = -5;
		System.out.println(" —————————————————");
		System.out.print("|   y    |");
		System.out.println("    x   |");
		System.out.println(" —————————————————");
		while (x < b) {
			System.out.print("|");
			System.out.printf("%6.2f", (5 - x * x / 2));
			System.out.print("  |");
			System.out.printf("%6.2f", x);
			System.out.println("  |");
			x = x + h;
		}
		System.out.println(" —————————————————");
	}
}
