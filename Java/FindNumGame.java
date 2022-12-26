//1부터 100사이의 발생된 임의의 숫자를 5번 안에 맞추는 게임

import java.util.Scanner;
import java.util.Random;

public class FindNumGame {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random ranGen = new Random();
		int ranNum, answer, count =1;
		ranNum=ranGen.nextInt(100)+1;
		while(count<6)
		{
			System.out.print("숫자를 입력하세요: ");
			answer = scan.nextInt();
			if (answer > ranNum) {
			     System.out.println("랜덤값보다 큽니다.");
			     count++; }
			else if (answer == ranNum) {
			     System.out.println(count + "번 만에 정답을 맞추었습니다.");
			     break;
		  	     }
			else {
			     System.out.println("랜덤값보다 작습니다."); 
			     count++; }
		}
		if (count==6)
			System.out.println("정답을 5번 시도에 맞추지 못 했습니다.");
	}
}