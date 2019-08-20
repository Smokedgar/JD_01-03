package by.htp.leso2.main;
//Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.
public class Task29 {
	public static void main(String[] args) {
		double a = 3;
		double b = 3;
		double c = 3;
		double dr;
		double er;
		double fr;
		double dg;
		double eg;
		double fg;
		double s;
		double p;
		p = (a + b +c) / 2;
		s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		dr = Math.asin((s * 2) / (a * b)); 
		er = Math.asin((s * 2) / (b * c));
		fr = Math.asin((s * 2) / (c * a));
		
		dg = dr * 180 / Math.PI; 
		eg = er * 180 / Math.PI;
		fg = fr * 180 / Math.PI;
		
		System.out.println(dr);
		System.out.println(dg);
		System.out.println(er);
		System.out.println(eg);
		System.out.println(fr);
		System.out.println(fg);
		
	}
}
