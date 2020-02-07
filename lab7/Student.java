package lab7;

public class Student {
	private int STUDENT_AGE;
	private String STUDENT_NAME;
	private String STUDENT_REGISTRATION_NO;
	private int MARKS;
	
	Student()
	{}
	Student(int age,String name,String reg_no,int marks)
	{
		setSTUDENT_AGE(age);
		setSTUDENT_NAME(name);
		setSTUDENT_REGISTRATION_NO(reg_no);
		setMARKS(marks);
	}
	
	public int getSTUDENT_AGE() {
		return STUDENT_AGE;
	}
	public void setSTUDENT_AGE(int sTUDENT_AGE) {
		STUDENT_AGE = sTUDENT_AGE;
	}
	public String getSTUDENT_NAME() {
		return STUDENT_NAME;
	}
	public void setSTUDENT_NAME(String sTUDENT_NAME) {
		STUDENT_NAME = sTUDENT_NAME;
	}
	public String getSTUDENT_REGISTRATION_NO() {
		return STUDENT_REGISTRATION_NO;
	}
	public void setSTUDENT_REGISTRATION_NO(String sTUDENT_REGISTRATION_NO) {
		STUDENT_REGISTRATION_NO = sTUDENT_REGISTRATION_NO;
	}
	public int getMARKS() {
		return MARKS;
	}
	public void setMARKS(int mARKS) {
		MARKS = mARKS;
	}

}
