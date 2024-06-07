package ch01.strategy;

import ch01.strategy.duck.Duck;
import ch01.strategy.duck.MallardDuck;
import ch01.strategy.duck.ModelDuck;
import ch01.strategy.fly.FlyRocketPowered;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();

		System.out.println("=====================================");

		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
