package by.htp.hw3.mail;
// Составить программу нахождения произведения квадратов первых двухсот чисел.
public class Task10 {
	public static void main(String args[]){
		double a = 1;
		int x = 1;
		while (x <= 200) {
		a = a * x * x;
		x++;
		}
		System.out.println(a);
	}
}
