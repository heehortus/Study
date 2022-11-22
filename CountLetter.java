import java.util.Scanner;	//  �� ���α׷������� Scanner ��ü�� ���
			// Java API���� Scanner ã��
	
class CountLetter //���� ���� Ƚ�� ��� 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in); 					//�Է��� �ޱ� ���� scannerŬ������ ��ü 
			
		// �빮��/�ҹ��� ���ĺ��� ������ �� �ִ� �迭 count�� �����ϰ� �����϶�.
		int SmallCount[] = new int[26];        						//�ҹ��� ���� �迭. �� 0���� �ʱ�ȭ
		int BigCount[] = new int[26];							//�빮�� ���� �迭. �� 0���� �ʱ�ȭ

		System.out.println("���ڿ��� �Է��Ͻÿ� : ");
		String buffer = scan.nextLine();

		// �� ���ڰ� �����ϴ� Ƚ���� ����Ѵ�.
		for (int i=0; i< buffer.length(); i++)
		{
			char ch = buffer.charAt(i); 						//���ڿ��� �� ���� �� ch�� ����
			
			if( 'A' <= ch && ch <= 'Z' ) 						//ASCII�ڵ忡�� �빮�� ������ 65~90�����̴�.
			{ 
				BigCount[ch - 'A']++;					//��: ch�� C�̴�. (ASCII�ڵ�:67) 67-'A'=2 > BigCount[2]�� ���� 1 �þ��. 
			}

			else //���� 65~90 �ȿ� ���ĺ��� ���� �� ����(�ҹ��ڰų� �빮���� ��)
			{ 
				if ( 'a' <= ch && ch <= 'z') 				//ASCII�ڵ忡�� �ҹ��� ������ 97~122�����̴�
				{
					SmallCount[ch - 'a']++;
				}
				else if ( ch == ' ' ) 					//���� �����̽��̸� count�� ������ �ʰ� �ݺ��� ����Ѵ�. ASCII�ڵ忡�� space�� 32�̴�.
				{
					continue; 
				 }
			}
		}
		
		//�迭�� ����� Ƚ���� ����ϴ� �ݺ�����
		for (int j=0; j<26; j++) 
		{	
			if(BigCount[j] != 0 || SmallCount[j] != 0) 				//0���� �ƴ� ���ĺ��� ���� ����Ѵٴ� �ǹ�(���ڿ��� ���ԵǴ� ���ĺ��� ����Ѵ�.)				
			{
				System.out.println((char) (j+'a')+ " : " + (SmallCount[j]) + " " + (char) (j+'A') + " : " + (BigCount[j]));
			}								//���� a : 0 A : 1
		} 

		
	}
}