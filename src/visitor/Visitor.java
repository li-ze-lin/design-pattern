package visitor;

/**
 * 
 * @author Dream
 *
 *		1) 访问者角色（Visitor）：
 *			为该对象结构中具体元素角色声明一个访问操作接口。该操作接口的名字和参数标识了
 *			发送访问请求给具体访问者的具体元素角色。这样访问者就可以通过该元素角色的特定接口直接访问它。 
 *
 *	访问者
 */
public interface Visitor {
	public void visit(Park park);
	public void visit(ParkA parkA);
	public void visit(ParkB parkB);
}
