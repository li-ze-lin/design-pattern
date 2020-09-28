package observer;

/**
 * 
 * @author Dream
 *
 *	一、什么是观察者模式:
 *		Observer模式是行为模式之一，它的作用是当一个对象的状态发生变化时，能够自动通知其他关联对象，
 *		自动刷新对象状态。Observer模式提供给关联对象一种同步通信的手段，
 *		使某个对象与依赖它的其他对象之间保持状态同步。
 *
 *	二、观察者模式的角色和职责:
 *		Subject（被观察者）:
 *			被观察的对象。当需要被观察的状态发生变化时，需要通知队列中所有观察者对象。
 *			Subject需要维持（添加，删除，通知）一个观察者对象的队列列表。
 *		ConcreteSubject:
 *			被观察者的具体实现。包含一些基本的属性状态及其他操作。
 *		Observer（观察者）:
 *			接口或抽象类。当Subject的状态发生变化时，Observer对象将通过一个callback函数得到通知。
 *		ConcreteObserver:
 *			观察者的具体实现。得到通知后将完成一些具体的业务逻辑处理。
 *
 *	三、观察者模式的典型应用:
 *		- 侦听事件驱动程序设计中的外部事件
 *		- 侦听/监视某个对象的状态变化
 *		- 发布者/订阅者(publisher/subscriber)模型中，当一个外部事件（新的产品，消息的出现等等）被触发时，通知邮件列表中的订阅者
 *		
 */
public class Main {
	
	public static void main(String[] args) {
		BlogUser user = new BlogUser();
		user.addObserver(new MyObServer());
		user.publishBlog("哈哈，博客上线了", "大家多来访问");
	}
}
