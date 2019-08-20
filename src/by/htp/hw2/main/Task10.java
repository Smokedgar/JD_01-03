package by.htp.hw2.main;
// Составить программу, которая определит площадь какого круга меньше. 
public class Task10 {
	public static void main(String args[]){
		double r = 4;
		double R = 4;
		if (r == R) System.out.println("Площади равны");
		else {
		if (r < R) System.out.println("Площадь круга с радиусом r - меньшая");
		else System.out.println("Площадь круга с радиусом R - меньшая");
		}
	}
}
