package by.htp.leso2.main;
/* Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае: 
 
• Целое число N является четным двузначным числом. 
• Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр. 
• Сумма цифр данного трехзначного числа N является четным числом. 
• Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= т, х= п (т<п). 
• Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа. 
• Треугольник со сторонами а,b,с является равнобедренным. 
• Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре. 
• Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4). 
• График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, п). 
*/
import java.io.IOException;
import java.util.Scanner;
public class Task37 {
	public static void main(String[] args) throws IOException {
		double N = 20;
		double a = 2;
		double b = 2;
		double c = 1;
		boolean t = true;
		boolean f = false;
		double x = 3;
		int m = 1;
		int n = 2;
		int p = 0;
		int s, k, a0, b0, c0, d0, a1, b1, c1;
		s = (int) N / 100;

		if (s == 0 && N % 2 == 0) System.out.println(t);
		else System.out.println(f);
		
		System.out.println("Введите четыреззначное число");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("> ");
		
		int M = sc.nextInt();
		a0 = (int) M % 10;
		b0 = (int) M % 100 / 10;
		c0 = (int) M % 1000 / 100;
		d0 = (int) M % 10000 / 1000;
		if ((a0 + b0) == (c0 + d0)) System.out.println(t);
		else System.out.println(f);
		a0 = (int) N % 10;
		b0 = (int) N % 100 / 10;
		c0 = (int) N % 1000 / 100;
		if ((a0 + b0 + c0) % 2 == 0) System.out.println(t);
		else System.out.println(f);
		if ((x >= m) && (x <= n)) System.out.println(t);
		else System.out.println(f);
		System.out.println("Введите трехзначное число");

		Scanner scan = new Scanner(System.in);
		
		System.out.println("> ");
		
		int L = scan.nextInt();
		a1 = (int) L % 10;
		b1 = (int) L % 100 / 10;
		c1 = (int) L % 1000 / 100;
		if (L * L == Math.pow(a1 + b1 + c1, 3)) System.out.println(t);
		else System.out.println(f);
		if (a == b || b == c || c == a) System.out.println(t);
		else System.out.println(f);
		if (c0 + b0 == a0 || a0 + b0 == c0 || a0 + c0 == b0) System.out.println(t);
		else System.out.println(f);
		for (int i = 0; i <= 4; i++)
			if (N == Math.pow(a, i)) {
			p++;	
			}	
		if (p > 0) System.out.println(t);
		else System.out.println(f);
		if (n == a * m * m + b * m +c) System.out.println(t);
		else System.out.println(f);
		System.in.close();
	}
}
