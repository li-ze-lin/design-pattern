package singleton;

/**
 * 
 * @author Dream
 *
 *	懒汉式(方法加锁)
 *		线程安全 但是效率会低 大量线程访问会堵塞
 */
public class Sluggard2 {
	
	private static Sluggard2 sluggard;

	/**
	 * 构造函数私有化
	 */
	private Sluggard2() {
		
	}
	
	/**
	 * 提供一个全局的静态方法
	 */
	public static synchronized Sluggard2 getSluggard() {
		if (sluggard == null) {
			sluggard = new Sluggard2();
		}
		return sluggard;
	}
}
