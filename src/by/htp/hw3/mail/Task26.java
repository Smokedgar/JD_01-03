package by.htp.hw3.mail;
//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера (Таблицу ASCII).
public class Task26 {
	public static void main(String args[]){
		int a = 1;
		int b = 127;
		double y;
		double h = 0.5;
		int x = -5;
		System.out.println(" ————————————————");
		
		System.out.print("|   Dec  ");
		
		System.out.println("|  Char |");
		
		System.out.println(" ————————————————");
		while (x < b) {
			System.out.print("|   ");
			System.out.print (x);
			System.out.print("   |");
			System.out.print ("   " + (char) x);
			System.out.println("   |");
			x++;
		}
		System.out.println(" —————————————————");
	}
}
