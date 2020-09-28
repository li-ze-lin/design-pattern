package mediator;

/**
 * 
 * @author Dream
 *
 *	concreteColleague:具体的关联类。
 */
public class Woman extends Person {

	public Woman(String name, int condition,Mediator mediator) {
		super(name, condition, mediator);
	}

	public void getPartner(Person person) {
		this.getMediator().setWoman(this);
		this.getMediator().getPartner(person);
	}
	
}
