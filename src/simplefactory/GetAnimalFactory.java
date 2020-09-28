package simplefactory;

/**
 * 
 * @author Dream
 * 1.工厂（Creator）角色:简单工厂模式的核心，它负责实现创建所有实例的内部逻辑。工厂类可以被外界直接调用，创建所需的产品对象。
 */
public class GetAnimalFactory {

	public static final String DOG = "simplefactory.Dog";
	public static final String CAT = "simplefactory.Cat";
	
	public static Animal getTyepAnimal(String type) throws Exception {
		return (Animal) Class.forName(type).newInstance();
	}
}
