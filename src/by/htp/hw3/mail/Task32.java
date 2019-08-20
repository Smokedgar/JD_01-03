package by.htp.hw3.mail;
/*
 *Проверить введенную пользователем строку на наличие недопустимых символов. 
 *В качестве первого символа допустимы только буквы и знак подчеркивания. 
 *Остальные символы могут быть буквами, цифрами и знаком подчеркивания. 
 */
import java.io.IOException;
import java.util.Scanner;
public class Task32 {
	public static void main(String args[]) throws IOException{
			int n = 0;
			int i;
			System.out.println("> ");
			Scanner sc = new Scanner(System.in);
			String Str1 =  sc.nextLine();
			for (i = 0; i < Str1.length(); i++) {
				if (Str1.charAt(0) >= 'A' && Str1.charAt(0) <= 'Z' || Str1.charAt(0) >= 'a' && Str1.charAt(0) <= 'z' || Str1.charAt(0) == '_') {
					if (Str1.charAt(i) >= 'A' && Str1.charAt(i) <= 'Z' || Str1.charAt(i) >= 'a' && Str1.charAt(i) <= 'z' || Str1.charAt(i) >= '0' && Str1.charAt(i) <= '9' || Str1.charAt(i) == '_')
					n++;
					else {
					System.out.println("Введен неверный символ!");
					break;	
					}
				}
				else {
				System.out.println("Введен неверный символ!");
				break;
				}
			}
			System.in.close();
			if (n == Str1.length()) 
				System.out.println("Недопустимых символов нет!");
	}
}
