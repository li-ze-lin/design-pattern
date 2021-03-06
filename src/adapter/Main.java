package adapter;

/**
 * 
 * @author Dream
 *
 *	一、什么是适配器模式:
 *		Adapter模式也叫适配器模式，是构造型模式之一，通过Adapter模式可以改变已有类（或外部类）的接口形式。
 *
 *	二、适配器模式应用场景:
 *		在大规模的系统开发过程中，我们常常碰到诸如以下这些情况：
 *		我们需要实现某些功能，这些功能已有还不太成熟的一个或多个外
 *		部组件，如果我们自己重新开发这些功能会花费大量时间；所以很
 *		多情况下会选择先暂时使用外部组件，以后再考虑随时替换。但这
 *		样一来，会带来一个问题，随着对外部组件库的替换，可能需要对
 *		引用该外部组件的源代码进行大面积的修改，因此也极可能引入新
 *		的问题等等。如何最大限度的降低修改面呢？
 *		Adapter模式就是针对这种类似需求而提出来的。
 *		Adapter模式通过定义一个新的接口（对要实现的功能加以抽象），
 *		和一个实现该接口的Adapter（适配器）类来透明地调用外部组件。
 *		这样替换外部组件时，最多只要修改几个Adapter类就可以了，其他
 *		源代码都不会受到影响。
 *
 *	三、适配器模式的结构:
 *		1.通过继承实现Adapter
 *		2.通过委让实现Adapter
 */
public class Main {

	public static void main(String[] args) {
		ExtendsAdapter extendsAdapter = new ExtendsAdapter();
		extendsAdapter.use18V();
		
		CommissionAdapter commissionAdapter = new CommissionAdapter();
		commissionAdapter.use18V();

	}

}
