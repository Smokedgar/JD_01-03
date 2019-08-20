package by.htp.hw2.main;
//Написать программу нахождения суммы большего и меньшего из трех чисел.
public class Task26 {
	public static void main(String args[]){
		double x = 6;
		double y = 2;
		double z = 1;
		double max;
		double min;
		double sum;
		if (x > y) max = x;
		else max = y;
		if (max < z) max = z;
		if (x < y) min = x;
		else min = y;
		if (z < min) min = z;
		sum = min + max;
		System.out.println(sum);
	}
}
