package ch01.strategy.duck;

import ch01.strategy.fly.FlyNoWay;
import ch01.strategy.quack.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("저는 모형 오리입니다.");
	}
}
