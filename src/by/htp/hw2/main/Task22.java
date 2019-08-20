package by.htp.hw2.main;
// Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее. 
public class Task22 {
	public static void main(String args[]){
		double x = 6;
		double y = 11;
		double z;
		z = x;
		if (x < y) {
			x = y;
			y = z;
		}
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
