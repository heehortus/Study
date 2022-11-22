import java.util.Scanner;	//  이 프로그램에서는 Scanner 객체를 사용
			// Java API에서 Scanner 찾기
	
class CountLetter //문자 출현 횟수 계산 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in); 					//입력을 받기 위한 scanner클래스의 객체 
			
		// 대문자/소문자 알파벳을 저장할 수 있는 배열 count를 선언하고 생성하라.
		int SmallCount[] = new int[26];        						//소문자 저장 배열. 각 0으로 초기화
		int BigCount[] = new int[26];							//대문자 저장 배열. 각 0으로 초기화

		System.out.println("문자열을 입력하시오 : ");
		String buffer = scan.nextLine();

		// 각 문자가 등장하는 횟수를 계산한다.
		for (int i=0; i< buffer.length(); i++)
		{
			char ch = buffer.charAt(i); 						//문자열의 한 글자 씩 ch에 저장
			
			if( 'A' <= ch && ch <= 'Z' ) 						//ASCII코드에서 대문자 범위는 65~90까지이다.
			{ 
				BigCount[ch - 'A']++;					//예: ch이 C이다. (ASCII코드:67) 67-'A'=2 > BigCount[2]의 값이 1 늘어난다. 
			}

			else //범위 65~90 안에 알파벳이 없을 때 시행(소문자거나 대문자일 때)
			{ 
				if ( 'a' <= ch && ch <= 'z') 				//ASCII코드에서 소문자 범위는 97~122까지이다
				{
					SmallCount[ch - 'a']++;
				}
				else if ( ch == ' ' ) 					//만약 스페이스이면 count를 더하지 않고 반복을 계속한다. ASCII코드에서 space는 32이다.
				{
					continue; 
				 }
			}
		}
		
		//배열에 저장된 횟수를 출력하는 반복루프
		for (int j=0; j<26; j++) 
		{	
			if(BigCount[j] != 0 || SmallCount[j] != 0) 				//0개가 아닌 알파벳일 때만 출력한다는 의미(문자열에 포함되는 알파벳만 출력한다.)				
			{
				System.out.println((char) (j+'a')+ " : " + (SmallCount[j]) + " " + (char) (j+'A') + " : " + (BigCount[j]));
			}								//예시 a : 0 A : 1
		} 

		
	}
}