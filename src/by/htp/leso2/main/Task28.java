package by.htp.leso2.main;
//Составить программу перевода радианной меры угла в градусы, минуты и секунды. 
public class Task28 {
	public static void main(String[] args) {
		double a = 1.0472;
		double c;
		double d;
		double e;
		c = a * 180 / Math.PI;
		d = c;
		c = (int) c;
		System.out.print(c + " градусов");
		d = d - c;
		d = d * 60;
		e = d;
		d = (int) d;
		System.out.print(d + " минут ");
		e = e - d;
		e = e * 60;
		e = (int) e;
		System.out.print(e + " секунд ");
		
		
	}
}
