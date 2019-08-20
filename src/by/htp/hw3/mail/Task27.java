package by.htp.hw3.mail;
//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры. 
import java.io.IOException;
import java.util.Scanner;
public class Task27 {
	public static void main(String args[]) throws IOException{
		
		int b = 0;
		
		System.out.println("Введите m и n");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("> ");
		
		int m = sc.nextInt();
		
		int n = sc.nextInt();
		
		while (m <=n) {
			System.out.println("Делители числа " + m + ": ");
			for (int i = 2; i <= m - 1; i++) {
				if (m % i == 0) System.out.println(i + " ");
			}
			m++;
		}
		
		System.in.close();
	}

}
