package by.htp.hw2.main;
// Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если это не так. 
public class Task30 {
	public static void main(String args[]){
		double a = 1;
		double b = -1;
		double c = -2;
		if (a > b && b > c) {
			a = a * 2;
			b = b * 2;
			c = c * 2;
		}
		else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
