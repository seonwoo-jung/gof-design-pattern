package ch01.strategy.duck;

import ch01.strategy.fly.FlyWithWings;
import ch01.strategy.quack.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("저는 물오리입니다.");
	}
}
