package p3052;
//나머지
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		sc.close();
		
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i<num.length; i++) {
			set.add(num[i] % 42); 
		}
		
		 System.out.println(set.size());
	}

}

/* set 없이 풀기
    public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] inputArr = new int[10];
		for(int i = 0; i < 10; i++) {
			inputArr[i] = sc.nextInt();
		}
		
		sc.close();
		
		int[] result = new int[10];
		

		int count = 0;
		
		for(int i = 0; i < 10; i++) {
			boolean isDuplicate = false;
			result[i] = inputArr[i] % 42;
			
			for(int j = 0; j <i; j++) {
				if(result[j] == result[i]) {
					isDuplicate = true;
				}
			}
			if(!isDuplicate) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
*/
