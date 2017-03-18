import java.util.*;

public class Loops {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = 1;
		
		while (y < 11){
			int answer = x * y;
			System.out.println(x + " * " + y + " = " + answer);
			y++;
		}
		
		

	}

}
