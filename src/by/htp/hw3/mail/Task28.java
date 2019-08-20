package by.htp.hw3.mail;
/*
Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). 
Вычислить результат Z в зависимости от знака. 
Предусмотреть реакции на возможный неверный знак операции, а также на ввод Y=0 при делении. 
Организовать возможность многократных вычислений без перезагрузки программа (т.е. построить цикл). 
В качестве символа прекращения вычислений принять ‘0’.
 */
 
import java.io.IOException;
import java.util.Scanner;
public class Task28 {
	public static void main(String[] args) throws IOException {
	char a = 1;	 
       
 
        while (a != 0) {
        	Scanner sc = new Scanner(System.in);
        	
            System.out.print("Введите знак: ");
            
            a = sc.next().charAt(0);
            
            if (a == '0') 
            	break;
            
            System.out.print("Введите x: ");
            
            int x = sc.nextInt();
 
            System.out.print("Введите y: ");
            
            int y = sc.nextInt();
 
            if (a == '+') {
                int result = x + y;
                System.out.println("Итого: " + result);
            	} 
            else if (a == '-') {
                int result = x - y;
                System.out.println("Итого: " + result);
            	}
            else if (a == '*') {
                int result = x * y;
                System.out.println("Итого: " + result);
            	} 
            else if (a == '/' && y == 0) {
                System.out.println("Деление на 0!");
            	}
            else if (a == '/') {
                int result = x / y;
                System.out.println("Итого: " + result);
            	}  
            else if (a != '/' || a != '*' || a != '+' || a != '-') {
                System.out.println("Неверно введен знак!");
            	}
           
            
            }
        System.in.close();
	}
 
       
 
}

