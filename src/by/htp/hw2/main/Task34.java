package by.htp.hw2.main;
/*
Составить программу, реализующую эпизод применения компьютера в книжном магазине. 
Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем; 
если сдачи не требуется, печатает на экране «спасибо»; 
если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает сумму сдачи; 
если денег недостаточно, то печатает сообщение об этом и указывает размер недостающей суммы. 
 */
import java.io.IOException;
import java.util.Scanner;

public class Task34 {
	public static void main(String args[]) throws IOException{
		
		System.out.println("Введите внесенную сумму:");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("> ");
		
		int x = sc.nextInt();
		
		Scanner scaner = new Scanner(System.in);
		
		System.out.println("Введите стоимость: ");
		
		System.out.println("> ");
		
		int y = scaner.nextInt();
		
		if (y - x == 0) System.out.println("Спасибо!");
		else if (y - x > 0) System.out.println("Недостаточно средств, требуется еще " + (y - x));
		else if (y - x < 0) System.out.println("Возьмите сдачу: " + -(y - x));
		System.in.close();
	}
}
