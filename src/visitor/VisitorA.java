package visitor;

/**
 * 
 * @author Dream
 *
 *		2) 具体访问者角色（Concrete Visitor）：
 *			实现每个由访问者角色（Visitor）声明的操作。
 *
 *	清洁工A,负责parkA的卫生情况
 */
public class VisitorA implements Visitor {

	public void visit(Park park) {

	}

	public void visit(ParkA parkA) {
		System.out.println("清洁工A:完成公园" + parkA.getName()+ "的卫生");
	}

	public void visit(ParkB parkB) {

	}

}
