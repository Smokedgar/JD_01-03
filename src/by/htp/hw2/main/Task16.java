package by.htp.hw2.main;
// На плоскости ХОY задана своими координатами точка А. Указать, где она расположена (на какой оси или в каком координатном угле)
public class Task16 {
		public static void main(String args[]){
			double x = 6;
			double y = -2;
			if (x == 0 && y == 0) System.out.println("Начало координат");
			if (y == 0) System.out.println("На оси OX");
			if (x == 0) System.out.println("На оси OY");
			if (x > 0 && y > 0) System.out.println("в первой четверти");
			if (x < 0 && y > 0) System.out.println("во второй четверти");
			if (x < 0 && y < 0) System.out.println("в третьей четверти");
			if (x > 0 && y < 0) System.out.println("в четвертой четверти");
		}
}
