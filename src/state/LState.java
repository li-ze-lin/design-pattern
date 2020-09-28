package state;

/**
 * 
 * @author Dream
 *
 *	ConcreteState：接口实现类或子类实现了一个与Context某个状态相关的行为。
 */
public class LState extends State{

	public void doSomething(Person person) {
		if(person.getHour() == 12) {
			System.out.println("吃午饭");
		} else {
			person.setState(new SState());
			person.doSomething();
		}
	}

}
