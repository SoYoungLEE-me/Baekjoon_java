package q18870;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

//좌표 압축
//1. 배열에서 본인보다 직은 요소의 개수를 출력
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		Integer[] array = new Integer[N];
		
		for (int i = 0; i < N; i++) {
			array[i] = sc.nextInt();
		}
		
		sc.close();
		
		Set<Integer> set = new HashSet<>(Arrays.asList(array));
		List<Integer> sortedList = new ArrayList<>(set);
		Collections.sort(sortedList); //중복 제거 + 정렬된 요소들
		
		for (int num : array) {
			int index = sortedList.indexOf(num);
			System.out.print(index + " ");
		}
	}
}

//시간 초과
