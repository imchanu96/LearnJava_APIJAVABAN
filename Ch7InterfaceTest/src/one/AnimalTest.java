package one;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "강아지";
		Dog dog = new Dog(name);
		
		dog.walk();
		dog.run();
		dog.eat();
		dog.sleep();
		
		System.out.println();
		
		name = "토끼";
		Rabbit rabbit = new Rabbit(name);
		rabbit.walk();
		rabbit.run();
		rabbit.eat();
		rabbit.sleep();
		
		System.out.println();
		
		name = "고양이";
		Cat cat = new Cat(name);
		cat.walk();
		cat.run();
		cat.eat();
		cat.sleep();
	}

}
