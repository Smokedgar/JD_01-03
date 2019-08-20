package by.htp.hw2.main;
import java.io.IOException;
import java.util.Scanner;
public class Task21 {
	/* 
	 * Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М». 
	 * В зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся мальчики!»
	 */
	public static void main(String args[]) throws IOException{
		System.out.println("Кто ты: мальчик или девочка? Введи Д или М");
		Scanner sc = new Scanner(System.in);
		String x;
		String St1 = "Д";
		String St2 = "М";
		System.out.println("> ");
		x = sc.nextLine();
		
		if (x.equals(St1)) System.out.println("Мне нравятся девочки!");
		if (x.equals(St2)) System.out.println("Мне нравятся мальчики!");
		System.in.close(); 
	}
}
