package Array;

public class Array1 {
	
	public static void main(String[] args) {
		
		// 배열은 여러 개의 변수를 연속 공간에 모아놓은 것이다. 
		// 배열 생성
		// name ---> [a][b][c][d][e]
		//			  0  1  2  3  4
		// 배열값넣기	name[0] = 100;
		//			name[1] = 50;
		//			name[2] = 80;
		//			name[3] = 90;
		//			name[4] = 150;
		
		// 배열 생성 방법들
		// 데이터타입[] 배열명 = new 데이터 타입[방의 갯수];
		// 데이터타입[] 배열명 = new 데이터 타입[]{값1, 값2, ,,,, };
		// 데이터타입[] 배열명 = {값1, 값2, ,,,, };
		
		//여러 종류 배열 생성
		int[] num = new int[3];	// 정수를 저장할수 있는 배열 방 3개짜리 num
								// num ---> [][][]
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
//		num[3] = 40;
		
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}

		System.out.println();
		System.out.println("*******************");
		
		// 입력
		for(int i = 0; i < num.length; i++) {
			num[i] = 10*i;
		}
		
		// 출력1 - 전체
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		
		System.out.println();

		// 출력2 - 전체
		// 확장 for문
		for(int k: num) {
			System.out.print(k + " ");
		}
		
		
		// ************** 두번째 학습 ****************
		String[] str;
			str = new String[] {"한라산", "백두산", "금강산"};
			
		// 전체 출력 - 방법 1(실습)
			
		// 전체 출력 - 방법 2(실습)

			
			
		// ************** 세번째 학습 ****************
		// 별도로 나누어 초기화 할 수 없다. 
		double[] avg = {89.4, 93.5, 70.5};
		
		
		// 미션
		/*
		 * 1. Scanner로 10개 정수 값을 입력 받는다.
		 * 2. 입력 받은 값을 배열에 넣는다. 
		 * 3. 배열 속의 값을 오름차순으로 정렬 해서 다시 넣는다. 
		 * 4. 전체를 두가지 방식으로 출력해 본다. 
		 */
		
		
		
		
		
	}

}
