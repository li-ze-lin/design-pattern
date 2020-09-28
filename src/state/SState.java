package state;

/**
 * 
 * @author Dream
 *
 *	ConcreteState：接口实现类或子类实现了一个与Context某个状态相关的行为。
 */
public class SState extends State {

	public void doSomething(Person person) {
		if(person.getHour() == 18) {
			System.out.println("吃晚饭");
		} else {
			person.setState(new NoState());
			person.doSomething();
		}
	}

}
