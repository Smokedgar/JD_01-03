package by.htp.leso2.main;
//Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у. 
public class Task26 {
	public static void main(String[] args) {
		double a = 1;
		double b = 4;
		double c = 0.523599;
		double s;
		s = a * b * Math.sin(c)	/ 2;
		System.out.println(s);
	}
}
