package JV_0513Pack;

import java.util.Scanner;

// 2-12 다중 if else 로 학점 매기기

public class If_else02 {
	public static void main(String[] args)
	{
		char grade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0-100) : ");
		int score = scanner.nextInt(); // 점수 읽기
		if(score >= 90) // 90이상 A
			grade = 'A';
		else if(score >= 80) // score가 80 이상 90 미만
			grade = 'B';
		else if(score >= 70) // score가 70 이상 80 미만
			grade = 'C';
		else if(score >= 60) // score가 60 이상 70 미만
			grade = 'D';
		else // score가 60 이만
			grade = 'F';
		System.out.println("학점은 "+ grade + "입니다.");
		
		scanner.close();

	}
}
