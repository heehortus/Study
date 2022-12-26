import java.util.Scanner; 												//가위바위보를 입력받을 스캐너 호출

public class GamePlay												//클래스 선언
{
	public static void main(String[] args)
	{
		String myChoice;
		String myChoice2;											//가위/바위/보 중 하나의 문자열이 입력될 String
		
		Scanner scan = new Scanner(System.in);								//문자열을 입력받기 위한 스캐너 호출
		
		System.out.println("철수 VS 영희 가위 바위 보 게임! 가위, 바위, 보 중에서 하나만 입력하세요!");
		
		System.out.print("철수 : ");										//철수의 결과 입력
		myChoice = scan.nextLine();

		System.out.print("영희 : ");										//영희의 결과 입력
		myChoice2 = scan.nextLine();

		if(myChoice.equals("가위")) 										//철수가 가위 일때
		{

			if(myChoice2.equals("가위"))									//영희 : 가위 (철수 draw)
				System.out.println("비겼습니다.");

			else if(myChoice2.equals("바위"))								//영희 : 바위 (철수 lose)
				System.out.println("영희가 이겼습니다.");

			else if(myChoice2.equals("보"))								//영희 : 보 (철수 win)
				System.out.println("철수가 이겼습니다.");

		}

		if(myChoice.equals("바위")) 										//철수가 가위 일때
		
		{
			if(myChoice2.equals("가위"))									//영희 : 가위 (철수 win)
				System.out.println("철수가 이겼습니다.");

			else if(myChoice2.equals("바위"))								//영희 : 바위 (철수 draw)
				System.out.println("비겼습니다.");

			else if(myChoice2.equals("보"))								//영희 : 보 (철수 lose)
				System.out.println("영희가 이겼습니다.");
	
		}

		if(myChoice.equals("보")) 										//철수가 가위 일때
		
		{
			if(myChoice2.equals("가위"))									//영희 : 가위 (철수 lose)
				System.out.println("영희가 이겼습니다.");

			else if(myChoice2.equals("바위"))								//영희 : 바위 (철수 win)
				System.out.println("철수가 이겼습니다.");

			else if(myChoice2.equals("보"))								//영희 : 보 (철수 draw)
				System.out.println("비겼습니다.");
	
		}

	}
}