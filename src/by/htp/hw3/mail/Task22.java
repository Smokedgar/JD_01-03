package by.htp.hw3.mail;
/*Составить программу для вычисления значений функции  F(x) на отрезке [а, b] с шагом h. 
 * Результат представить в виде таблицы, первый столбец которой – значения  аргумента, второй - соответствующие значения функции:
 */
public class Task22 {
	public static void main(String args[]){
		int a = 1;
		int b = 5;
		double y;
		double h = 0.5;
		double x = -5;
		System.out.println(" —————————————————");
		
		System.out.print("|    x   ");
		
		System.out.println("|   y    |");
		
		System.out.println(" —————————————————");
		while (x < b) {
			System.out.print("|");
			System.out.printf("%6.2f", x);
			System.out.print("  |");
			System.out.printf("%6.2f", (Math.pow(Math.sin(x), 2)));
			System.out.println("  |");
			x = x + h;
		}
		System.out.println(" —————————————————");
	}
}
