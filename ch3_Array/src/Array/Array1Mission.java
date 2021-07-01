package Array;

import java.util.Scanner;

public class Array1Mission {

	public static void main(String[] args) {
		// 미션
		/*
		 * 1. Scanner로 10개 정수 값을 입력 받는다. 
		 * 2. 입력 받은 값을 배열에 넣는다. 
		 * 3. 배열 속의 값을 오름차순으로 정렬 해서 다시 넣는다. 
		 * 4. 전체를 두가지 방식으로 출력해 본다.
		 */

		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] str2 = str.split(" ");
		int[] a = new int[str.length()];
		
		for(int i = 0; i < str2.length; i++) {
			a[i] = Integer.parseInt(str);
			System.out.println(a[i] + " ");
		}
		
		
	}

}
