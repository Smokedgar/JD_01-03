package by.htp.hw2.main;
// Подсчитать количество положительных среди чисел а, b, с. 
public class Task19 {
	public static void main(String args[]){
		double a = 6;
		double b = 0;
		double c = -2;
		int n = 0;
		if (a > 0) n++;
		if (b > 0) n++;
		if (c > 0) n++;
		System.out.println(n);
	}

}
