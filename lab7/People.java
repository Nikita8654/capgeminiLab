package lab7;

public class People {

	private String ID;
	private int age;
	People(String ID,int age)
	{
		setID(ID);
		setAge(age);
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
