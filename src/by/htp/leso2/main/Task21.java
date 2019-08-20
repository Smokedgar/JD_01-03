package by.htp.leso2.main;
//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами дробную и целую части числа и вывести полученное значение числа.
public class Task21 {
	public static void main(String[] args) {
		double a = 321.456;
		double b;
		double c;
		
		b = a;
		a = (int) a;
		b = (b - a);
		b = b * 1000;
		b = (int) b;
		a = a / 1000;
		c = a + b;
		
		System.out.println(c);
		
	}
}
