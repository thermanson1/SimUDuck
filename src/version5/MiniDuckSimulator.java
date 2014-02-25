package version5;

public class MiniDuckSimulator {

	public static void main(String[] args) {
                FlyAndQuackGroup mallard = new MallardDuck(new Quack(), new FlyRocketPowered());
		mallard.performQuack();
		mallard.performFly();
                mallard.swim();
		mallard.display();
                
                FlyAndQuackGroup rubber = new RubberDuck(new Squeak(), new FlyNoWay());
                rubber.performQuack();
                rubber.performFly();
                rubber.swim();
                rubber.display();
                
                FlyAndQuackGroup model = new ModelDuck (new MuteQuack(), new FlyNoWay());
                model.performQuack();
                model.performFly();
                model.swim();
                model.display();
                
//		Duck model = new ModelDuck();
//		model.display();
//		model.performFly();
//		model.setFlyBehavior( new FlyRocketPowered() );
//		model.performFly();
	}

}
