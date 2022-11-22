public class Circle
{

	//����
	private double radius;
	final static double PI = 3.14159;		// PI��� �̸����� 3.14159�� �ʱ�ȭ�� ���� ���

	public Circle(double radius)			//���� �������� �Ű� ������ �޴� ������
	{
		this.radius = radius;		
	}

	public Circle()				//�Ű� ������ ���� circle ������, ������ 0.0
	{
		radius = 0.0;			
	}

	public void setRadius(double radius)		//������ �޼ҵ��� setRadius()�� �ۼ��Ѵ�.
	{
		this.radius =radius;
	}					

	public double getRadius()			//������ �޼ҵ��� getRadius()�� �ۼ��Ѵ�. �ʵ� ��ȯ(return)
	{
		return radius;
	}					

	private double square(double num)		//double���� ���� �����Ͽ� ��ȯ�ϴ� square()�޼ҵ带 �ۼ��Ѵ�. ����޼ҵ�(private)
	{
		return num*num;
	}					//���� ���� ���� �� ���ϵ�

	public double getArea()			//���� ���� ���
	{
		return PI*square(radius);		//�� ���� = pi*�������� ����
	}

	public double getPerimeter()			//���� �ѷ��� ���
	{
		return 2*PI*radius;
	}

	public static double getPI()			//PI���� ��ȯ�ϴ� ���� �޼ҵ�(static)
	{
		return PI;
	}

}




