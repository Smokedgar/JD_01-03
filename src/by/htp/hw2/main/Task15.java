package by.htp.hw2.main;
//Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух чисел заменить половиной их суммы, а большее — их удвоенным произведением.
public class Task15 {
	public static void main(String args[]){
		double x = 6;
		double y = 2;
		double z;
		z = (x + y) / 2;
		if (x < y) {
			y = x * y * 2;
			x = z;
			}
		else {
			x = x * y * 2;
			y = z;
		}
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
