package by.htp.leso2.main;
//Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, получить значение а8 за три операции и  а10 за четыре операции. 
public class Task27 {
	public static void main(String[] args) {
		double a = 2;
		double f;
		f = a * a;
		a = a * a;
		a = a * a;
		a = a * a; // a^8 //
		a = f * f * f * f * f; // другого способа не придумал :(
		
		
	}
}
