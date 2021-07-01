package Array;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		System.out.println("배열 크기를 입력해 주세요>> ");
		Scanner in = new Scanner(System.in);
		
		int size = in.nextInt();
		
		// 배열을 생성
		int[] num = new int[size];
		
		int i = 0;
		while(i < size) {
			num[i] = in.nextInt();
			
			if(num[i] == 0) {
				break;
			}
			i++;
			if(i == (size-1)) {
				System.out.println("마지막 하나가 남았습니다. ");
			}
		}
		in.close();
		System.out.println("배열이 생성되었습니다. ");
		
		// 최댓값과 최솟값 찾기
		int min = 1000, max = 0, sum = 0;
		
		for(i = 0; i < num.length; i++) {
			// 합
			sum += num[i];
			// 최댓값
			if(num[i] > max) {
				max = num[i];
			} 
			// 최솟값
			if(num[i] < min) {
				min = num[i];
			}
		}
		System.out.println("합계: " + sum);
		System.out.println("평균: " + sum/num.length);
		System.out.println("최댓값: " + max);
		System.out.println("최솟값: " + min);

		
	}

}
