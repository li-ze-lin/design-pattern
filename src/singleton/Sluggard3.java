package singleton;

/**
 * 
 * @author Dream
 *
 *	懒汉式(加锁, 双重检查)
 *		线程安全 第一次获取实例的时候可能会有所堵塞 但是以后在访问不会出现线程堵塞
 */
public class Sluggard3 {
	
	private static Sluggard3 sluggard;

	/**
	 * 构造函数私有化
	 */
	private Sluggard3() {
		
	}
	
	/**
	 * 提供一个全局的静态方法
	 */
	public static Sluggard3 getSluggard() {
		if (sluggard == null) {
			synchronized (Sluggard3.class) {
				if (sluggard == null) {
					sluggard = new Sluggard3();
				}
			}
		}
		return sluggard;
	}
}
