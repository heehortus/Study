public class Employee
{
	private String name;			//���� �̸�
	private String address;			//�ּ�
	private int annual_salary;			//����
	private String phone;			//��ȭ��ȣ

						//�� �ʵ忡 ���� getter/setter �޼ҵ� �ۼ�
	public String getName()			//�̸� get �Լ�
	{
		return name;
	}

	public void setName(String name)		//�̸� set �Լ�
	{
		this.name = name;
	}

	public String getAddress()			//�ּ� get �Լ�
	{
		return address;
	}

	public void setAddress(String address)		//�ּ� set �Լ�
	{
		this.address = address;
	}

	public int getAnnualSalary()		//���� get �Լ�
	{
		return annual_salary;
	}

	public void setAnnualSalary(int annual_salary)	//���� set �Լ�
	{
		this.annual_salary = annual_salary;
	}

	public String getPhone()			//��ȭ��ȣ get �Լ�
	{
		return phone;
	}

	public void setPhone(String phone)		//��ȭ��ȣ set �Լ�
	{
		this.phone = phone;
	}

	public String toString()			//toString()�޼ҵ带 �ۼ��Ͽ� ����. 
	{
		return "name: " + getName() + " Address: " + getAddress() + " annual_salary: " + getAnnualSalary() + " phone:" + getPhone();
	}
}