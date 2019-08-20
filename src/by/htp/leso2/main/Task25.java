package by.htp.leso2.main;
//Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с (предполагается, что а≠0 и что дискриминант уравнения неотрицателен). //
public class Task25 {
	public static void main(String[] args) {
		double a = 1;
		double b = 4;
		double c = -5;
		double x1;
		double x2;
		x1 = (b - Math.sqrt(b * b - 4 * a * c))/ (2 * a);
		x2 = (b + Math.sqrt(b * b - 4 * a * c))/ (2 * a);
		
		System.out.println(x1);
		System.out.println(x2);
	}
}
