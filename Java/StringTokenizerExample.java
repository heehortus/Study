import java.util.Arrays;	//�迭�� �ٷ�� ���� �޼ҵ� (toString�� ����� ����.)
import java.util.StringTokenizer;	//token���� Ŭ����

class StringTokenizerExample
{
	public static void main(String[] args)	//command arguments�� �Է�
	{	

		//args[0] = ���, args[1] = �� > �迭
		//�迭�� ���ڿ� ��ü�� �޴´�. toString() ���

		StringTokenizer stok = new StringTokenizer(Arrays.toString(args), "[ , ]");	//[ , ]�� ��ū �����Ѵ�.

		while (stok.hasMoreTokens())	//��ū�� �ִ� ���
		{
			String str = stok.nextToken();	//��ū ����
			System.out.println(str);	//���
		}
	}
}