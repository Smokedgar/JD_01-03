package by.htp.hw2.main;
//Даны целые числа т, п. Если числа не равны, то заменить каждое из них одним и тем же числом, равным большему из исходных, а если равны, то заменить числа нулями. 
public class Task17 {
	public static void main(String args[]){
		double m = 6;
		double n = 6;
	if (m != n) {
		if (m > n) n = m;
		else m = n;
	}
	else {
		n = 0;
		m = 0;
	}
	System.out.println(m);
	System.out.println(n);
	}
}
