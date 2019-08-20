package by.htp.leso2.main;
//Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей. 
//
public class Task19 {
	public static void main(String[] args) {
		double a = 3;
		double s;
		double h;
		double r;
		double R;
		s = Math.sqrt(3) / 4 * a * a;
		h = Math.sqrt(3) / 2 * a;
		r = Math.sqrt(3) / 6 * a;
		R = 2 * r;
		System.out.println(s);
		System.out.println(h);
		System.out.println(r);
		System.out.println(R);
		
	}
}
