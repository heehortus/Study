import java.util.ArrayList;
import java.util.Scanner;								//입력받기 위한 scanner 호출

public class TestEmployee
{
	public static void main(String args[])
	{
		String answer;
		Scanner scan = new Scanner(System.in);				//입력 메소드
		
		Employee[] a;							//배열 참조 변수를 선언한다.	

		a = new Employee[2];						//배열을 생성한다.
		
		for (int i = 0; i < a.length; i++)					//사용자로부터 데이터를 받아서 배열에 추가한다
		{
			a[i] = new Employee();
		}


		for(int i = 0; i < a.length; i++)					//각 데이터 필드는 private 접근이므로 public 접근 불가. set함수를 통한 접근이 필요하다
		{
			System.out.printf("이름을 입력하세요[직원번호%d]: ", i+1);
			a[i].setName(scan.next());
			System.out.printf("주소를 입력하세요[직원번호%d]: ", i+1);
			a[i].setAddress(scan.next());
			System.out.printf("연봉을 입력하세요[직원번호%d]: ", i+1);
			a[i].setAnnualSalary(scan.nextInt());
			System.out.printf("전화번호를 입력하세요[직원번호%d]: ", i+1);
			a[i].setPhone(scan.next());
		}			

		System.out.print("수정하시겠습니까? (YES / NO) : ");
		answer = scan.next();
			
		if(answer.equals("YES"))
		{
			System.out.println("수정할 직원 번호를 입력하시오.");
			int num = scan.nextInt();
			System.out.printf("이름을 입력하세요. ");
			a[num-1].setName(scan.next());
			System.out.printf("주소를 입력하세요. : ");
			a[num-1].setAddress(scan.next());
			System.out.printf("연봉을 입력하세요. : ");
			a[num-1].setAnnualSalary(scan.nextInt());
			System.out.printf("전화번호를 입력하세요. : ");
			a[num-1].setPhone(scan.next());		
		} 

		else if(answer.equals("NO"))
		{
			for(int i = 0; i < a.length; i++)							//배열에 저장된 모든 데이터를 출력한다.
			{
				System.out.println("직원번호[" + (i+1) + "]" +a[i]);
			}
		}
	}
}