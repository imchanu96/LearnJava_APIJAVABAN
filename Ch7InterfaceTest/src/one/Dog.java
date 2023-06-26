package one;

public class Dog extends Child implements Animal, Sociability{

//	다리가 있다.
//	입이 있다.
//	4발로 걷는다.
//	4발로 달린다.
//	입으로 먹는다.
	String name = "";
	String numberOfLegs = "4발";
	String mouth = "입";
	
	Dog(String name){
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

	@Override
	public void kind() {
		// TODO Auto-generated method stub
		System.out.println("사회성?");
	}

}
