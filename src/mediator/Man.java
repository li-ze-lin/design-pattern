package mediator;

/**
 * 
 * @author Dream
 *
 *	concreteColleague:具体的关联类。
 */
public class Man extends Person {

	public Man(String name, int condition,Mediator mediator) {
		super(name, condition, mediator);
	}

	public void getPartner(Person person) {
		this.getMediator().setMan(this);
		this.getMediator().getPartner(person);
	}
}
