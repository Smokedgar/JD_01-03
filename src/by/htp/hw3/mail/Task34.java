package by.htp.hw3.mail;
//Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15
public class Task34 {
	public static void main(String args[]) {
		int n = 0;
		int i;
		int x = 0;
		int z;
		for (i = 1000; i < 10000; i++) {
			z = i;
			while (z > 1) {
				n = z % 10;
				x = x + n;
				z = z / 10;
			}
			if (x == 15)
				System.out.println(i);
			x = 0;
		}
	}
}
