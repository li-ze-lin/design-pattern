package visitor;

/**
 * 
 * @author Dream
 *
 *		4) 具体元素角色（Concrete Element）：
 *			实现由元素角色提供的Accept操作。 
 *
 *	公园的A部分
 */
public class ParkA implements ParkElement {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
