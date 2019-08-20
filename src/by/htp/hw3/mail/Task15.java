package by.htp.hw3.mail;
//Вычислить : 1+2+4+8+...+ 2 в 10 степени.
public class Task15 {
	public static void main(String args[]){
		double n = 1;
		for (int i = 1; i <= 10; i++) {
			n = n + Math.pow(2, i);
		}
		System.out.println(n);
	}
}
