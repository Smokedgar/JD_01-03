package by.htp.hw3.mail;
// Найдите количество четных цифр данного натурального числа. 

import java.io.IOException;
import java.util.Scanner;

public class Task35 {
	public static void main(String args[]) throws IOException{
		int n = 0;
		int m = 0;
		System.out.println("> ");
		Scanner sc = new Scanner(System.in);
		int Str1 =  sc.nextInt();
		while (Str1 > 1) {
			n = Str1 % 10;
			if (n % 2 == 0) m++;
			Str1 = Str1 / 10;
		}
		System.out.println(m);
		System.in.close();
	}
}
