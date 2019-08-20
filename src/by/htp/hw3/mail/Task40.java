package by.htp.hw3.mail;
//Получить все числа, не превышающие заданного числа N, которые делятся без остатка на все свои цифры.  
public class Task40 {
	public static void main(String args[]){
		int n;
		int a;
		int N = 1000;
		int i = 1;
		while (i < N) {
		a = i;
			while (i >= 1) {
				n = i % 10;
				if (a % 10 == 0 || a % n == 0) { System.out.println(i);}
					i = i / 10;
			}
		i++;
		}
	}
}
