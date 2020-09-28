package decorator;

/**
 * 
 * @author Dream
 *
 *		具体组件角色：
 *			为抽象组件的实现类。
 */
public class RunCar implements Car {

	public void run() {
		System.out.println("跑");
	}

	public void show() {
		this.run();
	}

}
