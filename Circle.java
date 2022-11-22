public class Circle
{

	//정의
	private double radius;
	final static double PI = 3.14159;		// PI라는 이름으로 3.14159로 초기화된 정적 상수

	public Circle(double radius)			//원의 반지름을 매개 변수로 받는 생성자
	{
		this.radius = radius;		
	}

	public Circle()				//매개 변수가 없는 circle 생성자, 반지름 0.0
	{
		radius = 0.0;			
	}

	public void setRadius(double radius)		//설정자 메소드인 setRadius()를 작성한다.
	{
		this.radius =radius;
	}					

	public double getRadius()			//접근자 메소드인 getRadius()를 작성한다. 필드 반환(return)
	{
		return radius;
	}					

	private double square(double num)		//double형의 값을 제곱하여 반환하는 square()메소드를 작성한다. 전용메소드(private)
	{
		return num*num;
	}					//원의 면적 구할 때 쓰일듯

	public double getArea()			//원의 면적 계산
	{
		return PI*square(radius);		//원 넓이 = pi*반지름의 제곱
	}

	public double getPerimeter()			//원의 둘레를 계산
	{
		return 2*PI*radius;
	}

	public static double getPI()			//PI값을 반환하는 정적 메소드(static)
	{
		return PI;
	}

}




