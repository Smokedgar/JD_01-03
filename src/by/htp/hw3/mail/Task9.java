package by.htp.hw3.mail;
// Найти сумму квадратов первых ста чисел.
public class Task9 {
	public static void main(String args[]){
		int a = 0;
		int x = 1;
		while (x <= 100) {
		a = a + x * x;
		x++;
		}
		System.out.println(a);
	}
}
