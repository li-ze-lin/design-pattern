package bridge;

/**
 * 
 * @author Dream
 *
 *		Abstraction:
 *			抽象类接口（接口或抽象类）
 *			维护对行为实现（Implementor）的引用
 */
public abstract class Car {
	private Engine engine;
	
	public Car(Engine engine) {
		this.engine = engine;
	}
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public abstract void installEngine();
}
