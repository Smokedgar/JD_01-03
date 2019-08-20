package by.htp.hw3.mail;
// Вычислить значения функции на отрезке [а,b] c шагом h: 
public class Task8 {
	public static void main(String args[]){
		int a = 1;
		int b = 10;
		int c = 1;
		int h = 1;
		int x = a;
		while (x < b) {
			if (x == 15) System.out.println("y = " + (x + c) * 2);
			else System.out.println("y = " + (x - c + 6)); 
			x = x + h;
		}
	}
}
