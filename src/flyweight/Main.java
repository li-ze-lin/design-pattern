package flyweight;

/**
 * 
 * @author Dream
 *
 *	一、什么是享元模式:
 *		Flyweight模式也叫享元模式，是构造型模式之一，它通过与其他类似对象共享数据来减小内存占用。
 *
 *	二、享元模式的角色和职责:
 *		抽象享元角色：
 *			所有具体享元类的父类，规定一些需要实现的公共接口。
 *		具体享元角色：
 *			抽象享元角色的具体实现类，并实现了抽象享元角色规定的方法。
 *		享元工厂角色：
 *			负责创建和管理享元角色。
 *
 */
public class Main {

	public static void main(String[] args) {

		MyCharacter myChar11 = new MyCharacter('a');
		MyCharacter myChar22 = new MyCharacter('b');
		MyCharacter myChar33 = new MyCharacter('a');
		MyCharacter myChar44 = new MyCharacter('d');
		
		myChar11.display();
		myChar22.display();
		myChar33.display();
		myChar44.display();
		System.out.println(myChar11 == myChar33);
		
		System.out.println("\n--------------享元-----------------------");

		//1.创建MyCharacter工厂
		MyCharacterFactory factory = new MyCharacterFactory();
		
		//2.从工厂中取出相应的MyCharacter
		MyCharacter myChar1 = factory.getMyCharacter('a');
		MyCharacter myChar2 = factory.getMyCharacter('b');
		MyCharacter myChar3 = factory.getMyCharacter('a');
		MyCharacter myChar4 = factory.getMyCharacter('d');
		
		myChar1.display();
		myChar2.display();
		myChar3.display();
		myChar4.display();
		System.out.println(myChar1 == myChar3);

	}

}
