package singleton;

/**
 * 
 * @author Dream
 *
 *	饿汉式
 *		线程是安全的 但是浪费资源
 */
public class Hungry {

	private static final Hungry hungry = new Hungry();
	
	/**
	 * 构造函数私有化
	 */
	private Hungry() {
		
	}

	/**
	 * 提供一个全局的静态方法
	 */
	public static Hungry getHungry() {
		return hungry;
	}
	
}
