package by.htp.leso2.main;
// Вычислить периметр и площадь прямоугольного треугольника по длинам а и b  двух катетов.
public class Task11 {
		public static void main(String[] args) {
		   double a = 4;
		   double b = 5;
		   double s;
		   double c;
		   double p;
		   c = Math.sqrt(a * a + b * b);
		   p = c + a + b;
		   s = a * b / 2;
		   System.out.println(p);
		   System.out.println(s);
		   
		}
}
