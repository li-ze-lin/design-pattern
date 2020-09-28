package factorymethod;

/**
 * 
 * @author Dream
 * 	4.具体产品（Concrete Product）角色:
 * 		工厂方法模式所创建的具体实例对象
 */
public class Dog implements Animal {

	public void get() {
		System.out.println("get dog");
	}
}
