package flyweight;

/**
 * 
 * @author Dream
 *
 *		具体享元角色：
 *			抽象享元角色的具体实现类，并实现了抽象享元角色规定的方法。
 */
public class MyCharacter {
	private char mychar;
	
	public MyCharacter(char mychar) {
		this.mychar = mychar;
	}
	
	public void display() {
		System.out.println(mychar);
	}
}
