//1���� 100������ �߻��� ������ ���ڸ� 5�� �ȿ� ���ߴ� ����

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
			System.out.print("���ڸ� �Է��ϼ���: ");
			answer = scan.nextInt();
			if (answer > ranNum) {
			     System.out.println("���������� Ů�ϴ�.");
			     count++; }
			else if (answer == ranNum) {
			     System.out.println(count + "�� ���� ������ ���߾����ϴ�.");
			     break;
		  	     }
			else {
			     System.out.println("���������� �۽��ϴ�."); 
			     count++; }
		}
		if (count==6)
			System.out.println("������ 5�� �õ��� ������ �� �߽��ϴ�.");
	}
}