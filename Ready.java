class Ready
{
	public static void main(String args[])
	{
		int divisor[] = { 5, 4, 3, 2, 1, 0 };
		for (int cnt = 0; cnt < 10; cnt++)
		{
			try
			{
				int share = 100 / divisor[cnt];
				System.out.println(share);
			}
			
			catch (java.lang.ArithmeticException e) //arithmetic:����
			{
				System.out.println("�߸��� �����Դ� ��.");
			}

			catch (java.lang.ArrayIndexOutOfBoundsException n) //�ε����Ұ�
			{
				System.out.println("�߸��� �ε����Դϴ�.");
			}
		}
	}
}