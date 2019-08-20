package by.htp.hw3.mail;
//Для заданного натурального числа определить, образуют ли его цифры арифметическую прогрессию. Предполагается, что в числе не менее трёх цифр. Например: 1357, 963.  
import java.io.IOException;
import java.util.Scanner;

public class Task38 {
	public static void main(String args[]) throws IOException{
		int n = 0;
		int max = 0;
		int prevNum; 
		int y = 0;
		int x;
		int z = 0;
		System.out.println("> ");
		Scanner sc = new Scanner(System.in);
		int Str1 =  sc.nextInt();
		while (Str1 > 1) {
			prevNum = n; 
			z++;
			n = Str1 % 10; 
			x = n - prevNum; 
			y = y + x;
			Str1 = Str1 / 10;
		}
		if (y % (z - 1) == 0) 
		System.out.println("Цифры образуют арифметическую прогрессию");
		else System.out.println("Цифры не образуют арифметическую прогрессию");
		System.in.close();
	}
}