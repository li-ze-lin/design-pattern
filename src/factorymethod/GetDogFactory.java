package factorymethod;

/**
 * 
 * @author Dream
 *
 * 	2.具体工厂（ Concrete  Creator）角色:
 * 		具体工厂类是抽象工厂的一个实现，负责实例化产品对象。
 */
public class GetDogFactory implements GetAnimalFactory {

	@Override
	public Animal getAnimal() {
		return new Dog();
	}

}
