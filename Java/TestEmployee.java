import java.util.ArrayList;
import java.util.Scanner;								//�Է¹ޱ� ���� scanner ȣ��

public class TestEmployee
{
	public static void main(String args[])
	{
		String answer;
		Scanner scan = new Scanner(System.in);				//�Է� �޼ҵ�
		
		Employee[] a;							//�迭 ���� ������ �����Ѵ�.	

		a = new Employee[2];						//�迭�� �����Ѵ�.
		
		for (int i = 0; i < a.length; i++)					//����ڷκ��� �����͸� �޾Ƽ� �迭�� �߰��Ѵ�
		{
			a[i] = new Employee();
		}


		for(int i = 0; i < a.length; i++)					//�� ������ �ʵ�� private �����̹Ƿ� public ���� �Ұ�. set�Լ��� ���� ������ �ʿ��ϴ�
		{
			System.out.printf("�̸��� �Է��ϼ���[������ȣ%d]: ", i+1);
			a[i].setName(scan.next());
			System.out.printf("�ּҸ� �Է��ϼ���[������ȣ%d]: ", i+1);
			a[i].setAddress(scan.next());
			System.out.printf("������ �Է��ϼ���[������ȣ%d]: ", i+1);
			a[i].setAnnualSalary(scan.nextInt());
			System.out.printf("��ȭ��ȣ�� �Է��ϼ���[������ȣ%d]: ", i+1);
			a[i].setPhone(scan.next());
		}			

		System.out.print("�����Ͻðڽ��ϱ�? (YES / NO) : ");
		answer = scan.next();
			
		if(answer.equals("YES"))
		{
			System.out.println("������ ���� ��ȣ�� �Է��Ͻÿ�.");
			int num = scan.nextInt();
			System.out.printf("�̸��� �Է��ϼ���. ");
			a[num-1].setName(scan.next());
			System.out.printf("�ּҸ� �Է��ϼ���. : ");
			a[num-1].setAddress(scan.next());
			System.out.printf("������ �Է��ϼ���. : ");
			a[num-1].setAnnualSalary(scan.nextInt());
			System.out.printf("��ȭ��ȣ�� �Է��ϼ���. : ");
			a[num-1].setPhone(scan.next());		
		} 

		else if(answer.equals("NO"))
		{
			for(int i = 0; i < a.length; i++)							//�迭�� ����� ��� �����͸� ����Ѵ�.
			{
				System.out.println("������ȣ[" + (i+1) + "]" +a[i]);
			}
		}
	}
}