package visitor;

/**
 * 
 * @author Dream
 *
 *		2) 具体访问者角色（Concrete Visitor）：
 *			实现每个由访问者角色（Visitor）声明的操作。
 *
 *	清洁工B,负责parkB的卫生情况
 */
public class VisitorB implements Visitor {

	public void visit(Park park) {

	}

	public void visit(ParkA parkA) {

	}

	public void visit(ParkB parkB) {
		System.out.println("清洁工B:完成公园" + parkB.getName()+"的卫生");
	}

}
