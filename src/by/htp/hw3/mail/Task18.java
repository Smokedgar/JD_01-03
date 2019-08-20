package by.htp.hw3.mail;
//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:
public class Task18 {
	public static void main(String args[]){
		double e = 0.2;
		double s = 0;
		int n = 0;;
		double t;
		
		while (Math.abs(t) >= e) {
		t = Math.pow(-1, n - 1) / n;
		if (t )
		s = s + t;
		}
		
		
		
		
		
		
		
		if (e >= 1) s = 1;
		else {
			n = 0;
			t = 1;
			s = t;
			while (Math.abs(t) >= e) {
				n++;
				t = t * 10 / n;
				System.out.println(t);
				s = s + t;
			}
		}
		System.out.println("s = " + s);
	}
}
