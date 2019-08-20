package by.htp.hw3.mail;
//Два двузначных числа, записанных одно за другим , образуют четырёхзначное число, которое делится на их произведение. Найти эти числа. 
public class Task36 {
	public static void main(String args[]) {
		int n = 0;
		int m = 0;
		double sum;
		for (int i = 10; i <= 99; i++) {
			for (int j = 10; j <= 99; j++) {
				sum = i * 100 + j;
				if (sum % (i * j) == 0) System.out.println(i + " " + j);
			}
		}
	}
}
