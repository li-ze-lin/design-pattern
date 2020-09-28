package singleton;

/**
 * 
 * @author Dream
 *
 *	懒汉式(最基本)
 *		单线程安全 多线程不安全
 */
public class Sluggard {
	
	private static Sluggard sluggard;
	
	/**
	 * 构造函数私有化
	 */
	private Sluggard() {
		
	}

	/**
	 * 提供一个全局的静态方法
	 */
	public static Sluggard getSluggard() {
		if (sluggard == null) {
			sluggard = new Sluggard();
		}
		return sluggard;
	}
}
