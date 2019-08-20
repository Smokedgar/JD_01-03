package by.htp.hw3.mail;
//Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10). 
public class Task16 {
	public static void main(String args[]){
		int a = 1 + 2;
		double p = a;
		for (int i = 2; i <= 10; i++) {
			a = a + i;
			p = p * a;
		}
		System.out.println(p);
	}
}
