package by.htp.hw2.main;
//Написать программу, которая по заданным трем числам определяет, является ли сумма каких-либо двух из них положительной. 
public class Task32 {
	public static void main(String args[]){
		double a = 4;
		double b =-4;
		double c = 2;
		if (a + b > 0) System.out.println("a + b > 0");
		if (b + c > 0) System.out.println("b + c > 0");
		if (c + a > 0) System.out.println("a + c > 0");
	}
}
