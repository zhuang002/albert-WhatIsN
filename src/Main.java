import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int hand1, hand2;
		if (n>=5) {
			hand1 = 5;
		} else {
			hand1 = n;
		}
		hand2 = n-hand1;
		int count=0;
		while (hand1>=hand2) {
			count++;
			hand1--;
			hand2++;
			
		}
		
		System.out.println(count);
		
	}

}
