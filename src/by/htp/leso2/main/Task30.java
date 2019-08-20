package by.htp.leso2.main;
//Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения. 
public class Task30 {
	public static void main(String[] args) {
		double R1 = 3;
		double R2 = 3;
		double R3 = 3;
		double R;
		R = 1 / (1 / R1 + 1 / R2 + 1 / R3); 
		System.out.println(R);
	}
}
