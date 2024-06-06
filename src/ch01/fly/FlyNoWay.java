package ch01.fly;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("저는 못 날아요");
	}
}
