package by.htp.hw2.main;
//Составить программу нахождения наименьшего из квадратов двух чисел а и b
public class Task8 {
	public static void main(String args[]){
		double a = 4;
		double b = 4;
		if (a * a == b * b) System.out.println("�����");
		else {
		if (a * a < b * b) System.out.println("������� b - ������");
		else System.out.println("������� � - ������");
		}
		}
}
