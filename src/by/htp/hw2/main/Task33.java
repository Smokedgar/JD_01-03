package by.htp.hw2.main;
/*Написать программу, которая по паролю будет определять уровень доступа сотрудника к секретной информации в базе данных. 
 * Доступ к базе имеют только шесть человек, разбитых на три группы по степени доступа. 
 * Они имеют следующие пароли: 
 * 9583, 1747 — доступны модули баз А, В, С; 
 * 3331, 7922 — доступны модули баз В, С; 
 * 9455, 8997 — доступен модуль базы С.
 */
 
import java.io.IOException;
import java.util.Scanner;
public class Task33 {
	public static void main(String args[]) throws IOException{
		System.out.println("Введите пароль ");
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("> ");
		x = sc.nextInt();
		if (x == 9583 || x == 1747) System.out.println("Высший уровень доступа, доступны модули A, B, C"); 
		else if (x == 3331 || x == 7922) System.out.println("Средний уровень доступа, доступны модули B, C");
		else if (x == 9455 || x == 8997) System.out.println("Низший уровень доступа, доступен модуль С");
		else System.out.println("Неверный пароль, в доступе отказано");
		System.in.close(); 
	}
}
