package decorator;

/**
 * 
 * @author Dream
 *
 *		抽象装饰角色：
 *			包含一个组件的引用，并定义了与抽象组件一致的接口。
 */
public abstract class CarDecorator implements Car {
	
	private Car car;

	public CarDecorator(Car car) {
		this.car = car;
	}
	
	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public abstract void show();	

}
