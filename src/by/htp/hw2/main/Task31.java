package by.htp.hw2.main;
// Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.
public class Task31 {
	public static void main(String args[]){
		double a = 4;
		double b = 4;
		double x = 1;
		double y = 1;
		double z = 1;
		 if (((a < x) && (b < y)) || ((a < x) && (b < z)) || ((a < z) && (b < y)))
			 System.out.println("пройдет");
		 else System.out.println("не пройдет");
	}
}
