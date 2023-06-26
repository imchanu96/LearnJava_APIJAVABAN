package one.ezen;

public interface Student {

//	public int age = 0;   			static final 묵시
	public static final int age = 30;
	
//	public int getAge();			abstract 묵시
//	public void setAge(int age);	abstract 묵시
	
	public abstract int getAge();
	public abstract void setAge(int age);
	
	public void info();
}
