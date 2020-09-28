package templatemethod;

/**
 * 组装车
 * 
 * AbstractClass：抽象类的父类
 */
public abstract class MakeCar {
	//组装车头
	public abstract void makeHead();
	
	//组装车身
	public abstract void makeBody();
	
	//组装车尾
	public abstract void makeTail();
	
	/**
	 * templateMethod()：模板方法
	 */
	public void make() {
		this.makeHead();
		this.makeBody();
		this.makeTail();
	}
}
