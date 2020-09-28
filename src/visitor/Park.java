package visitor;

/**
 * 
 * @author Dream
 *
 *		4) 具体元素角色（Concrete Element）：
 *			实现由元素角色提供的Accept操作。 
 */
public class Park implements ParkElement {
	private String name;
	private ParkA parkA;
	private ParkB parkB;
	
	public Park() {
		this.parkA = new ParkA();
		this.parkB = new ParkB();
		parkA.setName("A");
		parkB.setName("B");
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
		parkA.accept(visitor);
		parkB.accept(visitor);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
