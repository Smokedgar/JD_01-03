package by.htp.hw3.mail;
// Вычислить значения функции на отрезке [а,b] c шагом h: 
public class Task7 {
	public static void main(String args[]){
		int a = 1;
		int b = 10;
		int h = 1;
		int x = a;
		while (x < b) {
			if (x > 2) System.out.println("y = " + x);
			else System.out.println("y = " + (-x)); 
			x = x + h;
		}
	}
}
