package version5;

public class ModelDuck implements FlyAndQuackGroup {
        
    private QuackStrategy quackBehavior;
    private FlyStrategy flyBehavior;


    public ModelDuck(QuackStrategy quackBehavior, FlyStrategy flyBehavior) {
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }
    
    @Override
    public void performQuack(){
            quackBehavior.quack();
    }

    @Override
    public void performFly() {
            flyBehavior.fly();
    }

    @Override
    public void setQuackBehavior(QuackStrategy quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    @Override
    public void setFlyBehavior(FlyStrategy flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    
    
   
    @Override
    public void swim() {
        System.out.println("All ducks float, even decoys!");
	}
	
    @Override
    public void display() {
	System.out.println("I'm a model duck");
	}
}
