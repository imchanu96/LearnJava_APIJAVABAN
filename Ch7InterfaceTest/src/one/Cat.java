package one;

public class Cat implements Animal{

	//고양이 걷기
	//고양이 달린다.
	//고양이 먹기.
	
	//동물들은 잠을 잔다.
	
	String name = "";
	String numberOfLegs = "4발";
	String mouth = "입";
	
	Cat(String name){
		this.name = name;
	}
	
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		String walk = "로 걷는다.";
		System.out.print(name + "는 ");
		System.out.println(numberOfLegs + walk);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String run = "로 달린다.";
		System.out.print(name + "는 ");
		System.out.println(numberOfLegs + run);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		String eat = "으로 먹는다.";
		System.out.print(name + "는 ");
		System.out.println(mouth + eat);
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		String sleep = "잠을 잔다.";
		System.out.print(name + "는 ");
		System.out.println(sleep);
	}

}
