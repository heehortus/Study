import java.util.Scanner; 												//������������ �Է¹��� ��ĳ�� ȣ��

public class GamePlay												//Ŭ���� ����
{
	public static void main(String[] args)
	{
		String myChoice;
		String myChoice2;											//����/����/�� �� �ϳ��� ���ڿ��� �Էµ� String
		
		Scanner scan = new Scanner(System.in);								//���ڿ��� �Է¹ޱ� ���� ��ĳ�� ȣ��
		
		System.out.println("ö�� VS ���� ���� ���� �� ����! ����, ����, �� �߿��� �ϳ��� �Է��ϼ���!");
		
		System.out.print("ö�� : ");										//ö���� ��� �Է�
		myChoice = scan.nextLine();

		System.out.print("���� : ");										//������ ��� �Է�
		myChoice2 = scan.nextLine();

		if(myChoice.equals("����")) 										//ö���� ���� �϶�
		{

			if(myChoice2.equals("����"))									//���� : ���� (ö�� draw)
				System.out.println("�����ϴ�.");

			else if(myChoice2.equals("����"))								//���� : ���� (ö�� lose)
				System.out.println("���� �̰���ϴ�.");

			else if(myChoice2.equals("��"))								//���� : �� (ö�� win)
				System.out.println("ö���� �̰���ϴ�.");

		}

		if(myChoice.equals("����")) 										//ö���� ���� �϶�
		
		{
			if(myChoice2.equals("����"))									//���� : ���� (ö�� win)
				System.out.println("ö���� �̰���ϴ�.");

			else if(myChoice2.equals("����"))								//���� : ���� (ö�� draw)
				System.out.println("�����ϴ�.");

			else if(myChoice2.equals("��"))								//���� : �� (ö�� lose)
				System.out.println("���� �̰���ϴ�.");
	
		}

		if(myChoice.equals("��")) 										//ö���� ���� �϶�
		
		{
			if(myChoice2.equals("����"))									//���� : ���� (ö�� lose)
				System.out.println("���� �̰���ϴ�.");

			else if(myChoice2.equals("����"))								//���� : ���� (ö�� win)
				System.out.println("ö���� �̰���ϴ�.");

			else if(myChoice2.equals("��"))								//���� : �� (ö�� draw)
				System.out.println("�����ϴ�.");
	
		}

	}
}