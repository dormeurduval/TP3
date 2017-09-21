import java.util.Scanner;

public class TestFibonacci {

	public static void main(String[] args) {
		System.out.println("Choisissez un rang N");
		Scanner questionUser= new Scanner(System.in);
		int rang = questionUser.nextInt();
		int first = 0;
		int second = 1;
		int actuallyrang = 2;
		while(actuallyrang!=rang){
			int n = first+second;
			first = second;
			second = n;
			actuallyrang ++;
		}
		System.out.println("Chiffre obtenu ="+(first+second));
	}
}
