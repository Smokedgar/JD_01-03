package by.htp.hw3.mail;
//Найдите наибольшую цифру данного натурального числа. 

import java.io.IOException;
import java.util.Scanner;

public class Task33 {
	public static void main(String args[]) throws IOException{
		int n = 0;
		int max = 0;
		System.out.println("> ");
		Scanner sc = new Scanner(System.in);
		int Str1 =  sc.nextInt();
		while (Str1 > 1) {
			n = Str1 % 10;
			if (n > max) max = n;
			Str1 = Str1 / 10;
		}
		System.out.println(max);
		System.in.close();
	}
}
