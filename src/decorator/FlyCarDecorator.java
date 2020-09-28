package decorator;

/**
 * 
 * @author Dream
 *
 *		具体组件角色：
 *			为抽象组件的实现类。
 */
public class FlyCarDecorator extends CarDecorator{

	public FlyCarDecorator(Car car) {
		super(car);
	}

	public void show() {
		this.getCar().show();
		this.fly();
	}
	
	public void fly() {
		System.out.println("飞");
	}

	public void run() {
		
	}
}
