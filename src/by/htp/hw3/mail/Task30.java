package by.htp.hw3.mail;
//Написать программу, переводящую римские цифры в арабские. 
import java.io.IOException;
import java.util.Scanner;
public class Task30 {
	public static void main(String args[]) throws IOException{
		int n = 0;
		int i;
		int prevnum = 10000000;
		System.out.println("> ");
		Scanner sc = new Scanner(System.in);
		String Str1 =  sc.nextLine();
		for (i = 0; i < Str1.length(); i++) {
			switch(Str1.charAt(i)) {
				case 'I' :
					n = n + 1;
					prevnum = 1;
					break;
				case 'V' :
					if (prevnum < 5) {
							n = n + 3;
					}
					else n = n + 5;
					prevnum = 5;
					break;
				case 'X' :
					if (prevnum < 10) {
						n = n + 8;
					}
					else n = n + 10;
					prevnum = 10;
					break;
				case 'L' :
					if (prevnum < 50) {
						n = n + 30;
					}
					else n = n + 50;
					prevnum = 50;
					break;
				case 'C' :
					if (prevnum < 100) {
						n = n + 80;
					}
					else n = n + 100;
					break;
				case 'D' :
					if (prevnum < 500) {
						n = n + 300;
					}
					else n = n + 500;
					break;
				case 'M' :
					if (prevnum < 1000) {
						n = n + 800;
					}
					else n = n + 1000;
					break;
					}
					
			}
		System.out.println(n);
		System.in.close();
	}
	
}
