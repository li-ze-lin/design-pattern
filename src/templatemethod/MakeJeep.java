package templatemethod;

/**
 *
 * @author Dream
 *
 *	ConcreteClass：具体的实现子类
 */
public class MakeJeep /*extends MakeCar*/ {

	/**
	 * method1()与method2()：具体步骤方法

	 public void makeBody() {
	 System.out.println("jeep:组装车身");
	 } */

	/**
	 * method1()与method2()：具体步骤方法

	 public void makeHead() {
	 System.out.println("jeep:组装车头");
	 }*/

	/**
	 * method1()与method2()：具体步骤方法

	 public void makeTail() {
	 System.out.println("jeep:组装车尾");
	 }*/

	public void make(ReVoid head, ReVoid body, ReVoid tail) {
		head.get();
		body.get();
		tail.get();
	}

}