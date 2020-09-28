package decorator;

/**
 * 
 * @author Dream
 *
 *		具体组件角色：
 *			为抽象组件的实现类。
 */
public class SwimCarDecorator extends CarDecorator {

	public SwimCarDecorator(Car car) {
		super(car);
	}

	public void show() {
		this.getCar().show();
		this.swim();
	}
	
	public void swim() {
		System.out.println("游");
	}

	public void run() {
		
	}

}
