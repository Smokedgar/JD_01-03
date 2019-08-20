package by.htp.hw3.mail;
//Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
public class Task14 {
	public static void main(String args[]){
		double n = 2;
		int i = 0;
		double x = 0;
		while (i <= n) {
		x = x + 1 / n;
		i++;
		}
		System.out.println(x);
	}
}
