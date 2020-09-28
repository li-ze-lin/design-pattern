package simplefactory;

/**
 * 
 * @author Dream
 * 3.具体产品（Concrete Product）角色:简单工厂模式所创建的具体实例对象
 */
public class Cat implements Animal {

	public void get() {
		System.out.println("get cat");
	}
}
