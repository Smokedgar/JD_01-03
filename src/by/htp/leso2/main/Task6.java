package by.htp.leso2.main;
// Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров молока в m больших бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом? 
public class Task6 {
	public static void main(String[] args) {
		int n = 4;
		int m = 2;
		int z;
		int x;
		x = 80 / n;
		z = (x + 12) * m;
		System.out.println(z);
		
	}
}
