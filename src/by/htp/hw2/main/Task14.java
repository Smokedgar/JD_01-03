package by.htp.hw2.main;
//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным. 
public class Task14 {
	public static void main(String args[]){
		double A = 90;
		double B = 45;
		if (A + B < 180) {
			System.out.println("Треугольник существует");
			if (A == 90 || B ==90 || A + B == 90) System.out.println("Треугольник прямоугольный");
		}
		else System.out.println("Не существует");
		
	}
}
