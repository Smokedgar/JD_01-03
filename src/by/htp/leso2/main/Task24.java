package by.htp.leso2.main;
//Найти площадь равнобедренной трапеции с основаниями а и  b  и углом α при большем основании а. //
public class Task24 {
	public static void main(String[] args) {
		double a = 6;
		double b = 2;
		double c;
		double s;
		double α = 1.0472;
		c = ((a - b) / 2) / Math.cos(α);
		s = c * Math.sin(α) * (a - c * Math.cos(α));
		System.out.println(s);
		
	}
}
