package state;

/**
 * 
 * @author Dream
 *
 *	ConcreteState：接口实现类或子类实现了一个与Context某个状态相关的行为。
 */
public class MState extends State {

	public void doSomething(Person person) {
		if(person.getHour() == 7) {
			System.out.println("吃早餐");
		} else {
			person.setState(new LState());
			person.doSomething();
		}
	}

}
