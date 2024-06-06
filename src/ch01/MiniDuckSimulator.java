package ch01;

import ch01.duck.Duck;
import ch01.duck.MallardDuck;
import ch01.duck.ModelDuck;
import ch01.fly.FlyRocketPowered;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		mallard.swim();

		System.out.println("=====================================");

		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
