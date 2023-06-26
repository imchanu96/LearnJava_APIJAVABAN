package one;

public class Rabbit implements Animal{

	String name = "";
	String numberOfLegsOfRabbit = "4발";
	String mouthOfRabbit = "입";
	//다리가 있다.
	//입이 있다.
	
	//4발로 걷는다.
	//4발로 달린다.
	
	//토끼는 냠냠 먹는다. 
	Rabbit(String name){
		this.name = name;
	}
	
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		String walk = "걷는다.";
		System.out.print(name + "는 ");
		System.out.println(numberOfLegsOfRabbit + "로 " + walk);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String run = "달린다.";
		System.out.print(name + "는 ");
		System.out.println(numberOfLegsOfRabbit + "로 " + run);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		String eat = "먹는다.";
		String howToEatOfRabbit = "냠냠";
		
		System.out.print(name + "는 ");
		System.out.println(mouthOfRabbit + "으로 " + howToEatOfRabbit + eat);
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		String sleep = "잠을 잔다.";
		System.out.print(name + "는 ");
		System.out.println(sleep);
	}

}
