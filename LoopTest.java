public class LoopTest {

	public static void main(String[] args) {
		forTest(); //for문 사용하는 메서드
		whileTest(); //while문 사용하는 메서드
		dowhileTest(); //do-while문 사용하는 메서드 
	}	
	public static void forTest() {
		int sum, i;
		System.out.println("for문 이용");
		for(sum=0, i=1; i<=100; i++){
			if(i%2==0) continue; //짝수일 경우 더하기 생략
			   sum+=i;
		}
		System.out.printf("\tsum = %d%n", sum); //자바 형태로
	}

	public static void whileTest() {
		int sum=0; int i=1; 
		System.out.println("while문 이용");
		while(i <= 100) {
			if (i % 2 != 0) //짝수인 부분은 생략한다. (not짝수=홀수)
			   { sum += i; }
			i++; }
		System.out.printf("\tsum = %d%n", sum);
	}

	public static void dowhileTest() {
		int sum=0; int i=1;
		System.out.println("do-while문 이용");
		do {
		 if (i % 2 !=0) { //짝수부 생략
		  sum+=i; }
		i++;
	           } while(i<=100);  //충족되어야 하는 조건식
	System.out.printf("\tsum = %d%n", sum);
	}
}