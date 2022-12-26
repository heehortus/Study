public class Employee
{
	private String name;			//직원 이름
	private String address;			//주소
	private int annual_salary;			//연봉
	private String phone;			//전화번호

						//각 필드에 대한 getter/setter 메소드 작성
	public String getName()			//이름 get 함수
	{
		return name;
	}

	public void setName(String name)		//이름 set 함수
	{
		this.name = name;
	}

	public String getAddress()			//주소 get 함수
	{
		return address;
	}

	public void setAddress(String address)		//주소 set 함수
	{
		this.address = address;
	}

	public int getAnnualSalary()		//연봉 get 함수
	{
		return annual_salary;
	}

	public void setAnnualSalary(int annual_salary)	//연봉 set 함수
	{
		this.annual_salary = annual_salary;
	}

	public String getPhone()			//전화번호 get 함수
	{
		return phone;
	}

	public void setPhone(String phone)		//전화번호 set 함수
	{
		this.phone = phone;
	}

	public String toString()			//toString()메소드를 작성하여 본다. 
	{
		return "name: " + getName() + " Address: " + getAddress() + " annual_salary: " + getAnnualSalary() + " phone:" + getPhone();
	}
}