package visitor;

/**
 * 
 * @author Dream
 *
 *		3) 元素角色（Element）：
 *			定义一个Accept操作，它以一个访问者为参数。 
 *
 *	公园每一部分的抽象
 */
public interface ParkElement {
	//用来接纳访问者
	public void accept(Visitor visitor);
}
