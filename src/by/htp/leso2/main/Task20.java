package by.htp.leso2.main;
//Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.
public class Task20 {
	public static void main(String[] args) {
		double c = 3;
		double s;
		s = Math.pow(c / (Math.PI * 2), 2) * Math.PI;
		System.out.println(s);
		
	}
}
