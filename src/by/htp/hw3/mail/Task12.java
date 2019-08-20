package by.htp.hw3.mail;
//Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте программу нахождения произведения первых 10 членов этой последовательности. 
public class Task12 {
	public static void main(String args[]){
		int a = 1;
		int x = 1;
		int n = 1;
		while (n <= 10) {
			n ++;
			a = 6 + a;
			x = x * a;
		}
		System.out.println(x);
	}
}
