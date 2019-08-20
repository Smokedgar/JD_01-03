package by.htp.leso2.main;
//Заданы координаты трех вершин треугольника  (х1 у2),(х2, у2) ),(х3, у3). Найти его периметр и площадь.
public class Task13 {
	public static void main(String[] args) {
		double x1 = 1;
		double y1 = 1;
		double x2 = 1;
		double y2 = 9;
		double x3 = 7;
		double y3 = 1;
		double a;
		double b;
		double c;
		double P;
		double s;
		double p;
		
		a = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		b = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
		c = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
		P = a + b + c;
		p = P / 2;
		s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println(P);
		System.out.println(s);
	}
}
