package by.htp.leso2.main;
/*
 * Составить программу для вычисления пути, пройденного лодкой, если ее скорость в стоячей воде v км/ч, 
 * скорость течения реки v1 км/ч, время движения по озеру t1 ч, а против течения реки — t2 ч. 
 */
public class Task31 {
	public static void main(String[] args) {
		double v = 3;
		double t1 = 3;
		double v1 = 3;
		double t2 = 4;
		double s;
		s = v * t1 + (v - v1) * t2;	
		System.out.println(s);
	}
}
