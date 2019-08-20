package by.htp.leso2.main;
//Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения информации.
public class Task34 {
	public static void main(String[] args) {
		double x= 1024;
		double kb;
		double mb;
		double gb;
		double tb;
		kb = x / 1024;
		mb = kb / 1024;
		gb = mb / 1024;
		tb = gb / 1024;
		System.out.println(kb + " килобайт");
		System.out.println(mb + " мегабайт");
		System.out.println(gb + " гигабайт");
		System.out.println(tb + " террабайт");
		
		
	}
}
