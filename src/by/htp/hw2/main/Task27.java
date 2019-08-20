package by.htp.hw2.main;
//Найти max{min(a, b), min(c, d)}. 
public class Task27 {
	public static void main(String args[]){
		double a = 6;
		double b = 2;
		double c = 1;
		double d = 9;
		double x;
		x = Math.max(Math.min(a, b), Math.min(c, d));
		System.out.println(x);
		
	}
}
