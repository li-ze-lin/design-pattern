package builder;

/**
 * 
 * @author Dream
 *
 *	一、什么是建造者模式:
 *		Builder模式也叫建造者模式或者生成器模式，是由GoF提出的23种设计模式中的一种。
 *		Builder模式是一种对象创建型模式之一，用来隐藏复合对象的创建过程，
 *		它把复合对象的创建过程加以抽象，通过子类继承和重载的方式，动态地创建具有复合属性的对象。
 *
 *	二、建造者模式应用场景:
 *		- 对象的创建：Builder模式是为对象的创建而设计的模式
 *		- 创建的是一个复合对象：被创建的对象为一个具有复合属性的复合对象
 *		- 关注对象创建的各部分的创建过程：不同的工厂（这里指builder生成器）对产品属性有不同的创建方法
 */
public class Main {

	public static void main(String[] args) {
		
		/**
		 * 由工程队来修
		 */
		HouseBuilder builder = new ApartmentBuilder();
		/**
		 * 设计者来做
		 */
		HouseDirector director = new HouseDirector();
		director.makeHouse(builder);
		
		House house = builder.getHouse();
		System.out.println(house.getFloor());
		System.out.println(house.getWall());
		System.out.println(house.getHousetop());
	}
}
