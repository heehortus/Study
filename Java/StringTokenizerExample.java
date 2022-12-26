import java.util.Arrays;	//배열을 다루기 위한 메소드 (toString을 사용할 것임.)
import java.util.StringTokenizer;	//token추출 클래스

class StringTokenizerExample
{
	public static void main(String[] args)	//command arguments에 입력
	{	

		//args[0] = 사과, args[1] = 배 > 배열
		//배열을 문자열 객체로 받는다. toString() 사용

		StringTokenizer stok = new StringTokenizer(Arrays.toString(args), "[ , ]");	//[ , ]은 토큰 추출한다.

		while (stok.hasMoreTokens())	//토큰이 있는 경우
		{
			String str = stok.nextToken();	//토큰 리턴
			System.out.println(str);	//출력
		}
	}
}