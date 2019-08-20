package by.htp.hw3.mail;
// Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)
public class Task17 {
	public static void main(String args[]){
		double a = 1.5;
		int n = 10;
		double x = 1;
		for (int i = 0; i <= n - 1; i++) {
		x = (x * (a + i));
		}
		System.out.println(x);
	}
}
