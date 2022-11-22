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
			
			catch (java.lang.ArithmeticException e) //arithmetic:연산
			{
				System.out.println("잘못된 연산입니 다.");
			}

			catch (java.lang.ArrayIndexOutOfBoundsException n) //인덱스불가
			{
				System.out.println("잘못된 인덱스입니다.");
			}
		}
	}
}