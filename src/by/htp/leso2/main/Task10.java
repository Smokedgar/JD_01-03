package by.htp.leso2.main;
//  Вычислить значение выражения по формуле (все переменные принимают действительные значения): ( 𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦) / ( 𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦) ∗ 𝑡𝑔 𝑥𝑦 
public class Task10 {
	public static void main(String[] args) {
	   int x = 45;
	   int y = 30;
	   double z;
	    z = (double) ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
	    System.out.println(z);
	}
}
