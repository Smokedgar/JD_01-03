package by.htp.leso2.main;
//Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы. 
public class Task33 {
	public static void main(String[] args) {
		char ch = 's';
		 int chNext, chPrev;
		 chNext = ch + 1;
		 chPrev = ch - 1; 
		 System.out.println((int) ch + " порядковый номер");
		 System.out.println((char) chNext + " последующий символ");
		 System.out.println((char) chPrev + " предыдущий символ");
		
	}
}
