package p1929;
//소수 구하기
import java.util.Scanner;

public class Main {
	
	private static boolean isPrime(int num) {
		if(num < 2) {
			return false;
		}
		if (num == 2) {
			return true; 
		}
		if (num % 2 == 0) {
			return false; 
		}
		
		
		for(int i = 3; i < num; i+=2) {
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		for(int i = num1; i <= num2; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		
	}

}

//시간 초과
