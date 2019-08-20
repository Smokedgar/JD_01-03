package by.htp.hw3.mail;
//В трехзначном числе зачеркнули старшую цифру. Когда полученное число умножили на 7, то получили исходное число. Найти это число.
public class Task39 {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		for (int i = 100; i <= 999; i++) {
			a = i % 100;
			if (a * 7 == i) System.out.println(i);
		}
	}
}
