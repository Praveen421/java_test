package core;

interface WildlifeCentury{
	void wake();
	void hunt();
	void eat();
	void sex();
	void sleep();
}

class Lion implements WildlifeCentury{
	public void wake() {
		System.out.println("lion wakes up");
	}
	public void hunt() {
		System.out.print("then he do hunting ");
	}
	public void eat() {
		System.out.println("and eating");
	}
	public void sex() {
		System.out.println("he do sex after full stomach");
	}
	public void sleep() {
		System.out.println("and then he sleeps again");
	}
}

class Tiger implements WildlifeCentury{
	public void wake() {
		System.out.println("Tiger is waking up");
	}
	public void hunt() {
		System.out.println("Tiger is hunting");
	}
	public void eat() {
		System.out.println("Tiger is eating");
	}
	public void sex() {
		System.out.println("Tiger is doing sex");
	}
	public void sleep() {
		System.out.println("Tiger sleeps again");
	}
}

class Deer implements WildlifeCentury{
	public void wake() {
		System.out.println("Deer is waking up");
	}
	public void hunt() {
		System.out.println("Deer is hunted");
	}
	public void eat() {
		System.out.println("Deer is eating grass");
	}
	public void sex() {
		System.out.println("Deer is doing sex");
	}
	public void sleep() {
		System.out.println("Deer sleeps again");
	} 
}

class Elephant implements WildlifeCentury{
	public void wake() {
		System.out.println("Elephant is waking up");
	}
	public void hunt() {
		System.out.println("elephant child is hunted");
	}
	public void eat() {
		System.out.println("Elephant is eating grass fields");
	}
	public void sex() {
		System.out.println("Elephant is doing sex");
	}
	public void sleep() {
		System.out.println("Elephant sleeps again");
	}
}

class ForestOfficer{
	public static void duty(WildlifeCentury a) {
		a.wake();
		a.hunt();
		a.eat();
		a.sex();
		a.sleep();
		
	}
}

public class Visitor1 {
	public static void main(String[] args) {
		ForestOfficer.duty(new Lion());
		//ForestOfficer.duty(new Tiger());
		//ForestOfficer.duty(new Deer());
		//ForestOfficer.duty(new Elephant());
	}
}