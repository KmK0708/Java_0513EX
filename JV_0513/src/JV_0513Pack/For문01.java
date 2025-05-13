package JV_0513Pack;


// 예제3-1 for문을 이용하여 1부터 10까지 덧셈을 표시하고 합을 구하시오.
public class For문01 
{
	public static void main(String[] args)
	{
		int sum = 0;
		
		for(int i=1;i<=10;i++) // 1~10까지 반복
		{
			sum += i;
			System.out.print(i); // 더하는 수 출력
			
			if (i<=9) // 1~9까지는 + 출력
				System.out.print("+");
			else // i가 10이면
			{
				System.out.print("="); // = 출력하고
				System.out.print(sum); // 덧셈 결과 출력
			}
		}
	}
}
