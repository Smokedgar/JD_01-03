package by.htp.hw3.mail;
/*Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. 
 * Человек пытается их угадать. 
 * Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала программа, а также ошибочные числа пользователя. 
 */
import java.io.IOException;
import java.util.Scanner;
public class Task31 {
	public static void main(String args[]) throws IOException{
	      int a = 1; 
	      int b = 15; 
	      int n = 0;
	      
	      int rand1 = a + (int) (Math.random() * b); 
	     
	      
	      int rand2 = a + (int) (Math.random() * b); 
	     
	     
	      int rand3 = a + (int) (Math.random() * b); // 
	     
	      
	      int rand4 = a + (int) (Math.random() * b); 
	     
	     
	      int rand5 = a + (int) (Math.random() * b); // 
	     
	      for (int i = 1; i <=5; i++) {
	    	System.out.println("Угадайте число: ");
	  		Scanner sc = new Scanner(System.in);
	  		int manNum =  sc.nextInt();  
	  		if (manNum == rand1 || manNum == rand2 ||manNum == rand3 ||manNum == rand4 ||manNum == rand5) {
	  			System.out.println("Вы угадали число " + manNum);
	  			n++;
	  		}
	  		else System.out.println("К сожалению, число " + manNum + " отсутствует среди загаданных.");
	      }
	      System.out.println("Ваш результат - " + n + " угаданных чисел. Поздравляем!");
	      System.out.println("1-загаданное число: " + rand1);
	      System.out.println("2-загаданное число: " + rand2);
	      System.out.println("3-загаданное число: " + rand3);
	      System.out.println("4-загаданное число: " + rand4);
	      System.out.println("5-загаданное число: " + rand5);
	      System.in.close();
	   }
}
