package adapter;

/**
 * 
 * @author Dream
 *
 *	2.通过委让实现Adapter
 */
public class CommissionAdapter extends Current {

	public void use18V() {
		System.out.println("使用适配器");
		this.use220V();
	}
}
