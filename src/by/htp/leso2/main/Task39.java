package by.htp.leso2.main;
//Дано действительное число х. Не пользуясь никакими другими арифметическими операциями, кроме умножения, сложения и вычитания, вычислите за минимальное число операций:
public class Task39 {
	public static void main(String[] args) {
		double x = 14;
		double y;
		double z;
		boolean t = true;
		boolean r = false;
		y = 2 * x * x * x * x - 3 * x * x * x + 4 * x * x - 5 * x + 6;
		z =  x * (x * ( x * (2 * x - 3) + 4) - 5) + 6; 
		if (y == z) System.out.println(t);
		else System.out.println(r);
		System.out.println(y);
		System.out.println(z);
	}
}
