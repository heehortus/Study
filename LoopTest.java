public class LoopTest {

	public static void main(String[] args) {
		forTest(); //for�� ����ϴ� �޼���
		whileTest(); //while�� ����ϴ� �޼���
		dowhileTest(); //do-while�� ����ϴ� �޼��� 
	}	
	public static void forTest() {
		int sum, i;
		System.out.println("for�� �̿�");
		for(sum=0, i=1; i<=100; i++){
			if(i%2==0) continue; //¦���� ��� ���ϱ� ����
			   sum+=i;
		}
		System.out.printf("\tsum = %d%n", sum); //�ڹ� ���·�
	}

	public static void whileTest() {
		int sum=0; int i=1; 
		System.out.println("while�� �̿�");
		while(i <= 100) {
			if (i % 2 != 0) //¦���� �κ��� �����Ѵ�. (not¦��=Ȧ��)
			   { sum += i; }
			i++; }
		System.out.printf("\tsum = %d%n", sum);
	}

	public static void dowhileTest() {
		int sum=0; int i=1;
		System.out.println("do-while�� �̿�");
		do {
		 if (i % 2 !=0) { //¦���� ����
		  sum+=i; }
		i++;
	           } while(i<=100);  //�����Ǿ�� �ϴ� ���ǽ�
	System.out.printf("\tsum = %d%n", sum);
	}
}