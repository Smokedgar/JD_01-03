package by.htp.hw2.main;
import java.io.IOException;
import java.util.Scanner;
public class Task3 {
//Составить программу сравнения введенного числа а и цифры 3. Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести слово «no». 
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt();
		
		if (a < 3) System.out.println("yes");
		
		else System.out.println("no");
		
		System.in.close(); 
		
			}
}
