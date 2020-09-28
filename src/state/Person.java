package state;

/**
 * 
 * @author Dream
 *
 *	Context：用户对象拥有一个State类型的成员，以标识对象的当前状态；
 */
public class Person {
	private int hour;
	private State state;

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public Person() {
		state = new MState();
	}
	
	public void doSomething(){
		state.doSomething(this);
		/**
		 * 复位
		 */
		state = new MState();
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}
