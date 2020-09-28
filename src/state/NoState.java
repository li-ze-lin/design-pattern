package state;

/**
 * 
 * @author Dream
 *
 *	ConcreteState：接口实现类或子类实现了一个与Context某个状态相关的行为。
 */
public class NoState extends State {

	public void doSomething(Person person) {
		System.out.println(person.getHour() +  "未定义");
	}

}
