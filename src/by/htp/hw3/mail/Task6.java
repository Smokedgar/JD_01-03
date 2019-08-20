package by.htp.hw3.mail;
// Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа. 
import java.io.IOException;
import java.util.Scanner;
public class Task6 {
	public static void main(String args[]) throws IOException{
		
		int b = 0;
		
		System.out.println("������� �����");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("> ");
		
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
		b = i + b;
		}
		System.out.println(b);	
		System.in.close();
	}
}
