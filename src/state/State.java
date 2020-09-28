package state;

/**
 * 
 * @author Dream
 *
 *	State：接口或基类封装与Context的特定状态相关的行为； 
 */
public abstract class State {
	public abstract void  doSomething(Person person);
}
