package by.htp.leso2.main;
//Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае: 
public class Task38 {
	public static void main(String[] args) {
		double x = -4;
		double y = -1;
		boolean z = true;
		boolean q = false;
		if (-x + 4 == y) System.out.println(z);
		else System.out.println(q);
		
		if (Math.abs(x) <= 4 && y <= 4 && y >= -3) System.out.println(z);
		else System.out.println(q);
		
		if (x < 0) System.out.println(q);
		else {
		if (y > 0) {
			if (x * x + y * y <= 16)
				System.out.println(z);
			else
				System.out.println(q);
			} 
		else 
		{	
			if (x * x + y * y <= 25) 
				System.out.println(z);
			else 
				System.out.println(q);
			}
		}
	}
}
		


