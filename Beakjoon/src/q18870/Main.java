package q18870;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            // 첫 번째 입력: 정수 개수 N
            int N = Integer.parseInt(bf.readLine().trim()); // N 읽기

            // 두 번째 입력: 공백으로 구분된 N개의 숫자
            StringTokenizer st = new StringTokenizer(bf.readLine()); // 한 줄에서 공백 단위로 숫자 읽기
            Integer[] array = new Integer[N];
            for (int i = 0; i < N; i++) {
                array[i] = Integer.parseInt(st.nextToken()); // 공백 단위로 숫자 변환
            }

            // 1️⃣ 중복 제거 후 정렬
            Set<Integer> set = new HashSet<>(Arrays.asList(array));
            List<Integer> sortedList = new ArrayList<>(set);
            Collections.sort(sortedList);

            // 2️⃣ HashMap을 사용하여 빠른 인덱스 검색
            Map<Integer, Integer> indexMap = new HashMap<>();
            for (int i = 0; i < sortedList.size(); i++) {
                indexMap.put(sortedList.get(i), i);
            }

            // 3️⃣ 결과 출력
            for (int num : array) {
                bw.write(indexMap.get(num) + " ");
            }

            bw.flush(); // 출력 보장
            bw.close(); // 자원 해제
            bf.close(); // 입력 스트림 닫기

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
//시간 초과 : BufferdReader, BufferedWriter 써서 해결
//두 번째 시간 초과 : hashMap 사용