package by.htp.leso2.main;
// Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
public class Task14 {
	public static void main(String[] args) {
		double R = 4;
		double s;
		double c;
		
		c = R * 2 * Math.PI;
		s = Math.PI * R * R;
		System.out.println(c);
		System.out.println(s);
	}
}
