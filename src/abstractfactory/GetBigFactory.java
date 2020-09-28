package abstractfactory;

/**
 * 
 * @author Dream
 *
 *		4.具体产品（Concrete Product）角色:
 *			抽象模式所创建的具体实例对象
 */
public class GetBigFactory implements GetAnimalFactory {

	@Override
	public Animal getCat() {
		// TODO Auto-generated method stub
		return new BigCat();
	}

	@Override
	public Animal getDog() {
		// TODO Auto-generated method stub
		return new BigDog();
	}

	

}
