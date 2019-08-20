package by.htp.hw2.main;
// Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12). Если введены некорректные данные, то сообщить об этом. 
import java.io.IOException;
import java.util.Scanner;

public class Task23 {
	public static void main(String args[]) throws IOException{
		
			System.out.println("Введите дату по примеру: xx yy zz");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("> ");
			
			int x = sc.nextInt();
			
			int y = sc.nextInt();
			
			int z = sc.nextInt();
			
			if (x > 31 || x < 1 || y > 12 || y < 1) System.out.println("Данные введены некорректно");
			
			else {
				
			System.out.print(x + "д ");
			
			System.out.print(y + "м ");
			
			System.out.print(z + "г");
			}
			System.in.close();
	}
}
